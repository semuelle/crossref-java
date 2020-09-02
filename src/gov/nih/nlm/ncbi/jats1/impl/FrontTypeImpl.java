/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ArticleMetaType;
import gov.nih.nlm.ncbi.jats1.FrontType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.JournalMetaType;
import gov.nih.nlm.ncbi.jats1.NotesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FrontTypeImpl#getJournalMeta <em>Journal Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FrontTypeImpl#getArticleMeta <em>Article Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FrontTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FrontTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FrontTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrontTypeImpl extends MinimalEObjectImpl.Container implements FrontType {
	/**
	 * The cached value of the '{@link #getJournalMeta() <em>Journal Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalMeta()
	 * @generated
	 * @ordered
	 */
	protected JournalMetaType journalMeta;

	/**
	 * The cached value of the '{@link #getArticleMeta() <em>Article Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticleMeta()
	 * @generated
	 * @ordered
	 */
	protected ArticleMetaType articleMeta;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected NotesType notes;

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
	protected FrontTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getFrontType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalMetaType getJournalMeta() {
		return journalMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalMeta(JournalMetaType newJournalMeta, NotificationChain msgs) {
		JournalMetaType oldJournalMeta = journalMeta;
		journalMeta = newJournalMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.FRONT_TYPE__JOURNAL_META, oldJournalMeta, newJournalMeta);
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
	public void setJournalMeta(JournalMetaType newJournalMeta) {
		if (newJournalMeta != journalMeta) {
			NotificationChain msgs = null;
			if (journalMeta != null)
				msgs = ((InternalEObject)journalMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.FRONT_TYPE__JOURNAL_META, null, msgs);
			if (newJournalMeta != null)
				msgs = ((InternalEObject)newJournalMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.FRONT_TYPE__JOURNAL_META, null, msgs);
			msgs = basicSetJournalMeta(newJournalMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FRONT_TYPE__JOURNAL_META, newJournalMeta, newJournalMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticleMetaType getArticleMeta() {
		return articleMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticleMeta(ArticleMetaType newArticleMeta, NotificationChain msgs) {
		ArticleMetaType oldArticleMeta = articleMeta;
		articleMeta = newArticleMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.FRONT_TYPE__ARTICLE_META, oldArticleMeta, newArticleMeta);
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
	public void setArticleMeta(ArticleMetaType newArticleMeta) {
		if (newArticleMeta != articleMeta) {
			NotificationChain msgs = null;
			if (articleMeta != null)
				msgs = ((InternalEObject)articleMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.FRONT_TYPE__ARTICLE_META, null, msgs);
			if (newArticleMeta != null)
				msgs = ((InternalEObject)newArticleMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.FRONT_TYPE__ARTICLE_META, null, msgs);
			msgs = basicSetArticleMeta(newArticleMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FRONT_TYPE__ARTICLE_META, newArticleMeta, newArticleMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotesType getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(NotesType newNotes, NotificationChain msgs) {
		NotesType oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.FRONT_TYPE__NOTES, oldNotes, newNotes);
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
	public void setNotes(NotesType newNotes) {
		if (newNotes != notes) {
			NotificationChain msgs = null;
			if (notes != null)
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.FRONT_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.FRONT_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FRONT_TYPE__NOTES, newNotes, newNotes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FRONT_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FRONT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.FRONT_TYPE__JOURNAL_META:
				return basicSetJournalMeta(null, msgs);
			case Jats1Package.FRONT_TYPE__ARTICLE_META:
				return basicSetArticleMeta(null, msgs);
			case Jats1Package.FRONT_TYPE__NOTES:
				return basicSetNotes(null, msgs);
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
			case Jats1Package.FRONT_TYPE__JOURNAL_META:
				return getJournalMeta();
			case Jats1Package.FRONT_TYPE__ARTICLE_META:
				return getArticleMeta();
			case Jats1Package.FRONT_TYPE__NOTES:
				return getNotes();
			case Jats1Package.FRONT_TYPE__BASE:
				return getBase();
			case Jats1Package.FRONT_TYPE__ID:
				return getId();
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
			case Jats1Package.FRONT_TYPE__JOURNAL_META:
				setJournalMeta((JournalMetaType)newValue);
				return;
			case Jats1Package.FRONT_TYPE__ARTICLE_META:
				setArticleMeta((ArticleMetaType)newValue);
				return;
			case Jats1Package.FRONT_TYPE__NOTES:
				setNotes((NotesType)newValue);
				return;
			case Jats1Package.FRONT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.FRONT_TYPE__ID:
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
			case Jats1Package.FRONT_TYPE__JOURNAL_META:
				setJournalMeta((JournalMetaType)null);
				return;
			case Jats1Package.FRONT_TYPE__ARTICLE_META:
				setArticleMeta((ArticleMetaType)null);
				return;
			case Jats1Package.FRONT_TYPE__NOTES:
				setNotes((NotesType)null);
				return;
			case Jats1Package.FRONT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.FRONT_TYPE__ID:
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
			case Jats1Package.FRONT_TYPE__JOURNAL_META:
				return journalMeta != null;
			case Jats1Package.FRONT_TYPE__ARTICLE_META:
				return articleMeta != null;
			case Jats1Package.FRONT_TYPE__NOTES:
				return notes != null;
			case Jats1Package.FRONT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.FRONT_TYPE__ID:
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

} //FrontTypeImpl
