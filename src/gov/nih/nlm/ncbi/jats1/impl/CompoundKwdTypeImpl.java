/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.CompoundKwdPartType;
import gov.nih.nlm.ncbi.jats1.CompoundKwdType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Kwd Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdTypeImpl#getCompoundKwdPart <em>Compound Kwd Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdTypeImpl#getVocab <em>Vocab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdTypeImpl#getVocabIdentifier <em>Vocab Identifier</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdTypeImpl#getVocabTerm <em>Vocab Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdTypeImpl#getVocabTermIdentifier <em>Vocab Term Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundKwdTypeImpl extends MinimalEObjectImpl.Container implements CompoundKwdType {
	/**
	 * The cached value of the '{@link #getCompoundKwdPart() <em>Compound Kwd Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundKwdPart()
	 * @generated
	 * @ordered
	 */
	protected EList<CompoundKwdPartType> compoundKwdPart;

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
	 * The default value of the '{@link #getVocabTerm() <em>Vocab Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabTerm() <em>Vocab Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTerm()
	 * @generated
	 * @ordered
	 */
	protected String vocabTerm = VOCAB_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVocabTermIdentifier() <em>Vocab Term Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTermIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VOCAB_TERM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVocabTermIdentifier() <em>Vocab Term Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabTermIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String vocabTermIdentifier = VOCAB_TERM_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundKwdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getCompoundKwdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompoundKwdPartType> getCompoundKwdPart() {
		if (compoundKwdPart == null) {
			compoundKwdPart = new EObjectContainmentEList<CompoundKwdPartType>(CompoundKwdPartType.class, this, Jats1Package.COMPOUND_KWD_TYPE__COMPOUND_KWD_PART);
		}
		return compoundKwdPart;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_TYPE__VOCAB, oldVocab, vocab));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_TYPE__VOCAB_IDENTIFIER, oldVocabIdentifier, vocabIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocabTerm() {
		return vocabTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocabTerm(String newVocabTerm) {
		String oldVocabTerm = vocabTerm;
		vocabTerm = newVocabTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM, oldVocabTerm, vocabTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVocabTermIdentifier() {
		return vocabTermIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVocabTermIdentifier(String newVocabTermIdentifier) {
		String oldVocabTermIdentifier = vocabTermIdentifier;
		vocabTermIdentifier = newVocabTermIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM_IDENTIFIER, oldVocabTermIdentifier, vocabTermIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.COMPOUND_KWD_TYPE__COMPOUND_KWD_PART:
				return ((InternalEList<?>)getCompoundKwdPart()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.COMPOUND_KWD_TYPE__COMPOUND_KWD_PART:
				return getCompoundKwdPart();
			case Jats1Package.COMPOUND_KWD_TYPE__BASE:
				return getBase();
			case Jats1Package.COMPOUND_KWD_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.COMPOUND_KWD_TYPE__ID:
				return getId();
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB:
				return getVocab();
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_IDENTIFIER:
				return getVocabIdentifier();
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM:
				return getVocabTerm();
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM_IDENTIFIER:
				return getVocabTermIdentifier();
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
			case Jats1Package.COMPOUND_KWD_TYPE__COMPOUND_KWD_PART:
				getCompoundKwdPart().clear();
				getCompoundKwdPart().addAll((Collection<? extends CompoundKwdPartType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB:
				setVocab((String)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier((String)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM:
				setVocabTerm((String)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM_IDENTIFIER:
				setVocabTermIdentifier((String)newValue);
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
			case Jats1Package.COMPOUND_KWD_TYPE__COMPOUND_KWD_PART:
				getCompoundKwdPart().clear();
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB:
				setVocab(VOCAB_EDEFAULT);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier(VOCAB_IDENTIFIER_EDEFAULT);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM:
				setVocabTerm(VOCAB_TERM_EDEFAULT);
				return;
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM_IDENTIFIER:
				setVocabTermIdentifier(VOCAB_TERM_IDENTIFIER_EDEFAULT);
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
			case Jats1Package.COMPOUND_KWD_TYPE__COMPOUND_KWD_PART:
				return compoundKwdPart != null && !compoundKwdPart.isEmpty();
			case Jats1Package.COMPOUND_KWD_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.COMPOUND_KWD_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.COMPOUND_KWD_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB:
				return VOCAB_EDEFAULT == null ? vocab != null : !VOCAB_EDEFAULT.equals(vocab);
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_IDENTIFIER:
				return VOCAB_IDENTIFIER_EDEFAULT == null ? vocabIdentifier != null : !VOCAB_IDENTIFIER_EDEFAULT.equals(vocabIdentifier);
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM:
				return VOCAB_TERM_EDEFAULT == null ? vocabTerm != null : !VOCAB_TERM_EDEFAULT.equals(vocabTerm);
			case Jats1Package.COMPOUND_KWD_TYPE__VOCAB_TERM_IDENTIFIER:
				return VOCAB_TERM_IDENTIFIER_EDEFAULT == null ? vocabTermIdentifier != null : !VOCAB_TERM_IDENTIFIER_EDEFAULT.equals(vocabTermIdentifier);
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
		result.append(" (base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", vocab: ");
		result.append(vocab);
		result.append(", vocabIdentifier: ");
		result.append(vocabIdentifier);
		result.append(", vocabTerm: ");
		result.append(vocabTerm);
		result.append(", vocabTermIdentifier: ");
		result.append(vocabTermIdentifier);
		result.append(')');
		return result.toString();
	}

} //CompoundKwdTypeImpl
