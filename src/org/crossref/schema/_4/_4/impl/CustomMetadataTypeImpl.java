/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.fundref.ProgramType;

import org.crossref.schema._4._4.AssertionType;
import org.crossref.schema._4._4.CustomMetadataType;
import org.crossref.schema._4._4._4Package;

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
 * An implementation of the model object '<em><b>Custom Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getProgram1 <em>Program1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getProgram2 <em>Program2</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getProgram3 <em>Program3</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getProgram4 <em>Program4</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getProgram5 <em>Program5</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getProgram6 <em>Program6</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getProgram7 <em>Program7</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl#getProgram8 <em>Program8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomMetadataTypeImpl extends MinimalEObjectImpl.Container implements CustomMetadataType {
	/**
	 * The cached value of the '{@link #getAssertion() <em>Assertion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertion()
	 * @generated
	 * @ordered
	 */
	protected EList<AssertionType> assertion;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected ProgramType program;

	/**
	 * The cached value of the '{@link #getProgram1() <em>Program1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram1()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.access.indicators.ProgramType program1;

	/**
	 * The cached value of the '{@link #getProgram2() <em>Program2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram2()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.clinicaltrials.ProgramType program2;

	/**
	 * The cached value of the '{@link #getProgram3() <em>Program3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram3()
	 * @generated
	 * @ordered
	 */
	protected ProgramType program3;

	/**
	 * The cached value of the '{@link #getProgram4() <em>Program4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram4()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.access.indicators.ProgramType program4;

	/**
	 * The cached value of the '{@link #getProgram5() <em>Program5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram5()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.clinicaltrials.ProgramType program5;

	/**
	 * The cached value of the '{@link #getProgram6() <em>Program6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram6()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.access.indicators.ProgramType program6;

	/**
	 * The cached value of the '{@link #getProgram7() <em>Program7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram7()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.clinicaltrials.ProgramType program7;

	/**
	 * The cached value of the '{@link #getProgram8() <em>Program8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram8()
	 * @generated
	 * @ordered
	 */
	protected org.crossref.clinicaltrials.ProgramType program8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getCustomMetadataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssertionType> getAssertion() {
		if (assertion == null) {
			assertion = new EObjectContainmentEList<AssertionType>(AssertionType.class, this, _4Package.CUSTOM_METADATA_TYPE__ASSERTION);
		}
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramType getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(ProgramType newProgram, NotificationChain msgs) {
		ProgramType oldProgram = program;
		program = newProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM, oldProgram, newProgram);
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
	public void setProgram(ProgramType newProgram) {
		if (newProgram != program) {
			NotificationChain msgs = null;
			if (program != null)
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.access.indicators.ProgramType getProgram1() {
		return program1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram1(org.crossref.access.indicators.ProgramType newProgram1, NotificationChain msgs) {
		org.crossref.access.indicators.ProgramType oldProgram1 = program1;
		program1 = newProgram1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM1, oldProgram1, newProgram1);
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
	public void setProgram1(org.crossref.access.indicators.ProgramType newProgram1) {
		if (newProgram1 != program1) {
			NotificationChain msgs = null;
			if (program1 != null)
				msgs = ((InternalEObject)program1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM1, null, msgs);
			if (newProgram1 != null)
				msgs = ((InternalEObject)newProgram1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM1, null, msgs);
			msgs = basicSetProgram1(newProgram1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM1, newProgram1, newProgram1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.clinicaltrials.ProgramType getProgram2() {
		return program2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram2(org.crossref.clinicaltrials.ProgramType newProgram2, NotificationChain msgs) {
		org.crossref.clinicaltrials.ProgramType oldProgram2 = program2;
		program2 = newProgram2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM2, oldProgram2, newProgram2);
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
	public void setProgram2(org.crossref.clinicaltrials.ProgramType newProgram2) {
		if (newProgram2 != program2) {
			NotificationChain msgs = null;
			if (program2 != null)
				msgs = ((InternalEObject)program2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM2, null, msgs);
			if (newProgram2 != null)
				msgs = ((InternalEObject)newProgram2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM2, null, msgs);
			msgs = basicSetProgram2(newProgram2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM2, newProgram2, newProgram2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramType getProgram3() {
		return program3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram3(ProgramType newProgram3, NotificationChain msgs) {
		ProgramType oldProgram3 = program3;
		program3 = newProgram3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM3, oldProgram3, newProgram3);
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
	public void setProgram3(ProgramType newProgram3) {
		if (newProgram3 != program3) {
			NotificationChain msgs = null;
			if (program3 != null)
				msgs = ((InternalEObject)program3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM3, null, msgs);
			if (newProgram3 != null)
				msgs = ((InternalEObject)newProgram3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM3, null, msgs);
			msgs = basicSetProgram3(newProgram3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM3, newProgram3, newProgram3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.access.indicators.ProgramType getProgram4() {
		return program4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram4(org.crossref.access.indicators.ProgramType newProgram4, NotificationChain msgs) {
		org.crossref.access.indicators.ProgramType oldProgram4 = program4;
		program4 = newProgram4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM4, oldProgram4, newProgram4);
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
	public void setProgram4(org.crossref.access.indicators.ProgramType newProgram4) {
		if (newProgram4 != program4) {
			NotificationChain msgs = null;
			if (program4 != null)
				msgs = ((InternalEObject)program4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM4, null, msgs);
			if (newProgram4 != null)
				msgs = ((InternalEObject)newProgram4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM4, null, msgs);
			msgs = basicSetProgram4(newProgram4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM4, newProgram4, newProgram4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.clinicaltrials.ProgramType getProgram5() {
		return program5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram5(org.crossref.clinicaltrials.ProgramType newProgram5, NotificationChain msgs) {
		org.crossref.clinicaltrials.ProgramType oldProgram5 = program5;
		program5 = newProgram5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM5, oldProgram5, newProgram5);
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
	public void setProgram5(org.crossref.clinicaltrials.ProgramType newProgram5) {
		if (newProgram5 != program5) {
			NotificationChain msgs = null;
			if (program5 != null)
				msgs = ((InternalEObject)program5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM5, null, msgs);
			if (newProgram5 != null)
				msgs = ((InternalEObject)newProgram5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM5, null, msgs);
			msgs = basicSetProgram5(newProgram5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM5, newProgram5, newProgram5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.access.indicators.ProgramType getProgram6() {
		return program6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram6(org.crossref.access.indicators.ProgramType newProgram6, NotificationChain msgs) {
		org.crossref.access.indicators.ProgramType oldProgram6 = program6;
		program6 = newProgram6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM6, oldProgram6, newProgram6);
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
	public void setProgram6(org.crossref.access.indicators.ProgramType newProgram6) {
		if (newProgram6 != program6) {
			NotificationChain msgs = null;
			if (program6 != null)
				msgs = ((InternalEObject)program6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM6, null, msgs);
			if (newProgram6 != null)
				msgs = ((InternalEObject)newProgram6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM6, null, msgs);
			msgs = basicSetProgram6(newProgram6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM6, newProgram6, newProgram6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.clinicaltrials.ProgramType getProgram7() {
		return program7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram7(org.crossref.clinicaltrials.ProgramType newProgram7, NotificationChain msgs) {
		org.crossref.clinicaltrials.ProgramType oldProgram7 = program7;
		program7 = newProgram7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM7, oldProgram7, newProgram7);
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
	public void setProgram7(org.crossref.clinicaltrials.ProgramType newProgram7) {
		if (newProgram7 != program7) {
			NotificationChain msgs = null;
			if (program7 != null)
				msgs = ((InternalEObject)program7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM7, null, msgs);
			if (newProgram7 != null)
				msgs = ((InternalEObject)newProgram7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM7, null, msgs);
			msgs = basicSetProgram7(newProgram7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM7, newProgram7, newProgram7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.crossref.clinicaltrials.ProgramType getProgram8() {
		return program8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram8(org.crossref.clinicaltrials.ProgramType newProgram8, NotificationChain msgs) {
		org.crossref.clinicaltrials.ProgramType oldProgram8 = program8;
		program8 = newProgram8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM8, oldProgram8, newProgram8);
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
	public void setProgram8(org.crossref.clinicaltrials.ProgramType newProgram8) {
		if (newProgram8 != program8) {
			NotificationChain msgs = null;
			if (program8 != null)
				msgs = ((InternalEObject)program8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM8, null, msgs);
			if (newProgram8 != null)
				msgs = ((InternalEObject)newProgram8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CUSTOM_METADATA_TYPE__PROGRAM8, null, msgs);
			msgs = basicSetProgram8(newProgram8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CUSTOM_METADATA_TYPE__PROGRAM8, newProgram8, newProgram8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.CUSTOM_METADATA_TYPE__ASSERTION:
				return ((InternalEList<?>)getAssertion()).basicRemove(otherEnd, msgs);
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM:
				return basicSetProgram(null, msgs);
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM1:
				return basicSetProgram1(null, msgs);
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM2:
				return basicSetProgram2(null, msgs);
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM3:
				return basicSetProgram3(null, msgs);
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM4:
				return basicSetProgram4(null, msgs);
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM5:
				return basicSetProgram5(null, msgs);
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM6:
				return basicSetProgram6(null, msgs);
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM7:
				return basicSetProgram7(null, msgs);
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM8:
				return basicSetProgram8(null, msgs);
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
			case _4Package.CUSTOM_METADATA_TYPE__ASSERTION:
				return getAssertion();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM:
				return getProgram();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM1:
				return getProgram1();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM2:
				return getProgram2();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM3:
				return getProgram3();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM4:
				return getProgram4();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM5:
				return getProgram5();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM6:
				return getProgram6();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM7:
				return getProgram7();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM8:
				return getProgram8();
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
			case _4Package.CUSTOM_METADATA_TYPE__ASSERTION:
				getAssertion().clear();
				getAssertion().addAll((Collection<? extends AssertionType>)newValue);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM:
				setProgram((ProgramType)newValue);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)newValue);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM2:
				setProgram2((org.crossref.clinicaltrials.ProgramType)newValue);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM3:
				setProgram3((ProgramType)newValue);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM4:
				setProgram4((org.crossref.access.indicators.ProgramType)newValue);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM5:
				setProgram5((org.crossref.clinicaltrials.ProgramType)newValue);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM6:
				setProgram6((org.crossref.access.indicators.ProgramType)newValue);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM7:
				setProgram7((org.crossref.clinicaltrials.ProgramType)newValue);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM8:
				setProgram8((org.crossref.clinicaltrials.ProgramType)newValue);
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
			case _4Package.CUSTOM_METADATA_TYPE__ASSERTION:
				getAssertion().clear();
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM:
				setProgram((ProgramType)null);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM1:
				setProgram1((org.crossref.access.indicators.ProgramType)null);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM2:
				setProgram2((org.crossref.clinicaltrials.ProgramType)null);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM3:
				setProgram3((ProgramType)null);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM4:
				setProgram4((org.crossref.access.indicators.ProgramType)null);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM5:
				setProgram5((org.crossref.clinicaltrials.ProgramType)null);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM6:
				setProgram6((org.crossref.access.indicators.ProgramType)null);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM7:
				setProgram7((org.crossref.clinicaltrials.ProgramType)null);
				return;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM8:
				setProgram8((org.crossref.clinicaltrials.ProgramType)null);
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
			case _4Package.CUSTOM_METADATA_TYPE__ASSERTION:
				return assertion != null && !assertion.isEmpty();
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM:
				return program != null;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM1:
				return program1 != null;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM2:
				return program2 != null;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM3:
				return program3 != null;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM4:
				return program4 != null;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM5:
				return program5 != null;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM6:
				return program6 != null;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM7:
				return program7 != null;
			case _4Package.CUSTOM_METADATA_TYPE__PROGRAM8:
				return program8 != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomMetadataTypeImpl
