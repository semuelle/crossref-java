/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AckType;
import gov.nih.nlm.ncbi.jats1.AppGroupType;
import gov.nih.nlm.ncbi.jats1.BackType;
import gov.nih.nlm.ncbi.jats1.BioType;
import gov.nih.nlm.ncbi.jats1.FnGroupType;
import gov.nih.nlm.ncbi.jats1.GlossaryType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.NotesType;
import gov.nih.nlm.ncbi.jats1.RefListType;
import gov.nih.nlm.ncbi.jats1.SecType;
import gov.nih.nlm.ncbi.jats1.TitleType;

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
 * An implementation of the model object '<em><b>Back Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getDocBackMatterMix <em>Doc Back Matter Mix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getAck <em>Ack</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getAppGroup <em>App Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getBio <em>Bio</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getFnGroup <em>Fn Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getRefList <em>Ref List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BackTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackTypeImpl extends MinimalEObjectImpl.Container implements BackType {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<TitleType> title;

	/**
	 * The cached value of the '{@link #getDocBackMatterMix() <em>Doc Back Matter Mix</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocBackMatterMix()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap docBackMatterMix;

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
	protected BackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getBackType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.BACK_TYPE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BACK_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BACK_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BACK_TYPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleType> getTitle() {
		if (title == null) {
			title = new EObjectContainmentEList<TitleType>(TitleType.class, this, Jats1Package.BACK_TYPE__TITLE);
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDocBackMatterMix() {
		if (docBackMatterMix == null) {
			docBackMatterMix = new BasicFeatureMap(this, Jats1Package.BACK_TYPE__DOC_BACK_MATTER_MIX);
		}
		return docBackMatterMix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AckType> getAck() {
		return getDocBackMatterMix().list(Jats1Package.eINSTANCE.getBackType_Ack());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AppGroupType> getAppGroup() {
		return getDocBackMatterMix().list(Jats1Package.eINSTANCE.getBackType_AppGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BioType> getBio() {
		return getDocBackMatterMix().list(Jats1Package.eINSTANCE.getBackType_Bio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnGroupType> getFnGroup() {
		return getDocBackMatterMix().list(Jats1Package.eINSTANCE.getBackType_FnGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryType> getGlossary() {
		return getDocBackMatterMix().list(Jats1Package.eINSTANCE.getBackType_Glossary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefListType> getRefList() {
		return getDocBackMatterMix().list(Jats1Package.eINSTANCE.getBackType_RefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NotesType> getNotes() {
		return getDocBackMatterMix().list(Jats1Package.eINSTANCE.getBackType_Notes());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecType> getSec() {
		return getDocBackMatterMix().list(Jats1Package.eINSTANCE.getBackType_Sec());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BACK_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BACK_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.BACK_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.BACK_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case Jats1Package.BACK_TYPE__DOC_BACK_MATTER_MIX:
				return ((InternalEList<?>)getDocBackMatterMix()).basicRemove(otherEnd, msgs);
			case Jats1Package.BACK_TYPE__ACK:
				return ((InternalEList<?>)getAck()).basicRemove(otherEnd, msgs);
			case Jats1Package.BACK_TYPE__APP_GROUP:
				return ((InternalEList<?>)getAppGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BACK_TYPE__BIO:
				return ((InternalEList<?>)getBio()).basicRemove(otherEnd, msgs);
			case Jats1Package.BACK_TYPE__FN_GROUP:
				return ((InternalEList<?>)getFnGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BACK_TYPE__GLOSSARY:
				return ((InternalEList<?>)getGlossary()).basicRemove(otherEnd, msgs);
			case Jats1Package.BACK_TYPE__REF_LIST:
				return ((InternalEList<?>)getRefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.BACK_TYPE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case Jats1Package.BACK_TYPE__SEC:
				return ((InternalEList<?>)getSec()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.BACK_TYPE__LABEL:
				return getLabel();
			case Jats1Package.BACK_TYPE__TITLE:
				return getTitle();
			case Jats1Package.BACK_TYPE__DOC_BACK_MATTER_MIX:
				if (coreType) return getDocBackMatterMix();
				return ((FeatureMap.Internal)getDocBackMatterMix()).getWrapper();
			case Jats1Package.BACK_TYPE__ACK:
				return getAck();
			case Jats1Package.BACK_TYPE__APP_GROUP:
				return getAppGroup();
			case Jats1Package.BACK_TYPE__BIO:
				return getBio();
			case Jats1Package.BACK_TYPE__FN_GROUP:
				return getFnGroup();
			case Jats1Package.BACK_TYPE__GLOSSARY:
				return getGlossary();
			case Jats1Package.BACK_TYPE__REF_LIST:
				return getRefList();
			case Jats1Package.BACK_TYPE__NOTES:
				return getNotes();
			case Jats1Package.BACK_TYPE__SEC:
				return getSec();
			case Jats1Package.BACK_TYPE__BASE:
				return getBase();
			case Jats1Package.BACK_TYPE__ID:
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
			case Jats1Package.BACK_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.BACK_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case Jats1Package.BACK_TYPE__DOC_BACK_MATTER_MIX:
				((FeatureMap.Internal)getDocBackMatterMix()).set(newValue);
				return;
			case Jats1Package.BACK_TYPE__ACK:
				getAck().clear();
				getAck().addAll((Collection<? extends AckType>)newValue);
				return;
			case Jats1Package.BACK_TYPE__APP_GROUP:
				getAppGroup().clear();
				getAppGroup().addAll((Collection<? extends AppGroupType>)newValue);
				return;
			case Jats1Package.BACK_TYPE__BIO:
				getBio().clear();
				getBio().addAll((Collection<? extends BioType>)newValue);
				return;
			case Jats1Package.BACK_TYPE__FN_GROUP:
				getFnGroup().clear();
				getFnGroup().addAll((Collection<? extends FnGroupType>)newValue);
				return;
			case Jats1Package.BACK_TYPE__GLOSSARY:
				getGlossary().clear();
				getGlossary().addAll((Collection<? extends GlossaryType>)newValue);
				return;
			case Jats1Package.BACK_TYPE__REF_LIST:
				getRefList().clear();
				getRefList().addAll((Collection<? extends RefListType>)newValue);
				return;
			case Jats1Package.BACK_TYPE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends NotesType>)newValue);
				return;
			case Jats1Package.BACK_TYPE__SEC:
				getSec().clear();
				getSec().addAll((Collection<? extends SecType>)newValue);
				return;
			case Jats1Package.BACK_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.BACK_TYPE__ID:
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
			case Jats1Package.BACK_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.BACK_TYPE__TITLE:
				getTitle().clear();
				return;
			case Jats1Package.BACK_TYPE__DOC_BACK_MATTER_MIX:
				getDocBackMatterMix().clear();
				return;
			case Jats1Package.BACK_TYPE__ACK:
				getAck().clear();
				return;
			case Jats1Package.BACK_TYPE__APP_GROUP:
				getAppGroup().clear();
				return;
			case Jats1Package.BACK_TYPE__BIO:
				getBio().clear();
				return;
			case Jats1Package.BACK_TYPE__FN_GROUP:
				getFnGroup().clear();
				return;
			case Jats1Package.BACK_TYPE__GLOSSARY:
				getGlossary().clear();
				return;
			case Jats1Package.BACK_TYPE__REF_LIST:
				getRefList().clear();
				return;
			case Jats1Package.BACK_TYPE__NOTES:
				getNotes().clear();
				return;
			case Jats1Package.BACK_TYPE__SEC:
				getSec().clear();
				return;
			case Jats1Package.BACK_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.BACK_TYPE__ID:
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
			case Jats1Package.BACK_TYPE__LABEL:
				return label != null;
			case Jats1Package.BACK_TYPE__TITLE:
				return title != null && !title.isEmpty();
			case Jats1Package.BACK_TYPE__DOC_BACK_MATTER_MIX:
				return docBackMatterMix != null && !docBackMatterMix.isEmpty();
			case Jats1Package.BACK_TYPE__ACK:
				return !getAck().isEmpty();
			case Jats1Package.BACK_TYPE__APP_GROUP:
				return !getAppGroup().isEmpty();
			case Jats1Package.BACK_TYPE__BIO:
				return !getBio().isEmpty();
			case Jats1Package.BACK_TYPE__FN_GROUP:
				return !getFnGroup().isEmpty();
			case Jats1Package.BACK_TYPE__GLOSSARY:
				return !getGlossary().isEmpty();
			case Jats1Package.BACK_TYPE__REF_LIST:
				return !getRefList().isEmpty();
			case Jats1Package.BACK_TYPE__NOTES:
				return !getNotes().isEmpty();
			case Jats1Package.BACK_TYPE__SEC:
				return !getSec().isEmpty();
			case Jats1Package.BACK_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.BACK_TYPE__ID:
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
		result.append(" (docBackMatterMix: ");
		result.append(docBackMatterMix);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BackTypeImpl
