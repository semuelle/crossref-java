/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ArticleVersionAlternativesType;
import gov.nih.nlm.ncbi.jats1.ArticleVersionType;
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
 * An implementation of the model object '<em><b>Article Version Alternatives Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionAlternativesTypeImpl#getArticleVersion <em>Article Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionAlternativesTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ArticleVersionAlternativesTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleVersionAlternativesTypeImpl extends MinimalEObjectImpl.Container implements ArticleVersionAlternativesType {
	/**
	 * The cached value of the '{@link #getArticleVersion() <em>Article Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<ArticleVersionType> articleVersion;

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
	protected ArticleVersionAlternativesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getArticleVersionAlternativesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArticleVersionType> getArticleVersion() {
		if (articleVersion == null) {
			articleVersion = new EObjectContainmentEList<ArticleVersionType>(ArticleVersionType.class, this, Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ARTICLE_VERSION);
		}
		return articleVersion;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ARTICLE_VERSION:
				return ((InternalEList<?>)getArticleVersion()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ARTICLE_VERSION:
				return getArticleVersion();
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__BASE:
				return getBase();
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ID:
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
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ARTICLE_VERSION:
				getArticleVersion().clear();
				getArticleVersion().addAll((Collection<? extends ArticleVersionType>)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ID:
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
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ARTICLE_VERSION:
				getArticleVersion().clear();
				return;
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ID:
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
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ARTICLE_VERSION:
				return articleVersion != null && !articleVersion.isEmpty();
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ARTICLE_VERSION_ALTERNATIVES_TYPE__ID:
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

} //ArticleVersionAlternativesTypeImpl
