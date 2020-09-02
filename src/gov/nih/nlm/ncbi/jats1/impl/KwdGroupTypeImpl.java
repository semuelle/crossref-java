/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.CompoundKwdType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.KwdGroupType;
import gov.nih.nlm.ncbi.jats1.KwdType;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.NestedKwdType;
import gov.nih.nlm.ncbi.jats1.TitleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kwd Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getKwdClass <em>Kwd Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getKwd <em>Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getCompoundKwd <em>Compound Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getNestedKwd <em>Nested Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getKwdGroupType <em>Kwd Group Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getVocab <em>Vocab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.KwdGroupTypeImpl#getVocabIdentifier <em>Vocab Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KwdGroupTypeImpl extends MinimalEObjectImpl.Container implements KwdGroupType {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected LabelType label;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getKwdClass() <em>Kwd Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKwdClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap kwdClass;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKwdGroupType() <em>Kwd Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKwdGroupType()
	 * @generated
	 * @ordered
	 */
	protected static final String KWD_GROUP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKwdGroupType() <em>Kwd Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKwdGroupType()
	 * @generated
	 * @ordered
	 */
	protected String kwdGroupType = KWD_GROUP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected Object lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected String specificUse = SPECIFIC_USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVocab() <em>Vocab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocab()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocab() <em>Vocab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocab()
	 * @generated
	 * @ordered
	 */
	protected String vocab = VOCAB_EDEFAULT;

	/**
	 * The default value of the '{@link #getVocabIdentifier() <em>Vocab Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabIdentifier() <em>Vocab Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String vocabIdentifier = VOCAB_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KwdGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getKwdGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		LabelType oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(LabelType newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.KWD_GROUP_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.KWD_GROUP_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.KWD_GROUP_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.KWD_GROUP_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getKwdClass() {
		if (kwdClass == null) {
			kwdClass = new BasicFeatureMap(this, Jats1Package.KWD_GROUP_TYPE__KWD_CLASS);
		}
		return kwdClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KwdType> getKwd() {
		return getKwdClass().list(Jats1Package.eINSTANCE.getKwdGroupType_Kwd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompoundKwdType> getCompoundKwd() {
		return getKwdClass().list(Jats1Package.eINSTANCE.getKwdGroupType_CompoundKwd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NestedKwdType> getNestedKwd() {
		return getKwdClass().list(Jats1Package.eINSTANCE.getKwdGroupType_NestedKwd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKwdGroupType() {
		return kwdGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKwdGroupType(String newKwdGroupType) {
		String oldKwdGroupType = kwdGroupType;
		kwdGroupType = newKwdGroupType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__KWD_GROUP_TYPE, oldKwdGroupType, kwdGroupType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang(Object newLang) {
		Object oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecificUse() {
		return specificUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecificUse(String newSpecificUse) {
		String oldSpecificUse = specificUse;
		specificUse = newSpecificUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocab() {
		return vocab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocab(String newVocab) {
		String oldVocab = vocab;
		vocab = newVocab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__VOCAB, oldVocab, vocab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocabIdentifier() {
		return vocabIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocabIdentifier(String newVocabIdentifier) {
		String oldVocabIdentifier = vocabIdentifier;
		vocabIdentifier = newVocabIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.KWD_GROUP_TYPE__VOCAB_IDENTIFIER, oldVocabIdentifier, vocabIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.KWD_GROUP_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.KWD_GROUP_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case Jats1Package.KWD_GROUP_TYPE__KWD_CLASS:
				return ((InternalEList<?>)getKwdClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.KWD_GROUP_TYPE__KWD:
				return ((InternalEList<?>)getKwd()).basicRemove(otherEnd, msgs);
			case Jats1Package.KWD_GROUP_TYPE__COMPOUND_KWD:
				return ((InternalEList<?>)getCompoundKwd()).basicRemove(otherEnd, msgs);
			case Jats1Package.KWD_GROUP_TYPE__NESTED_KWD:
				return ((InternalEList<?>)getNestedKwd()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Jats1Package.KWD_GROUP_TYPE__LABEL:
				return getLabel();
			case Jats1Package.KWD_GROUP_TYPE__TITLE:
				return getTitle();
			case Jats1Package.KWD_GROUP_TYPE__KWD_CLASS:
				if (coreType) return getKwdClass();
				return ((FeatureMap.Internal)getKwdClass()).getWrapper();
			case Jats1Package.KWD_GROUP_TYPE__KWD:
				return getKwd();
			case Jats1Package.KWD_GROUP_TYPE__COMPOUND_KWD:
				return getCompoundKwd();
			case Jats1Package.KWD_GROUP_TYPE__NESTED_KWD:
				return getNestedKwd();
			case Jats1Package.KWD_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.KWD_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.KWD_GROUP_TYPE__KWD_GROUP_TYPE:
				return getKwdGroupType();
			case Jats1Package.KWD_GROUP_TYPE__LANG:
				return getLang();
			case Jats1Package.KWD_GROUP_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.KWD_GROUP_TYPE__VOCAB:
				return getVocab();
			case Jats1Package.KWD_GROUP_TYPE__VOCAB_IDENTIFIER:
				return getVocabIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jats1Package.KWD_GROUP_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__KWD_CLASS:
				((FeatureMap.Internal)getKwdClass()).set(newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__KWD:
				getKwd().clear();
				getKwd().addAll((Collection<? extends KwdType>)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__COMPOUND_KWD:
				getCompoundKwd().clear();
				getCompoundKwd().addAll((Collection<? extends CompoundKwdType>)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__NESTED_KWD:
				getNestedKwd().clear();
				getNestedKwd().addAll((Collection<? extends NestedKwdType>)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__KWD_GROUP_TYPE:
				setKwdGroupType((String)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__VOCAB:
				setVocab((String)newValue);
				return;
			case Jats1Package.KWD_GROUP_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Jats1Package.KWD_GROUP_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.KWD_GROUP_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case Jats1Package.KWD_GROUP_TYPE__KWD_CLASS:
				getKwdClass().clear();
				return;
			case Jats1Package.KWD_GROUP_TYPE__KWD:
				getKwd().clear();
				return;
			case Jats1Package.KWD_GROUP_TYPE__COMPOUND_KWD:
				getCompoundKwd().clear();
				return;
			case Jats1Package.KWD_GROUP_TYPE__NESTED_KWD:
				getNestedKwd().clear();
				return;
			case Jats1Package.KWD_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.KWD_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.KWD_GROUP_TYPE__KWD_GROUP_TYPE:
				setKwdGroupType(KWD_GROUP_TYPE_EDEFAULT);
				return;
			case Jats1Package.KWD_GROUP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.KWD_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.KWD_GROUP_TYPE__VOCAB:
				setVocab(VOCAB_EDEFAULT);
				return;
			case Jats1Package.KWD_GROUP_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier(VOCAB_IDENTIFIER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Jats1Package.KWD_GROUP_TYPE__LABEL:
				return label != null;
			case Jats1Package.KWD_GROUP_TYPE__TITLE:
				return title != null;
			case Jats1Package.KWD_GROUP_TYPE__KWD_CLASS:
				return kwdClass != null && !kwdClass.isEmpty();
			case Jats1Package.KWD_GROUP_TYPE__KWD:
				return !getKwd().isEmpty();
			case Jats1Package.KWD_GROUP_TYPE__COMPOUND_KWD:
				return !getCompoundKwd().isEmpty();
			case Jats1Package.KWD_GROUP_TYPE__NESTED_KWD:
				return !getNestedKwd().isEmpty();
			case Jats1Package.KWD_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.KWD_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.KWD_GROUP_TYPE__KWD_GROUP_TYPE:
				return KWD_GROUP_TYPE_EDEFAULT == null ? kwdGroupType != null : !KWD_GROUP_TYPE_EDEFAULT.equals(kwdGroupType);
			case Jats1Package.KWD_GROUP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.KWD_GROUP_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.KWD_GROUP_TYPE__VOCAB:
				return VOCAB_EDEFAULT == null ? vocab != null : !VOCAB_EDEFAULT.equals(vocab);
			case Jats1Package.KWD_GROUP_TYPE__VOCAB_IDENTIFIER:
				return VOCAB_IDENTIFIER_EDEFAULT == null ? vocabIdentifier != null : !VOCAB_IDENTIFIER_EDEFAULT.equals(vocabIdentifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kwdClass: ");
		result.append(kwdClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", kwdGroupType: ");
		result.append(kwdGroupType);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", vocab: ");
		result.append(vocab);
		result.append(", vocabIdentifier: ");
		result.append(vocabIdentifier);
		result.append(')');
		return result.toString();
	}

} //KwdGroupTypeImpl
