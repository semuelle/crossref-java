/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AltTitleType;
import gov.nih.nlm.ncbi.jats1.ArticleTitleType;
import gov.nih.nlm.ncbi.jats1.FnGroupType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.SubtitleType;
import gov.nih.nlm.ncbi.jats1.TitleGroupType;
import gov.nih.nlm.ncbi.jats1.TransTitleGroupType;

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
 * An implementation of the model object '<em><b>Title Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TitleGroupTypeImpl#getArticleTitle <em>Article Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TitleGroupTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TitleGroupTypeImpl#getTransTitleGroup <em>Trans Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TitleGroupTypeImpl#getAltTitle <em>Alt Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TitleGroupTypeImpl#getFnGroup <em>Fn Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TitleGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TitleGroupTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitleGroupTypeImpl extends MinimalEObjectImpl.Container implements TitleGroupType {
	/**
	 * The cached value of the '{@link #getArticleTitle() <em>Article Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleTitle()
	 * @generated
	 * @ordered
	 */
	protected ArticleTitleType articleTitle;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected EList<SubtitleType> subtitle;

	/**
	 * The cached value of the '{@link #getTransTitleGroup() <em>Trans Title Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransTitleGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TransTitleGroupType> transTitleGroup;

	/**
	 * The cached value of the '{@link #getAltTitle() <em>Alt Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<AltTitleType> altTitle;

	/**
	 * The cached value of the '{@link #getFnGroup() <em>Fn Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFnGroup()
	 * @generated
	 * @ordered
	 */
	protected FnGroupType fnGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getTitleGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleTitleType getArticleTitle() {
		return articleTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleTitle(ArticleTitleType newArticleTitle, NotificationChain msgs) {
		ArticleTitleType oldArticleTitle = articleTitle;
		articleTitle = newArticleTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.TITLE_GROUP_TYPE__ARTICLE_TITLE, oldArticleTitle, newArticleTitle);
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
	public void setArticleTitle(ArticleTitleType newArticleTitle) {
		if (newArticleTitle != articleTitle) {
			NotificationChain msgs = null;
			if (articleTitle != null)
				msgs = ((InternalEObject)articleTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TITLE_GROUP_TYPE__ARTICLE_TITLE, null, msgs);
			if (newArticleTitle != null)
				msgs = ((InternalEObject)newArticleTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TITLE_GROUP_TYPE__ARTICLE_TITLE, null, msgs);
			msgs = basicSetArticleTitle(newArticleTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TITLE_GROUP_TYPE__ARTICLE_TITLE, newArticleTitle, newArticleTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubtitleType> getSubtitle() {
		if (subtitle == null) {
			subtitle = new EObjectContainmentEList<SubtitleType>(SubtitleType.class, this, Jats1Package.TITLE_GROUP_TYPE__SUBTITLE);
		}
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransTitleGroupType> getTransTitleGroup() {
		if (transTitleGroup == null) {
			transTitleGroup = new EObjectContainmentEList<TransTitleGroupType>(TransTitleGroupType.class, this, Jats1Package.TITLE_GROUP_TYPE__TRANS_TITLE_GROUP);
		}
		return transTitleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltTitleType> getAltTitle() {
		if (altTitle == null) {
			altTitle = new EObjectContainmentEList<AltTitleType>(AltTitleType.class, this, Jats1Package.TITLE_GROUP_TYPE__ALT_TITLE);
		}
		return altTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FnGroupType getFnGroup() {
		return fnGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFnGroup(FnGroupType newFnGroup, NotificationChain msgs) {
		FnGroupType oldFnGroup = fnGroup;
		fnGroup = newFnGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.TITLE_GROUP_TYPE__FN_GROUP, oldFnGroup, newFnGroup);
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
	public void setFnGroup(FnGroupType newFnGroup) {
		if (newFnGroup != fnGroup) {
			NotificationChain msgs = null;
			if (fnGroup != null)
				msgs = ((InternalEObject)fnGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TITLE_GROUP_TYPE__FN_GROUP, null, msgs);
			if (newFnGroup != null)
				msgs = ((InternalEObject)newFnGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TITLE_GROUP_TYPE__FN_GROUP, null, msgs);
			msgs = basicSetFnGroup(newFnGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TITLE_GROUP_TYPE__FN_GROUP, newFnGroup, newFnGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TITLE_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TITLE_GROUP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.TITLE_GROUP_TYPE__ARTICLE_TITLE:
				return basicSetArticleTitle(null, msgs);
			case Jats1Package.TITLE_GROUP_TYPE__SUBTITLE:
				return ((InternalEList<?>)getSubtitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				return ((InternalEList<?>)getTransTitleGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.TITLE_GROUP_TYPE__ALT_TITLE:
				return ((InternalEList<?>)getAltTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.TITLE_GROUP_TYPE__FN_GROUP:
				return basicSetFnGroup(null, msgs);
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
			case Jats1Package.TITLE_GROUP_TYPE__ARTICLE_TITLE:
				return getArticleTitle();
			case Jats1Package.TITLE_GROUP_TYPE__SUBTITLE:
				return getSubtitle();
			case Jats1Package.TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				return getTransTitleGroup();
			case Jats1Package.TITLE_GROUP_TYPE__ALT_TITLE:
				return getAltTitle();
			case Jats1Package.TITLE_GROUP_TYPE__FN_GROUP:
				return getFnGroup();
			case Jats1Package.TITLE_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.TITLE_GROUP_TYPE__ID:
				return getId();
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
			case Jats1Package.TITLE_GROUP_TYPE__ARTICLE_TITLE:
				setArticleTitle((ArticleTitleType)newValue);
				return;
			case Jats1Package.TITLE_GROUP_TYPE__SUBTITLE:
				getSubtitle().clear();
				getSubtitle().addAll((Collection<? extends SubtitleType>)newValue);
				return;
			case Jats1Package.TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				getTransTitleGroup().clear();
				getTransTitleGroup().addAll((Collection<? extends TransTitleGroupType>)newValue);
				return;
			case Jats1Package.TITLE_GROUP_TYPE__ALT_TITLE:
				getAltTitle().clear();
				getAltTitle().addAll((Collection<? extends AltTitleType>)newValue);
				return;
			case Jats1Package.TITLE_GROUP_TYPE__FN_GROUP:
				setFnGroup((FnGroupType)newValue);
				return;
			case Jats1Package.TITLE_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.TITLE_GROUP_TYPE__ID:
				setId((String)newValue);
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
			case Jats1Package.TITLE_GROUP_TYPE__ARTICLE_TITLE:
				setArticleTitle((ArticleTitleType)null);
				return;
			case Jats1Package.TITLE_GROUP_TYPE__SUBTITLE:
				getSubtitle().clear();
				return;
			case Jats1Package.TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				getTransTitleGroup().clear();
				return;
			case Jats1Package.TITLE_GROUP_TYPE__ALT_TITLE:
				getAltTitle().clear();
				return;
			case Jats1Package.TITLE_GROUP_TYPE__FN_GROUP:
				setFnGroup((FnGroupType)null);
				return;
			case Jats1Package.TITLE_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.TITLE_GROUP_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case Jats1Package.TITLE_GROUP_TYPE__ARTICLE_TITLE:
				return articleTitle != null;
			case Jats1Package.TITLE_GROUP_TYPE__SUBTITLE:
				return subtitle != null && !subtitle.isEmpty();
			case Jats1Package.TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				return transTitleGroup != null && !transTitleGroup.isEmpty();
			case Jats1Package.TITLE_GROUP_TYPE__ALT_TITLE:
				return altTitle != null && !altTitle.isEmpty();
			case Jats1Package.TITLE_GROUP_TYPE__FN_GROUP:
				return fnGroup != null;
			case Jats1Package.TITLE_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.TITLE_GROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TitleGroupTypeImpl
