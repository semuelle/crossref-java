/**
 */
package org.crossref.access.indicators.util;

import java.util.Map;

import org.crossref.access.indicators.IndicatorsPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IndicatorsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		IndicatorsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the IndicatorsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new IndicatorsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new IndicatorsResourceFactoryImpl());
		}
		return registrations;
	}

} //IndicatorsXMLProcessor
