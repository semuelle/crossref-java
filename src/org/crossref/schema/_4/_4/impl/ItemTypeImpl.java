/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.CountryType;
import org.crossref.schema._4._4.CrawlerType;
import org.crossref.schema._4._4.ItemType;
import org.crossref.schema._4._4.LinkHeaderRelationshipType;
import org.crossref.schema._4._4.ResourceType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ItemTypeImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ItemTypeImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ItemTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ItemTypeImpl#getCrawler <em>Crawler</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ItemTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ItemTypeImpl#getLinkHeaderRelationship <em>Link Header Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemTypeImpl extends MinimalEObjectImpl.Container implements ItemType {
	/**
	 * The default value of the '{@link #getDoi() <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoi()
	 * @generated
	 * @ordered
	 */
	protected static final String DOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoi() <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoi()
	 * @generated
	 * @ordered
	 */
	protected String doi = DOI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected ResourceType resource;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final CountryType COUNTRY_EDEFAULT = CountryType.AD;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType country = COUNTRY_EDEFAULT;

	/**
	 * This is true if the Country attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countryESet;

	/**
	 * The default value of the '{@link #getCrawler() <em>Crawler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrawler()
	 * @generated
	 * @ordered
	 */
	protected static final CrawlerType CRAWLER_EDEFAULT = CrawlerType.GOOGLE;

	/**
	 * The cached value of the '{@link #getCrawler() <em>Crawler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrawler()
	 * @generated
	 * @ordered
	 */
	protected CrawlerType crawler = CRAWLER_EDEFAULT;

	/**
	 * This is true if the Crawler attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean crawlerESet;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkHeaderRelationship() <em>Link Header Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHeaderRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final LinkHeaderRelationshipType LINK_HEADER_RELATIONSHIP_EDEFAULT = LinkHeaderRelationshipType.DUL;

	/**
	 * The cached value of the '{@link #getLinkHeaderRelationship() <em>Link Header Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHeaderRelationship()
	 * @generated
	 * @ordered
	 */
	protected LinkHeaderRelationshipType linkHeaderRelationship = LINK_HEADER_RELATIONSHIP_EDEFAULT;

	/**
	 * This is true if the Link Header Relationship attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linkHeaderRelationshipESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getItemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoi() {
		return doi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoi(String newDoi) {
		String oldDoi = doi;
		doi = newDoi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ITEM_TYPE__DOI, oldDoi, doi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(ResourceType newResource, NotificationChain msgs) {
		ResourceType oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.ITEM_TYPE__RESOURCE, oldResource, newResource);
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
	public void setResource(ResourceType newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.ITEM_TYPE__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.ITEM_TYPE__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ITEM_TYPE__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryType getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(CountryType newCountry) {
		CountryType oldCountry = country;
		country = newCountry == null ? COUNTRY_EDEFAULT : newCountry;
		boolean oldCountryESet = countryESet;
		countryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ITEM_TYPE__COUNTRY, oldCountry, country, !oldCountryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCountry() {
		CountryType oldCountry = country;
		boolean oldCountryESet = countryESet;
		country = COUNTRY_EDEFAULT;
		countryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ITEM_TYPE__COUNTRY, oldCountry, COUNTRY_EDEFAULT, oldCountryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCountry() {
		return countryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrawlerType getCrawler() {
		return crawler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrawler(CrawlerType newCrawler) {
		CrawlerType oldCrawler = crawler;
		crawler = newCrawler == null ? CRAWLER_EDEFAULT : newCrawler;
		boolean oldCrawlerESet = crawlerESet;
		crawlerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ITEM_TYPE__CRAWLER, oldCrawler, crawler, !oldCrawlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCrawler() {
		CrawlerType oldCrawler = crawler;
		boolean oldCrawlerESet = crawlerESet;
		crawler = CRAWLER_EDEFAULT;
		crawlerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ITEM_TYPE__CRAWLER, oldCrawler, CRAWLER_EDEFAULT, oldCrawlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCrawler() {
		return crawlerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ITEM_TYPE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkHeaderRelationshipType getLinkHeaderRelationship() {
		return linkHeaderRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkHeaderRelationship(LinkHeaderRelationshipType newLinkHeaderRelationship) {
		LinkHeaderRelationshipType oldLinkHeaderRelationship = linkHeaderRelationship;
		linkHeaderRelationship = newLinkHeaderRelationship == null ? LINK_HEADER_RELATIONSHIP_EDEFAULT : newLinkHeaderRelationship;
		boolean oldLinkHeaderRelationshipESet = linkHeaderRelationshipESet;
		linkHeaderRelationshipESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ITEM_TYPE__LINK_HEADER_RELATIONSHIP, oldLinkHeaderRelationship, linkHeaderRelationship, !oldLinkHeaderRelationshipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLinkHeaderRelationship() {
		LinkHeaderRelationshipType oldLinkHeaderRelationship = linkHeaderRelationship;
		boolean oldLinkHeaderRelationshipESet = linkHeaderRelationshipESet;
		linkHeaderRelationship = LINK_HEADER_RELATIONSHIP_EDEFAULT;
		linkHeaderRelationshipESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.ITEM_TYPE__LINK_HEADER_RELATIONSHIP, oldLinkHeaderRelationship, LINK_HEADER_RELATIONSHIP_EDEFAULT, oldLinkHeaderRelationshipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLinkHeaderRelationship() {
		return linkHeaderRelationshipESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.ITEM_TYPE__RESOURCE:
				return basicSetResource(null, msgs);
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
			case _4Package.ITEM_TYPE__DOI:
				return getDoi();
			case _4Package.ITEM_TYPE__RESOURCE:
				return getResource();
			case _4Package.ITEM_TYPE__COUNTRY:
				return getCountry();
			case _4Package.ITEM_TYPE__CRAWLER:
				return getCrawler();
			case _4Package.ITEM_TYPE__LABEL:
				return getLabel();
			case _4Package.ITEM_TYPE__LINK_HEADER_RELATIONSHIP:
				return getLinkHeaderRelationship();
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
			case _4Package.ITEM_TYPE__DOI:
				setDoi((String)newValue);
				return;
			case _4Package.ITEM_TYPE__RESOURCE:
				setResource((ResourceType)newValue);
				return;
			case _4Package.ITEM_TYPE__COUNTRY:
				setCountry((CountryType)newValue);
				return;
			case _4Package.ITEM_TYPE__CRAWLER:
				setCrawler((CrawlerType)newValue);
				return;
			case _4Package.ITEM_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case _4Package.ITEM_TYPE__LINK_HEADER_RELATIONSHIP:
				setLinkHeaderRelationship((LinkHeaderRelationshipType)newValue);
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
			case _4Package.ITEM_TYPE__DOI:
				setDoi(DOI_EDEFAULT);
				return;
			case _4Package.ITEM_TYPE__RESOURCE:
				setResource((ResourceType)null);
				return;
			case _4Package.ITEM_TYPE__COUNTRY:
				unsetCountry();
				return;
			case _4Package.ITEM_TYPE__CRAWLER:
				unsetCrawler();
				return;
			case _4Package.ITEM_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case _4Package.ITEM_TYPE__LINK_HEADER_RELATIONSHIP:
				unsetLinkHeaderRelationship();
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
			case _4Package.ITEM_TYPE__DOI:
				return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
			case _4Package.ITEM_TYPE__RESOURCE:
				return resource != null;
			case _4Package.ITEM_TYPE__COUNTRY:
				return isSetCountry();
			case _4Package.ITEM_TYPE__CRAWLER:
				return isSetCrawler();
			case _4Package.ITEM_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case _4Package.ITEM_TYPE__LINK_HEADER_RELATIONSHIP:
				return isSetLinkHeaderRelationship();
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
		result.append(" (doi: ");
		result.append(doi);
		result.append(", country: ");
		if (countryESet) result.append(country); else result.append("<unset>");
		result.append(", crawler: ");
		if (crawlerESet) result.append(crawler); else result.append("<unset>");
		result.append(", label: ");
		result.append(label);
		result.append(", linkHeaderRelationship: ");
		if (linkHeaderRelationshipESet) result.append(linkHeaderRelationship); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ItemTypeImpl
