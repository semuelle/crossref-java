/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.BackType;
import gov.nih.nlm.ncbi.jats1.BodyType;
import gov.nih.nlm.ncbi.jats1.FloatsGroupType;
import gov.nih.nlm.ncbi.jats1.FrontStubType;
import gov.nih.nlm.ncbi.jats1.FrontType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.ResponseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getFront <em>Front</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getFrontStub <em>Front Stub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getBack <em>Back</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getFloatsGroup <em>Floats Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ResponseTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseTypeImpl extends MinimalEObjectImpl.Container implements ResponseType {
	/**
	 * The cached value of the '{@link #getFront() <em>Front</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFront()
	 * @generated
	 * @ordered
	 */
	protected FrontType front;

	/**
	 * The cached value of the '{@link #getFrontStub() <em>Front Stub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontStub()
	 * @generated
	 * @ordered
	 */
	protected FrontStubType frontStub;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected BodyType body;

	/**
	 * The cached value of the '{@link #getBack() <em>Back</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBack()
	 * @generated
	 * @ordered
	 */
	protected BackType back;

	/**
	 * The cached value of the '{@link #getFloatsGroup() <em>Floats Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatsGroup()
	 * @generated
	 * @ordered
	 */
	protected FloatsGroupType floatsGroup;

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
	 * The default value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected String responseType = RESPONSE_TYPE_EDEFAULT;

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
	protected ResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getResponseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontType getFront() {
		return front;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFront(FrontType newFront, NotificationChain msgs) {
		FrontType oldFront = front;
		front = newFront;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__FRONT, oldFront, newFront);
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
	public void setFront(FrontType newFront) {
		if (newFront != front) {
			NotificationChain msgs = null;
			if (front != null)
				msgs = ((InternalEObject)front).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__FRONT, null, msgs);
			if (newFront != null)
				msgs = ((InternalEObject)newFront).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__FRONT, null, msgs);
			msgs = basicSetFront(newFront, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__FRONT, newFront, newFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontStubType getFrontStub() {
		return frontStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrontStub(FrontStubType newFrontStub, NotificationChain msgs) {
		FrontStubType oldFrontStub = frontStub;
		frontStub = newFrontStub;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__FRONT_STUB, oldFrontStub, newFrontStub);
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
	public void setFrontStub(FrontStubType newFrontStub) {
		if (newFrontStub != frontStub) {
			NotificationChain msgs = null;
			if (frontStub != null)
				msgs = ((InternalEObject)frontStub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__FRONT_STUB, null, msgs);
			if (newFrontStub != null)
				msgs = ((InternalEObject)newFrontStub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__FRONT_STUB, null, msgs);
			msgs = basicSetFrontStub(newFrontStub, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__FRONT_STUB, newFrontStub, newFrontStub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyType getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(BodyType newBody, NotificationChain msgs) {
		BodyType oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__BODY, oldBody, newBody);
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
	public void setBody(BodyType newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackType getBack() {
		return back;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBack(BackType newBack, NotificationChain msgs) {
		BackType oldBack = back;
		back = newBack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__BACK, oldBack, newBack);
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
	public void setBack(BackType newBack) {
		if (newBack != back) {
			NotificationChain msgs = null;
			if (back != null)
				msgs = ((InternalEObject)back).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__BACK, null, msgs);
			if (newBack != null)
				msgs = ((InternalEObject)newBack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__BACK, null, msgs);
			msgs = basicSetBack(newBack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__BACK, newBack, newBack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatsGroupType getFloatsGroup() {
		return floatsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatsGroup(FloatsGroupType newFloatsGroup, NotificationChain msgs) {
		FloatsGroupType oldFloatsGroup = floatsGroup;
		floatsGroup = newFloatsGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__FLOATS_GROUP, oldFloatsGroup, newFloatsGroup);
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
	public void setFloatsGroup(FloatsGroupType newFloatsGroup) {
		if (newFloatsGroup != floatsGroup) {
			NotificationChain msgs = null;
			if (floatsGroup != null)
				msgs = ((InternalEObject)floatsGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__FLOATS_GROUP, null, msgs);
			if (newFloatsGroup != null)
				msgs = ((InternalEObject)newFloatsGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.RESPONSE_TYPE__FLOATS_GROUP, null, msgs);
			msgs = basicSetFloatsGroup(newFloatsGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__FLOATS_GROUP, newFloatsGroup, newFloatsGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseType() {
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseType(String newResponseType) {
		String oldResponseType = responseType;
		responseType = newResponseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__RESPONSE_TYPE, oldResponseType, responseType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.RESPONSE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.RESPONSE_TYPE__FRONT:
				return basicSetFront(null, msgs);
			case Jats1Package.RESPONSE_TYPE__FRONT_STUB:
				return basicSetFrontStub(null, msgs);
			case Jats1Package.RESPONSE_TYPE__BODY:
				return basicSetBody(null, msgs);
			case Jats1Package.RESPONSE_TYPE__BACK:
				return basicSetBack(null, msgs);
			case Jats1Package.RESPONSE_TYPE__FLOATS_GROUP:
				return basicSetFloatsGroup(null, msgs);
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
			case Jats1Package.RESPONSE_TYPE__FRONT:
				return getFront();
			case Jats1Package.RESPONSE_TYPE__FRONT_STUB:
				return getFrontStub();
			case Jats1Package.RESPONSE_TYPE__BODY:
				return getBody();
			case Jats1Package.RESPONSE_TYPE__BACK:
				return getBack();
			case Jats1Package.RESPONSE_TYPE__FLOATS_GROUP:
				return getFloatsGroup();
			case Jats1Package.RESPONSE_TYPE__BASE:
				return getBase();
			case Jats1Package.RESPONSE_TYPE__ID:
				return getId();
			case Jats1Package.RESPONSE_TYPE__LANG:
				return getLang();
			case Jats1Package.RESPONSE_TYPE__RESPONSE_TYPE:
				return getResponseType();
			case Jats1Package.RESPONSE_TYPE__SPECIFIC_USE:
				return getSpecificUse();
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
			case Jats1Package.RESPONSE_TYPE__FRONT:
				setFront((FrontType)newValue);
				return;
			case Jats1Package.RESPONSE_TYPE__FRONT_STUB:
				setFrontStub((FrontStubType)newValue);
				return;
			case Jats1Package.RESPONSE_TYPE__BODY:
				setBody((BodyType)newValue);
				return;
			case Jats1Package.RESPONSE_TYPE__BACK:
				setBack((BackType)newValue);
				return;
			case Jats1Package.RESPONSE_TYPE__FLOATS_GROUP:
				setFloatsGroup((FloatsGroupType)newValue);
				return;
			case Jats1Package.RESPONSE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.RESPONSE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.RESPONSE_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.RESPONSE_TYPE__RESPONSE_TYPE:
				setResponseType((String)newValue);
				return;
			case Jats1Package.RESPONSE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.RESPONSE_TYPE__FRONT:
				setFront((FrontType)null);
				return;
			case Jats1Package.RESPONSE_TYPE__FRONT_STUB:
				setFrontStub((FrontStubType)null);
				return;
			case Jats1Package.RESPONSE_TYPE__BODY:
				setBody((BodyType)null);
				return;
			case Jats1Package.RESPONSE_TYPE__BACK:
				setBack((BackType)null);
				return;
			case Jats1Package.RESPONSE_TYPE__FLOATS_GROUP:
				setFloatsGroup((FloatsGroupType)null);
				return;
			case Jats1Package.RESPONSE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.RESPONSE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.RESPONSE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.RESPONSE_TYPE__RESPONSE_TYPE:
				setResponseType(RESPONSE_TYPE_EDEFAULT);
				return;
			case Jats1Package.RESPONSE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.RESPONSE_TYPE__FRONT:
				return front != null;
			case Jats1Package.RESPONSE_TYPE__FRONT_STUB:
				return frontStub != null;
			case Jats1Package.RESPONSE_TYPE__BODY:
				return body != null;
			case Jats1Package.RESPONSE_TYPE__BACK:
				return back != null;
			case Jats1Package.RESPONSE_TYPE__FLOATS_GROUP:
				return floatsGroup != null;
			case Jats1Package.RESPONSE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.RESPONSE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.RESPONSE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.RESPONSE_TYPE__RESPONSE_TYPE:
				return RESPONSE_TYPE_EDEFAULT == null ? responseType != null : !RESPONSE_TYPE_EDEFAULT.equals(responseType);
			case Jats1Package.RESPONSE_TYPE__SPECIFIC_USE:
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
		result.append(" (base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", responseType: ");
		result.append(responseType);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //ResponseTypeImpl
