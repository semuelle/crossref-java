/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.IndexTermType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.SeeAlsoType;
import gov.nih.nlm.ncbi.jats1.SeeType;
import gov.nih.nlm.ncbi.jats1.TermType;

import java.util.Collection;
import java.util.List;

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
 * An implementation of the model object '<em><b>Index Term Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getSee <em>See</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getIndexType <em>Index Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.IndexTermTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexTermTypeImpl extends MinimalEObjectImpl.Container implements IndexTermType {
	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected TermType term;

	/**
	 * The cached value of the '{@link #getIndexTerm() <em>Index Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexTerm()
	 * @generated
	 * @ordered
	 */
	protected IndexTermType indexTerm;

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
	 * The default value of the '{@link #getIndexType() <em>Index Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexType()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> INDEX_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexType() <em>Index Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexType()
	 * @generated
	 * @ordered
	 */
	protected List<String> indexType = INDEX_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexTermTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getIndexTermType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermType getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(TermType newTerm, NotificationChain msgs) {
		TermType oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__TERM, oldTerm, newTerm);
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
	public void setTerm(TermType newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.INDEX_TERM_TYPE__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.INDEX_TERM_TYPE__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexTermType getIndexTerm() {
		return indexTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexTerm(IndexTermType newIndexTerm, NotificationChain msgs) {
		IndexTermType oldIndexTerm = indexTerm;
		indexTerm = newIndexTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__INDEX_TERM, oldIndexTerm, newIndexTerm);
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
	public void setIndexTerm(IndexTermType newIndexTerm) {
		if (newIndexTerm != indexTerm) {
			NotificationChain msgs = null;
			if (indexTerm != null)
				msgs = ((InternalEObject)indexTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.INDEX_TERM_TYPE__INDEX_TERM, null, msgs);
			if (newIndexTerm != null)
				msgs = ((InternalEObject)newIndexTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.INDEX_TERM_TYPE__INDEX_TERM, null, msgs);
			msgs = basicSetIndexTerm(newIndexTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__INDEX_TERM, newIndexTerm, newIndexTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.INDEX_TERM_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeeType> getSee() {
		return getGroup().list(Jats1Package.eINSTANCE.getIndexTermType_See());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeeAlsoType> getSeeAlso() {
		return getGroup().list(Jats1Package.eINSTANCE.getIndexTermType_SeeAlso());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getIndexType() {
		return indexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexType(List<String> newIndexType) {
		List<String> oldIndexType = indexType;
		indexType = newIndexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__INDEX_TYPE, oldIndexType, indexType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.INDEX_TERM_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.INDEX_TERM_TYPE__TERM:
				return basicSetTerm(null, msgs);
			case Jats1Package.INDEX_TERM_TYPE__INDEX_TERM:
				return basicSetIndexTerm(null, msgs);
			case Jats1Package.INDEX_TERM_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.INDEX_TERM_TYPE__SEE:
				return ((InternalEList<?>)getSee()).basicRemove(otherEnd, msgs);
			case Jats1Package.INDEX_TERM_TYPE__SEE_ALSO:
				return ((InternalEList<?>)getSeeAlso()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.INDEX_TERM_TYPE__TERM:
				return getTerm();
			case Jats1Package.INDEX_TERM_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.INDEX_TERM_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.INDEX_TERM_TYPE__SEE:
				return getSee();
			case Jats1Package.INDEX_TERM_TYPE__SEE_ALSO:
				return getSeeAlso();
			case Jats1Package.INDEX_TERM_TYPE__BASE:
				return getBase();
			case Jats1Package.INDEX_TERM_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.INDEX_TERM_TYPE__ID:
				return getId();
			case Jats1Package.INDEX_TERM_TYPE__INDEX_TYPE:
				return getIndexType();
			case Jats1Package.INDEX_TERM_TYPE__LANG:
				return getLang();
			case Jats1Package.INDEX_TERM_TYPE__SPECIFIC_USE:
				return getSpecificUse();
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
			case Jats1Package.INDEX_TERM_TYPE__TERM:
				setTerm((TermType)newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__INDEX_TERM:
				setIndexTerm((IndexTermType)newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__SEE:
				getSee().clear();
				getSee().addAll((Collection<? extends SeeType>)newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__SEE_ALSO:
				getSeeAlso().clear();
				getSeeAlso().addAll((Collection<? extends SeeAlsoType>)newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__INDEX_TYPE:
				setIndexType((List<String>)newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.INDEX_TERM_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
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
			case Jats1Package.INDEX_TERM_TYPE__TERM:
				setTerm((TermType)null);
				return;
			case Jats1Package.INDEX_TERM_TYPE__INDEX_TERM:
				setIndexTerm((IndexTermType)null);
				return;
			case Jats1Package.INDEX_TERM_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.INDEX_TERM_TYPE__SEE:
				getSee().clear();
				return;
			case Jats1Package.INDEX_TERM_TYPE__SEE_ALSO:
				getSeeAlso().clear();
				return;
			case Jats1Package.INDEX_TERM_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.INDEX_TERM_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.INDEX_TERM_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.INDEX_TERM_TYPE__INDEX_TYPE:
				setIndexType(INDEX_TYPE_EDEFAULT);
				return;
			case Jats1Package.INDEX_TERM_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.INDEX_TERM_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
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
			case Jats1Package.INDEX_TERM_TYPE__TERM:
				return term != null;
			case Jats1Package.INDEX_TERM_TYPE__INDEX_TERM:
				return indexTerm != null;
			case Jats1Package.INDEX_TERM_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.INDEX_TERM_TYPE__SEE:
				return !getSee().isEmpty();
			case Jats1Package.INDEX_TERM_TYPE__SEE_ALSO:
				return !getSeeAlso().isEmpty();
			case Jats1Package.INDEX_TERM_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.INDEX_TERM_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.INDEX_TERM_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.INDEX_TERM_TYPE__INDEX_TYPE:
				return INDEX_TYPE_EDEFAULT == null ? indexType != null : !INDEX_TYPE_EDEFAULT.equals(indexType);
			case Jats1Package.INDEX_TERM_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.INDEX_TERM_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
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
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", indexType: ");
		result.append(indexType);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //IndexTermTypeImpl
