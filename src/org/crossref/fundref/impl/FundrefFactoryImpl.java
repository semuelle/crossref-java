/**
 */
package org.crossref.fundref.impl;

import org.crossref.fundref.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FundrefFactoryImpl extends EFactoryImpl implements FundrefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FundrefFactory init() {
		try {
			FundrefFactory theFundrefFactory = (FundrefFactory)EPackage.Registry.INSTANCE.getEFactory(FundrefPackage.eNS_URI);
			if (theFundrefFactory != null) {
				return theFundrefFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FundrefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FundrefFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FundrefPackage.ASSERTION_TYPE: return createAssertionType();
			case FundrefPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FundrefPackage.PROGRAM_TYPE: return createProgramType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FundrefPackage.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case FundrefPackage.PROVIDER_TYPE:
				return createProviderTypeFromString(eDataType, initialValue);
			case FundrefPackage.NAME_TYPE_OBJECT:
				return createNameTypeObjectFromString(eDataType, initialValue);
			case FundrefPackage.PROVIDER_TYPE_OBJECT:
				return createProviderTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FundrefPackage.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case FundrefPackage.PROVIDER_TYPE:
				return convertProviderTypeToString(eDataType, instanceValue);
			case FundrefPackage.NAME_TYPE_OBJECT:
				return convertNameTypeObjectToString(eDataType, instanceValue);
			case FundrefPackage.PROVIDER_TYPE_OBJECT:
				return convertProviderTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionType createAssertionType() {
		AssertionTypeImpl assertionType = new AssertionTypeImpl();
		return assertionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramType createProgramType() {
		ProgramTypeImpl programType = new ProgramTypeImpl();
		return programType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameTypeFromString(EDataType eDataType, String initialValue) {
		NameType result = NameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderType createProviderTypeFromString(EDataType eDataType, String initialValue) {
		ProviderType result = ProviderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNameTypeFromString(FundrefPackage.Literals.NAME_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameTypeToString(FundrefPackage.Literals.NAME_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderType createProviderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProviderTypeFromString(FundrefPackage.Literals.PROVIDER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProviderTypeToString(FundrefPackage.Literals.PROVIDER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FundrefPackage getFundrefPackage() {
		return (FundrefPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FundrefPackage getPackage() {
		return FundrefPackage.eINSTANCE;
	}

} //FundrefFactoryImpl
