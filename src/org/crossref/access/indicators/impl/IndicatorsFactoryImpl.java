/**
 */
package org.crossref.access.indicators.impl;

import org.crossref.access.indicators.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndicatorsFactoryImpl extends EFactoryImpl implements IndicatorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IndicatorsFactory init() {
		try {
			IndicatorsFactory theIndicatorsFactory = (IndicatorsFactory)EPackage.Registry.INSTANCE.getEFactory(IndicatorsPackage.eNS_URI);
			if (theIndicatorsFactory != null) {
				return theIndicatorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IndicatorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorsFactoryImpl() {
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
			case IndicatorsPackage.FREE_TO_READ_TYPE: return createFreeToReadType();
			case IndicatorsPackage.LICENSE_REF_TYPE: return createLicenseRefType();
			case IndicatorsPackage.PROGRAM_TYPE: return createProgramType();
			case IndicatorsPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case IndicatorsPackage.APPLIES_TO_TYPE:
				return createAppliesToTypeFromString(eDataType, initialValue);
			case IndicatorsPackage.APPLIES_TO_TYPE_OBJECT:
				return createAppliesToTypeObjectFromString(eDataType, initialValue);
			case IndicatorsPackage.LICENSE_REF_T:
				return createLicenseRefTFromString(eDataType, initialValue);
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
			case IndicatorsPackage.APPLIES_TO_TYPE:
				return convertAppliesToTypeToString(eDataType, instanceValue);
			case IndicatorsPackage.APPLIES_TO_TYPE_OBJECT:
				return convertAppliesToTypeObjectToString(eDataType, instanceValue);
			case IndicatorsPackage.LICENSE_REF_T:
				return convertLicenseRefTToString(eDataType, instanceValue);
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
	public FreeToReadType createFreeToReadType() {
		FreeToReadTypeImpl freeToReadType = new FreeToReadTypeImpl();
		return freeToReadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseRefType createLicenseRefType() {
		LicenseRefTypeImpl licenseRefType = new LicenseRefTypeImpl();
		return licenseRefType;
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
	public AppliesToType createAppliesToTypeFromString(EDataType eDataType, String initialValue) {
		AppliesToType result = AppliesToType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppliesToTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliesToType createAppliesToTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAppliesToTypeFromString(IndicatorsPackage.Literals.APPLIES_TO_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppliesToTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAppliesToTypeToString(IndicatorsPackage.Literals.APPLIES_TO_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLicenseRefTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLicenseRefTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndicatorsPackage getIndicatorsPackage() {
		return (IndicatorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IndicatorsPackage getPackage() {
		return IndicatorsPackage.eINSTANCE;
	}

} //IndicatorsFactoryImpl
