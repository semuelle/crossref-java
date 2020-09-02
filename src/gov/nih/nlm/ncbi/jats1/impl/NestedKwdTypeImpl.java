/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.CompoundKwdType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.KwdType;
import gov.nih.nlm.ncbi.jats1.NestedKwdType;

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
 * An implementation of the model object '<em><b>Nested Kwd Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getNestedKwdClass <em>Nested Kwd Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getKwd <em>Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getCompoundKwd <em>Compound Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getNestedKwd <em>Nested Kwd</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getVocab <em>Vocab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getVocabIdentifier <em>Vocab Identifier</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getVocabTerm <em>Vocab Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NestedKwdTypeImpl#getVocabTermIdentifier <em>Vocab Term Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedKwdTypeImpl extends MinimalEObjectImpl.Container implements NestedKwdType {
	/**
	 * The cached value of the '{@link #getNestedKwdClass() <em>Nested Kwd Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedKwdClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap nestedKwdClass;

	/**
	 * The cached value of the '{@link #getNestedKwd() <em>Nested Kwd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedKwd()
	 * @generated
	 * @ordered
	 */
	protected EList<NestedKwdType> nestedKwd;

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
	protected NestedKwdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getNestedKwdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNestedKwdClass() {
		if (nestedKwdClass == null) {
			nestedKwdClass = new BasicFeatureMap(this, Jats1Package.NESTED_KWD_TYPE__NESTED_KWD_CLASS);
		}
		return nestedKwdClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KwdType> getKwd() {
		return getNestedKwdClass().list(Jats1Package.eINSTANCE.getNestedKwdType_Kwd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompoundKwdType> getCompoundKwd() {
		return getNestedKwdClass().list(Jats1Package.eINSTANCE.getNestedKwdType_CompoundKwd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NestedKwdType> getNestedKwd() {
		if (nestedKwd == null) {
			nestedKwd = new EObjectContainmentEList<NestedKwdType>(NestedKwdType.class, this, Jats1Package.NESTED_KWD_TYPE__NESTED_KWD);
		}
		return nestedKwd;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NESTED_KWD_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NESTED_KWD_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NESTED_KWD_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NESTED_KWD_TYPE__VOCAB, oldVocab, vocab));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NESTED_KWD_TYPE__VOCAB_IDENTIFIER, oldVocabIdentifier, vocabIdentifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM, oldVocabTerm, vocabTerm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM_IDENTIFIER, oldVocabTermIdentifier, vocabTermIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD_CLASS:
				return ((InternalEList<?>)getNestedKwdClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.NESTED_KWD_TYPE__KWD:
				return ((InternalEList<?>)getKwd()).basicRemove(otherEnd, msgs);
			case Jats1Package.NESTED_KWD_TYPE__COMPOUND_KWD:
				return ((InternalEList<?>)getCompoundKwd()).basicRemove(otherEnd, msgs);
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD:
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
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD_CLASS:
				if (coreType) return getNestedKwdClass();
				return ((FeatureMap.Internal)getNestedKwdClass()).getWrapper();
			case Jats1Package.NESTED_KWD_TYPE__KWD:
				return getKwd();
			case Jats1Package.NESTED_KWD_TYPE__COMPOUND_KWD:
				return getCompoundKwd();
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD:
				return getNestedKwd();
			case Jats1Package.NESTED_KWD_TYPE__BASE:
				return getBase();
			case Jats1Package.NESTED_KWD_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.NESTED_KWD_TYPE__ID:
				return getId();
			case Jats1Package.NESTED_KWD_TYPE__VOCAB:
				return getVocab();
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_IDENTIFIER:
				return getVocabIdentifier();
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM:
				return getVocabTerm();
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM_IDENTIFIER:
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
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD_CLASS:
				((FeatureMap.Internal)getNestedKwdClass()).set(newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__KWD:
				getKwd().clear();
				getKwd().addAll((Collection<? extends KwdType>)newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__COMPOUND_KWD:
				getCompoundKwd().clear();
				getCompoundKwd().addAll((Collection<? extends CompoundKwdType>)newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD:
				getNestedKwd().clear();
				getNestedKwd().addAll((Collection<? extends NestedKwdType>)newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__VOCAB:
				setVocab((String)newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier((String)newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM:
				setVocabTerm((String)newValue);
				return;
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM_IDENTIFIER:
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
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD_CLASS:
				getNestedKwdClass().clear();
				return;
			case Jats1Package.NESTED_KWD_TYPE__KWD:
				getKwd().clear();
				return;
			case Jats1Package.NESTED_KWD_TYPE__COMPOUND_KWD:
				getCompoundKwd().clear();
				return;
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD:
				getNestedKwd().clear();
				return;
			case Jats1Package.NESTED_KWD_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.NESTED_KWD_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.NESTED_KWD_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.NESTED_KWD_TYPE__VOCAB:
				setVocab(VOCAB_EDEFAULT);
				return;
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_IDENTIFIER:
				setVocabIdentifier(VOCAB_IDENTIFIER_EDEFAULT);
				return;
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM:
				setVocabTerm(VOCAB_TERM_EDEFAULT);
				return;
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM_IDENTIFIER:
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
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD_CLASS:
				return nestedKwdClass != null && !nestedKwdClass.isEmpty();
			case Jats1Package.NESTED_KWD_TYPE__KWD:
				return !getKwd().isEmpty();
			case Jats1Package.NESTED_KWD_TYPE__COMPOUND_KWD:
				return !getCompoundKwd().isEmpty();
			case Jats1Package.NESTED_KWD_TYPE__NESTED_KWD:
				return nestedKwd != null && !nestedKwd.isEmpty();
			case Jats1Package.NESTED_KWD_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.NESTED_KWD_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.NESTED_KWD_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.NESTED_KWD_TYPE__VOCAB:
				return VOCAB_EDEFAULT == null ? vocab != null : !VOCAB_EDEFAULT.equals(vocab);
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_IDENTIFIER:
				return VOCAB_IDENTIFIER_EDEFAULT == null ? vocabIdentifier != null : !VOCAB_IDENTIFIER_EDEFAULT.equals(vocabIdentifier);
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM:
				return VOCAB_TERM_EDEFAULT == null ? vocabTerm != null : !VOCAB_TERM_EDEFAULT.equals(vocabTerm);
			case Jats1Package.NESTED_KWD_TYPE__VOCAB_TERM_IDENTIFIER:
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
		result.append(" (nestedKwdClass: ");
		result.append(nestedKwdClass);
		result.append(", base: ");
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

} //NestedKwdTypeImpl
