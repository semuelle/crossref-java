/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AuthorNotesType;
import gov.nih.nlm.ncbi.jats1.CorrespType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.PType;
import gov.nih.nlm.ncbi.jats1.TitleType;

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
 * An implementation of the model object '<em><b>Author Notes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getCorresp <em>Corresp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getRid <em>Rid</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AuthorNotesTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorNotesTypeImpl extends MinimalEObjectImpl.Container implements AuthorNotesType {
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
	 * The default value of the '{@link #getRid() <em>Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRid()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> RID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRid() <em>Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRid()
	 * @generated
	 * @ordered
	 */
	protected List<String> rid = RID_EDEFAULT;

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
	protected AuthorNotesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getAuthorNotesType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.AUTHOR_NOTES_TYPE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.AUTHOR_NOTES_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.AUTHOR_NOTES_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AUTHOR_NOTES_TYPE__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.AUTHOR_NOTES_TYPE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.AUTHOR_NOTES_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.AUTHOR_NOTES_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AUTHOR_NOTES_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.AUTHOR_NOTES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CorrespType> getCorresp() {
		return getGroup().list(Jats1Package.eINSTANCE.getAuthorNotesType_Corresp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getGroup().list(Jats1Package.eINSTANCE.getAuthorNotesType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PType> getP() {
		return getGroup().list(Jats1Package.eINSTANCE.getAuthorNotesType_P());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AUTHOR_NOTES_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AUTHOR_NOTES_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getRid() {
		return rid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRid(List<String> newRid) {
		List<String> oldRid = rid;
		rid = newRid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AUTHOR_NOTES_TYPE__RID, oldRid, rid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AUTHOR_NOTES_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.AUTHOR_NOTES_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.AUTHOR_NOTES_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case Jats1Package.AUTHOR_NOTES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.AUTHOR_NOTES_TYPE__CORRESP:
				return ((InternalEList<?>)getCorresp()).basicRemove(otherEnd, msgs);
			case Jats1Package.AUTHOR_NOTES_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.AUTHOR_NOTES_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.AUTHOR_NOTES_TYPE__LABEL:
				return getLabel();
			case Jats1Package.AUTHOR_NOTES_TYPE__TITLE:
				return getTitle();
			case Jats1Package.AUTHOR_NOTES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.AUTHOR_NOTES_TYPE__CORRESP:
				return getCorresp();
			case Jats1Package.AUTHOR_NOTES_TYPE__FN:
				return getFn();
			case Jats1Package.AUTHOR_NOTES_TYPE__P:
				return getP();
			case Jats1Package.AUTHOR_NOTES_TYPE__BASE:
				return getBase();
			case Jats1Package.AUTHOR_NOTES_TYPE__ID:
				return getId();
			case Jats1Package.AUTHOR_NOTES_TYPE__RID:
				return getRid();
			case Jats1Package.AUTHOR_NOTES_TYPE__SPECIFIC_USE:
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
			case Jats1Package.AUTHOR_NOTES_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__CORRESP:
				getCorresp().clear();
				getCorresp().addAll((Collection<? extends CorrespType>)newValue);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__RID:
				setRid((List<String>)newValue);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__SPECIFIC_USE:
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
			case Jats1Package.AUTHOR_NOTES_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__CORRESP:
				getCorresp().clear();
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__P:
				getP().clear();
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__RID:
				setRid(RID_EDEFAULT);
				return;
			case Jats1Package.AUTHOR_NOTES_TYPE__SPECIFIC_USE:
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
			case Jats1Package.AUTHOR_NOTES_TYPE__LABEL:
				return label != null;
			case Jats1Package.AUTHOR_NOTES_TYPE__TITLE:
				return title != null;
			case Jats1Package.AUTHOR_NOTES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.AUTHOR_NOTES_TYPE__CORRESP:
				return !getCorresp().isEmpty();
			case Jats1Package.AUTHOR_NOTES_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.AUTHOR_NOTES_TYPE__P:
				return !getP().isEmpty();
			case Jats1Package.AUTHOR_NOTES_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.AUTHOR_NOTES_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.AUTHOR_NOTES_TYPE__RID:
				return RID_EDEFAULT == null ? rid != null : !RID_EDEFAULT.equals(rid);
			case Jats1Package.AUTHOR_NOTES_TYPE__SPECIFIC_USE:
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
		result.append(", id: ");
		result.append(id);
		result.append(", rid: ");
		result.append(rid);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //AuthorNotesTypeImpl
