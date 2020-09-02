/**
 */
package org.crossref.schema._4._4.util;

import java.util.Map;

import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class _4XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _4XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		_4Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the _4ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new _4ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new _4ResourceFactoryImpl());
		}
		return registrations;
	}

} //_4XMLProcessor
