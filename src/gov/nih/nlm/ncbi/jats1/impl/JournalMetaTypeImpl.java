/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AffAlternativesType;
import gov.nih.nlm.ncbi.jats1.AffType;
import gov.nih.nlm.ncbi.jats1.ContribGroupType;
import gov.nih.nlm.ncbi.jats1.IsbnType;
import gov.nih.nlm.ncbi.jats1.IssnLType;
import gov.nih.nlm.ncbi.jats1.IssnType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.JournalIdType;
import gov.nih.nlm.ncbi.jats1.JournalMetaType;
import gov.nih.nlm.ncbi.jats1.JournalTitleGroupType;
import gov.nih.nlm.ncbi.jats1.NotesType;
import gov.nih.nlm.ncbi.jats1.PublisherType;
import gov.nih.nlm.ncbi.jats1.SelfUriType;

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
 * An implementation of the model object '<em><b>Journal Meta Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getJournalId <em>Journal Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getJournalTitleGroup <em>Journal Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getContribGroup <em>Contrib Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getAff <em>Aff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getAffAlternatives <em>Aff Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getIssn <em>Issn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getIssnL <em>Issn L</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getSelfUri <em>Self Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalMetaTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JournalMetaTypeImpl extends MinimalEObjectImpl.Container implements JournalMetaType {
	/**
	 * The cached value of the '{@link #getJournalId() <em>Journal Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalId()
	 * @generated
	 * @ordered
	 */
	protected EList<JournalIdType> journalId;

	/**
	 * The cached value of the '{@link #getJournalTitleGroup() <em>Journal Title Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalTitleGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<JournalTitleGroupType> journalTitleGroup;

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
	 * The cached value of the '{@link #getIssn() <em>Issn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssn()
	 * @generated
	 * @ordered
	 */
	protected EList<IssnType> issn;

	/**
	 * The cached value of the '{@link #getIssnL() <em>Issn L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssnL()
	 * @generated
	 * @ordered
	 */
	protected IssnLType issnL;

	/**
	 * The cached value of the '{@link #getIsbn() <em>Isbn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected EList<IsbnType> isbn;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected PublisherType publisher;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<NotesType> notes;

	/**
	 * The cached value of the '{@link #getSelfUri() <em>Self Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfUri()
	 * @generated
	 * @ordered
	 */
	protected EList<SelfUriType> selfUri;

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
	protected JournalMetaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getJournalMetaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JournalIdType> getJournalId() {
		if (journalId == null) {
			journalId = new EObjectContainmentEList<JournalIdType>(JournalIdType.class, this, Jats1Package.JOURNAL_META_TYPE__JOURNAL_ID);
		}
		return journalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JournalTitleGroupType> getJournalTitleGroup() {
		if (journalTitleGroup == null) {
			journalTitleGroup = new EObjectContainmentEList<JournalTitleGroupType>(JournalTitleGroupType.class, this, Jats1Package.JOURNAL_META_TYPE__JOURNAL_TITLE_GROUP);
		}
		return journalTitleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.JOURNAL_META_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContribGroupType> getContribGroup() {
		return getGroup().list(Jats1Package.eINSTANCE.getJournalMetaType_ContribGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffType> getAff() {
		return getGroup().list(Jats1Package.eINSTANCE.getJournalMetaType_Aff());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffAlternativesType> getAffAlternatives() {
		return getGroup().list(Jats1Package.eINSTANCE.getJournalMetaType_AffAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssnType> getIssn() {
		if (issn == null) {
			issn = new EObjectContainmentEList<IssnType>(IssnType.class, this, Jats1Package.JOURNAL_META_TYPE__ISSN);
		}
		return issn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssnLType getIssnL() {
		return issnL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssnL(IssnLType newIssnL, NotificationChain msgs) {
		IssnLType oldIssnL = issnL;
		issnL = newIssnL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.JOURNAL_META_TYPE__ISSN_L, oldIssnL, newIssnL);
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
	public void setIssnL(IssnLType newIssnL) {
		if (newIssnL != issnL) {
			NotificationChain msgs = null;
			if (issnL != null)
				msgs = ((InternalEObject)issnL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.JOURNAL_META_TYPE__ISSN_L, null, msgs);
			if (newIssnL != null)
				msgs = ((InternalEObject)newIssnL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.JOURNAL_META_TYPE__ISSN_L, null, msgs);
			msgs = basicSetIssnL(newIssnL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.JOURNAL_META_TYPE__ISSN_L, newIssnL, newIssnL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IsbnType> getIsbn() {
		if (isbn == null) {
			isbn = new EObjectContainmentEList<IsbnType>(IsbnType.class, this, Jats1Package.JOURNAL_META_TYPE__ISBN);
		}
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherType getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(PublisherType newPublisher, NotificationChain msgs) {
		PublisherType oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.JOURNAL_META_TYPE__PUBLISHER, oldPublisher, newPublisher);
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
	public void setPublisher(PublisherType newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.JOURNAL_META_TYPE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.JOURNAL_META_TYPE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.JOURNAL_META_TYPE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NotesType> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<NotesType>(NotesType.class, this, Jats1Package.JOURNAL_META_TYPE__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelfUriType> getSelfUri() {
		if (selfUri == null) {
			selfUri = new EObjectContainmentEList<SelfUriType>(SelfUriType.class, this, Jats1Package.JOURNAL_META_TYPE__SELF_URI);
		}
		return selfUri;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.JOURNAL_META_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.JOURNAL_META_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_ID:
				return ((InternalEList<?>)getJournalId()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_TITLE_GROUP:
				return ((InternalEList<?>)getJournalTitleGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_META_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_META_TYPE__CONTRIB_GROUP:
				return ((InternalEList<?>)getContribGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_META_TYPE__AFF:
				return ((InternalEList<?>)getAff()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_META_TYPE__AFF_ALTERNATIVES:
				return ((InternalEList<?>)getAffAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_META_TYPE__ISSN:
				return ((InternalEList<?>)getIssn()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_META_TYPE__ISSN_L:
				return basicSetIssnL(null, msgs);
			case Jats1Package.JOURNAL_META_TYPE__ISBN:
				return ((InternalEList<?>)getIsbn()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_META_TYPE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case Jats1Package.JOURNAL_META_TYPE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_META_TYPE__SELF_URI:
				return ((InternalEList<?>)getSelfUri()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_ID:
				return getJournalId();
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_TITLE_GROUP:
				return getJournalTitleGroup();
			case Jats1Package.JOURNAL_META_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.JOURNAL_META_TYPE__CONTRIB_GROUP:
				return getContribGroup();
			case Jats1Package.JOURNAL_META_TYPE__AFF:
				return getAff();
			case Jats1Package.JOURNAL_META_TYPE__AFF_ALTERNATIVES:
				return getAffAlternatives();
			case Jats1Package.JOURNAL_META_TYPE__ISSN:
				return getIssn();
			case Jats1Package.JOURNAL_META_TYPE__ISSN_L:
				return getIssnL();
			case Jats1Package.JOURNAL_META_TYPE__ISBN:
				return getIsbn();
			case Jats1Package.JOURNAL_META_TYPE__PUBLISHER:
				return getPublisher();
			case Jats1Package.JOURNAL_META_TYPE__NOTES:
				return getNotes();
			case Jats1Package.JOURNAL_META_TYPE__SELF_URI:
				return getSelfUri();
			case Jats1Package.JOURNAL_META_TYPE__BASE:
				return getBase();
			case Jats1Package.JOURNAL_META_TYPE__ID:
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
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_ID:
				getJournalId().clear();
				getJournalId().addAll((Collection<? extends JournalIdType>)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_TITLE_GROUP:
				getJournalTitleGroup().clear();
				getJournalTitleGroup().addAll((Collection<? extends JournalTitleGroupType>)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				getContribGroup().addAll((Collection<? extends ContribGroupType>)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__AFF:
				getAff().clear();
				getAff().addAll((Collection<? extends AffType>)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				getAffAlternatives().addAll((Collection<? extends AffAlternativesType>)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__ISSN:
				getIssn().clear();
				getIssn().addAll((Collection<? extends IssnType>)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__ISSN_L:
				setIssnL((IssnLType)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__ISBN:
				getIsbn().clear();
				getIsbn().addAll((Collection<? extends IsbnType>)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__PUBLISHER:
				setPublisher((PublisherType)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends NotesType>)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__SELF_URI:
				getSelfUri().clear();
				getSelfUri().addAll((Collection<? extends SelfUriType>)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.JOURNAL_META_TYPE__ID:
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
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_ID:
				getJournalId().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_TITLE_GROUP:
				getJournalTitleGroup().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__AFF:
				getAff().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__ISSN:
				getIssn().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__ISSN_L:
				setIssnL((IssnLType)null);
				return;
			case Jats1Package.JOURNAL_META_TYPE__ISBN:
				getIsbn().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__PUBLISHER:
				setPublisher((PublisherType)null);
				return;
			case Jats1Package.JOURNAL_META_TYPE__NOTES:
				getNotes().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__SELF_URI:
				getSelfUri().clear();
				return;
			case Jats1Package.JOURNAL_META_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.JOURNAL_META_TYPE__ID:
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
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_ID:
				return journalId != null && !journalId.isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__JOURNAL_TITLE_GROUP:
				return journalTitleGroup != null && !journalTitleGroup.isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__CONTRIB_GROUP:
				return !getContribGroup().isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__AFF:
				return !getAff().isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__AFF_ALTERNATIVES:
				return !getAffAlternatives().isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__ISSN:
				return issn != null && !issn.isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__ISSN_L:
				return issnL != null;
			case Jats1Package.JOURNAL_META_TYPE__ISBN:
				return isbn != null && !isbn.isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__PUBLISHER:
				return publisher != null;
			case Jats1Package.JOURNAL_META_TYPE__NOTES:
				return notes != null && !notes.isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__SELF_URI:
				return selfUri != null && !selfUri.isEmpty();
			case Jats1Package.JOURNAL_META_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.JOURNAL_META_TYPE__ID:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //JournalMetaTypeImpl
