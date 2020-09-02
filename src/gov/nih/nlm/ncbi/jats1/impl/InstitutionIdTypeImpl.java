/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.InstitutionIdType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Institution Id Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getAssigningAuthority <em>Assigning Authority</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getInstitutionIdType <em>Institution Id Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getVocab <em>Vocab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.InstitutionIdTypeImpl#getVocabIdentifier <em>Vocab Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstitutionIdTypeImpl extends MinimalEObjectImpl.Container implements InstitutionIdType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getAssigningAuthority() <em>Assigning Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigningAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNING_AUTHORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssigningAuthority() <em>Assigning Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigningAuthority()
	 * @generated
	 * @ordered
	 */
	protected String assigningAuthority = ASSIGNING_AUTHORITY_EDEFAULT;

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
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getInstitutionIdType() <em>Institution Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionIdType()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitutionIdType() <em>Institution Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionIdType()
	 * @generated
	 * @ordered
	 */
	protected String institutionIdType = INSTITUTION_ID_TYPE_EDEFAULT;

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
	protected InstitutionIdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getInstitutionIdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.INSTITUTION_ID_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssigningAuthority() {
		return assigningAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssigningAuthority(String newAssigningAuthority) {
		String oldAssigningAuthority = assigningAuthority;
		assigningAuthority = newAssigningAuthority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_ID_TYPE__ASSIGNING_AUTHORITY, oldAssigningAuthority, assigningAuthority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_ID_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_ID_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_ID_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitutionIdType() {
		return institutionIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitutionIdType(String newInstitutionIdType) {
		String oldInstitutionIdType = institutionIdType;
		institutionIdType = newInstitutionIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_ID_TYPE__INSTITUTION_ID_TYPE, oldInstitutionIdType, institutionIdType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_ID_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_ID_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_ID_TYPE__VOCAB, oldVocab, vocab));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INSTITUTION_ID_TYPE__VOCAB_IDENTIFIER, oldVocabIdentifier, vocabIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.INSTITUTION_ID_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.INSTITUTION_ID_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.INSTITUTION_ID_TYPE__ASSIGNING_AUTHORITY:
				return getAssigningAuthority();
			case Jats1Package.INSTITUTION_ID_TYPE__BASE:
				return getBase();
			case Jats1Package.INSTITUTION_ID_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.INSTITUTION_ID_TYPE__ID:
				return getId();
			case Jats1Package.INSTITUTION_ID_TYPE__INSTITUTION_ID_TYPE:
				return getInstitutionIdType();
			case Jats1Package.INSTITUTION_ID_TYPE__LANG:
				return getLang();
			case Jats1Package.INSTITUTION_ID_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.INSTITUTION_ID_TYPE__VOCAB:
				return getVocab();
			case Jats1Package.INSTITUTION_ID_TYPE__VOCAB_IDENTIFIER:
				return getVocabIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jats1Package.INSTITUTION_ID_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__ASSIGNING_AUTHORITY:
				setAssigningAuthority((String)newValue);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__INSTITUTION_ID_TYPE:
				setInstitutionIdType((String)newValue);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__VOCAB:
				setVocab((String)newValue);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__VOCAB_IDENTIFIER:
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
			case Jats1Package.INSTITUTION_ID_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__ASSIGNING_AUTHORITY:
				setAssigningAuthority(ASSIGNING_AUTHORITY_EDEFAULT);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__INSTITUTION_ID_TYPE:
				setInstitutionIdType(INSTITUTION_ID_TYPE_EDEFAULT);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__VOCAB:
				setVocab(VOCAB_EDEFAULT);
				return;
			case Jats1Package.INSTITUTION_ID_TYPE__VOCAB_IDENTIFIER:
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
			case Jats1Package.INSTITUTION_ID_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.INSTITUTION_ID_TYPE__ASSIGNING_AUTHORITY:
				return ASSIGNING_AUTHORITY_EDEFAULT == null ? assigningAuthority != null : !ASSIGNING_AUTHORITY_EDEFAULT.equals(assigningAuthority);
			case Jats1Package.INSTITUTION_ID_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.INSTITUTION_ID_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.INSTITUTION_ID_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.INSTITUTION_ID_TYPE__INSTITUTION_ID_TYPE:
				return INSTITUTION_ID_TYPE_EDEFAULT == null ? institutionIdType != null : !INSTITUTION_ID_TYPE_EDEFAULT.equals(institutionIdType);
			case Jats1Package.INSTITUTION_ID_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.INSTITUTION_ID_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.INSTITUTION_ID_TYPE__VOCAB:
				return VOCAB_EDEFAULT == null ? vocab != null : !VOCAB_EDEFAULT.equals(vocab);
			case Jats1Package.INSTITUTION_ID_TYPE__VOCAB_IDENTIFIER:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", assigningAuthority: ");
		result.append(assigningAuthority);
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", institutionIdType: ");
		result.append(institutionIdType);
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

} //InstitutionIdTypeImpl
