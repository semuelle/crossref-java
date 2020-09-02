/**
 */
package gov.nih.nlm.ncbi.jats1.util;

import gov.nih.nlm.ncbi.jats1.Jats1Package;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Jats1XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jats1XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Jats1Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Jats1ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Jats1ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Jats1ResourceFactoryImpl());
		}
		return registrations;
	}

} //Jats1XMLProcessor
