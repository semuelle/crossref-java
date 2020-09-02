/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevJournalTitleType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.JournalSubtitleType;
import gov.nih.nlm.ncbi.jats1.JournalTitleGroupType;
import gov.nih.nlm.ncbi.jats1.JournalTitleType;
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
 * An implementation of the model object '<em><b>Journal Title Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalTitleGroupTypeImpl#getJournalTitle <em>Journal Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalTitleGroupTypeImpl#getJournalSubtitle <em>Journal Subtitle</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalTitleGroupTypeImpl#getTransTitleGroup <em>Trans Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalTitleGroupTypeImpl#getAbbrevJournalTitle <em>Abbrev Journal Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalTitleGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalTitleGroupTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.JournalTitleGroupTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JournalTitleGroupTypeImpl extends MinimalEObjectImpl.Container implements JournalTitleGroupType {
	/**
	 * The cached value of the '{@link #getJournalTitle() <em>Journal Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<JournalTitleType> journalTitle;

	/**
	 * The cached value of the '{@link #getJournalSubtitle() <em>Journal Subtitle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalSubtitle()
	 * @generated
	 * @ordered
	 */
	protected EList<JournalSubtitleType> journalSubtitle;

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
	 * The cached value of the '{@link #getAbbrevJournalTitle() <em>Abbrev Journal Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbrevJournalTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<AbbrevJournalTitleType> abbrevJournalTitle;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JournalTitleGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getJournalTitleGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JournalTitleType> getJournalTitle() {
		if (journalTitle == null) {
			journalTitle = new EObjectContainmentEList<JournalTitleType>(JournalTitleType.class, this, Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_TITLE);
		}
		return journalTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JournalSubtitleType> getJournalSubtitle() {
		if (journalSubtitle == null) {
			journalSubtitle = new EObjectContainmentEList<JournalSubtitleType>(JournalSubtitleType.class, this, Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_SUBTITLE);
		}
		return journalSubtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransTitleGroupType> getTransTitleGroup() {
		if (transTitleGroup == null) {
			transTitleGroup = new EObjectContainmentEList<TransTitleGroupType>(TransTitleGroupType.class, this, Jats1Package.JOURNAL_TITLE_GROUP_TYPE__TRANS_TITLE_GROUP);
		}
		return transTitleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevJournalTitleType> getAbbrevJournalTitle() {
		if (abbrevJournalTitle == null) {
			abbrevJournalTitle = new EObjectContainmentEList<AbbrevJournalTitleType>(AbbrevJournalTitleType.class, this, Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ABBREV_JOURNAL_TITLE);
		}
		return abbrevJournalTitle;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.JOURNAL_TITLE_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.JOURNAL_TITLE_GROUP_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_TITLE:
				return ((InternalEList<?>)getJournalTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_SUBTITLE:
				return ((InternalEList<?>)getJournalSubtitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				return ((InternalEList<?>)getTransTitleGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ABBREV_JOURNAL_TITLE:
				return ((InternalEList<?>)getAbbrevJournalTitle()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_TITLE:
				return getJournalTitle();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_SUBTITLE:
				return getJournalSubtitle();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				return getTransTitleGroup();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ABBREV_JOURNAL_TITLE:
				return getAbbrevJournalTitle();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ID:
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
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_TITLE:
				getJournalTitle().clear();
				getJournalTitle().addAll((Collection<? extends JournalTitleType>)newValue);
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_SUBTITLE:
				getJournalSubtitle().clear();
				getJournalSubtitle().addAll((Collection<? extends JournalSubtitleType>)newValue);
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				getTransTitleGroup().clear();
				getTransTitleGroup().addAll((Collection<? extends TransTitleGroupType>)newValue);
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ABBREV_JOURNAL_TITLE:
				getAbbrevJournalTitle().clear();
				getAbbrevJournalTitle().addAll((Collection<? extends AbbrevJournalTitleType>)newValue);
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ID:
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
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_TITLE:
				getJournalTitle().clear();
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_SUBTITLE:
				getJournalSubtitle().clear();
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				getTransTitleGroup().clear();
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ABBREV_JOURNAL_TITLE:
				getAbbrevJournalTitle().clear();
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ID:
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
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_TITLE:
				return journalTitle != null && !journalTitle.isEmpty();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__JOURNAL_SUBTITLE:
				return journalSubtitle != null && !journalSubtitle.isEmpty();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__TRANS_TITLE_GROUP:
				return transTitleGroup != null && !transTitleGroup.isEmpty();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ABBREV_JOURNAL_TITLE:
				return abbrevJournalTitle != null && !abbrevJournalTitle.isEmpty();
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.JOURNAL_TITLE_GROUP_TYPE__ID:
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
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //JournalTitleGroupTypeImpl
