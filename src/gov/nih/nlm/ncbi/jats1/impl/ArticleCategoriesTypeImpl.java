/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ArticleCategoriesType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.SeriesTextType;
import gov.nih.nlm.ncbi.jats1.SeriesTitleType;
import gov.nih.nlm.ncbi.jats1.SubjGroupType;

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
 * An implementation of the model object '<em><b>Article Categories Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleCategoriesTypeImpl#getSubjGroup <em>Subj Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleCategoriesTypeImpl#getSeriesTitle <em>Series Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleCategoriesTypeImpl#getSeriesText <em>Series Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleCategoriesTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleCategoriesTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleCategoriesTypeImpl extends MinimalEObjectImpl.Container implements ArticleCategoriesType {
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
	 * The cached value of the '{@link #getSeriesTitle() <em>Series Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<SeriesTitleType> seriesTitle;

	/**
	 * The cached value of the '{@link #getSeriesText() <em>Series Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesText()
	 * @generated
	 * @ordered
	 */
	protected EList<SeriesTextType> seriesText;

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
	protected ArticleCategoriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getArticleCategoriesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjGroupType> getSubjGroup() {
		if (subjGroup == null) {
			subjGroup = new EObjectContainmentEList<SubjGroupType>(SubjGroupType.class, this, Jats1Package.ARTICLE_CATEGORIES_TYPE__SUBJ_GROUP);
		}
		return subjGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeriesTitleType> getSeriesTitle() {
		if (seriesTitle == null) {
			seriesTitle = new EObjectContainmentEList<SeriesTitleType>(SeriesTitleType.class, this, Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TITLE);
		}
		return seriesTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeriesTextType> getSeriesText() {
		if (seriesText == null) {
			seriesText = new EObjectContainmentEList<SeriesTextType>(SeriesTextType.class, this, Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TEXT);
		}
		return seriesText;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_CATEGORIES_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_CATEGORIES_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SUBJ_GROUP:
				return ((InternalEList<?>)getSubjGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TITLE:
				return ((InternalEList<?>)getSeriesTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TEXT:
				return ((InternalEList<?>)getSeriesText()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SUBJ_GROUP:
				return getSubjGroup();
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TITLE:
				return getSeriesTitle();
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TEXT:
				return getSeriesText();
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__BASE:
				return getBase();
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__ID:
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
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SUBJ_GROUP:
				getSubjGroup().clear();
				getSubjGroup().addAll((Collection<? extends SubjGroupType>)newValue);
				return;
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TITLE:
				getSeriesTitle().clear();
				getSeriesTitle().addAll((Collection<? extends SeriesTitleType>)newValue);
				return;
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TEXT:
				getSeriesText().clear();
				getSeriesText().addAll((Collection<? extends SeriesTextType>)newValue);
				return;
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__ID:
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
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SUBJ_GROUP:
				getSubjGroup().clear();
				return;
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TITLE:
				getSeriesTitle().clear();
				return;
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TEXT:
				getSeriesText().clear();
				return;
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__ID:
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
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SUBJ_GROUP:
				return subjGroup != null && !subjGroup.isEmpty();
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TITLE:
				return seriesTitle != null && !seriesTitle.isEmpty();
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__SERIES_TEXT:
				return seriesText != null && !seriesText.isEmpty();
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ARTICLE_CATEGORIES_TYPE__ID:
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

} //ArticleCategoriesTypeImpl
