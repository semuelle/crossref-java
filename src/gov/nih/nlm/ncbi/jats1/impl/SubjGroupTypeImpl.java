/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.CompoundSubjectType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.SubjGroupType;
import gov.nih.nlm.ncbi.jats1.SubjectType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subj Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getCompoundSubject <em>Compound Subject</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getSubjGroup <em>Subj Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getSubjGroupType <em>Subj Group Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getVocab <em>Vocab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SubjGroupTypeImpl#getVocabIdentifier <em>Vocab Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubjGroupTypeImpl extends MinimalEObjectImpl.Container implements SubjGroupType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getSubjGroup() <em>Subj Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SubjGroupType> subjGroup;

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
	 * The default value of the '{@link #getSubjGroupType() <em>Subj Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjGroupType()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJ_GROUP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjGroupType() <em>Subj Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjGroupType()
	 * @generated
	 * @ordered
	 */
	protected String subjGroupType = SUBJ_GROUP_TYPE_EDEFAULT;

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
	protected SubjGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getSubjGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.SUBJ_GROUP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjectType> getSubject() {
		return getGroup().list(Jats1Package.eINSTANCE.getSubjGroupType_Subject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompoundSubjectType> getCompoundSubject() {
		return getGroup().list(Jats1Package.eINSTANCE.getSubjGroupType_CompoundSubject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjGroupType> getSubjGroup() {
		if (subjGroup == null) {
			subjGroup = new EObjectContainmentEList<SubjGroupType>(SubjGroupType.class, this, Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP);
		}
		return subjGroup;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUBJ_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUBJ_GROUP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUBJ_GROUP_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUBJ_GROUP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjGroupType() {
		return subjGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjGroupType(String newSubjGroupType) {
		String oldSubjGroupType = subjGroupType;
		subjGroupType = newSubjGroupType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP_TYPE, oldSubjGroupType, subjGroupType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUBJ_GROUP_TYPE__VOCAB, oldVocab, vocab));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUBJ_GROUP_TYPE__VOCAB_IDENTIFIER, oldVocabIdentifier, vocabIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.SUBJ_GROUP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUBJ_GROUP_TYPE__COMPOUND_SUBJECT:
				return ((InternalEList<?>)getCompoundSubject()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP:
				return ((InternalEList<?>)getSubjGroup()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.SUBJ_GROUP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJECT:
				return getSubject();
			case Jats1Package.SUBJ_GROUP_TYPE__COMPOUND_SUBJECT:
				return getCompoundSubject();
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP:
				return getSubjGroup();
			case Jats1Package.SUBJ_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.SUBJ_GROUP_TYPE__ID:
				return getId();
			case Jats1Package.SUBJ_GROUP_TYPE__LANG:
				return getLang();
			case Jats1Package.SUBJ_GROUP_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP_TYPE:
				return getSubjGroupType();
			case Jats1Package.SUBJ_GROUP_TYPE__VOCAB:
				return getVocab();
			case Jats1Package.SUBJ_GROUP_TYPE__VOCAB_IDENTIFIER:
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
			case Jats1Package.SUBJ_GROUP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends SubjectType>)newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__COMPOUND_SUBJECT:
				getCompoundSubject().clear();
				getCompoundSubject().addAll((Collection<? extends CompoundSubjectType>)newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP:
				getSubjGroup().clear();
				getSubjGroup().addAll((Collection<? extends SubjGroupType>)newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP_TYPE:
				setSubjGroupType((String)newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__VOCAB:
				setVocab((String)newValue);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__VOCAB_IDENTIFIER:
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
			case Jats1Package.SUBJ_GROUP_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJECT:
				getSubject().clear();
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__COMPOUND_SUBJECT:
				getCompoundSubject().clear();
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP:
				getSubjGroup().clear();
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP_TYPE:
				setSubjGroupType(SUBJ_GROUP_TYPE_EDEFAULT);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__VOCAB:
				setVocab(VOCAB_EDEFAULT);
				return;
			case Jats1Package.SUBJ_GROUP_TYPE__VOCAB_IDENTIFIER:
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
			case Jats1Package.SUBJ_GROUP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJECT:
				return !getSubject().isEmpty();
			case Jats1Package.SUBJ_GROUP_TYPE__COMPOUND_SUBJECT:
				return !getCompoundSubject().isEmpty();
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP:
				return subjGroup != null && !subjGroup.isEmpty();
			case Jats1Package.SUBJ_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.SUBJ_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.SUBJ_GROUP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.SUBJ_GROUP_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.SUBJ_GROUP_TYPE__SUBJ_GROUP_TYPE:
				return SUBJ_GROUP_TYPE_EDEFAULT == null ? subjGroupType != null : !SUBJ_GROUP_TYPE_EDEFAULT.equals(subjGroupType);
			case Jats1Package.SUBJ_GROUP_TYPE__VOCAB:
				return VOCAB_EDEFAULT == null ? vocab != null : !VOCAB_EDEFAULT.equals(vocab);
			case Jats1Package.SUBJ_GROUP_TYPE__VOCAB_IDENTIFIER:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", subjGroupType: ");
		result.append(subjGroupType);
		result.append(", vocab: ");
		result.append(vocab);
		result.append(", vocabIdentifier: ");
		result.append(vocabIdentifier);
		result.append(')');
		return result.toString();
	}

} //SubjGroupTypeImpl
