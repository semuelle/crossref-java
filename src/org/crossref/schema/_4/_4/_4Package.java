/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  Version: 1.1 This is CrossRef's schema for defining the applicable
 *             licenses for a given item. This schema was available and in use prior to the completion
 *             of the NISO working group Access and License Indicators
 *             (http://www.niso.org/publications/rp/rp-22-2015). That effort produced a schema
 *             (http://www.niso.org/schemas/ali/1.0/ali.xsd) that extended the CrossRef definition but
 *             at the same time omitted necessary CrossRef features. This schema will continue as the
 *             basis for CrossRef metadata deposits, but will incorporate the NISO work where possible.
 *             Change history: 2/23/15 CSK added Niso free_to_read element 
 *                             4/21/15 CSK added start and end attributes to the free-to-read element as in the Niso ALI schema
 *                                         but will make both attributes optional.
 *         
 *   
 *          Linked Clinical Trials is a CrossRef initiative helping to connect the published literature to registered clinical trials associated with the research,
 *          
 *             - version 1.0 (initial release) September 24, 2015
 *         
 * <!-- end-model-doc -->
 * @see org.crossref.schema._4._4._4Factory
 * @model kind="package"
 * @generated
 */
public interface _4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_4";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.crossref.org/schema/4.4.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_4Package eINSTANCE = org.crossref.schema._4._4.impl._4PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DateTImpl <em>Date T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DateTImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDateT()
	 * @generated
	 */
	int DATE_T = 35;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_T__MONTH = 0;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_T__DAY = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_T__YEAR = 2;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_T__MEDIA_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Date T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_T_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Date T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_T_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.AcceptanceDateTypeImpl <em>Acceptance Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.AcceptanceDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getAcceptanceDateType()
	 * @generated
	 */
	int ACCEPTANCE_DATE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_DATE_TYPE__MONTH = DATE_T__MONTH;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_DATE_TYPE__DAY = DATE_T__DAY;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_DATE_TYPE__YEAR = DATE_T__YEAR;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_DATE_TYPE__MEDIA_TYPE = DATE_T__MEDIA_TYPE;

	/**
	 * The number of structural features of the '<em>Acceptance Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_DATE_TYPE_FEATURE_COUNT = DATE_T_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Acceptance Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_DATE_TYPE_OPERATION_COUNT = DATE_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.AltNameTypeImpl <em>Alt Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.AltNameTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getAltNameType()
	 * @generated
	 */
	int ALT_NAME_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_NAME_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_NAME_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>String Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_NAME_TYPE__STRING_NAME = 2;

	/**
	 * The number of structural features of the '<em>Alt Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_NAME_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Alt Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.AnonymousTypeImpl <em>Anonymous Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.AnonymousTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getAnonymousType()
	 * @generated
	 */
	int ANONYMOUS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__AFFILIATION = 0;

	/**
	 * The feature id for the '<em><b>Contributor Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__CONTRIBUTOR_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Name Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__NAME_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE__SEQUENCE = 4;

	/**
	 * The number of structural features of the '<em>Anonymous Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Anonymous Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ApprovalDateTypeImpl <em>Approval Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ApprovalDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getApprovalDateType()
	 * @generated
	 */
	int APPROVAL_DATE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_DATE_TYPE__MONTH = DATE_T__MONTH;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_DATE_TYPE__DAY = DATE_T__DAY;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_DATE_TYPE__YEAR = DATE_T__YEAR;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_DATE_TYPE__MEDIA_TYPE = DATE_T__MEDIA_TYPE;

	/**
	 * The number of structural features of the '<em>Approval Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_DATE_TYPE_FEATURE_COUNT = DATE_T_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Approval Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_DATE_TYPE_OPERATION_COUNT = DATE_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ArchiveLocationsTypeImpl <em>Archive Locations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ArchiveLocationsTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getArchiveLocationsType()
	 * @generated
	 */
	int ARCHIVE_LOCATIONS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_LOCATIONS_TYPE__ARCHIVE = 0;

	/**
	 * The number of structural features of the '<em>Archive Locations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_LOCATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Archive Locations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_LOCATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ArchiveTypeImpl <em>Archive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ArchiveTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getArchiveType()
	 * @generated
	 */
	int ARCHIVE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Archive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Archive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.AssertionTypeImpl <em>Assertion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.AssertionTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getAssertionType()
	 * @generated
	 */
	int ASSERTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__FONT = 12;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__MATH = 13;

	/**
	 * The feature id for the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__EXPLANATION = 14;

	/**
	 * The feature id for the '<em><b>Group Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__GROUP_LABEL = 15;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__GROUP_NAME = 16;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__HREF = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__LABEL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__NAME = 19;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__ORDER = 20;

	/**
	 * The number of structural features of the '<em>Assertion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Assertion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ATypeImpl <em>AType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ATypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getAType()
	 * @generated
	 */
	int ATYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__HREF = 1;

	/**
	 * The number of structural features of the '<em>AType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.BodyTypeImpl <em>Body Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.BodyTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getBodyType()
	 * @generated
	 */
	int BODY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Journal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__JOURNAL = 0;

	/**
	 * The feature id for the '<em><b>Book</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__BOOK = 1;

	/**
	 * The feature id for the '<em><b>Conference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__CONFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Sa Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__SA_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Dissertation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__DISSERTATION = 4;

	/**
	 * The feature id for the '<em><b>Report Paper</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__REPORT_PAPER = 5;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__STANDARD = 6;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__DATABASE = 7;

	/**
	 * The feature id for the '<em><b>Peer Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__PEER_REVIEW = 8;

	/**
	 * The feature id for the '<em><b>Pending Publication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__PENDING_PUBLICATION = 9;

	/**
	 * The feature id for the '<em><b>Posted Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__POSTED_CONTENT = 10;

	/**
	 * The number of structural features of the '<em>Body Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Body Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.BookMetadataTypeImpl <em>Book Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.BookMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getBookMetadataType()
	 * @generated
	 */
	int BOOK_METADATA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__EDITION_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__PUBLICATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Acceptance Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__ACCEPTANCE_DATE = 5;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__ISBN = 6;

	/**
	 * The feature id for the '<em><b>Noisbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__NOISBN = 7;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__PUBLISHER = 8;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__PUBLISHER_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__CROSSMARK = 10;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__PROGRAM = 11;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__PROGRAM1 = 12;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__PROGRAM2 = 13;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__ARCHIVE_LOCATIONS = 14;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__DOI_DATA = 15;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__CITATION_LIST = 16;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__LANGUAGE = 17;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 18;

	/**
	 * The number of structural features of the '<em>Book Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Book Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.BookSeriesMetadataTypeImpl <em>Book Series Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.BookSeriesMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getBookSeriesMetadataType()
	 * @generated
	 */
	int BOOK_SERIES_METADATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__SERIES_METADATA = 0;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__CONTRIBUTORS = 1;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__TITLES = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__VOLUME = 4;

	/**
	 * The feature id for the '<em><b>Volume1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__VOLUME1 = 5;

	/**
	 * The feature id for the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__EDITION_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__PUBLICATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__ISBN = 8;

	/**
	 * The feature id for the '<em><b>Noisbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__NOISBN = 9;

	/**
	 * The feature id for the '<em><b>Publication Date1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__PUBLICATION_DATE1 = 10;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__PUBLISHER = 11;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__PUBLISHER_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__CROSSMARK = 13;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__PROGRAM = 14;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__PROGRAM1 = 15;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__PROGRAM2 = 16;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS = 17;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__DOI_DATA = 18;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__CITATION_LIST = 19;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__LANGUAGE = 20;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 21;

	/**
	 * The number of structural features of the '<em>Book Series Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Book Series Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SERIES_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.BookSetMetadataTypeImpl <em>Book Set Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.BookSetMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getBookSetMetadataType()
	 * @generated
	 */
	int BOOK_SET_METADATA_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Set Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__SET_METADATA = 0;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__CONTRIBUTORS = 1;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__TITLES = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__VOLUME = 4;

	/**
	 * The feature id for the '<em><b>Volume1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__VOLUME1 = 5;

	/**
	 * The feature id for the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__EDITION_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__PUBLICATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__ISBN = 8;

	/**
	 * The feature id for the '<em><b>Noisbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__NOISBN = 9;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__PUBLISHER = 10;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__PUBLISHER_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__CROSSMARK = 12;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__PROGRAM = 13;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__PROGRAM1 = 14;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__PROGRAM2 = 15;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__ARCHIVE_LOCATIONS = 16;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__DOI_DATA = 17;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__CITATION_LIST = 18;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__LANGUAGE = 19;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 20;

	/**
	 * The number of structural features of the '<em>Book Set Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Book Set Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_SET_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.BookTypeImpl <em>Book Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.BookTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getBookType()
	 * @generated
	 */
	int BOOK_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Book Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__BOOK_METADATA = 0;

	/**
	 * The feature id for the '<em><b>Book Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__BOOK_SERIES_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Book Set Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__BOOK_SET_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Content Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__CONTENT_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Book Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__BOOK_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Book Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Book Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CitationListTypeImpl <em>Citation List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CitationListTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCitationListType()
	 * @generated
	 */
	int CITATION_LIST_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_LIST_TYPE__CITATION = 0;

	/**
	 * The number of structural features of the '<em>Citation List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Citation List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CitationTImpl <em>Citation T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CitationTImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCitationT()
	 * @generated
	 */
	int CITATION_T = 14;

	/**
	 * The feature id for the '<em><b>Issn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__ISSN = 0;

	/**
	 * The feature id for the '<em><b>Journal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__JOURNAL_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__VOLUME = 3;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__ISSUE = 4;

	/**
	 * The feature id for the '<em><b>First Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__FIRST_PAGE = 5;

	/**
	 * The feature id for the '<em><b>Elocation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__ELOCATION_ID = 6;

	/**
	 * The feature id for the '<em><b>CYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__CYEAR = 7;

	/**
	 * The feature id for the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__DOI = 8;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__ISBN = 9;

	/**
	 * The feature id for the '<em><b>Series Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__SERIES_TITLE = 10;

	/**
	 * The feature id for the '<em><b>Volume Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__VOLUME_TITLE = 11;

	/**
	 * The feature id for the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__EDITION_NUMBER = 12;

	/**
	 * The feature id for the '<em><b>Component Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__COMPONENT_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Article Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__ARTICLE_TITLE = 14;

	/**
	 * The feature id for the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__STD_DESIGNATOR = 15;

	/**
	 * The feature id for the '<em><b>Standards Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__STANDARDS_BODY = 16;

	/**
	 * The feature id for the '<em><b>Unstructured Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T__UNSTRUCTURED_CITATION = 17;

	/**
	 * The number of structural features of the '<em>Citation T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Citation T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_T_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CitationTypeImpl <em>Citation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CitationTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCitationType()
	 * @generated
	 */
	int CITATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Issn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__ISSN = CITATION_T__ISSN;

	/**
	 * The feature id for the '<em><b>Journal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__JOURNAL_TITLE = CITATION_T__JOURNAL_TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__AUTHOR = CITATION_T__AUTHOR;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__VOLUME = CITATION_T__VOLUME;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__ISSUE = CITATION_T__ISSUE;

	/**
	 * The feature id for the '<em><b>First Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__FIRST_PAGE = CITATION_T__FIRST_PAGE;

	/**
	 * The feature id for the '<em><b>Elocation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__ELOCATION_ID = CITATION_T__ELOCATION_ID;

	/**
	 * The feature id for the '<em><b>CYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__CYEAR = CITATION_T__CYEAR;

	/**
	 * The feature id for the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__DOI = CITATION_T__DOI;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__ISBN = CITATION_T__ISBN;

	/**
	 * The feature id for the '<em><b>Series Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__SERIES_TITLE = CITATION_T__SERIES_TITLE;

	/**
	 * The feature id for the '<em><b>Volume Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__VOLUME_TITLE = CITATION_T__VOLUME_TITLE;

	/**
	 * The feature id for the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__EDITION_NUMBER = CITATION_T__EDITION_NUMBER;

	/**
	 * The feature id for the '<em><b>Component Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__COMPONENT_NUMBER = CITATION_T__COMPONENT_NUMBER;

	/**
	 * The feature id for the '<em><b>Article Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__ARTICLE_TITLE = CITATION_T__ARTICLE_TITLE;

	/**
	 * The feature id for the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__STD_DESIGNATOR = CITATION_T__STD_DESIGNATOR;

	/**
	 * The feature id for the '<em><b>Standards Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__STANDARDS_BODY = CITATION_T__STANDARDS_BODY;

	/**
	 * The feature id for the '<em><b>Unstructured Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__UNSTRUCTURED_CITATION = CITATION_T__UNSTRUCTURED_CITATION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE__KEY = CITATION_T_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Citation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE_FEATURE_COUNT = CITATION_T_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Citation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_TYPE_OPERATION_COUNT = CITATION_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CollectionTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Multi Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__MULTI_RESOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CompetingInterestStatementTypeImpl <em>Competing Interest Statement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CompetingInterestStatementTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCompetingInterestStatementType()
	 * @generated
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__FONT = 12;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__MATH = 13;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE__LANGUAGE = 14;

	/**
	 * The number of structural features of the '<em>Competing Interest Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Competing Interest Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETING_INTEREST_STATEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ComponentListTypeImpl <em>Component List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ComponentListTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getComponentListType()
	 * @generated
	 */
	int COMPONENT_LIST_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LIST_TYPE__COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ComponentTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__TITLES = 0;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__CONTRIBUTORS = 1;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PUBLICATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__FORMAT = 4;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PROGRAM = 5;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DOI_DATA = 6;

	/**
	 * The feature id for the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DOI = 7;

	/**
	 * The feature id for the '<em><b>Component Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__COMPONENT_SIZE = 8;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__LANGUAGE = 9;

	/**
	 * The feature id for the '<em><b>Parent Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PARENT_RELATION = 10;

	/**
	 * The feature id for the '<em><b>Reg Agency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REG_AGENCY = 11;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ConferenceDateTypeImpl <em>Conference Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ConferenceDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferenceDateType()
	 * @generated
	 */
	int CONFERENCE_DATE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_DATE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>End Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_DATE_TYPE__END_DAY = 1;

	/**
	 * The feature id for the '<em><b>End Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_DATE_TYPE__END_MONTH = 2;

	/**
	 * The feature id for the '<em><b>End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_DATE_TYPE__END_YEAR = 3;

	/**
	 * The feature id for the '<em><b>Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_DATE_TYPE__START_DAY = 4;

	/**
	 * The feature id for the '<em><b>Start Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_DATE_TYPE__START_MONTH = 5;

	/**
	 * The feature id for the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_DATE_TYPE__START_YEAR = 6;

	/**
	 * The number of structural features of the '<em>Conference Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_DATE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Conference Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_DATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ConferencePaperTypeImpl <em>Conference Paper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ConferencePaperTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferencePaperType()
	 * @generated
	 */
	int CONFERENCE_PAPER_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__PUBLICATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Acceptance Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__ACCEPTANCE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__PAGES = 5;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__PUBLISHER_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__CROSSMARK = 7;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__PROGRAM = 8;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__PROGRAM1 = 9;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__PROGRAM2 = 10;

	/**
	 * The feature id for the '<em><b>Program3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__PROGRAM3 = 11;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__ARCHIVE_LOCATIONS = 12;

	/**
	 * The feature id for the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__SCN_POLICIES = 13;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__DOI_DATA = 14;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__CITATION_LIST = 15;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__COMPONENT_LIST = 16;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__LANGUAGE = 17;

	/**
	 * The feature id for the '<em><b>Publication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__PUBLICATION_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE__REFERENCE_DISTRIBUTION_OPTS = 19;

	/**
	 * The number of structural features of the '<em>Conference Paper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Conference Paper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_PAPER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ConferenceTypeImpl <em>Conference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ConferenceTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferenceType()
	 * @generated
	 */
	int CONFERENCE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Event Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_TYPE__EVENT_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Proceedings Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA = 2;

	/**
	 * The feature id for the '<em><b>Proceedings Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_TYPE__PROCEEDINGS_METADATA = 3;

	/**
	 * The feature id for the '<em><b>Conference Paper</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_TYPE__CONFERENCE_PAPER = 4;

	/**
	 * The number of structural features of the '<em>Conference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Conference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ContentDateTypeImpl <em>Content Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ContentDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getContentDateType()
	 * @generated
	 */
	int CONTENT_DATE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DATE_TYPE__MONTH = DATE_T__MONTH;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DATE_TYPE__DAY = DATE_T__DAY;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DATE_TYPE__YEAR = DATE_T__YEAR;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DATE_TYPE__MEDIA_TYPE = DATE_T__MEDIA_TYPE;

	/**
	 * The number of structural features of the '<em>Content Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DATE_TYPE_FEATURE_COUNT = DATE_T_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DATE_TYPE_OPERATION_COUNT = DATE_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ContentItemTypeImpl <em>Content Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ContentItemTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getContentItemType()
	 * @generated
	 */
	int CONTENT_ITEM_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Component Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__COMPONENT_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__PUBLICATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Acceptance Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__ACCEPTANCE_DATE = 5;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__PAGES = 6;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__PUBLISHER_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__CROSSMARK = 8;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__PROGRAM = 9;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__PROGRAM1 = 10;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__PROGRAM2 = 11;

	/**
	 * The feature id for the '<em><b>Program3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__PROGRAM3 = 12;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__ARCHIVE_LOCATIONS = 13;

	/**
	 * The feature id for the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__SCN_POLICIES = 14;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__DOI_DATA = 15;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__CITATION_LIST = 16;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__COMPONENT_LIST = 17;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__COMPONENT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__LANGUAGE = 19;

	/**
	 * The feature id for the '<em><b>Level Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__LEVEL_SEQUENCE_NUMBER = 20;

	/**
	 * The feature id for the '<em><b>Publication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__PUBLICATION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE__REFERENCE_DISTRIBUTION_OPTS = 22;

	/**
	 * The number of structural features of the '<em>Content Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Content Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ContributorsTypeImpl <em>Contributors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ContributorsTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getContributorsType()
	 * @generated
	 */
	int CONTRIBUTORS_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTORS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTORS_TYPE__ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTORS_TYPE__PERSON_NAME = 2;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTORS_TYPE__ANONYMOUS = 3;

	/**
	 * The number of structural features of the '<em>Contributors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTORS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Contributors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CreationDateTypeImpl <em>Creation Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CreationDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCreationDateType()
	 * @generated
	 */
	int CREATION_DATE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_DATE_TYPE__MONTH = DATE_T__MONTH;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_DATE_TYPE__DAY = DATE_T__DAY;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_DATE_TYPE__YEAR = DATE_T__YEAR;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_DATE_TYPE__MEDIA_TYPE = DATE_T__MEDIA_TYPE;

	/**
	 * The number of structural features of the '<em>Creation Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_DATE_TYPE_FEATURE_COUNT = DATE_T_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Creation Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_DATE_TYPE_OPERATION_COUNT = DATE_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CrossmarkDomainsTypeImpl <em>Crossmark Domains Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CrossmarkDomainsTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCrossmarkDomainsType()
	 * @generated
	 */
	int CROSSMARK_DOMAINS_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Crossmark Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_DOMAINS_TYPE__CROSSMARK_DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Crossmark Domains Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_DOMAINS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Crossmark Domains Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_DOMAINS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CrossmarkDomainTypeImpl <em>Crossmark Domain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CrossmarkDomainTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCrossmarkDomainType()
	 * @generated
	 */
	int CROSSMARK_DOMAIN_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_DOMAIN_TYPE__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_DOMAIN_TYPE__FILTER = 1;

	/**
	 * The number of structural features of the '<em>Crossmark Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_DOMAIN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Crossmark Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_DOMAIN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CrossmarkTypeImpl <em>Crossmark Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CrossmarkTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCrossmarkType()
	 * @generated
	 */
	int CROSSMARK_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Crossmark Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_TYPE__CROSSMARK_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Crossmark Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_TYPE__CROSSMARK_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Crossmark Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_TYPE__CROSSMARK_DOMAINS = 2;

	/**
	 * The feature id for the '<em><b>Crossmark Domain Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_TYPE__CROSSMARK_DOMAIN_EXCLUSIVE = 3;

	/**
	 * The feature id for the '<em><b>Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_TYPE__UPDATES = 4;

	/**
	 * The feature id for the '<em><b>Custom Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_TYPE__CUSTOM_METADATA = 5;

	/**
	 * The number of structural features of the '<em>Crossmark Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Crossmark Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSMARK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.CustomMetadataTypeImpl <em>Custom Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.CustomMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCustomMetadataType()
	 * @generated
	 */
	int CUSTOM_METADATA_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__ASSERTION = 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__PROGRAM1 = 2;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__PROGRAM2 = 3;

	/**
	 * The feature id for the '<em><b>Program3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__PROGRAM3 = 4;

	/**
	 * The feature id for the '<em><b>Program4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__PROGRAM4 = 5;

	/**
	 * The feature id for the '<em><b>Program5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__PROGRAM5 = 6;

	/**
	 * The feature id for the '<em><b>Program6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__PROGRAM6 = 7;

	/**
	 * The feature id for the '<em><b>Program7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__PROGRAM7 = 8;

	/**
	 * The feature id for the '<em><b>Program8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE__PROGRAM8 = 9;

	/**
	 * The number of structural features of the '<em>Custom Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Custom Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DatabaseDateTypeImpl <em>Database Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DatabaseDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDatabaseDateType()
	 * @generated
	 */
	int DATABASE_DATE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATE_TYPE__CREATION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATE_TYPE__PUBLICATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATE_TYPE__UPDATE_DATE = 2;

	/**
	 * The number of structural features of the '<em>Database Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Database Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_DATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DatabaseMetadataTypeImpl <em>Database Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DatabaseMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDatabaseMetadataType()
	 * @generated
	 */
	int DATABASE_METADATA_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Database Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__DATABASE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__PUBLISHER = 4;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__INSTITUTION = 5;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__PUBLISHER_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__ARCHIVE_LOCATIONS = 7;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__DOI_DATA = 8;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__PROGRAM = 9;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__LANGUAGE = 10;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 11;

	/**
	 * The number of structural features of the '<em>Database Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Database Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DatabaseTypeImpl <em>Database Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DatabaseTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Database Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__DATABASE_METADATA = 0;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__DATASET = 1;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__COMPONENT_LIST = 2;

	/**
	 * The number of structural features of the '<em>Database Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Database Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DatasetTypeImpl <em>Dataset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DatasetTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDatasetType()
	 * @generated
	 */
	int DATASET_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Database Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DATABASE_DATE = 2;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__PUBLISHER_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__FORMAT = 5;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__CROSSMARK = 6;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__PROGRAM = 7;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__PROGRAM1 = 8;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__PROGRAM2 = 9;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__ARCHIVE_LOCATIONS = 10;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DOI_DATA = 11;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__CITATION_LIST = 12;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__COMPONENT_LIST = 13;

	/**
	 * The feature id for the '<em><b>Dataset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DATASET_TYPE = 14;

	/**
	 * The number of structural features of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DegreesTypeImpl <em>Degrees Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DegreesTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDegreesType()
	 * @generated
	 */
	int DEGREES_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREES_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREES_TYPE__CONTENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREES_TYPE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREES_TYPE__SPECIFIC_USE = 3;

	/**
	 * The number of structural features of the '<em>Degrees Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Degrees Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DepositorTypeImpl <em>Depositor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DepositorTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDepositorType()
	 * @generated
	 */
	int DEPOSITOR_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Depositor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITOR_TYPE__DEPOSITOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITOR_TYPE__EMAIL_ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Depositor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITOR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Depositor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSITOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DescriptionTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__FONT = 12;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__MATH = 13;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__LANGUAGE = 14;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DesignatorsTypeImpl <em>Designators Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DesignatorsTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDesignatorsType()
	 * @generated
	 */
	int DESIGNATORS_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Std Family Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE__STD_FAMILY_DESIGNATOR = 0;

	/**
	 * The feature id for the '<em><b>Std Set Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE__STD_SET_DESIGNATOR = 1;

	/**
	 * The feature id for the '<em><b>Std Undated Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE__STD_UNDATED_DESIGNATOR = 2;

	/**
	 * The feature id for the '<em><b>Std As Published</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE__STD_AS_PUBLISHED = 3;

	/**
	 * The feature id for the '<em><b>Std Alt As Published</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE__STD_ALT_AS_PUBLISHED = 4;

	/**
	 * The feature id for the '<em><b>Std Supersedes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE__STD_SUPERSEDES = 5;

	/**
	 * The feature id for the '<em><b>Std Adopted From</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE__STD_ADOPTED_FROM = 6;

	/**
	 * The feature id for the '<em><b>Std Revision Of</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE__STD_REVISION_OF = 7;

	/**
	 * The number of structural features of the '<em>Designators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Designators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DissertationTypeImpl <em>Dissertation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DissertationTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDissertationType()
	 * @generated
	 */
	int DISSERTATION_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__PERSON_NAME = 0;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__CONTRIBUTORS = 1;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__TITLES = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__APPROVAL_DATE = 4;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__INSTITUTION = 5;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__DEGREE = 6;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__ISBN = 7;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__PUBLISHER_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__CROSSMARK = 9;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__PROGRAM = 10;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__PROGRAM1 = 11;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__PROGRAM2 = 12;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__ARCHIVE_LOCATIONS = 13;

	/**
	 * The feature id for the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__SCN_POLICIES = 14;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__DOI_DATA = 15;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__CITATION_LIST = 16;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__COMPONENT_LIST = 17;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__LANGUAGE = 18;

	/**
	 * The feature id for the '<em><b>Publication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__PUBLICATION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE__REFERENCE_DISTRIBUTION_OPTS = 20;

	/**
	 * The number of structural features of the '<em>Dissertation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Dissertation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISSERTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DocumentRootImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 41;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__A = 3;

	/**
	 * The feature id for the '<em><b>Abbrev Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABBREV_TITLE = 4;

	/**
	 * The feature id for the '<em><b>Acceptance Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCEPTANCE_DATE = 5;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AFFILIATION = 6;

	/**
	 * The feature id for the '<em><b>Alt Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALT_NAME = 7;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANONYMOUS = 8;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPROVAL_DATE = 9;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARCHIVE = 10;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARCHIVE_LOCATIONS = 11;

	/**
	 * The feature id for the '<em><b>Article Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARTICLE_TITLE = 12;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSERTION = 13;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHOR = 14;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__B = 15;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BODY = 16;

	/**
	 * The feature id for the '<em><b>Book</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOK = 17;

	/**
	 * The feature id for the '<em><b>Book Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOK_METADATA = 18;

	/**
	 * The feature id for the '<em><b>Book Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOK_SERIES_METADATA = 19;

	/**
	 * The feature id for the '<em><b>Book Set Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOK_SET_METADATA = 20;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITATION = 21;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITATION_LIST = 22;

	/**
	 * The feature id for the '<em><b>Coden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODEN = 23;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLECTION = 24;

	/**
	 * The feature id for the '<em><b>Competing Interest Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPETING_INTEREST_STATEMENT = 25;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT = 26;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_LIST = 27;

	/**
	 * The feature id for the '<em><b>Component Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_NUMBER = 28;

	/**
	 * The feature id for the '<em><b>Conference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFERENCE = 29;

	/**
	 * The feature id for the '<em><b>Conference Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFERENCE_ACRONYM = 30;

	/**
	 * The feature id for the '<em><b>Conference Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFERENCE_DATE = 31;

	/**
	 * The feature id for the '<em><b>Conference Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFERENCE_LOCATION = 32;

	/**
	 * The feature id for the '<em><b>Conference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFERENCE_NAME = 33;

	/**
	 * The feature id for the '<em><b>Conference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFERENCE_NUMBER = 34;

	/**
	 * The feature id for the '<em><b>Conference Paper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFERENCE_PAPER = 35;

	/**
	 * The feature id for the '<em><b>Conference Sponsor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFERENCE_SPONSOR = 36;

	/**
	 * The feature id for the '<em><b>Conference Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFERENCE_THEME = 37;

	/**
	 * The feature id for the '<em><b>Content Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTENT_DATE = 38;

	/**
	 * The feature id for the '<em><b>Content Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTENT_ITEM = 39;

	/**
	 * The feature id for the '<em><b>Contract Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTRACT_NUMBER = 40;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTRIBUTORS = 41;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATION_DATE = 42;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CROSSMARK = 43;

	/**
	 * The feature id for the '<em><b>Crossmark Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CROSSMARK_DOMAIN = 44;

	/**
	 * The feature id for the '<em><b>Crossmark Domain Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CROSSMARK_DOMAIN_EXCLUSIVE = 45;

	/**
	 * The feature id for the '<em><b>Crossmark Domains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CROSSMARK_DOMAINS = 46;

	/**
	 * The feature id for the '<em><b>Crossmark Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CROSSMARK_POLICY = 47;

	/**
	 * The feature id for the '<em><b>Crossmark Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CROSSMARK_VERSION = 48;

	/**
	 * The feature id for the '<em><b>Custom Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOM_METADATA = 49;

	/**
	 * The feature id for the '<em><b>CYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CYEAR = 50;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE = 51;

	/**
	 * The feature id for the '<em><b>Database Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_DATE = 52;

	/**
	 * The feature id for the '<em><b>Database Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE_METADATA = 53;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATASET = 54;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DAY = 55;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEGREE = 56;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEGREES = 57;

	/**
	 * The feature id for the '<em><b>Depositor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPOSITOR = 58;

	/**
	 * The feature id for the '<em><b>Depositor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPOSITOR_NAME = 59;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 60;

	/**
	 * The feature id for the '<em><b>Designators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESIGNATORS = 61;

	/**
	 * The feature id for the '<em><b>Dissertation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISSERTATION = 62;

	/**
	 * The feature id for the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOI = 63;

	/**
	 * The feature id for the '<em><b>Doi Batch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOI_BATCH = 64;

	/**
	 * The feature id for the '<em><b>Doi Batch Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOI_BATCH_ID = 65;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOI_DATA = 66;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOMAIN = 67;

	/**
	 * The feature id for the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EDITION_NUMBER = 68;

	/**
	 * The feature id for the '<em><b>Elocation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELOCATION_ID = 69;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EM = 70;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMAIL_ADDRESS = 71;

	/**
	 * The feature id for the '<em><b>Event Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT_METADATA = 72;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER = 73;

	/**
	 * The feature id for the '<em><b>First Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIRST_PAGE = 74;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT = 75;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMAT = 76;

	/**
	 * The feature id for the '<em><b>Full Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FULL_TITLE = 77;

	/**
	 * The feature id for the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GIVEN_NAME = 78;

	/**
	 * The feature id for the '<em><b>Group Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUP_TITLE = 79;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEAD = 80;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__I = 81;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFIER = 82;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTITUTION = 83;

	/**
	 * The feature id for the '<em><b>Institution Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTITUTION_ACRONYM = 84;

	/**
	 * The feature id for the '<em><b>Institution Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTITUTION_DEPARTMENT = 85;

	/**
	 * The feature id for the '<em><b>Institution Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTITUTION_NAME = 86;

	/**
	 * The feature id for the '<em><b>Institution Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTITUTION_PLACE = 87;

	/**
	 * The feature id for the '<em><b>Intent Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTENT_STATEMENT = 88;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISBN = 89;

	/**
	 * The feature id for the '<em><b>Issn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISSN = 90;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISSUE = 91;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM = 92;

	/**
	 * The feature id for the '<em><b>Item Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM_NUMBER = 93;

	/**
	 * The feature id for the '<em><b>Journal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOURNAL = 94;

	/**
	 * The feature id for the '<em><b>Journal Article</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOURNAL_ARTICLE = 95;

	/**
	 * The feature id for the '<em><b>Journal Issue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOURNAL_ISSUE = 96;

	/**
	 * The feature id for the '<em><b>Journal Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOURNAL_METADATA = 97;

	/**
	 * The feature id for the '<em><b>Journal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOURNAL_TITLE = 98;

	/**
	 * The feature id for the '<em><b>Journal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOURNAL_VOLUME = 99;

	/**
	 * The feature id for the '<em><b>Last Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_PAGE = 100;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MONTH = 101;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 102;

	/**
	 * The feature id for the '<em><b>Noisbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOISBN = 103;

	/**
	 * The feature id for the '<em><b>ORCID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORCID = 104;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION = 105;

	/**
	 * The feature id for the '<em><b>Original Language Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGINAL_LANGUAGE_TITLE = 106;

	/**
	 * The feature id for the '<em><b>Other Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OTHER_PAGES = 107;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OVL = 108;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGES = 109;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PART_NUMBER = 110;

	/**
	 * The feature id for the '<em><b>Peer Review</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PEER_REVIEW = 111;

	/**
	 * The feature id for the '<em><b>Pending Publication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PENDING_PUBLICATION = 112;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSON_NAME = 113;

	/**
	 * The feature id for the '<em><b>Posted Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTED_CONTENT = 114;

	/**
	 * The feature id for the '<em><b>Posted Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTED_DATE = 115;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREFIX = 116;

	/**
	 * The feature id for the '<em><b>Proceedings Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCEEDINGS_METADATA = 117;

	/**
	 * The feature id for the '<em><b>Proceedings Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCEEDINGS_SERIES_METADATA = 118;

	/**
	 * The feature id for the '<em><b>Proceedings Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCEEDINGS_SUBJECT = 119;

	/**
	 * The feature id for the '<em><b>Proceedings Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCEEDINGS_TITLE = 120;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 121;

	/**
	 * The feature id for the '<em><b>Publication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLICATION = 122;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLICATION_DATE = 123;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER = 124;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER_ITEM = 125;

	/**
	 * The feature id for the '<em><b>Publisher Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER_NAME = 126;

	/**
	 * The feature id for the '<em><b>Publisher Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER_PLACE = 127;

	/**
	 * The feature id for the '<em><b>Registrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGISTRANT = 128;

	/**
	 * The feature id for the '<em><b>Report Paper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPORT_PAPER = 129;

	/**
	 * The feature id for the '<em><b>Report Paper Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPORT_PAPER_METADATA = 130;

	/**
	 * The feature id for the '<em><b>Report Paper Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REPORT_PAPER_SERIES_METADATA = 131;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE = 132;

	/**
	 * The feature id for the '<em><b>Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REVIEW_DATE = 133;

	/**
	 * The feature id for the '<em><b>Running Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUNNING_NUMBER = 134;

	/**
	 * The feature id for the '<em><b>Sa Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SA_COMPONENT = 135;

	/**
	 * The feature id for the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCN_POLICIES = 136;

	/**
	 * The feature id for the '<em><b>Scn Policy Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCN_POLICY_REF = 137;

	/**
	 * The feature id for the '<em><b>Scn Policy Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCN_POLICY_SET = 138;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCP = 139;

	/**
	 * The feature id for the '<em><b>Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERIES_METADATA = 140;

	/**
	 * The feature id for the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERIES_NUMBER = 141;

	/**
	 * The feature id for the '<em><b>Series Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERIES_TITLE = 142;

	/**
	 * The feature id for the '<em><b>Set Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SET_METADATA = 143;

	/**
	 * The feature id for the '<em><b>Special Numbering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECIAL_NUMBERING = 144;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STANDARD = 145;

	/**
	 * The feature id for the '<em><b>Standard Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STANDARD_METADATA = 146;

	/**
	 * The feature id for the '<em><b>Standards Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STANDARDS_BODY = 147;

	/**
	 * The feature id for the '<em><b>Standards Body Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STANDARDS_BODY_ACRONYM = 148;

	/**
	 * The feature id for the '<em><b>Standards Body Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STANDARDS_BODY_NAME = 149;

	/**
	 * The feature id for the '<em><b>Std Adopted From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_ADOPTED_FROM = 150;

	/**
	 * The feature id for the '<em><b>Std Alt As Published</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_ALT_AS_PUBLISHED = 151;

	/**
	 * The feature id for the '<em><b>Std Alt Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_ALT_SCRIPT = 152;

	/**
	 * The feature id for the '<em><b>Std As Published</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_AS_PUBLISHED = 153;

	/**
	 * The feature id for the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_DESIGNATOR = 154;

	/**
	 * The feature id for the '<em><b>Std Family Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_FAMILY_DESIGNATOR = 155;

	/**
	 * The feature id for the '<em><b>Std Revision Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_REVISION_OF = 156;

	/**
	 * The feature id for the '<em><b>Std Set Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_SET_DESIGNATOR = 157;

	/**
	 * The feature id for the '<em><b>Std Supersedes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_SUPERSEDES = 158;

	/**
	 * The feature id for the '<em><b>Std Undated Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_UNDATED_DESIGNATOR = 159;

	/**
	 * The feature id for the '<em><b>Std Variant Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STD_VARIANT_FORM = 160;

	/**
	 * The feature id for the '<em><b>String Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_NAME = 161;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRONG = 162;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB = 163;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBTITLE = 164;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUFFIX = 165;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUP = 166;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SURNAME = 167;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIMESTAMP = 168;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 169;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLES = 170;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TT = 171;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__U = 172;

	/**
	 * The feature id for the '<em><b>Unassigned Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNASSIGNED_CONTENT = 173;

	/**
	 * The feature id for the '<em><b>Unstructured Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNSTRUCTURED_CITATION = 174;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE = 175;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE_DATE = 176;

	/**
	 * The feature id for the '<em><b>Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATES = 177;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VOLUME = 178;

	/**
	 * The feature id for the '<em><b>Volume Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VOLUME_TITLE = 179;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__YEAR = 180;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 181;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DoiBatchTypeImpl <em>Doi Batch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DoiBatchTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDoiBatchType()
	 * @generated
	 */
	int DOI_BATCH_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_BATCH_TYPE__HEAD = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_BATCH_TYPE__BODY = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_BATCH_TYPE__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Doi Batch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_BATCH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Doi Batch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_BATCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.DoiDataTypeImpl <em>Doi Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.DoiDataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDoiDataType()
	 * @generated
	 */
	int DOI_DATA_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_DATA_TYPE__DOI = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_DATA_TYPE__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_DATA_TYPE__RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_DATA_TYPE__COLLECTION = 3;

	/**
	 * The number of structural features of the '<em>Doi Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_DATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Doi Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOI_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.EventMetadataTypeImpl <em>Event Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.EventMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getEventMetadataType()
	 * @generated
	 */
	int EVENT_METADATA_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Conference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_METADATA_TYPE__CONFERENCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Conference Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_METADATA_TYPE__CONFERENCE_THEME = 1;

	/**
	 * The feature id for the '<em><b>Conference Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_METADATA_TYPE__CONFERENCE_ACRONYM = 2;

	/**
	 * The feature id for the '<em><b>Conference Sponsor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_METADATA_TYPE__CONFERENCE_SPONSOR = 3;

	/**
	 * The feature id for the '<em><b>Conference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_METADATA_TYPE__CONFERENCE_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Conference Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_METADATA_TYPE__CONFERENCE_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Conference Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_METADATA_TYPE__CONFERENCE_DATE = 6;

	/**
	 * The number of structural features of the '<em>Event Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_METADATA_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Event Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.FormatTypeImpl <em>Format Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.FormatTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getFormatType()
	 * @generated
	 */
	int FORMAT_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE__MIME_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Format Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Format Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.HeadTypeImpl <em>Head Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.HeadTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getHeadType()
	 * @generated
	 */
	int HEAD_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Doi Batch Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TYPE__DOI_BATCH_ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TYPE__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Depositor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TYPE__DEPOSITOR = 2;

	/**
	 * The feature id for the '<em><b>Registrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TYPE__REGISTRANT = 3;

	/**
	 * The number of structural features of the '<em>Head Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Head Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.IdentifierTypeImpl <em>Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.IdentifierTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIdentifierType()
	 * @generated
	 */
	int IDENTIFIER_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TYPE__ID_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.InstitutionTypeImpl <em>Institution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.InstitutionTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getInstitutionType()
	 * @generated
	 */
	int INSTITUTION_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Institution Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_TYPE__INSTITUTION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Institution Acronym</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_TYPE__INSTITUTION_ACRONYM = 1;

	/**
	 * The feature id for the '<em><b>Institution Place</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_TYPE__INSTITUTION_PLACE = 2;

	/**
	 * The feature id for the '<em><b>Institution Department</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_TYPE__INSTITUTION_DEPARTMENT = 3;

	/**
	 * The number of structural features of the '<em>Institution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Institution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.IntentStatementTypeImpl <em>Intent Statement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.IntentStatementTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIntentStatementType()
	 * @generated
	 */
	int INTENT_STATEMENT_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STATEMENT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STATEMENT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STATEMENT_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STATEMENT_TYPE__I = 3;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STATEMENT_TYPE__U = 4;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STATEMENT_TYPE__A = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STATEMENT_TYPE__LANGUAGE = 6;

	/**
	 * The number of structural features of the '<em>Intent Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STATEMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Intent Statement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_STATEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.IsbnTypeImpl <em>Isbn Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.IsbnTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIsbnType()
	 * @generated
	 */
	int ISBN_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISBN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISBN_TYPE__MEDIA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Isbn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISBN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Isbn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISBN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.IssnTypeImpl <em>Issn Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.IssnTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIssnType()
	 * @generated
	 */
	int ISSN_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSN_TYPE__MEDIA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Issn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Issn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ItemNumberTypeImpl <em>Item Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ItemNumberTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getItemNumberType()
	 * @generated
	 */
	int ITEM_NUMBER_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NUMBER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Item Number Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NUMBER_TYPE__ITEM_NUMBER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Item Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NUMBER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ItemTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__DOI = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Crawler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__CRAWLER = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Link Header Relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__LINK_HEADER_RELATIONSHIP = 5;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.JournalArticleTypeImpl <em>Journal Article Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.JournalArticleTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getJournalArticleType()
	 * @generated
	 */
	int JOURNAL_ARTICLE_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__TITLES = 0;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__CONTRIBUTORS = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__PUBLICATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Acceptance Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__ACCEPTANCE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__PAGES = 5;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__PUBLISHER_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__CROSSMARK = 7;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__PROGRAM = 8;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__PROGRAM1 = 9;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__PROGRAM2 = 10;

	/**
	 * The feature id for the '<em><b>Program3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__PROGRAM3 = 11;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__ARCHIVE_LOCATIONS = 12;

	/**
	 * The feature id for the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__SCN_POLICIES = 13;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__DOI_DATA = 14;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__CITATION_LIST = 15;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__COMPONENT_LIST = 16;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__LANGUAGE = 17;

	/**
	 * The feature id for the '<em><b>Publication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__PUBLICATION_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE__REFERENCE_DISTRIBUTION_OPTS = 19;

	/**
	 * The number of structural features of the '<em>Journal Article Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Journal Article Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ARTICLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.JournalIssueTypeImpl <em>Journal Issue Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.JournalIssueTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getJournalIssueType()
	 * @generated
	 */
	int JOURNAL_ISSUE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE__PUBLICATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Journal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE__JOURNAL_VOLUME = 3;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE__ISSUE = 4;

	/**
	 * The feature id for the '<em><b>Special Numbering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE__SPECIAL_NUMBERING = 5;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE__ARCHIVE_LOCATIONS = 6;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE__DOI_DATA = 7;

	/**
	 * The number of structural features of the '<em>Journal Issue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Journal Issue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_ISSUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.JournalMetadataTypeImpl <em>Journal Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.JournalMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getJournalMetadataType()
	 * @generated
	 */
	int JOURNAL_METADATA_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Full Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE__FULL_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Abbrev Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE__ABBREV_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Issn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE__ISSN = 2;

	/**
	 * The feature id for the '<em><b>Coden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE__CODEN = 3;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE__ARCHIVE_LOCATIONS = 4;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE__DOI_DATA = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 7;

	/**
	 * The number of structural features of the '<em>Journal Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Journal Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.JournalTypeImpl <em>Journal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.JournalTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getJournalType()
	 * @generated
	 */
	int JOURNAL_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Journal Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_TYPE__JOURNAL_METADATA = 0;

	/**
	 * The feature id for the '<em><b>Journal Issue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_TYPE__JOURNAL_ISSUE = 1;

	/**
	 * The feature id for the '<em><b>Journal Article</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_TYPE__JOURNAL_ARTICLE = 2;

	/**
	 * The number of structural features of the '<em>Journal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Journal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.JournalVolumeTypeImpl <em>Journal Volume Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.JournalVolumeTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getJournalVolumeType()
	 * @generated
	 */
	int JOURNAL_VOLUME_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_VOLUME_TYPE__VOLUME = 0;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_VOLUME_TYPE__PUBLISHER_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_VOLUME_TYPE__ARCHIVE_LOCATIONS = 2;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_VOLUME_TYPE__DOI_DATA = 3;

	/**
	 * The number of structural features of the '<em>Journal Volume Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_VOLUME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Journal Volume Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_VOLUME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.NameType1Impl <em>Name Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.NameType1Impl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNameType1()
	 * @generated
	 */
	int NAME_TYPE1 = 59;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1__SURNAME = 0;

	/**
	 * The feature id for the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1__GIVEN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Given Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1__GIVEN_NAME1 = 2;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1__PREFIX = 3;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1__SUFFIX = 4;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1__CONTENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Name Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1__NAME_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1__SPECIFIC_USE = 8;

	/**
	 * The number of structural features of the '<em>Name Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Name Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.NoisbnTypeImpl <em>Noisbn Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.NoisbnTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNoisbnType()
	 * @generated
	 */
	int NOISBN_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISBN_TYPE__REASON = 0;

	/**
	 * The number of structural features of the '<em>Noisbn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISBN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Noisbn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISBN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ORCIDTypeImpl <em>ORCID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ORCIDTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getORCIDType()
	 * @generated
	 */
	int ORCID_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCID_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCID_TYPE__AUTHENTICATED = 1;

	/**
	 * The number of structural features of the '<em>ORCID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ORCID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.OrganizationTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Contributor Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__CONTRIBUTOR_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Name Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__NAME_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__SEQUENCE = 4;

	/**
	 * The number of structural features of the '<em>Organization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Organization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl <em>Original Language Title Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.OriginalLanguageTitleTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getOriginalLanguageTitleType()
	 * @generated
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__FONT = 12;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__MATH = 13;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE__LANGUAGE = 14;

	/**
	 * The number of structural features of the '<em>Original Language Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Original Language Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_LANGUAGE_TITLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PagesTypeImpl <em>Pages Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PagesTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPagesType()
	 * @generated
	 */
	int PAGES_TYPE = 64;

	/**
	 * The feature id for the '<em><b>First Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_TYPE__FIRST_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Last Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_TYPE__LAST_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Other Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_TYPE__OTHER_PAGES = 2;

	/**
	 * The number of structural features of the '<em>Pages Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pages Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PeerReviewTypeImpl <em>Peer Review Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PeerReviewTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPeerReviewType()
	 * @generated
	 */
	int PEER_REVIEW_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__REVIEW_DATE = 2;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__INSTITUTION = 3;

	/**
	 * The feature id for the '<em><b>Competing Interest Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__COMPETING_INTEREST_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Running Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__RUNNING_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__PROGRAM = 6;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__PROGRAM1 = 7;

	/**
	 * The feature id for the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__SCN_POLICIES = 8;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__DOI_DATA = 9;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__LANGUAGE = 10;

	/**
	 * The feature id for the '<em><b>Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__RECOMMENDATION = 11;

	/**
	 * The feature id for the '<em><b>Revision Round</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__REVISION_ROUND = 12;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__STAGE = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE__TYPE = 14;

	/**
	 * The number of structural features of the '<em>Peer Review Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Peer Review Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_REVIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PendingPublicationTypeImpl <em>Pending Publication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PendingPublicationTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPendingPublicationType()
	 * @generated
	 */
	int PENDING_PUBLICATION_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Publication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__PUBLICATION = 1;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__TITLES = 2;

	/**
	 * The feature id for the '<em><b>Acceptance Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__ACCEPTANCE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__INSTITUTION = 4;

	/**
	 * The feature id for the '<em><b>Item Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__ITEM_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Intent Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__INTENT_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__ABSTRACT = 7;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__CROSSMARK = 8;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__PROGRAM = 9;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__PROGRAM1 = 10;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__PROGRAM2 = 11;

	/**
	 * The feature id for the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__DOI = 12;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE__LANGUAGE = 13;

	/**
	 * The number of structural features of the '<em>Pending Publication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Pending Publication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_PUBLICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PersonNameTypeImpl <em>Person Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PersonNameTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPersonNameType()
	 * @generated
	 */
	int PERSON_NAME_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__GIVEN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__SURNAME = 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__SUFFIX = 2;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__AFFILIATION = 3;

	/**
	 * The feature id for the '<em><b>ORCID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__ORCID = 4;

	/**
	 * The feature id for the '<em><b>Alt Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__ALT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Contributor Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__CONTRIBUTOR_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Name Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__NAME_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__SEQUENCE = 9;

	/**
	 * The number of structural features of the '<em>Person Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Person Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PostedContentTypeImpl <em>Posted Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PostedContentTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPostedContentType()
	 * @generated
	 */
	int POSTED_CONTENT_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Group Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__GROUP_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__CONTRIBUTORS = 1;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__TITLES = 2;

	/**
	 * The feature id for the '<em><b>Posted Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__POSTED_DATE = 3;

	/**
	 * The feature id for the '<em><b>Acceptance Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__ACCEPTANCE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__INSTITUTION = 5;

	/**
	 * The feature id for the '<em><b>Item Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__ITEM_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__ABSTRACT = 7;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__PROGRAM = 8;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__PROGRAM1 = 9;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__PROGRAM2 = 10;

	/**
	 * The feature id for the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__SCN_POLICIES = 11;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__DOI_DATA = 12;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__CITATION_LIST = 13;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__LANGUAGE = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE__TYPE = 15;

	/**
	 * The number of structural features of the '<em>Posted Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Posted Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_CONTENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PostedDateTypeImpl <em>Posted Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PostedDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPostedDateType()
	 * @generated
	 */
	int POSTED_DATE_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_DATE_TYPE__MONTH = DATE_T__MONTH;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_DATE_TYPE__DAY = DATE_T__DAY;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_DATE_TYPE__YEAR = DATE_T__YEAR;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_DATE_TYPE__MEDIA_TYPE = DATE_T__MEDIA_TYPE;

	/**
	 * The number of structural features of the '<em>Posted Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_DATE_TYPE_FEATURE_COUNT = DATE_T_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Posted Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTED_DATE_TYPE_OPERATION_COUNT = DATE_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PrefixTypeImpl <em>Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PrefixTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPrefixType()
	 * @generated
	 */
	int PREFIX_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_TYPE__CONTENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_TYPE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_TYPE__SPECIFIC_USE = 3;

	/**
	 * The number of structural features of the '<em>Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl <em>Proceedings Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ProceedingsMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getProceedingsMetadataType()
	 * @generated
	 */
	int PROCEEDINGS_METADATA_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Proceedings Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Proceedings Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__PROCEEDINGS_SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__PUBLICATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__ISBN = 4;

	/**
	 * The feature id for the '<em><b>Noisbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__NOISBN = 5;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__PUBLISHER_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__ARCHIVE_LOCATIONS = 7;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__DOI_DATA = 8;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__LANGUAGE = 9;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 10;

	/**
	 * The number of structural features of the '<em>Proceedings Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Proceedings Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ProceedingsSeriesMetadataTypeImpl <em>Proceedings Series Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ProceedingsSeriesMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getProceedingsSeriesMetadataType()
	 * @generated
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__SERIES_METADATA = 0;

	/**
	 * The feature id for the '<em><b>Proceedings Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__PROCEEDINGS_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Volume1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__VOLUME1 = 3;

	/**
	 * The feature id for the '<em><b>Proceedings Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__PROCEEDINGS_SUBJECT = 4;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__PUBLISHER = 5;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__PUBLICATION_DATE = 6;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__ISBN = 7;

	/**
	 * The feature id for the '<em><b>Noisbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__NOISBN = 8;

	/**
	 * The feature id for the '<em><b>Proceedings Subject1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__PROCEEDINGS_SUBJECT1 = 9;

	/**
	 * The feature id for the '<em><b>Publisher1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__PUBLISHER1 = 10;

	/**
	 * The feature id for the '<em><b>Publication Date1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__PUBLICATION_DATE1 = 11;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__PUBLISHER_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS = 13;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__DOI_DATA = 14;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 15;

	/**
	 * The number of structural features of the '<em>Proceedings Series Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Proceedings Series Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEEDINGS_SERIES_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PropertyTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PublicationDateTypeImpl <em>Publication Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PublicationDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublicationDateType()
	 * @generated
	 */
	int PUBLICATION_DATE_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_DATE_TYPE__MONTH = DATE_T__MONTH;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_DATE_TYPE__DAY = DATE_T__DAY;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_DATE_TYPE__YEAR = DATE_T__YEAR;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_DATE_TYPE__MEDIA_TYPE = DATE_T__MEDIA_TYPE;

	/**
	 * The number of structural features of the '<em>Publication Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_DATE_TYPE_FEATURE_COUNT = DATE_T_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Publication Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_DATE_TYPE_OPERATION_COUNT = DATE_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PublicationTypeImpl <em>Publication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PublicationTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublicationType()
	 * @generated
	 */
	int PUBLICATION_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Full Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_TYPE__FULL_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Issn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_TYPE__ISSN = 1;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_TYPE__ISBN = 2;

	/**
	 * The feature id for the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_TYPE__DOI = 3;

	/**
	 * The feature id for the '<em><b>Issn1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_TYPE__ISSN1 = 4;

	/**
	 * The feature id for the '<em><b>Isbn1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_TYPE__ISBN1 = 5;

	/**
	 * The number of structural features of the '<em>Publication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Publication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PublisherItemTypeImpl <em>Publisher Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PublisherItemTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublisherItemType()
	 * @generated
	 */
	int PUBLISHER_ITEM_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Item Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ITEM_TYPE__ITEM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ITEM_TYPE__IDENTIFIER = 1;

	/**
	 * The number of structural features of the '<em>Publisher Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ITEM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Publisher Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.PublisherTypeImpl <em>Publisher Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.PublisherTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublisherType()
	 * @generated
	 */
	int PUBLISHER_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Publisher Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_TYPE__PUBLISHER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Publisher Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_TYPE__PUBLISHER_PLACE = 1;

	/**
	 * The number of structural features of the '<em>Publisher Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Publisher Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ReportPaperMetadataTypeImpl <em>Report Paper Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ReportPaperMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReportPaperMetadataType()
	 * @generated
	 */
	int REPORT_PAPER_METADATA_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__EDITION_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__PUBLICATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__APPROVAL_DATE = 5;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__ISBN = 6;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__PUBLISHER = 7;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__INSTITUTION = 8;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__PUBLISHER_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Contract Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__CONTRACT_NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__CROSSMARK = 11;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__PROGRAM = 12;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__PROGRAM1 = 13;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__PROGRAM2 = 14;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__ARCHIVE_LOCATIONS = 15;

	/**
	 * The feature id for the '<em><b>Scn Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__SCN_POLICIES = 16;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__DOI_DATA = 17;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__CITATION_LIST = 18;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__LANGUAGE = 19;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 20;

	/**
	 * The number of structural features of the '<em>Report Paper Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Report Paper Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ReportPaperSeriesMetadataTypeImpl <em>Report Paper Series Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ReportPaperSeriesMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReportPaperSeriesMetadataType()
	 * @generated
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__SERIES_METADATA = 0;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__CONTRIBUTORS = 1;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__TITLES = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__VOLUME = 4;

	/**
	 * The feature id for the '<em><b>Volume1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__VOLUME1 = 5;

	/**
	 * The feature id for the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__EDITION_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__PUBLICATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__APPROVAL_DATE = 8;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__ISBN = 9;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__PUBLISHER = 10;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__INSTITUTION = 11;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__PUBLISHER_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Contract Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__CONTRACT_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS = 14;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__DOI_DATA = 15;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__CITATION_LIST = 16;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__PROGRAM = 17;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__LANGUAGE = 18;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 19;

	/**
	 * The number of structural features of the '<em>Report Paper Series Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Report Paper Series Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_SERIES_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ReportPaperTypeImpl <em>Report Paper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ReportPaperTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReportPaperType()
	 * @generated
	 */
	int REPORT_PAPER_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Report Paper Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_TYPE__REPORT_PAPER_METADATA = 0;

	/**
	 * The feature id for the '<em><b>Report Paper Series Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Content Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_TYPE__CONTENT_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_TYPE__COMPONENT_LIST = 3;

	/**
	 * The feature id for the '<em><b>Publication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_TYPE__PUBLICATION_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Report Paper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Report Paper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_PAPER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ResourceTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Content Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CONTENT_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__MIME_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ReviewDateTypeImpl <em>Review Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ReviewDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReviewDateType()
	 * @generated
	 */
	int REVIEW_DATE_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_DATE_TYPE__MONTH = 0;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_DATE_TYPE__DAY = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_DATE_TYPE__YEAR = 2;

	/**
	 * The number of structural features of the '<em>Review Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_DATE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Review Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_DATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.SaComponentTypeImpl <em>Sa Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.SaComponentTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSaComponentType()
	 * @generated
	 */
	int SA_COMPONENT_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT_TYPE__COMPONENT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Parent Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT_TYPE__PARENT_DOI = 1;

	/**
	 * The number of structural features of the '<em>Sa Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sa Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ScnPoliciesTypeImpl <em>Scn Policies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ScnPoliciesTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getScnPoliciesType()
	 * @generated
	 */
	int SCN_POLICIES_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Scn Policy Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICIES_TYPE__SCN_POLICY_SET = 0;

	/**
	 * The number of structural features of the '<em>Scn Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scn Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ScnPolicyRefTypeImpl <em>Scn Policy Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ScnPolicyRefTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getScnPolicyRefType()
	 * @generated
	 */
	int SCN_POLICY_REF_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICY_REF_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Scn Policy Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICY_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scn Policy Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICY_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.ScnPolicySetTypeImpl <em>Scn Policy Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.ScnPolicySetTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getScnPolicySetType()
	 * @generated
	 */
	int SCN_POLICY_SET_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Scn Policy Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICY_SET_TYPE__SCN_POLICY_REF = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICY_SET_TYPE__START_DATE = 1;

	/**
	 * The number of structural features of the '<em>Scn Policy Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICY_SET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scn Policy Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCN_POLICY_SET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl <em>Series Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.SeriesMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSeriesMetadataType()
	 * @generated
	 */
	int SERIES_METADATA_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Issn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__ISSN = 3;

	/**
	 * The feature id for the '<em><b>Coden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__CODEN = 4;

	/**
	 * The feature id for the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__SERIES_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__PUBLISHER_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__CROSSMARK = 7;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__PROGRAM = 8;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__PROGRAM1 = 9;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__ARCHIVE_LOCATIONS = 10;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE__DOI_DATA = 11;

	/**
	 * The number of structural features of the '<em>Series Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Series Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.SetMetadataTypeImpl <em>Set Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.SetMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSetMetadataType()
	 * @generated
	 */
	int SET_METADATA_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE__TITLES = 0;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE__ISBN = 1;

	/**
	 * The feature id for the '<em><b>Noisbn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE__NOISBN = 2;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE__CONTRIBUTORS = 3;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE__PART_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE__PUBLISHER_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE__ARCHIVE_LOCATIONS = 6;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE__DOI_DATA = 7;

	/**
	 * The number of structural features of the '<em>Set Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Set Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.StandardMetadataTypeImpl <em>Standard Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.StandardMetadataTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStandardMetadataType()
	 * @generated
	 */
	int STANDARD_METADATA_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__CONTRIBUTORS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Designators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__DESIGNATORS = 3;

	/**
	 * The feature id for the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__EDITION_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__APPROVAL_DATE = 5;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__ISBN = 6;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__PUBLISHER = 7;

	/**
	 * The feature id for the '<em><b>Standards Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__STANDARDS_BODY = 8;

	/**
	 * The feature id for the '<em><b>Publisher Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__PUBLISHER_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Crossmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__CROSSMARK = 10;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__PROGRAM = 11;

	/**
	 * The feature id for the '<em><b>Program1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__PROGRAM1 = 12;

	/**
	 * The feature id for the '<em><b>Program2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__PROGRAM2 = 13;

	/**
	 * The feature id for the '<em><b>Archive Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__ARCHIVE_LOCATIONS = 14;

	/**
	 * The feature id for the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__DOI_DATA = 15;

	/**
	 * The feature id for the '<em><b>Citation List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__CITATION_LIST = 16;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__LANGUAGE = 17;

	/**
	 * The feature id for the '<em><b>Publication Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__PUBLICATION_STATUS = 18;

	/**
	 * The feature id for the '<em><b>Reference Distribution Opts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE__REFERENCE_DISTRIBUTION_OPTS = 19;

	/**
	 * The number of structural features of the '<em>Standard Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Standard Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.StandardsBodyTypeImpl <em>Standards Body Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.StandardsBodyTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStandardsBodyType()
	 * @generated
	 */
	int STANDARDS_BODY_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Standards Body Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_BODY_TYPE__STANDARDS_BODY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Standards Body Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_BODY_TYPE__STANDARDS_BODY_ACRONYM = 1;

	/**
	 * The number of structural features of the '<em>Standards Body Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_BODY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Standards Body Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDS_BODY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.StandardTypeImpl <em>Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.StandardTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStandardType()
	 * @generated
	 */
	int STANDARD_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Standard Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__STANDARD_METADATA = 0;

	/**
	 * The feature id for the '<em><b>Content Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__CONTENT_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__COMPONENT_LIST = 2;

	/**
	 * The feature id for the '<em><b>Publication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__PUBLICATION_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.StdDesignatorTImpl <em>Std Designator T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.StdDesignatorTImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStdDesignatorT()
	 * @generated
	 */
	int STD_DESIGNATOR_T = 94;

	/**
	 * The feature id for the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DESIGNATOR_T__STD_DESIGNATOR = 0;

	/**
	 * The feature id for the '<em><b>Std Alt Script</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DESIGNATOR_T__STD_ALT_SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Std Variant Form</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DESIGNATOR_T__STD_VARIANT_FORM = 2;

	/**
	 * The number of structural features of the '<em>Std Designator T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DESIGNATOR_T_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Std Designator T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DESIGNATOR_T_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.StdAltAsPublishedTypeImpl <em>Std Alt As Published Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.StdAltAsPublishedTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStdAltAsPublishedType()
	 * @generated
	 */
	int STD_ALT_AS_PUBLISHED_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_ALT_AS_PUBLISHED_TYPE__STD_DESIGNATOR = STD_DESIGNATOR_T__STD_DESIGNATOR;

	/**
	 * The feature id for the '<em><b>Std Alt Script</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_ALT_AS_PUBLISHED_TYPE__STD_ALT_SCRIPT = STD_DESIGNATOR_T__STD_ALT_SCRIPT;

	/**
	 * The feature id for the '<em><b>Std Variant Form</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_ALT_AS_PUBLISHED_TYPE__STD_VARIANT_FORM = STD_DESIGNATOR_T__STD_VARIANT_FORM;

	/**
	 * The feature id for the '<em><b>Approved Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_ALT_AS_PUBLISHED_TYPE__APPROVED_MONTH = STD_DESIGNATOR_T_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Approved Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_ALT_AS_PUBLISHED_TYPE__APPROVED_YEAR = STD_DESIGNATOR_T_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_ALT_AS_PUBLISHED_TYPE__REASON = STD_DESIGNATOR_T_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Std Alt As Published Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_ALT_AS_PUBLISHED_TYPE_FEATURE_COUNT = STD_DESIGNATOR_T_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Std Alt As Published Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_ALT_AS_PUBLISHED_TYPE_OPERATION_COUNT = STD_DESIGNATOR_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.StdAsPublishedTypeImpl <em>Std As Published Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.StdAsPublishedTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStdAsPublishedType()
	 * @generated
	 */
	int STD_AS_PUBLISHED_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_AS_PUBLISHED_TYPE__STD_DESIGNATOR = STD_DESIGNATOR_T__STD_DESIGNATOR;

	/**
	 * The feature id for the '<em><b>Std Alt Script</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_AS_PUBLISHED_TYPE__STD_ALT_SCRIPT = STD_DESIGNATOR_T__STD_ALT_SCRIPT;

	/**
	 * The feature id for the '<em><b>Std Variant Form</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_AS_PUBLISHED_TYPE__STD_VARIANT_FORM = STD_DESIGNATOR_T__STD_VARIANT_FORM;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_AS_PUBLISHED_TYPE__FAMILY = STD_DESIGNATOR_T_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_AS_PUBLISHED_TYPE__SET = STD_DESIGNATOR_T_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Undated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_AS_PUBLISHED_TYPE__UNDATED = STD_DESIGNATOR_T_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Std As Published Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_AS_PUBLISHED_TYPE_FEATURE_COUNT = STD_DESIGNATOR_T_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Std As Published Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_AS_PUBLISHED_TYPE_OPERATION_COUNT = STD_DESIGNATOR_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.StdSetDesignatorTypeImpl <em>Std Set Designator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.StdSetDesignatorTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStdSetDesignatorType()
	 * @generated
	 */
	int STD_SET_DESIGNATOR_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_SET_DESIGNATOR_TYPE__STD_DESIGNATOR = STD_DESIGNATOR_T__STD_DESIGNATOR;

	/**
	 * The feature id for the '<em><b>Std Alt Script</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_SET_DESIGNATOR_TYPE__STD_ALT_SCRIPT = STD_DESIGNATOR_T__STD_ALT_SCRIPT;

	/**
	 * The feature id for the '<em><b>Std Variant Form</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_SET_DESIGNATOR_TYPE__STD_VARIANT_FORM = STD_DESIGNATOR_T__STD_VARIANT_FORM;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_SET_DESIGNATOR_TYPE__FAMILY = STD_DESIGNATOR_T_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Std Set Designator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_SET_DESIGNATOR_TYPE_FEATURE_COUNT = STD_DESIGNATOR_T_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Std Set Designator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_SET_DESIGNATOR_TYPE_OPERATION_COUNT = STD_DESIGNATOR_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.StdUndatedDesignatorTypeImpl <em>Std Undated Designator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.StdUndatedDesignatorTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStdUndatedDesignatorType()
	 * @generated
	 */
	int STD_UNDATED_DESIGNATOR_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Std Designator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_UNDATED_DESIGNATOR_TYPE__STD_DESIGNATOR = STD_DESIGNATOR_T__STD_DESIGNATOR;

	/**
	 * The feature id for the '<em><b>Std Alt Script</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_UNDATED_DESIGNATOR_TYPE__STD_ALT_SCRIPT = STD_DESIGNATOR_T__STD_ALT_SCRIPT;

	/**
	 * The feature id for the '<em><b>Std Variant Form</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_UNDATED_DESIGNATOR_TYPE__STD_VARIANT_FORM = STD_DESIGNATOR_T__STD_VARIANT_FORM;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_UNDATED_DESIGNATOR_TYPE__FAMILY = STD_DESIGNATOR_T_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_UNDATED_DESIGNATOR_TYPE__SET = STD_DESIGNATOR_T_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Std Undated Designator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_UNDATED_DESIGNATOR_TYPE_FEATURE_COUNT = STD_DESIGNATOR_T_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Std Undated Designator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_UNDATED_DESIGNATOR_TYPE_OPERATION_COUNT = STD_DESIGNATOR_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.StringNameTypeImpl <em>String Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.StringNameTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStringNameType()
	 * @generated
	 */
	int STRING_NAME_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__DEGREES = 2;

	/**
	 * The feature id for the '<em><b>Given Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__GIVEN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__SURNAME = 5;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__SUFFIX = 6;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__CONTENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__LANGUAGE = 8;

	/**
	 * The feature id for the '<em><b>Name Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__NAME_STYLE = 9;

	/**
	 * The feature id for the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE__SPECIFIC_USE = 10;

	/**
	 * The number of structural features of the '<em>String Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>String Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl <em>Subtitle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.SubtitleTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSubtitleType()
	 * @generated
	 */
	int SUBTITLE_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__FONT = 12;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__MATH = 13;

	/**
	 * The number of structural features of the '<em>Subtitle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Subtitle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.TitlesTypeImpl <em>Titles Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.TitlesTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getTitlesType()
	 * @generated
	 */
	int TITLES_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLES_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLES_TYPE__SUBTITLE = 1;

	/**
	 * The feature id for the '<em><b>Original Language Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE = 2;

	/**
	 * The feature id for the '<em><b>Subtitle1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLES_TYPE__SUBTITLE1 = 3;

	/**
	 * The number of structural features of the '<em>Titles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Titles Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.TitleTypeImpl <em>Title Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.TitleTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__FONT = 12;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__MATH = 13;

	/**
	 * The number of structural features of the '<em>Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.UnassignedContentTypeImpl <em>Unassigned Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.UnassignedContentTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getUnassignedContentType()
	 * @generated
	 */
	int UNASSIGNED_CONTENT_TYPE = 101;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNASSIGNED_CONTENT_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Unassigned Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNASSIGNED_CONTENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unassigned Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNASSIGNED_CONTENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.UnstructuredCitationTypeImpl <em>Unstructured Citation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.UnstructuredCitationTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getUnstructuredCitationType()
	 * @generated
	 */
	int UNSTRUCTURED_CITATION_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__FONT = 12;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE__MATH = 13;

	/**
	 * The number of structural features of the '<em>Unstructured Citation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Unstructured Citation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_CITATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.UpdateDateTypeImpl <em>Update Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.UpdateDateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getUpdateDateType()
	 * @generated
	 */
	int UPDATE_DATE_TYPE = 103;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DATE_TYPE__MONTH = DATE_T__MONTH;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DATE_TYPE__DAY = DATE_T__DAY;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DATE_TYPE__YEAR = DATE_T__YEAR;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DATE_TYPE__MEDIA_TYPE = DATE_T__MEDIA_TYPE;

	/**
	 * The number of structural features of the '<em>Update Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DATE_TYPE_FEATURE_COUNT = DATE_T_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DATE_TYPE_OPERATION_COUNT = DATE_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.UpdatesTypeImpl <em>Updates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.UpdatesTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getUpdatesType()
	 * @generated
	 */
	int UPDATES_TYPE = 104;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATES_TYPE__UPDATE = 0;

	/**
	 * The number of structural features of the '<em>Updates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Updates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.UpdateTypeImpl <em>Update Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.UpdateTypeImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getUpdateType()
	 * @generated
	 */
	int UPDATE_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.impl.XrefFacesImpl <em>Xref Faces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.impl.XrefFacesImpl
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getXrefFaces()
	 * @generated
	 */
	int XREF_FACES = 106;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__FONT = 12;

	/**
	 * The feature id for the '<em><b>Math</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__MATH = 13;

	/**
	 * The number of structural features of the '<em>Xref Faces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Xref Faces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.BookTypeType <em>Book Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.BookTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getBookTypeType()
	 * @generated
	 */
	int BOOK_TYPE_TYPE = 107;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.CmUpdateType <em>Cm Update Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.CmUpdateType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCmUpdateType()
	 * @generated
	 */
	int CM_UPDATE_TYPE = 108;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.ComponentTypeType <em>Component Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ComponentTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getComponentTypeType()
	 * @generated
	 */
	int COMPONENT_TYPE_TYPE = 109;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.ContentVersionType <em>Content Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ContentVersionType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getContentVersionType()
	 * @generated
	 */
	int CONTENT_VERSION_TYPE = 110;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.ContributorRoleType <em>Contributor Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ContributorRoleType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getContributorRoleType()
	 * @generated
	 */
	int CONTRIBUTOR_ROLE_TYPE = 111;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.CountryType <em>Country Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.CountryType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCountryType()
	 * @generated
	 */
	int COUNTRY_TYPE = 112;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.CrawlerType <em>Crawler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.CrawlerType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCrawlerType()
	 * @generated
	 */
	int CRAWLER_TYPE = 113;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.DatasetTypeType <em>Dataset Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.DatasetTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDatasetTypeType()
	 * @generated
	 */
	int DATASET_TYPE_TYPE = 114;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.IdTypeType <em>Id Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.IdTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIdTypeType()
	 * @generated
	 */
	int ID_TYPE_TYPE = 115;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.LanguageType <em>Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.LanguageType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 116;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.LinkHeaderRelationshipType <em>Link Header Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.LinkHeaderRelationshipType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getLinkHeaderRelationshipType()
	 * @generated
	 */
	int LINK_HEADER_RELATIONSHIP_TYPE = 117;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.MediaTypeType <em>Media Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.MediaTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getMediaTypeType()
	 * @generated
	 */
	int MEDIA_TYPE_TYPE = 118;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.MediaTypeType1 <em>Media Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.MediaTypeType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getMediaTypeType1()
	 * @generated
	 */
	int MEDIA_TYPE_TYPE1 = 119;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.MimeTypeType <em>Mime Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.MimeTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getMimeTypeType()
	 * @generated
	 */
	int MIME_TYPE_TYPE = 120;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.MultiResolutionType <em>Multi Resolution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.MultiResolutionType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getMultiResolutionType()
	 * @generated
	 */
	int MULTI_RESOLUTION_TYPE = 121;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.NameStyleType <em>Name Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.NameStyleType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNameStyleType()
	 * @generated
	 */
	int NAME_STYLE_TYPE = 122;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.NameStyleType1 <em>Name Style Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.NameStyleType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNameStyleType1()
	 * @generated
	 */
	int NAME_STYLE_TYPE1 = 123;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.NameStyleType2 <em>Name Style Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.NameStyleType2
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNameStyleType2()
	 * @generated
	 */
	int NAME_STYLE_TYPE2 = 124;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.NameType <em>Name Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.NameType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 125;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.ParentRelationType <em>Parent Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ParentRelationType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getParentRelationType()
	 * @generated
	 */
	int PARENT_RELATION_TYPE = 126;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.PropertyType1 <em>Property Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.PropertyType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPropertyType1()
	 * @generated
	 */
	int PROPERTY_TYPE1 = 127;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.PublicationStatusType <em>Publication Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.PublicationStatusType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublicationStatusType()
	 * @generated
	 */
	int PUBLICATION_STATUS_TYPE = 128;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.PublicationTypeType <em>Publication Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.PublicationTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublicationTypeType()
	 * @generated
	 */
	int PUBLICATION_TYPE_TYPE = 129;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.ReasonType1 <em>Reason Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ReasonType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReasonType1()
	 * @generated
	 */
	int REASON_TYPE1 = 130;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.ReasonTypeItem <em>Reason Type Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ReasonTypeItem
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReasonTypeItem()
	 * @generated
	 */
	int REASON_TYPE_ITEM = 131;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.RecommendationType <em>Recommendation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.RecommendationType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getRecommendationType()
	 * @generated
	 */
	int RECOMMENDATION_TYPE = 132;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.ReferenceDistributionOptsType <em>Reference Distribution Opts Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ReferenceDistributionOptsType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReferenceDistributionOptsType()
	 * @generated
	 */
	int REFERENCE_DISTRIBUTION_OPTS_TYPE = 133;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.SequenceType <em>Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.SequenceType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 134;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.StageType <em>Stage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.StageType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStageType()
	 * @generated
	 */
	int STAGE_TYPE = 135;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.TypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 136;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.TypeType1 <em>Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.TypeType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getTypeType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 137;

	/**
	 * The meta object id for the '{@link org.crossref.schema._4._4.TypeType2 <em>Type Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.TypeType2
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getTypeType2()
	 * @generated
	 */
	int TYPE_TYPE2 = 138;

	/**
	 * The meta object id for the '<em>Abbrev Title Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getAbbrevTitleType()
	 * @generated
	 */
	int ABBREV_TITLE_TYPE = 139;

	/**
	 * The meta object id for the '<em>Affiliation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getAffiliationType()
	 * @generated
	 */
	int AFFILIATION_TYPE = 140;

	/**
	 * The meta object id for the '<em>Approved Month Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getApprovedMonthType()
	 * @generated
	 */
	int APPROVED_MONTH_TYPE = 141;

	/**
	 * The meta object id for the '<em>Approved Year Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getApprovedYearType()
	 * @generated
	 */
	int APPROVED_YEAR_TYPE = 142;

	/**
	 * The meta object id for the '<em>Book Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.BookTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getBookTypeTypeObject()
	 * @generated
	 */
	int BOOK_TYPE_TYPE_OBJECT = 143;

	/**
	 * The meta object id for the '<em>Cm Assertion</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCmAssertion()
	 * @generated
	 */
	int CM_ASSERTION = 144;

	/**
	 * The meta object id for the '<em>Cm Assertion Group Label</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCmAssertionGroupLabel()
	 * @generated
	 */
	int CM_ASSERTION_GROUP_LABEL = 145;

	/**
	 * The meta object id for the '<em>Cm Assertion Group Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCmAssertionGroupName()
	 * @generated
	 */
	int CM_ASSERTION_GROUP_NAME = 146;

	/**
	 * The meta object id for the '<em>Cm Assertion Label</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCmAssertionLabel()
	 * @generated
	 */
	int CM_ASSERTION_LABEL = 147;

	/**
	 * The meta object id for the '<em>Cm Assertion Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCmAssertionName()
	 * @generated
	 */
	int CM_ASSERTION_NAME = 148;

	/**
	 * The meta object id for the '<em>Cm Domain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCmDomain()
	 * @generated
	 */
	int CM_DOMAIN = 149;

	/**
	 * The meta object id for the '<em>Cm Update Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.CmUpdateType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCmUpdateTypeObject()
	 * @generated
	 */
	int CM_UPDATE_TYPE_OBJECT = 150;

	/**
	 * The meta object id for the '<em>Coden Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCodenType()
	 * @generated
	 */
	int CODEN_TYPE = 151;

	/**
	 * The meta object id for the '<em>Component Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getComponentNumberType()
	 * @generated
	 */
	int COMPONENT_NUMBER_TYPE = 152;

	/**
	 * The meta object id for the '<em>Component Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getComponentSizeType()
	 * @generated
	 */
	int COMPONENT_SIZE_TYPE = 153;

	/**
	 * The meta object id for the '<em>Component Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ComponentTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getComponentTypeTypeObject()
	 * @generated
	 */
	int COMPONENT_TYPE_TYPE_OBJECT = 154;

	/**
	 * The meta object id for the '<em>Conference Acronym Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferenceAcronymType()
	 * @generated
	 */
	int CONFERENCE_ACRONYM_TYPE = 155;

	/**
	 * The meta object id for the '<em>Conference Date T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferenceDateT()
	 * @generated
	 */
	int CONFERENCE_DATE_T = 156;

	/**
	 * The meta object id for the '<em>Conference Location Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferenceLocationType()
	 * @generated
	 */
	int CONFERENCE_LOCATION_TYPE = 157;

	/**
	 * The meta object id for the '<em>Conference Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferenceNameType()
	 * @generated
	 */
	int CONFERENCE_NAME_TYPE = 158;

	/**
	 * The meta object id for the '<em>Conference Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferenceNumberType()
	 * @generated
	 */
	int CONFERENCE_NUMBER_TYPE = 159;

	/**
	 * The meta object id for the '<em>Conference Sponsor Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferenceSponsorType()
	 * @generated
	 */
	int CONFERENCE_SPONSOR_TYPE = 160;

	/**
	 * The meta object id for the '<em>Conference Theme Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getConferenceThemeType()
	 * @generated
	 */
	int CONFERENCE_THEME_TYPE = 161;

	/**
	 * The meta object id for the '<em>Content Version Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ContentVersionType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getContentVersionTypeObject()
	 * @generated
	 */
	int CONTENT_VERSION_TYPE_OBJECT = 162;

	/**
	 * The meta object id for the '<em>Contract Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getContractNumberType()
	 * @generated
	 */
	int CONTRACT_NUMBER_TYPE = 163;

	/**
	 * The meta object id for the '<em>Contributor Role Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ContributorRoleType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getContributorRoleTypeObject()
	 * @generated
	 */
	int CONTRIBUTOR_ROLE_TYPE_OBJECT = 164;

	/**
	 * The meta object id for the '<em>Country Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.CountryType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCountryTypeObject()
	 * @generated
	 */
	int COUNTRY_TYPE_OBJECT = 165;

	/**
	 * The meta object id for the '<em>Crawler Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.CrawlerType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getCrawlerTypeObject()
	 * @generated
	 */
	int CRAWLER_TYPE_OBJECT = 166;

	/**
	 * The meta object id for the '<em>Dataset Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.DatasetTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDatasetTypeTypeObject()
	 * @generated
	 */
	int DATASET_TYPE_TYPE_OBJECT = 167;

	/**
	 * The meta object id for the '<em>Degree Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDegreeType()
	 * @generated
	 */
	int DEGREE_TYPE = 168;

	/**
	 * The meta object id for the '<em>Depositor Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDepositorNameType()
	 * @generated
	 */
	int DEPOSITOR_NAME_TYPE = 169;

	/**
	 * The meta object id for the '<em>Doi Batch Id Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDoiBatchIdType()
	 * @generated
	 */
	int DOI_BATCH_ID_TYPE = 170;

	/**
	 * The meta object id for the '<em>Doi T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDoiT()
	 * @generated
	 */
	int DOI_T = 171;

	/**
	 * The meta object id for the '<em>Doi Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getDoiType()
	 * @generated
	 */
	int DOI_TYPE = 172;

	/**
	 * The meta object id for the '<em>Edition Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getEditionNumberType()
	 * @generated
	 */
	int EDITION_NUMBER_TYPE = 173;

	/**
	 * The meta object id for the '<em>Email Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getEmailAddressType()
	 * @generated
	 */
	int EMAIL_ADDRESS_TYPE = 174;

	/**
	 * The meta object id for the '<em>First Page Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getFirstPageType()
	 * @generated
	 */
	int FIRST_PAGE_TYPE = 175;

	/**
	 * The meta object id for the '<em>Format T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getFormatT()
	 * @generated
	 */
	int FORMAT_T = 176;

	/**
	 * The meta object id for the '<em>Full Title Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getFullTitleType()
	 * @generated
	 */
	int FULL_TITLE_TYPE = 177;

	/**
	 * The meta object id for the '<em>Given Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getGivenNameType()
	 * @generated
	 */
	int GIVEN_NAME_TYPE = 178;

	/**
	 * The meta object id for the '<em>Group Title Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getGroupTitleType()
	 * @generated
	 */
	int GROUP_TITLE_TYPE = 179;

	/**
	 * The meta object id for the '<em>Identifier T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIdentifierT()
	 * @generated
	 */
	int IDENTIFIER_T = 180;

	/**
	 * The meta object id for the '<em>Id Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.IdTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIdTypeTypeObject()
	 * @generated
	 */
	int ID_TYPE_TYPE_OBJECT = 181;

	/**
	 * The meta object id for the '<em>Institution Acronym Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getInstitutionAcronymType()
	 * @generated
	 */
	int INSTITUTION_ACRONYM_TYPE = 182;

	/**
	 * The meta object id for the '<em>Institution Department Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getInstitutionDepartmentType()
	 * @generated
	 */
	int INSTITUTION_DEPARTMENT_TYPE = 183;

	/**
	 * The meta object id for the '<em>Institution Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getInstitutionNameType()
	 * @generated
	 */
	int INSTITUTION_NAME_TYPE = 184;

	/**
	 * The meta object id for the '<em>Institution Place Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getInstitutionPlaceType()
	 * @generated
	 */
	int INSTITUTION_PLACE_TYPE = 185;

	/**
	 * The meta object id for the '<em>Isbn T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIsbnT()
	 * @generated
	 */
	int ISBN_T = 186;

	/**
	 * The meta object id for the '<em>Issn T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIssnT()
	 * @generated
	 */
	int ISSN_T = 187;

	/**
	 * The meta object id for the '<em>Issue Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getIssueType()
	 * @generated
	 */
	int ISSUE_TYPE = 188;

	/**
	 * The meta object id for the '<em>Item Number T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getItemNumberT()
	 * @generated
	 */
	int ITEM_NUMBER_T = 189;

	/**
	 * The meta object id for the '<em>Key Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getKeyType()
	 * @generated
	 */
	int KEY_TYPE = 190;

	/**
	 * The meta object id for the '<em>Label Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 191;

	/**
	 * The meta object id for the '<em>Language Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.LanguageType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getLanguageTypeObject()
	 * @generated
	 */
	int LANGUAGE_TYPE_OBJECT = 192;

	/**
	 * The meta object id for the '<em>Last Page Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getLastPageType()
	 * @generated
	 */
	int LAST_PAGE_TYPE = 193;

	/**
	 * The meta object id for the '<em>Level Sequence Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getLevelSequenceNumberType()
	 * @generated
	 */
	int LEVEL_SEQUENCE_NUMBER_TYPE = 194;

	/**
	 * The meta object id for the '<em>Link Header Relationship Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.LinkHeaderRelationshipType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getLinkHeaderRelationshipTypeObject()
	 * @generated
	 */
	int LINK_HEADER_RELATIONSHIP_TYPE_OBJECT = 195;

	/**
	 * The meta object id for the '<em>Media Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.MediaTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getMediaTypeTypeObject()
	 * @generated
	 */
	int MEDIA_TYPE_TYPE_OBJECT = 196;

	/**
	 * The meta object id for the '<em>Media Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.MediaTypeType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getMediaTypeTypeObject1()
	 * @generated
	 */
	int MEDIA_TYPE_TYPE_OBJECT1 = 197;

	/**
	 * The meta object id for the '<em>Mime Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.MimeTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getMimeTypeTypeObject()
	 * @generated
	 */
	int MIME_TYPE_TYPE_OBJECT = 198;

	/**
	 * The meta object id for the '<em>Multi Resolution Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.MultiResolutionType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getMultiResolutionTypeObject()
	 * @generated
	 */
	int MULTI_RESOLUTION_TYPE_OBJECT = 199;

	/**
	 * The meta object id for the '<em>Name Style Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.NameStyleType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNameStyleTypeObject()
	 * @generated
	 */
	int NAME_STYLE_TYPE_OBJECT = 200;

	/**
	 * The meta object id for the '<em>Name Style Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.NameStyleType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNameStyleTypeObject1()
	 * @generated
	 */
	int NAME_STYLE_TYPE_OBJECT1 = 201;

	/**
	 * The meta object id for the '<em>Name Style Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.NameStyleType2
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNameStyleTypeObject2()
	 * @generated
	 */
	int NAME_STYLE_TYPE_OBJECT2 = 202;

	/**
	 * The meta object id for the '<em>Name Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.NameType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getNameTypeObject()
	 * @generated
	 */
	int NAME_TYPE_OBJECT = 203;

	/**
	 * The meta object id for the '<em>Orcid T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getOrcidT()
	 * @generated
	 */
	int ORCID_T = 204;

	/**
	 * The meta object id for the '<em>Organization T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getOrganizationT()
	 * @generated
	 */
	int ORGANIZATION_T = 205;

	/**
	 * The meta object id for the '<em>Other Pages Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getOtherPagesType()
	 * @generated
	 */
	int OTHER_PAGES_TYPE = 206;

	/**
	 * The meta object id for the '<em>Parent Doi Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getParentDoiType()
	 * @generated
	 */
	int PARENT_DOI_TYPE = 207;

	/**
	 * The meta object id for the '<em>Parent Relation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ParentRelationType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getParentRelationTypeObject()
	 * @generated
	 */
	int PARENT_RELATION_TYPE_OBJECT = 208;

	/**
	 * The meta object id for the '<em>Part Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPartNumberType()
	 * @generated
	 */
	int PART_NUMBER_TYPE = 209;

	/**
	 * The meta object id for the '<em>Proceedings Subject Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getProceedingsSubjectType()
	 * @generated
	 */
	int PROCEEDINGS_SUBJECT_TYPE = 210;

	/**
	 * The meta object id for the '<em>Proceedings Title Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getProceedingsTitleType()
	 * @generated
	 */
	int PROCEEDINGS_TITLE_TYPE = 211;

	/**
	 * The meta object id for the '<em>Property T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPropertyT()
	 * @generated
	 */
	int PROPERTY_T = 212;

	/**
	 * The meta object id for the '<em>Property Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.PropertyType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPropertyTypeObject()
	 * @generated
	 */
	int PROPERTY_TYPE_OBJECT = 213;

	/**
	 * The meta object id for the '<em>Publication Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.PublicationStatusType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublicationStatusTypeObject()
	 * @generated
	 */
	int PUBLICATION_STATUS_TYPE_OBJECT = 214;

	/**
	 * The meta object id for the '<em>Publication Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.PublicationTypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublicationTypeTypeObject()
	 * @generated
	 */
	int PUBLICATION_TYPE_TYPE_OBJECT = 215;

	/**
	 * The meta object id for the '<em>Publisher Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublisherNameType()
	 * @generated
	 */
	int PUBLISHER_NAME_TYPE = 216;

	/**
	 * The meta object id for the '<em>Publisher Place Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getPublisherPlaceType()
	 * @generated
	 */
	int PUBLISHER_PLACE_TYPE = 217;

	/**
	 * The meta object id for the '<em>Reason Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReasonType()
	 * @generated
	 */
	int REASON_TYPE = 218;

	/**
	 * The meta object id for the '<em>Reason Type Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ReasonTypeItem
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReasonTypeItemObject()
	 * @generated
	 */
	int REASON_TYPE_ITEM_OBJECT = 219;

	/**
	 * The meta object id for the '<em>Reason Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ReasonType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReasonTypeObject()
	 * @generated
	 */
	int REASON_TYPE_OBJECT = 220;

	/**
	 * The meta object id for the '<em>Recommendation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.RecommendationType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getRecommendationTypeObject()
	 * @generated
	 */
	int RECOMMENDATION_TYPE_OBJECT = 221;

	/**
	 * The meta object id for the '<em>Reference Distribution Opts Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.ReferenceDistributionOptsType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getReferenceDistributionOptsTypeObject()
	 * @generated
	 */
	int REFERENCE_DISTRIBUTION_OPTS_TYPE_OBJECT = 222;

	/**
	 * The meta object id for the '<em>Reg Agency Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getRegAgencyType()
	 * @generated
	 */
	int REG_AGENCY_TYPE = 223;

	/**
	 * The meta object id for the '<em>Registrant Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getRegistrantType()
	 * @generated
	 */
	int REGISTRANT_TYPE = 224;

	/**
	 * The meta object id for the '<em>Resource T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getResourceT()
	 * @generated
	 */
	int RESOURCE_T = 225;

	/**
	 * The meta object id for the '<em>Sequence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.SequenceType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSequenceTypeObject()
	 * @generated
	 */
	int SEQUENCE_TYPE_OBJECT = 226;

	/**
	 * The meta object id for the '<em>Series Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSeriesNumberType()
	 * @generated
	 */
	int SERIES_NUMBER_TYPE = 227;

	/**
	 * The meta object id for the '<em>Special Numbering Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSpecialNumberingType()
	 * @generated
	 */
	int SPECIAL_NUMBERING_TYPE = 228;

	/**
	 * The meta object id for the '<em>Stage Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.StageType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStageTypeObject()
	 * @generated
	 */
	int STAGE_TYPE_OBJECT = 229;

	/**
	 * The meta object id for the '<em>Std Designatorvalue T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getStdDesignatorvalueT()
	 * @generated
	 */
	int STD_DESIGNATORVALUE_T = 230;

	/**
	 * The meta object id for the '<em>Suffix Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSuffixType()
	 * @generated
	 */
	int SUFFIX_TYPE = 231;

	/**
	 * The meta object id for the '<em>Surname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getSurnameType()
	 * @generated
	 */
	int SURNAME_TYPE = 232;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.TypeType
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 233;

	/**
	 * The meta object id for the '<em>Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.TypeType1
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getTypeTypeObject1()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT1 = 234;

	/**
	 * The meta object id for the '<em>Type Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.schema._4._4.TypeType2
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getTypeTypeObject2()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT2 = 235;

	/**
	 * The meta object id for the '<em>Volume Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getVolumeType()
	 * @generated
	 */
	int VOLUME_TYPE = 236;

	/**
	 * The meta object id for the '<em>Xref Day</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getXrefDay()
	 * @generated
	 */
	int XREF_DAY = 237;

	/**
	 * The meta object id for the '<em>Xref Month</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getXrefMonth()
	 * @generated
	 */
	int XREF_MONTH = 238;

	/**
	 * The meta object id for the '<em>Xref Year</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.crossref.schema._4._4.impl._4PackageImpl#getXrefYear()
	 * @generated
	 */
	int XREF_YEAR = 239;


	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.AcceptanceDateType <em>Acceptance Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptance Date Type</em>'.
	 * @see org.crossref.schema._4._4.AcceptanceDateType
	 * @generated
	 */
	EClass getAcceptanceDateType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.AltNameType <em>Alt Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Name Type</em>'.
	 * @see org.crossref.schema._4._4.AltNameType
	 * @generated
	 */
	EClass getAltNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.AltNameType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.crossref.schema._4._4.AltNameType#getGroup()
	 * @see #getAltNameType()
	 * @generated
	 */
	EAttribute getAltNameType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AltNameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.crossref.schema._4._4.AltNameType#getName()
	 * @see #getAltNameType()
	 * @generated
	 */
	EReference getAltNameType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AltNameType#getStringName <em>String Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Name</em>'.
	 * @see org.crossref.schema._4._4.AltNameType#getStringName()
	 * @see #getAltNameType()
	 * @generated
	 */
	EReference getAltNameType_StringName();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.AnonymousType <em>Anonymous Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Type</em>'.
	 * @see org.crossref.schema._4._4.AnonymousType
	 * @generated
	 */
	EClass getAnonymousType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.AnonymousType#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Affiliation</em>'.
	 * @see org.crossref.schema._4._4.AnonymousType#getAffiliation()
	 * @see #getAnonymousType()
	 * @generated
	 */
	EAttribute getAnonymousType_Affiliation();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AnonymousType#getContributorRole <em>Contributor Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contributor Role</em>'.
	 * @see org.crossref.schema._4._4.AnonymousType#getContributorRole()
	 * @see #getAnonymousType()
	 * @generated
	 */
	EAttribute getAnonymousType_ContributorRole();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AnonymousType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.AnonymousType#getLanguage()
	 * @see #getAnonymousType()
	 * @generated
	 */
	EAttribute getAnonymousType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AnonymousType#getNameStyle <em>Name Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Style</em>'.
	 * @see org.crossref.schema._4._4.AnonymousType#getNameStyle()
	 * @see #getAnonymousType()
	 * @generated
	 */
	EAttribute getAnonymousType_NameStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AnonymousType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.crossref.schema._4._4.AnonymousType#getSequence()
	 * @see #getAnonymousType()
	 * @generated
	 */
	EAttribute getAnonymousType_Sequence();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ApprovalDateType <em>Approval Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approval Date Type</em>'.
	 * @see org.crossref.schema._4._4.ApprovalDateType
	 * @generated
	 */
	EClass getApprovalDateType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ArchiveLocationsType <em>Archive Locations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive Locations Type</em>'.
	 * @see org.crossref.schema._4._4.ArchiveLocationsType
	 * @generated
	 */
	EClass getArchiveLocationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ArchiveLocationsType#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Archive</em>'.
	 * @see org.crossref.schema._4._4.ArchiveLocationsType#getArchive()
	 * @see #getArchiveLocationsType()
	 * @generated
	 */
	EReference getArchiveLocationsType_Archive();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ArchiveType <em>Archive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive Type</em>'.
	 * @see org.crossref.schema._4._4.ArchiveType
	 * @generated
	 */
	EClass getArchiveType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ArchiveType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.crossref.schema._4._4.ArchiveType#getName()
	 * @see #getArchiveType()
	 * @generated
	 */
	EAttribute getArchiveType_Name();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.AssertionType <em>Assertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Type</em>'.
	 * @see org.crossref.schema._4._4.AssertionType
	 * @generated
	 */
	EClass getAssertionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.AssertionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getMixed()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.AssertionType#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getFaceMarkup()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getB()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getI()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getEm()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getStrong()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getU()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getOvl()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getSup()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getSub()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getScp()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getTt()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getFont()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.AssertionType#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Math</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getMath()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Math();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AssertionType#getExplanation <em>Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explanation</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getExplanation()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_Explanation();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AssertionType#getGroupLabel <em>Group Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Label</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getGroupLabel()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_GroupLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AssertionType#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getGroupName()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AssertionType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getHref()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AssertionType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getLabel()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AssertionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getName()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AssertionType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.crossref.schema._4._4.AssertionType#getOrder()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_Order();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AType</em>'.
	 * @see org.crossref.schema._4._4.AType
	 * @generated
	 */
	EClass getAType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.AType#getValue()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.AType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.crossref.schema._4._4.AType#getHref()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Href();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Type</em>'.
	 * @see org.crossref.schema._4._4.BodyType
	 * @generated
	 */
	EClass getBodyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getJournal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journal</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getJournal()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_Journal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Book</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getBook()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_Book();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getConference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conference</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getConference()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_Conference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getSaComponent <em>Sa Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sa Component</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getSaComponent()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_SaComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getDissertation <em>Dissertation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dissertation</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getDissertation()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_Dissertation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getReportPaper <em>Report Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report Paper</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getReportPaper()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_ReportPaper();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standard</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getStandard()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_Standard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getDatabase()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_Database();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getPeerReview <em>Peer Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Peer Review</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getPeerReview()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_PeerReview();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getPendingPublication <em>Pending Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pending Publication</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getPendingPublication()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_PendingPublication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BodyType#getPostedContent <em>Posted Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posted Content</em>'.
	 * @see org.crossref.schema._4._4.BodyType#getPostedContent()
	 * @see #getBodyType()
	 * @generated
	 */
	EReference getBodyType_PostedContent();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.BookMetadataType <em>Book Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType
	 * @generated
	 */
	EClass getBookMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getContributors()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getTitles()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookMetadataType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getAbstract()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookMetadataType#getEditionNumber <em>Edition Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Number</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getEditionNumber()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EAttribute getBookMetadataType_EditionNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookMetadataType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getPublicationDate()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getAcceptanceDate <em>Acceptance Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceptance Date</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getAcceptanceDate()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_AcceptanceDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookMetadataType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getIsbn()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getNoisbn <em>Noisbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noisbn</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getNoisbn()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Noisbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getPublisher()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getPublisherItem()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getCrossmark()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getProgram()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getProgram1()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getProgram2()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getArchiveLocations()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getDoiData()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookMetadataType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getCitationList()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EReference getBookMetadataType_CitationList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookMetadataType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getLanguage()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EAttribute getBookMetadataType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.BookMetadataType#getReferenceDistributionOpts()
	 * @see #getBookMetadataType()
	 * @generated
	 */
	EAttribute getBookMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.BookSeriesMetadataType <em>Book Series Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Series Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType
	 * @generated
	 */
	EClass getBookSeriesMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getSeriesMetadata <em>Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getSeriesMetadata()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_SeriesMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getContributors()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getTitles()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getAbstract()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getVolume()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EAttribute getBookSeriesMetadataType_Volume();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getVolume1 <em>Volume1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume1</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getVolume1()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EAttribute getBookSeriesMetadataType_Volume1();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getEditionNumber <em>Edition Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Number</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getEditionNumber()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EAttribute getBookSeriesMetadataType_EditionNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getPublicationDate()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getIsbn()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getNoisbn <em>Noisbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noisbn</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getNoisbn()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Noisbn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getPublicationDate1 <em>Publication Date1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date1</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getPublicationDate1()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_PublicationDate1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getPublisher()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getPublisherItem()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getCrossmark()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getProgram()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getProgram1()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getProgram2()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getArchiveLocations()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getDoiData()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getCitationList()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EReference getBookSeriesMetadataType_CitationList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getLanguage()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EAttribute getBookSeriesMetadataType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSeriesMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType#getReferenceDistributionOpts()
	 * @see #getBookSeriesMetadataType()
	 * @generated
	 */
	EAttribute getBookSeriesMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.BookSetMetadataType <em>Book Set Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Set Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType
	 * @generated
	 */
	EClass getBookSetMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getSetMetadata <em>Set Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Metadata</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getSetMetadata()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_SetMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getContributors()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getTitles()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookSetMetadataType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getAbstract()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSetMetadataType#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getVolume()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EAttribute getBookSetMetadataType_Volume();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSetMetadataType#getVolume1 <em>Volume1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume1</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getVolume1()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EAttribute getBookSetMetadataType_Volume1();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSetMetadataType#getEditionNumber <em>Edition Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Number</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getEditionNumber()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EAttribute getBookSetMetadataType_EditionNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookSetMetadataType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getPublicationDate()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookSetMetadataType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getIsbn()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getNoisbn <em>Noisbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noisbn</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getNoisbn()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Noisbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getPublisher()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getPublisherItem()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getCrossmark()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getProgram()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getProgram1()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getProgram2()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getArchiveLocations()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getDoiData()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookSetMetadataType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getCitationList()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EReference getBookSetMetadataType_CitationList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSetMetadataType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getLanguage()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EAttribute getBookSetMetadataType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookSetMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.BookSetMetadataType#getReferenceDistributionOpts()
	 * @see #getBookSetMetadataType()
	 * @generated
	 */
	EAttribute getBookSetMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Type</em>'.
	 * @see org.crossref.schema._4._4.BookType
	 * @generated
	 */
	EClass getBookType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookType#getBookMetadata <em>Book Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book Metadata</em>'.
	 * @see org.crossref.schema._4._4.BookType#getBookMetadata()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_BookMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookType#getBookSeriesMetadata <em>Book Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.BookType#getBookSeriesMetadata()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_BookSeriesMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.BookType#getBookSetMetadata <em>Book Set Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book Set Metadata</em>'.
	 * @see org.crossref.schema._4._4.BookType#getBookSetMetadata()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_BookSetMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.BookType#getContentItem <em>Content Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Item</em>'.
	 * @see org.crossref.schema._4._4.BookType#getContentItem()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_ContentItem();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.BookType#getBookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Book Type</em>'.
	 * @see org.crossref.schema._4._4.BookType#getBookType()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_BookType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CitationListType <em>Citation List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation List Type</em>'.
	 * @see org.crossref.schema._4._4.CitationListType
	 * @generated
	 */
	EClass getCitationListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CitationListType#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Citation</em>'.
	 * @see org.crossref.schema._4._4.CitationListType#getCitation()
	 * @see #getCitationListType()
	 * @generated
	 */
	EReference getCitationListType_Citation();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CitationT <em>Citation T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation T</em>'.
	 * @see org.crossref.schema._4._4.CitationT
	 * @generated
	 */
	EClass getCitationT();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CitationT#getIssn <em>Issn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issn</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getIssn()
	 * @see #getCitationT()
	 * @generated
	 */
	EReference getCitationT_Issn();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getJournalTitle <em>Journal Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journal Title</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getJournalTitle()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_JournalTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getAuthor()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getVolume()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_Volume();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getIssue()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_Issue();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getFirstPage <em>First Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getFirstPage()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_FirstPage();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getElocationId <em>Elocation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elocation Id</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getElocationId()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_ElocationId();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getCYear <em>CYear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CYear</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getCYear()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_CYear();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getDoi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getDoi()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_Doi();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CitationT#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getIsbn()
	 * @see #getCitationT()
	 * @generated
	 */
	EReference getCitationT_Isbn();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getSeriesTitle <em>Series Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Title</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getSeriesTitle()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_SeriesTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getVolumeTitle <em>Volume Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Title</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getVolumeTitle()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_VolumeTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getEditionNumber <em>Edition Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Number</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getEditionNumber()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_EditionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getComponentNumber <em>Component Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Number</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getComponentNumber()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_ComponentNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getArticleTitle <em>Article Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Article Title</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getArticleTitle()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_ArticleTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationT#getStdDesignator <em>Std Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Designator</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getStdDesignator()
	 * @see #getCitationT()
	 * @generated
	 */
	EAttribute getCitationT_StdDesignator();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CitationT#getStandardsBody <em>Standards Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standards Body</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getStandardsBody()
	 * @see #getCitationT()
	 * @generated
	 */
	EReference getCitationT_StandardsBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CitationT#getUnstructuredCitation <em>Unstructured Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unstructured Citation</em>'.
	 * @see org.crossref.schema._4._4.CitationT#getUnstructuredCitation()
	 * @see #getCitationT()
	 * @generated
	 */
	EReference getCitationT_UnstructuredCitation();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CitationType <em>Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation Type</em>'.
	 * @see org.crossref.schema._4._4.CitationType
	 * @generated
	 */
	EClass getCitationType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CitationType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.crossref.schema._4._4.CitationType#getKey()
	 * @see #getCitationType()
	 * @generated
	 */
	EAttribute getCitationType_Key();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see org.crossref.schema._4._4.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CollectionType#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.crossref.schema._4._4.CollectionType#getItem()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_Item();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CollectionType#getMultiResolution <em>Multi Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Resolution</em>'.
	 * @see org.crossref.schema._4._4.CollectionType#getMultiResolution()
	 * @see #getCollectionType()
	 * @generated
	 */
	EAttribute getCollectionType_MultiResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CollectionType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.crossref.schema._4._4.CollectionType#getProperty()
	 * @see #getCollectionType()
	 * @generated
	 */
	EAttribute getCollectionType_Property();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CompetingInterestStatementType <em>Competing Interest Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Competing Interest Statement Type</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType
	 * @generated
	 */
	EClass getCompetingInterestStatementType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getMixed()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EAttribute getCompetingInterestStatementType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getFaceMarkup()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EAttribute getCompetingInterestStatementType_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getB()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getI()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getEm()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getStrong()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getU()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getOvl()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getSup()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getSub()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getScp()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getTt()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getFont()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Math</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getMath()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EReference getCompetingInterestStatementType_Math();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CompetingInterestStatementType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType#getLanguage()
	 * @see #getCompetingInterestStatementType()
	 * @generated
	 */
	EAttribute getCompetingInterestStatementType_Language();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ComponentListType <em>Component List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component List Type</em>'.
	 * @see org.crossref.schema._4._4.ComponentListType
	 * @generated
	 */
	EClass getComponentListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ComponentListType#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.crossref.schema._4._4.ComponentListType#getComponent()
	 * @see #getComponentListType()
	 * @generated
	 */
	EReference getComponentListType_Component();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see org.crossref.schema._4._4.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ComponentType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getTitles()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Titles();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ComponentType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getContributors()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ComponentType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getPublicationDate()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ComponentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getDescription()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ComponentType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getFormat()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ComponentType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getProgram()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ComponentType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getDoiData()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_DoiData();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ComponentType#getDoi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getDoi()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Doi();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ComponentType#getComponentSize <em>Component Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Size</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getComponentSize()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_ComponentSize();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ComponentType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getLanguage()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ComponentType#getParentRelation <em>Parent Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Relation</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getParentRelation()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_ParentRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ComponentType#getRegAgency <em>Reg Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Agency</em>'.
	 * @see org.crossref.schema._4._4.ComponentType#getRegAgency()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_RegAgency();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ConferenceDateType <em>Conference Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Date Type</em>'.
	 * @see org.crossref.schema._4._4.ConferenceDateType
	 * @generated
	 */
	EClass getConferenceDateType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferenceDateType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.ConferenceDateType#getValue()
	 * @see #getConferenceDateType()
	 * @generated
	 */
	EAttribute getConferenceDateType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferenceDateType#getEndDay <em>End Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Day</em>'.
	 * @see org.crossref.schema._4._4.ConferenceDateType#getEndDay()
	 * @see #getConferenceDateType()
	 * @generated
	 */
	EAttribute getConferenceDateType_EndDay();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferenceDateType#getEndMonth <em>End Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Month</em>'.
	 * @see org.crossref.schema._4._4.ConferenceDateType#getEndMonth()
	 * @see #getConferenceDateType()
	 * @generated
	 */
	EAttribute getConferenceDateType_EndMonth();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferenceDateType#getEndYear <em>End Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Year</em>'.
	 * @see org.crossref.schema._4._4.ConferenceDateType#getEndYear()
	 * @see #getConferenceDateType()
	 * @generated
	 */
	EAttribute getConferenceDateType_EndYear();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferenceDateType#getStartDay <em>Start Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Day</em>'.
	 * @see org.crossref.schema._4._4.ConferenceDateType#getStartDay()
	 * @see #getConferenceDateType()
	 * @generated
	 */
	EAttribute getConferenceDateType_StartDay();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferenceDateType#getStartMonth <em>Start Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Month</em>'.
	 * @see org.crossref.schema._4._4.ConferenceDateType#getStartMonth()
	 * @see #getConferenceDateType()
	 * @generated
	 */
	EAttribute getConferenceDateType_StartMonth();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferenceDateType#getStartYear <em>Start Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Year</em>'.
	 * @see org.crossref.schema._4._4.ConferenceDateType#getStartYear()
	 * @see #getConferenceDateType()
	 * @generated
	 */
	EAttribute getConferenceDateType_StartYear();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ConferencePaperType <em>Conference Paper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Paper Type</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType
	 * @generated
	 */
	EClass getConferencePaperType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getContributors()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getTitles()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ConferencePaperType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getAbstract()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ConferencePaperType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getPublicationDate()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getAcceptanceDate <em>Acceptance Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceptance Date</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getAcceptanceDate()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_AcceptanceDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pages</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getPages()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getPublisherItem()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getCrossmark()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getProgram()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getProgram1()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getProgram2()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getProgram3 <em>Program3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program3</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getProgram3()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_Program3();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getArchiveLocations()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getScnPolicies <em>Scn Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policies</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getScnPolicies()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_ScnPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getDoiData()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getCitationList()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_CitationList();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferencePaperType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getComponentList()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EReference getConferencePaperType_ComponentList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferencePaperType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getLanguage()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EAttribute getConferencePaperType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferencePaperType#getPublicationType <em>Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Type</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getPublicationType()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EAttribute getConferencePaperType_PublicationType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ConferencePaperType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.ConferencePaperType#getReferenceDistributionOpts()
	 * @see #getConferencePaperType()
	 * @generated
	 */
	EAttribute getConferencePaperType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ConferenceType <em>Conference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Type</em>'.
	 * @see org.crossref.schema._4._4.ConferenceType
	 * @generated
	 */
	EClass getConferenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferenceType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.ConferenceType#getContributors()
	 * @see #getConferenceType()
	 * @generated
	 */
	EReference getConferenceType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferenceType#getEventMetadata <em>Event Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Metadata</em>'.
	 * @see org.crossref.schema._4._4.ConferenceType#getEventMetadata()
	 * @see #getConferenceType()
	 * @generated
	 */
	EReference getConferenceType_EventMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferenceType#getProceedingsSeriesMetadata <em>Proceedings Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proceedings Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.ConferenceType#getProceedingsSeriesMetadata()
	 * @see #getConferenceType()
	 * @generated
	 */
	EReference getConferenceType_ProceedingsSeriesMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ConferenceType#getProceedingsMetadata <em>Proceedings Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proceedings Metadata</em>'.
	 * @see org.crossref.schema._4._4.ConferenceType#getProceedingsMetadata()
	 * @see #getConferenceType()
	 * @generated
	 */
	EReference getConferenceType_ProceedingsMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ConferenceType#getConferencePaper <em>Conference Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conference Paper</em>'.
	 * @see org.crossref.schema._4._4.ConferenceType#getConferencePaper()
	 * @see #getConferenceType()
	 * @generated
	 */
	EReference getConferenceType_ConferencePaper();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ContentDateType <em>Content Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Date Type</em>'.
	 * @see org.crossref.schema._4._4.ContentDateType
	 * @generated
	 */
	EClass getContentDateType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ContentItemType <em>Content Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Item Type</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType
	 * @generated
	 */
	EClass getContentItemType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getContributors()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getTitles()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ContentItemType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getAbstract()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ContentItemType#getComponentNumber <em>Component Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Number</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getComponentNumber()
	 * @see #getContentItemType()
	 * @generated
	 */
	EAttribute getContentItemType_ComponentNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ContentItemType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getPublicationDate()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getAcceptanceDate <em>Acceptance Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceptance Date</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getAcceptanceDate()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_AcceptanceDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pages</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getPages()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getPublisherItem()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getCrossmark()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getProgram()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getProgram1()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getProgram2()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getProgram3 <em>Program3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program3</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getProgram3()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_Program3();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getArchiveLocations()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getScnPolicies <em>Scn Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policies</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getScnPolicies()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_ScnPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getDoiData()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getCitationList()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_CitationList();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ContentItemType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getComponentList()
	 * @see #getContentItemType()
	 * @generated
	 */
	EReference getContentItemType_ComponentList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ContentItemType#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getComponentType()
	 * @see #getContentItemType()
	 * @generated
	 */
	EAttribute getContentItemType_ComponentType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ContentItemType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getLanguage()
	 * @see #getContentItemType()
	 * @generated
	 */
	EAttribute getContentItemType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ContentItemType#getLevelSequenceNumber <em>Level Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Sequence Number</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getLevelSequenceNumber()
	 * @see #getContentItemType()
	 * @generated
	 */
	EAttribute getContentItemType_LevelSequenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ContentItemType#getPublicationType <em>Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Type</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getPublicationType()
	 * @see #getContentItemType()
	 * @generated
	 */
	EAttribute getContentItemType_PublicationType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ContentItemType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.ContentItemType#getReferenceDistributionOpts()
	 * @see #getContentItemType()
	 * @generated
	 */
	EAttribute getContentItemType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ContributorsType <em>Contributors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributors Type</em>'.
	 * @see org.crossref.schema._4._4.ContributorsType
	 * @generated
	 */
	EClass getContributorsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.ContributorsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.crossref.schema._4._4.ContributorsType#getGroup()
	 * @see #getContributorsType()
	 * @generated
	 */
	EAttribute getContributorsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ContributorsType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see org.crossref.schema._4._4.ContributorsType#getOrganization()
	 * @see #getContributorsType()
	 * @generated
	 */
	EReference getContributorsType_Organization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ContributorsType#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person Name</em>'.
	 * @see org.crossref.schema._4._4.ContributorsType#getPersonName()
	 * @see #getContributorsType()
	 * @generated
	 */
	EReference getContributorsType_PersonName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ContributorsType#getAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anonymous</em>'.
	 * @see org.crossref.schema._4._4.ContributorsType#getAnonymous()
	 * @see #getContributorsType()
	 * @generated
	 */
	EReference getContributorsType_Anonymous();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CreationDateType <em>Creation Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Date Type</em>'.
	 * @see org.crossref.schema._4._4.CreationDateType
	 * @generated
	 */
	EClass getCreationDateType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CrossmarkDomainsType <em>Crossmark Domains Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crossmark Domains Type</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkDomainsType
	 * @generated
	 */
	EClass getCrossmarkDomainsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CrossmarkDomainsType#getCrossmarkDomain <em>Crossmark Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crossmark Domain</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkDomainsType#getCrossmarkDomain()
	 * @see #getCrossmarkDomainsType()
	 * @generated
	 */
	EReference getCrossmarkDomainsType_CrossmarkDomain();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CrossmarkDomainType <em>Crossmark Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crossmark Domain Type</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkDomainType
	 * @generated
	 */
	EClass getCrossmarkDomainType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CrossmarkDomainType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkDomainType#getDomain()
	 * @see #getCrossmarkDomainType()
	 * @generated
	 */
	EAttribute getCrossmarkDomainType_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CrossmarkDomainType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkDomainType#getFilter()
	 * @see #getCrossmarkDomainType()
	 * @generated
	 */
	EAttribute getCrossmarkDomainType_Filter();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CrossmarkType <em>Crossmark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crossmark Type</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkType
	 * @generated
	 */
	EClass getCrossmarkType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CrossmarkType#getCrossmarkVersion <em>Crossmark Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossmark Version</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkType#getCrossmarkVersion()
	 * @see #getCrossmarkType()
	 * @generated
	 */
	EAttribute getCrossmarkType_CrossmarkVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CrossmarkType#getCrossmarkPolicy <em>Crossmark Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossmark Policy</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkType#getCrossmarkPolicy()
	 * @see #getCrossmarkType()
	 * @generated
	 */
	EAttribute getCrossmarkType_CrossmarkPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CrossmarkType#getCrossmarkDomains <em>Crossmark Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crossmark Domains</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkType#getCrossmarkDomains()
	 * @see #getCrossmarkType()
	 * @generated
	 */
	EReference getCrossmarkType_CrossmarkDomains();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.CrossmarkType#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossmark Domain Exclusive</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkType#isCrossmarkDomainExclusive()
	 * @see #getCrossmarkType()
	 * @generated
	 */
	EAttribute getCrossmarkType_CrossmarkDomainExclusive();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CrossmarkType#getUpdates <em>Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updates</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkType#getUpdates()
	 * @see #getCrossmarkType()
	 * @generated
	 */
	EReference getCrossmarkType_Updates();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CrossmarkType#getCustomMetadata <em>Custom Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Metadata</em>'.
	 * @see org.crossref.schema._4._4.CrossmarkType#getCustomMetadata()
	 * @see #getCrossmarkType()
	 * @generated
	 */
	EReference getCrossmarkType_CustomMetadata();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.CustomMetadataType <em>Custom Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType
	 * @generated
	 */
	EClass getCustomMetadataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.CustomMetadataType#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertion</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getAssertion()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Assertion();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getProgram()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getProgram1()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getProgram2()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram3 <em>Program3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program3</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getProgram3()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Program3();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram4 <em>Program4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program4</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getProgram4()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Program4();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram5 <em>Program5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program5</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getProgram5()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Program5();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram6 <em>Program6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program6</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getProgram6()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Program6();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram7 <em>Program7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program7</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getProgram7()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Program7();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.CustomMetadataType#getProgram8 <em>Program8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program8</em>'.
	 * @see org.crossref.schema._4._4.CustomMetadataType#getProgram8()
	 * @see #getCustomMetadataType()
	 * @generated
	 */
	EReference getCustomMetadataType_Program8();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DatabaseDateType <em>Database Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Date Type</em>'.
	 * @see org.crossref.schema._4._4.DatabaseDateType
	 * @generated
	 */
	EClass getDatabaseDateType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseDateType#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Date</em>'.
	 * @see org.crossref.schema._4._4.DatabaseDateType#getCreationDate()
	 * @see #getDatabaseDateType()
	 * @generated
	 */
	EReference getDatabaseDateType_CreationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseDateType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.DatabaseDateType#getPublicationDate()
	 * @see #getDatabaseDateType()
	 * @generated
	 */
	EReference getDatabaseDateType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseDateType#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Date</em>'.
	 * @see org.crossref.schema._4._4.DatabaseDateType#getUpdateDate()
	 * @see #getDatabaseDateType()
	 * @generated
	 */
	EReference getDatabaseDateType_UpdateDate();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DatabaseMetadataType <em>Database Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType
	 * @generated
	 */
	EClass getDatabaseMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseMetadataType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getContributors()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseMetadataType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getTitles()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_Titles();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseMetadataType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getDescription()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DatabaseMetadataType#getDatabaseDate <em>Database Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database Date</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getDatabaseDate()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_DatabaseDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseMetadataType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getPublisher()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DatabaseMetadataType#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institution</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getInstitution()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_Institution();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getPublisherItem()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getArchiveLocations()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getDoiData()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseMetadataType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getProgram()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EReference getDatabaseMetadataType_Program();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DatabaseMetadataType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getLanguage()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EAttribute getDatabaseMetadataType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DatabaseMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType#getReferenceDistributionOpts()
	 * @see #getDatabaseMetadataType()
	 * @generated
	 */
	EAttribute getDatabaseMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Type</em>'.
	 * @see org.crossref.schema._4._4.DatabaseType
	 * @generated
	 */
	EClass getDatabaseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseType#getDatabaseMetadata <em>Database Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Metadata</em>'.
	 * @see org.crossref.schema._4._4.DatabaseType#getDatabaseMetadata()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EReference getDatabaseType_DatabaseMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DatabaseType#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see org.crossref.schema._4._4.DatabaseType#getDataset()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EReference getDatabaseType_Dataset();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatabaseType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.DatabaseType#getComponentList()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EReference getDatabaseType_ComponentList();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Type</em>'.
	 * @see org.crossref.schema._4._4.DatasetType
	 * @generated
	 */
	EClass getDatasetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getContributors()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getTitles()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DatasetType#getDatabaseDate <em>Database Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database Date</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getDatabaseDate()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_DatabaseDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getPublisherItem()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getDescription()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getFormat()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Format();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getCrossmark()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getProgram()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getProgram1()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getProgram2()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getArchiveLocations()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getDoiData()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getCitationList()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_CitationList();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DatasetType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getComponentList()
	 * @see #getDatasetType()
	 * @generated
	 */
	EReference getDatasetType_ComponentList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DatasetType#getDatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Type</em>'.
	 * @see org.crossref.schema._4._4.DatasetType#getDatasetType()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_DatasetType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DateT <em>Date T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date T</em>'.
	 * @see org.crossref.schema._4._4.DateT
	 * @generated
	 */
	EClass getDateT();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DateT#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.crossref.schema._4._4.DateT#getMonth()
	 * @see #getDateT()
	 * @generated
	 */
	EAttribute getDateT_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DateT#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.crossref.schema._4._4.DateT#getDay()
	 * @see #getDateT()
	 * @generated
	 */
	EAttribute getDateT_Day();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DateT#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.crossref.schema._4._4.DateT#getYear()
	 * @see #getDateT()
	 * @generated
	 */
	EAttribute getDateT_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DateT#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.crossref.schema._4._4.DateT#getMediaType()
	 * @see #getDateT()
	 * @generated
	 */
	EAttribute getDateT_MediaType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DegreesType <em>Degrees Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degrees Type</em>'.
	 * @see org.crossref.schema._4._4.DegreesType
	 * @generated
	 */
	EClass getDegreesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.DegreesType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.DegreesType#getMixed()
	 * @see #getDegreesType()
	 * @generated
	 */
	EAttribute getDegreesType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DegreesType#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.crossref.schema._4._4.DegreesType#getContentType()
	 * @see #getDegreesType()
	 * @generated
	 */
	EAttribute getDegreesType_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DegreesType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.DegreesType#getLanguage()
	 * @see #getDegreesType()
	 * @generated
	 */
	EAttribute getDegreesType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DegreesType#getSpecificUse <em>Specific Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Use</em>'.
	 * @see org.crossref.schema._4._4.DegreesType#getSpecificUse()
	 * @see #getDegreesType()
	 * @generated
	 */
	EAttribute getDegreesType_SpecificUse();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DepositorType <em>Depositor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depositor Type</em>'.
	 * @see org.crossref.schema._4._4.DepositorType
	 * @generated
	 */
	EClass getDepositorType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DepositorType#getDepositorName <em>Depositor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depositor Name</em>'.
	 * @see org.crossref.schema._4._4.DepositorType#getDepositorName()
	 * @see #getDepositorType()
	 * @generated
	 */
	EAttribute getDepositorType_DepositorName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DepositorType#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see org.crossref.schema._4._4.DepositorType#getEmailAddress()
	 * @see #getDepositorType()
	 * @generated
	 */
	EAttribute getDepositorType_EmailAddress();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.DescriptionType#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getFaceMarkup()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getB()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getI()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getEm()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getStrong()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getU()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getOvl()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getSup()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getSub()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getScp()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getTt()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getFont()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DescriptionType#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Math</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getMath()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Math();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DescriptionType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.DescriptionType#getLanguage()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Language();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DesignatorsType <em>Designators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Designators Type</em>'.
	 * @see org.crossref.schema._4._4.DesignatorsType
	 * @generated
	 */
	EClass getDesignatorsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DesignatorsType#getStdFamilyDesignator <em>Std Family Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Std Family Designator</em>'.
	 * @see org.crossref.schema._4._4.DesignatorsType#getStdFamilyDesignator()
	 * @see #getDesignatorsType()
	 * @generated
	 */
	EReference getDesignatorsType_StdFamilyDesignator();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DesignatorsType#getStdSetDesignator <em>Std Set Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Std Set Designator</em>'.
	 * @see org.crossref.schema._4._4.DesignatorsType#getStdSetDesignator()
	 * @see #getDesignatorsType()
	 * @generated
	 */
	EReference getDesignatorsType_StdSetDesignator();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DesignatorsType#getStdUndatedDesignator <em>Std Undated Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Std Undated Designator</em>'.
	 * @see org.crossref.schema._4._4.DesignatorsType#getStdUndatedDesignator()
	 * @see #getDesignatorsType()
	 * @generated
	 */
	EReference getDesignatorsType_StdUndatedDesignator();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DesignatorsType#getStdAsPublished <em>Std As Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Std As Published</em>'.
	 * @see org.crossref.schema._4._4.DesignatorsType#getStdAsPublished()
	 * @see #getDesignatorsType()
	 * @generated
	 */
	EReference getDesignatorsType_StdAsPublished();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DesignatorsType#getStdAltAsPublished <em>Std Alt As Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Std Alt As Published</em>'.
	 * @see org.crossref.schema._4._4.DesignatorsType#getStdAltAsPublished()
	 * @see #getDesignatorsType()
	 * @generated
	 */
	EReference getDesignatorsType_StdAltAsPublished();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.DesignatorsType#getStdSupersedes <em>Std Supersedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Std Supersedes</em>'.
	 * @see org.crossref.schema._4._4.DesignatorsType#getStdSupersedes()
	 * @see #getDesignatorsType()
	 * @generated
	 */
	EAttribute getDesignatorsType_StdSupersedes();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.DesignatorsType#getStdAdoptedFrom <em>Std Adopted From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Std Adopted From</em>'.
	 * @see org.crossref.schema._4._4.DesignatorsType#getStdAdoptedFrom()
	 * @see #getDesignatorsType()
	 * @generated
	 */
	EAttribute getDesignatorsType_StdAdoptedFrom();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.DesignatorsType#getStdRevisionOf <em>Std Revision Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Std Revision Of</em>'.
	 * @see org.crossref.schema._4._4.DesignatorsType#getStdRevisionOf()
	 * @see #getDesignatorsType()
	 * @generated
	 */
	EAttribute getDesignatorsType_StdRevisionOf();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DissertationType <em>Dissertation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dissertation Type</em>'.
	 * @see org.crossref.schema._4._4.DissertationType
	 * @generated
	 */
	EClass getDissertationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DissertationType#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person Name</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getPersonName()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_PersonName();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getContributors()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getTitles()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DissertationType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getAbstract()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DissertationType#getApprovalDate <em>Approval Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approval Date</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getApprovalDate()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_ApprovalDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DissertationType#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institution</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getInstitution()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_Institution();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.DissertationType#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Degree</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getDegree()
	 * @see #getDissertationType()
	 * @generated
	 */
	EAttribute getDissertationType_Degree();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DissertationType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getIsbn()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getPublisherItem()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getCrossmark()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getProgram()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getProgram1()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getProgram2()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getArchiveLocations()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getScnPolicies <em>Scn Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policies</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getScnPolicies()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_ScnPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getDoiData()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getCitationList()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_CitationList();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DissertationType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getComponentList()
	 * @see #getDissertationType()
	 * @generated
	 */
	EReference getDissertationType_ComponentList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DissertationType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getLanguage()
	 * @see #getDissertationType()
	 * @generated
	 */
	EAttribute getDissertationType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DissertationType#getPublicationType <em>Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Type</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getPublicationType()
	 * @see #getDissertationType()
	 * @generated
	 */
	EAttribute getDissertationType_PublicationType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DissertationType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.DissertationType#getReferenceDistributionOpts()
	 * @see #getDissertationType()
	 * @generated
	 */
	EAttribute getDissertationType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.crossref.schema._4._4.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.crossref.schema._4._4.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getA()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_A();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getAbbrevTitle <em>Abbrev Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbrev Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getAbbrevTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbbrevTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getAcceptanceDate <em>Acceptance Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceptance Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getAcceptanceDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AcceptanceDate();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliation</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getAffiliation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Affiliation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getAltName <em>Alt Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alt Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getAltName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AltName();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anonymous</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getAnonymous()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Anonymous();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getApprovalDate <em>Approval Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approval Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getApprovalDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ApprovalDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getArchive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Archive();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getArchiveLocations()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ArchiveLocations();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getArticleTitle <em>Article Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Article Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getArticleTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ArticleTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assertion</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getAssertion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Assertion();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getAuthor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Author();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>B</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_B();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getBook()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Book();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getBookMetadata <em>Book Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getBookMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BookMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getBookSeriesMetadata <em>Book Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getBookSeriesMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BookSeriesMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getBookSetMetadata <em>Book Set Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book Set Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getBookSetMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BookSetMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCitation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Citation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCitationList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CitationList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getCoden <em>Coden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coden</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCoden()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Coden();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getCompetingInterestStatement <em>Competing Interest Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Competing Interest Statement</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCompetingInterestStatement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompetingInterestStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Component();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getComponentList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComponentList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getComponentNumber <em>Component Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Number</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getComponentNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ComponentNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getConference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conference</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getConference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Conference();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceAcronym <em>Conference Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Acronym</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getConferenceAcronym()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConferenceAcronym();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceDate <em>Conference Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conference Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getConferenceDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConferenceDate();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceLocation <em>Conference Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Location</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getConferenceLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConferenceLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceName <em>Conference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getConferenceName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConferenceName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceNumber <em>Conference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Number</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getConferenceNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConferenceNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getConferencePaper <em>Conference Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conference Paper</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getConferencePaper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConferencePaper();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceSponsor <em>Conference Sponsor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Sponsor</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getConferenceSponsor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConferenceSponsor();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getConferenceTheme <em>Conference Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Theme</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getConferenceTheme()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ConferenceTheme();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getContentDate <em>Content Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getContentDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContentDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getContentItem <em>Content Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Item</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getContentItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContentItem();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getContractNumber <em>Contract Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Number</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getContractNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ContractNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getContributors()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCreationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCrossmark()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkDomain <em>Crossmark Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark Domain</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCrossmarkDomain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CrossmarkDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossmark Domain Exclusive</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#isCrossmarkDomainExclusive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CrossmarkDomainExclusive();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkDomains <em>Crossmark Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark Domains</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCrossmarkDomains()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CrossmarkDomains();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkPolicy <em>Crossmark Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossmark Policy</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCrossmarkPolicy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CrossmarkPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getCrossmarkVersion <em>Crossmark Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossmark Version</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCrossmarkVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CrossmarkVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getCustomMetadata <em>Custom Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCustomMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CustomMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getCYear <em>CYear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CYear</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getCYear()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CYear();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDatabase()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Database();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDatabaseDate <em>Database Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDatabaseDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatabaseDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDatabaseMetadata <em>Database Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDatabaseMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DatabaseMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataset</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDataset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dataset();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Day();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDegree()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Degree();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degrees</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDegrees()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Degrees();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDepositor <em>Depositor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depositor</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDepositor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Depositor();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getDepositorName <em>Depositor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depositor Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDepositorName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DepositorName();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDesignators <em>Designators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Designators</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDesignators()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Designators();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDissertation <em>Dissertation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dissertation</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDissertation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dissertation();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getDoi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDoi()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Doi();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDoiBatch <em>Doi Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Batch</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDoiBatch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DoiBatch();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getDoiBatchId <em>Doi Batch Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi Batch Id</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDoiBatchId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DoiBatchId();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDoiData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DoiData();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getDomain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getEditionNumber <em>Edition Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Number</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getEditionNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EditionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getElocationId <em>Elocation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elocation Id</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getElocationId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ElocationId();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Em</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getEm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Em();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getEmailAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EmailAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getEventMetadata <em>Event Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getEventMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EventMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getFirstPage <em>First Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getFirstPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FirstPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getFont()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Font();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getFullTitle <em>Full Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getFullTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FullTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getGivenName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GivenName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getGroupTitle <em>Group Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getGroupTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GroupTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getHead()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Head();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_I();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Institution</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getInstitution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Institution();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionAcronym <em>Institution Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution Acronym</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getInstitutionAcronym()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InstitutionAcronym();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionDepartment <em>Institution Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution Department</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getInstitutionDepartment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InstitutionDepartment();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionName <em>Institution Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getInstitutionName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InstitutionName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getInstitutionPlace <em>Institution Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution Place</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getInstitutionPlace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InstitutionPlace();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getIntentStatement <em>Intent Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intent Statement</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getIntentStatement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IntentStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getIsbn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getIssn <em>Issn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issn</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getIssn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Issn();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getIssue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Issue();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Item();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getItemNumber <em>Item Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Number</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getItemNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ItemNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getJournal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journal</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getJournal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Journal();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getJournalArticle <em>Journal Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journal Article</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getJournalArticle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JournalArticle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getJournalIssue <em>Journal Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journal Issue</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getJournalIssue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JournalIssue();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getJournalMetadata <em>Journal Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journal Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getJournalMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JournalMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getJournalTitle <em>Journal Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journal Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getJournalTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_JournalTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getJournalVolume <em>Journal Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journal Volume</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getJournalVolume()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JournalVolume();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getLastPage <em>Last Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Page</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getLastPage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LastPage();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getMonth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Month();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getNoisbn <em>Noisbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noisbn</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getNoisbn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Noisbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getORCID <em>ORCID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ORCID</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getORCID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ORCID();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getOrganization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getOriginalLanguageTitle <em>Original Language Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Language Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getOriginalLanguageTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OriginalLanguageTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getOtherPages <em>Other Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Pages</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getOtherPages()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OtherPages();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ovl</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getOvl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ovl();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pages</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPages()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pages();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Number</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPartNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PartNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPeerReview <em>Peer Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Peer Review</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPeerReview()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PeerReview();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPendingPublication <em>Pending Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pending Publication</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPendingPublication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PendingPublication();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPersonName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PersonName();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPostedContent <em>Posted Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Posted Content</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPostedContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostedContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPostedDate <em>Posted Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Posted Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPostedDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostedDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPrefix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Prefix();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsMetadata <em>Proceedings Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proceedings Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getProceedingsMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProceedingsMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsSeriesMetadata <em>Proceedings Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proceedings Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getProceedingsSeriesMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProceedingsSeriesMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsSubject <em>Proceedings Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proceedings Subject</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getProceedingsSubject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProceedingsSubject();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getProceedingsTitle <em>Proceedings Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proceedings Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getProceedingsTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProceedingsTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPublication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publication</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPublication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Publication();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPublicationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PublicationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPublisher()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPublisherItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PublisherItem();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getPublisherName <em>Publisher Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPublisherName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PublisherName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getPublisherPlace <em>Publisher Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Place</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getPublisherPlace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PublisherPlace();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getRegistrant <em>Registrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registrant</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getRegistrant()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Registrant();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getReportPaper <em>Report Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report Paper</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getReportPaper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReportPaper();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getReportPaperMetadata <em>Report Paper Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report Paper Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getReportPaperMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReportPaperMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getReportPaperSeriesMetadata <em>Report Paper Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report Paper Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getReportPaperSeriesMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReportPaperSeriesMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getReviewDate <em>Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Review Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getReviewDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReviewDate();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getRunningNumber <em>Running Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Number</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getRunningNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RunningNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getSaComponent <em>Sa Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sa Component</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSaComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SaComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getScnPolicies <em>Scn Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policies</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getScnPolicies()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScnPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getScnPolicyRef <em>Scn Policy Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policy Ref</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getScnPolicyRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScnPolicyRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getScnPolicySet <em>Scn Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policy Set</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getScnPolicySet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScnPolicySet();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scp</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getScp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scp();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getSeriesMetadata <em>Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSeriesMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SeriesMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getSeriesNumber <em>Series Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Number</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSeriesNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SeriesNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getSeriesTitle <em>Series Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSeriesTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SeriesTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getSetMetadata <em>Set Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSetMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SetMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getSpecialNumbering <em>Special Numbering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Numbering</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSpecialNumbering()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SpecialNumbering();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStandard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Standard();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStandardMetadata <em>Standard Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard Metadata</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStandardMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StandardMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStandardsBody <em>Standards Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standards Body</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStandardsBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StandardsBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStandardsBodyAcronym <em>Standards Body Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standards Body Acronym</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStandardsBodyAcronym()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StandardsBodyAcronym();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStandardsBodyName <em>Standards Body Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standards Body Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStandardsBodyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StandardsBodyName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getStdAdoptedFrom <em>Std Adopted From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Adopted From</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdAdoptedFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StdAdoptedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStdAltAsPublished <em>Std Alt As Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Std Alt As Published</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdAltAsPublished()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StdAltAsPublished();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getStdAltScript <em>Std Alt Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Alt Script</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdAltScript()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StdAltScript();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStdAsPublished <em>Std As Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Std As Published</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdAsPublished()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StdAsPublished();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getStdDesignator <em>Std Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Designator</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdDesignator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StdDesignator();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStdFamilyDesignator <em>Std Family Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Std Family Designator</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdFamilyDesignator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StdFamilyDesignator();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getStdRevisionOf <em>Std Revision Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Revision Of</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdRevisionOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StdRevisionOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStdSetDesignator <em>Std Set Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Std Set Designator</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdSetDesignator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StdSetDesignator();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getStdSupersedes <em>Std Supersedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Supersedes</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdSupersedes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StdSupersedes();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStdUndatedDesignator <em>Std Undated Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Std Undated Designator</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdUndatedDesignator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StdUndatedDesignator();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getStdVariantForm <em>Std Variant Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Variant Form</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStdVariantForm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StdVariantForm();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStringName <em>String Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Name</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStringName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StringName();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strong</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getStrong()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Strong();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSub()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sub();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtitle</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSubtitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Subtitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSuffix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Suffix();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sup</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sup();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getSurname()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Surname();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getTimestamp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getTitles()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Titles();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tt</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getTt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tt();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>U</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getU()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_U();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getUnassignedContent <em>Unassigned Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unassigned Content</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getUnassignedContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnassignedContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getUnstructuredCitation <em>Unstructured Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unstructured Citation</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getUnstructuredCitation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnstructuredCitation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getUpdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Update();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Date</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getUpdateDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdateDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DocumentRoot#getUpdates <em>Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updates</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getUpdates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Updates();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getVolume()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Volume();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getVolumeTitle <em>Volume Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Title</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getVolumeTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_VolumeTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DocumentRoot#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.crossref.schema._4._4.DocumentRoot#getYear()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Year();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DoiBatchType <em>Doi Batch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doi Batch Type</em>'.
	 * @see org.crossref.schema._4._4.DoiBatchType
	 * @generated
	 */
	EClass getDoiBatchType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DoiBatchType#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.crossref.schema._4._4.DoiBatchType#getHead()
	 * @see #getDoiBatchType()
	 * @generated
	 */
	EReference getDoiBatchType_Head();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DoiBatchType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.crossref.schema._4._4.DoiBatchType#getBody()
	 * @see #getDoiBatchType()
	 * @generated
	 */
	EReference getDoiBatchType_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DoiBatchType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.crossref.schema._4._4.DoiBatchType#getVersion()
	 * @see #getDoiBatchType()
	 * @generated
	 */
	EAttribute getDoiBatchType_Version();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.DoiDataType <em>Doi Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doi Data Type</em>'.
	 * @see org.crossref.schema._4._4.DoiDataType
	 * @generated
	 */
	EClass getDoiDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DoiDataType#getDoi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi</em>'.
	 * @see org.crossref.schema._4._4.DoiDataType#getDoi()
	 * @see #getDoiDataType()
	 * @generated
	 */
	EAttribute getDoiDataType_Doi();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.DoiDataType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.crossref.schema._4._4.DoiDataType#getTimestamp()
	 * @see #getDoiDataType()
	 * @generated
	 */
	EAttribute getDoiDataType_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.DoiDataType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.crossref.schema._4._4.DoiDataType#getResource()
	 * @see #getDoiDataType()
	 * @generated
	 */
	EReference getDoiDataType_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.DoiDataType#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see org.crossref.schema._4._4.DoiDataType#getCollection()
	 * @see #getDoiDataType()
	 * @generated
	 */
	EReference getDoiDataType_Collection();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.EventMetadataType <em>Event Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.EventMetadataType
	 * @generated
	 */
	EClass getEventMetadataType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceName <em>Conference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Name</em>'.
	 * @see org.crossref.schema._4._4.EventMetadataType#getConferenceName()
	 * @see #getEventMetadataType()
	 * @generated
	 */
	EAttribute getEventMetadataType_ConferenceName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceTheme <em>Conference Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Theme</em>'.
	 * @see org.crossref.schema._4._4.EventMetadataType#getConferenceTheme()
	 * @see #getEventMetadataType()
	 * @generated
	 */
	EAttribute getEventMetadataType_ConferenceTheme();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceAcronym <em>Conference Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Acronym</em>'.
	 * @see org.crossref.schema._4._4.EventMetadataType#getConferenceAcronym()
	 * @see #getEventMetadataType()
	 * @generated
	 */
	EAttribute getEventMetadataType_ConferenceAcronym();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceSponsor <em>Conference Sponsor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conference Sponsor</em>'.
	 * @see org.crossref.schema._4._4.EventMetadataType#getConferenceSponsor()
	 * @see #getEventMetadataType()
	 * @generated
	 */
	EAttribute getEventMetadataType_ConferenceSponsor();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceNumber <em>Conference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Number</em>'.
	 * @see org.crossref.schema._4._4.EventMetadataType#getConferenceNumber()
	 * @see #getEventMetadataType()
	 * @generated
	 */
	EAttribute getEventMetadataType_ConferenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceLocation <em>Conference Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference Location</em>'.
	 * @see org.crossref.schema._4._4.EventMetadataType#getConferenceLocation()
	 * @see #getEventMetadataType()
	 * @generated
	 */
	EAttribute getEventMetadataType_ConferenceLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.EventMetadataType#getConferenceDate <em>Conference Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conference Date</em>'.
	 * @see org.crossref.schema._4._4.EventMetadataType#getConferenceDate()
	 * @see #getEventMetadataType()
	 * @generated
	 */
	EReference getEventMetadataType_ConferenceDate();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format Type</em>'.
	 * @see org.crossref.schema._4._4.FormatType
	 * @generated
	 */
	EClass getFormatType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.FormatType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.FormatType#getValue()
	 * @see #getFormatType()
	 * @generated
	 */
	EAttribute getFormatType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.FormatType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.crossref.schema._4._4.FormatType#getMimeType()
	 * @see #getFormatType()
	 * @generated
	 */
	EAttribute getFormatType_MimeType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.HeadType <em>Head Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head Type</em>'.
	 * @see org.crossref.schema._4._4.HeadType
	 * @generated
	 */
	EClass getHeadType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.HeadType#getDoiBatchId <em>Doi Batch Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi Batch Id</em>'.
	 * @see org.crossref.schema._4._4.HeadType#getDoiBatchId()
	 * @see #getHeadType()
	 * @generated
	 */
	EAttribute getHeadType_DoiBatchId();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.HeadType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.crossref.schema._4._4.HeadType#getTimestamp()
	 * @see #getHeadType()
	 * @generated
	 */
	EAttribute getHeadType_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.HeadType#getDepositor <em>Depositor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depositor</em>'.
	 * @see org.crossref.schema._4._4.HeadType#getDepositor()
	 * @see #getHeadType()
	 * @generated
	 */
	EReference getHeadType_Depositor();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.HeadType#getRegistrant <em>Registrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registrant</em>'.
	 * @see org.crossref.schema._4._4.HeadType#getRegistrant()
	 * @see #getHeadType()
	 * @generated
	 */
	EAttribute getHeadType_Registrant();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Type</em>'.
	 * @see org.crossref.schema._4._4.IdentifierType
	 * @generated
	 */
	EClass getIdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.IdentifierType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.IdentifierType#getValue()
	 * @see #getIdentifierType()
	 * @generated
	 */
	EAttribute getIdentifierType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.IdentifierType#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see org.crossref.schema._4._4.IdentifierType#getIdType()
	 * @see #getIdentifierType()
	 * @generated
	 */
	EAttribute getIdentifierType_IdType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.InstitutionType <em>Institution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Institution Type</em>'.
	 * @see org.crossref.schema._4._4.InstitutionType
	 * @generated
	 */
	EClass getInstitutionType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.InstitutionType#getInstitutionName <em>Institution Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution Name</em>'.
	 * @see org.crossref.schema._4._4.InstitutionType#getInstitutionName()
	 * @see #getInstitutionType()
	 * @generated
	 */
	EAttribute getInstitutionType_InstitutionName();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.InstitutionType#getInstitutionAcronym <em>Institution Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Institution Acronym</em>'.
	 * @see org.crossref.schema._4._4.InstitutionType#getInstitutionAcronym()
	 * @see #getInstitutionType()
	 * @generated
	 */
	EAttribute getInstitutionType_InstitutionAcronym();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.InstitutionType#getInstitutionPlace <em>Institution Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Institution Place</em>'.
	 * @see org.crossref.schema._4._4.InstitutionType#getInstitutionPlace()
	 * @see #getInstitutionType()
	 * @generated
	 */
	EAttribute getInstitutionType_InstitutionPlace();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.InstitutionType#getInstitutionDepartment <em>Institution Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Institution Department</em>'.
	 * @see org.crossref.schema._4._4.InstitutionType#getInstitutionDepartment()
	 * @see #getInstitutionType()
	 * @generated
	 */
	EAttribute getInstitutionType_InstitutionDepartment();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.IntentStatementType <em>Intent Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Statement Type</em>'.
	 * @see org.crossref.schema._4._4.IntentStatementType
	 * @generated
	 */
	EClass getIntentStatementType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.IntentStatementType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.IntentStatementType#getMixed()
	 * @see #getIntentStatementType()
	 * @generated
	 */
	EAttribute getIntentStatementType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.IntentStatementType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.crossref.schema._4._4.IntentStatementType#getGroup()
	 * @see #getIntentStatementType()
	 * @generated
	 */
	EAttribute getIntentStatementType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.IntentStatementType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.schema._4._4.IntentStatementType#getB()
	 * @see #getIntentStatementType()
	 * @generated
	 */
	EReference getIntentStatementType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.IntentStatementType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.schema._4._4.IntentStatementType#getI()
	 * @see #getIntentStatementType()
	 * @generated
	 */
	EReference getIntentStatementType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.IntentStatementType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.schema._4._4.IntentStatementType#getU()
	 * @see #getIntentStatementType()
	 * @generated
	 */
	EReference getIntentStatementType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.IntentStatementType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.crossref.schema._4._4.IntentStatementType#getA()
	 * @see #getIntentStatementType()
	 * @generated
	 */
	EReference getIntentStatementType_A();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.IntentStatementType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.IntentStatementType#getLanguage()
	 * @see #getIntentStatementType()
	 * @generated
	 */
	EAttribute getIntentStatementType_Language();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.IsbnType <em>Isbn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Isbn Type</em>'.
	 * @see org.crossref.schema._4._4.IsbnType
	 * @generated
	 */
	EClass getIsbnType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.IsbnType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.IsbnType#getValue()
	 * @see #getIsbnType()
	 * @generated
	 */
	EAttribute getIsbnType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.IsbnType#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.crossref.schema._4._4.IsbnType#getMediaType()
	 * @see #getIsbnType()
	 * @generated
	 */
	EAttribute getIsbnType_MediaType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.IssnType <em>Issn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issn Type</em>'.
	 * @see org.crossref.schema._4._4.IssnType
	 * @generated
	 */
	EClass getIssnType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.IssnType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.IssnType#getValue()
	 * @see #getIssnType()
	 * @generated
	 */
	EAttribute getIssnType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.IssnType#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.crossref.schema._4._4.IssnType#getMediaType()
	 * @see #getIssnType()
	 * @generated
	 */
	EAttribute getIssnType_MediaType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ItemNumberType <em>Item Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Number Type</em>'.
	 * @see org.crossref.schema._4._4.ItemNumberType
	 * @generated
	 */
	EClass getItemNumberType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ItemNumberType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.ItemNumberType#getValue()
	 * @see #getItemNumberType()
	 * @generated
	 */
	EAttribute getItemNumberType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ItemNumberType#getItemNumberType <em>Item Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Number Type</em>'.
	 * @see org.crossref.schema._4._4.ItemNumberType#getItemNumberType()
	 * @see #getItemNumberType()
	 * @generated
	 */
	EAttribute getItemNumberType_ItemNumberType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.crossref.schema._4._4.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ItemType#getDoi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi</em>'.
	 * @see org.crossref.schema._4._4.ItemType#getDoi()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Doi();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ItemType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.crossref.schema._4._4.ItemType#getResource()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Resource();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ItemType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.crossref.schema._4._4.ItemType#getCountry()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ItemType#getCrawler <em>Crawler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crawler</em>'.
	 * @see org.crossref.schema._4._4.ItemType#getCrawler()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Crawler();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ItemType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.crossref.schema._4._4.ItemType#getLabel()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ItemType#getLinkHeaderRelationship <em>Link Header Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Header Relationship</em>'.
	 * @see org.crossref.schema._4._4.ItemType#getLinkHeaderRelationship()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_LinkHeaderRelationship();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.JournalArticleType <em>Journal Article Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal Article Type</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType
	 * @generated
	 */
	EClass getJournalArticleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.JournalArticleType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getTitles()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_Titles();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getContributors()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_Contributors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.JournalArticleType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getAbstract()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.JournalArticleType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getPublicationDate()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getAcceptanceDate <em>Acceptance Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceptance Date</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getAcceptanceDate()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_AcceptanceDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pages</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getPages()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getPublisherItem()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getCrossmark()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getProgram()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getProgram1()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getProgram2()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getProgram3 <em>Program3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program3</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getProgram3()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_Program3();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getArchiveLocations()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getScnPolicies <em>Scn Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policies</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getScnPolicies()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_ScnPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getDoiData()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getCitationList()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_CitationList();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalArticleType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getComponentList()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EReference getJournalArticleType_ComponentList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.JournalArticleType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getLanguage()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EAttribute getJournalArticleType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.JournalArticleType#getPublicationType <em>Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Type</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getPublicationType()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EAttribute getJournalArticleType_PublicationType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.JournalArticleType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.JournalArticleType#getReferenceDistributionOpts()
	 * @see #getJournalArticleType()
	 * @generated
	 */
	EAttribute getJournalArticleType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.JournalIssueType <em>Journal Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal Issue Type</em>'.
	 * @see org.crossref.schema._4._4.JournalIssueType
	 * @generated
	 */
	EClass getJournalIssueType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalIssueType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.JournalIssueType#getContributors()
	 * @see #getJournalIssueType()
	 * @generated
	 */
	EReference getJournalIssueType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalIssueType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.JournalIssueType#getTitles()
	 * @see #getJournalIssueType()
	 * @generated
	 */
	EReference getJournalIssueType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.JournalIssueType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.JournalIssueType#getPublicationDate()
	 * @see #getJournalIssueType()
	 * @generated
	 */
	EReference getJournalIssueType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalIssueType#getJournalVolume <em>Journal Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journal Volume</em>'.
	 * @see org.crossref.schema._4._4.JournalIssueType#getJournalVolume()
	 * @see #getJournalIssueType()
	 * @generated
	 */
	EReference getJournalIssueType_JournalVolume();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.JournalIssueType#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see org.crossref.schema._4._4.JournalIssueType#getIssue()
	 * @see #getJournalIssueType()
	 * @generated
	 */
	EAttribute getJournalIssueType_Issue();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.JournalIssueType#getSpecialNumbering <em>Special Numbering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Numbering</em>'.
	 * @see org.crossref.schema._4._4.JournalIssueType#getSpecialNumbering()
	 * @see #getJournalIssueType()
	 * @generated
	 */
	EAttribute getJournalIssueType_SpecialNumbering();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalIssueType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.JournalIssueType#getArchiveLocations()
	 * @see #getJournalIssueType()
	 * @generated
	 */
	EReference getJournalIssueType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalIssueType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.JournalIssueType#getDoiData()
	 * @see #getJournalIssueType()
	 * @generated
	 */
	EReference getJournalIssueType_DoiData();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.JournalMetadataType <em>Journal Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.JournalMetadataType
	 * @generated
	 */
	EClass getJournalMetadataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.JournalMetadataType#getFullTitle <em>Full Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Full Title</em>'.
	 * @see org.crossref.schema._4._4.JournalMetadataType#getFullTitle()
	 * @see #getJournalMetadataType()
	 * @generated
	 */
	EAttribute getJournalMetadataType_FullTitle();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.JournalMetadataType#getAbbrevTitle <em>Abbrev Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abbrev Title</em>'.
	 * @see org.crossref.schema._4._4.JournalMetadataType#getAbbrevTitle()
	 * @see #getJournalMetadataType()
	 * @generated
	 */
	EAttribute getJournalMetadataType_AbbrevTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.JournalMetadataType#getIssn <em>Issn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issn</em>'.
	 * @see org.crossref.schema._4._4.JournalMetadataType#getIssn()
	 * @see #getJournalMetadataType()
	 * @generated
	 */
	EReference getJournalMetadataType_Issn();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.JournalMetadataType#getCoden <em>Coden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coden</em>'.
	 * @see org.crossref.schema._4._4.JournalMetadataType#getCoden()
	 * @see #getJournalMetadataType()
	 * @generated
	 */
	EAttribute getJournalMetadataType_Coden();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.JournalMetadataType#getArchiveLocations()
	 * @see #getJournalMetadataType()
	 * @generated
	 */
	EReference getJournalMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.JournalMetadataType#getDoiData()
	 * @see #getJournalMetadataType()
	 * @generated
	 */
	EReference getJournalMetadataType_DoiData();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.JournalMetadataType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.JournalMetadataType#getLanguage()
	 * @see #getJournalMetadataType()
	 * @generated
	 */
	EAttribute getJournalMetadataType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.JournalMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.JournalMetadataType#getReferenceDistributionOpts()
	 * @see #getJournalMetadataType()
	 * @generated
	 */
	EAttribute getJournalMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.JournalType <em>Journal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal Type</em>'.
	 * @see org.crossref.schema._4._4.JournalType
	 * @generated
	 */
	EClass getJournalType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalType#getJournalMetadata <em>Journal Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journal Metadata</em>'.
	 * @see org.crossref.schema._4._4.JournalType#getJournalMetadata()
	 * @see #getJournalType()
	 * @generated
	 */
	EReference getJournalType_JournalMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalType#getJournalIssue <em>Journal Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journal Issue</em>'.
	 * @see org.crossref.schema._4._4.JournalType#getJournalIssue()
	 * @see #getJournalType()
	 * @generated
	 */
	EReference getJournalType_JournalIssue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.JournalType#getJournalArticle <em>Journal Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journal Article</em>'.
	 * @see org.crossref.schema._4._4.JournalType#getJournalArticle()
	 * @see #getJournalType()
	 * @generated
	 */
	EReference getJournalType_JournalArticle();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.JournalVolumeType <em>Journal Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal Volume Type</em>'.
	 * @see org.crossref.schema._4._4.JournalVolumeType
	 * @generated
	 */
	EClass getJournalVolumeType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.JournalVolumeType#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.crossref.schema._4._4.JournalVolumeType#getVolume()
	 * @see #getJournalVolumeType()
	 * @generated
	 */
	EAttribute getJournalVolumeType_Volume();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalVolumeType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.JournalVolumeType#getPublisherItem()
	 * @see #getJournalVolumeType()
	 * @generated
	 */
	EReference getJournalVolumeType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalVolumeType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.JournalVolumeType#getArchiveLocations()
	 * @see #getJournalVolumeType()
	 * @generated
	 */
	EReference getJournalVolumeType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.JournalVolumeType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.JournalVolumeType#getDoiData()
	 * @see #getJournalVolumeType()
	 * @generated
	 */
	EReference getJournalVolumeType_DoiData();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.NameType1 <em>Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type1</em>'.
	 * @see org.crossref.schema._4._4.NameType1
	 * @generated
	 */
	EClass getNameType1();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.NameType1#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see org.crossref.schema._4._4.NameType1#getSurname()
	 * @see #getNameType1()
	 * @generated
	 */
	EAttribute getNameType1_Surname();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.NameType1#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name</em>'.
	 * @see org.crossref.schema._4._4.NameType1#getGivenName()
	 * @see #getNameType1()
	 * @generated
	 */
	EAttribute getNameType1_GivenName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.NameType1#getGivenName1 <em>Given Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name1</em>'.
	 * @see org.crossref.schema._4._4.NameType1#getGivenName1()
	 * @see #getNameType1()
	 * @generated
	 */
	EAttribute getNameType1_GivenName1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.NameType1#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see org.crossref.schema._4._4.NameType1#getPrefix()
	 * @see #getNameType1()
	 * @generated
	 */
	EReference getNameType1_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.NameType1#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see org.crossref.schema._4._4.NameType1#getSuffix()
	 * @see #getNameType1()
	 * @generated
	 */
	EAttribute getNameType1_Suffix();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.NameType1#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.crossref.schema._4._4.NameType1#getContentType()
	 * @see #getNameType1()
	 * @generated
	 */
	EAttribute getNameType1_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.NameType1#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.NameType1#getLanguage()
	 * @see #getNameType1()
	 * @generated
	 */
	EAttribute getNameType1_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.NameType1#getNameStyle <em>Name Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Style</em>'.
	 * @see org.crossref.schema._4._4.NameType1#getNameStyle()
	 * @see #getNameType1()
	 * @generated
	 */
	EAttribute getNameType1_NameStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.NameType1#getSpecificUse <em>Specific Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Use</em>'.
	 * @see org.crossref.schema._4._4.NameType1#getSpecificUse()
	 * @see #getNameType1()
	 * @generated
	 */
	EAttribute getNameType1_SpecificUse();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.NoisbnType <em>Noisbn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noisbn Type</em>'.
	 * @see org.crossref.schema._4._4.NoisbnType
	 * @generated
	 */
	EClass getNoisbnType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.NoisbnType#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.crossref.schema._4._4.NoisbnType#getReason()
	 * @see #getNoisbnType()
	 * @generated
	 */
	EAttribute getNoisbnType_Reason();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ORCIDType <em>ORCID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORCID Type</em>'.
	 * @see org.crossref.schema._4._4.ORCIDType
	 * @generated
	 */
	EClass getORCIDType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ORCIDType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.ORCIDType#getValue()
	 * @see #getORCIDType()
	 * @generated
	 */
	EAttribute getORCIDType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ORCIDType#isAuthenticated <em>Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authenticated</em>'.
	 * @see org.crossref.schema._4._4.ORCIDType#isAuthenticated()
	 * @see #getORCIDType()
	 * @generated
	 */
	EAttribute getORCIDType_Authenticated();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Type</em>'.
	 * @see org.crossref.schema._4._4.OrganizationType
	 * @generated
	 */
	EClass getOrganizationType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.OrganizationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.OrganizationType#getValue()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.OrganizationType#getContributorRole <em>Contributor Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contributor Role</em>'.
	 * @see org.crossref.schema._4._4.OrganizationType#getContributorRole()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_ContributorRole();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.OrganizationType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.OrganizationType#getLanguage()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.OrganizationType#getNameStyle <em>Name Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Style</em>'.
	 * @see org.crossref.schema._4._4.OrganizationType#getNameStyle()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_NameStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.OrganizationType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.crossref.schema._4._4.OrganizationType#getSequence()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_Sequence();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.OriginalLanguageTitleType <em>Original Language Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Original Language Title Type</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType
	 * @generated
	 */
	EClass getOriginalLanguageTitleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getMixed()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EAttribute getOriginalLanguageTitleType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getFaceMarkup()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EAttribute getOriginalLanguageTitleType_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getB()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getI()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getEm()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getStrong()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getU()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getOvl()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getSup()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getSub()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getScp()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getTt()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getFont()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Math</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getMath()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EReference getOriginalLanguageTitleType_Math();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.OriginalLanguageTitleType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType#getLanguage()
	 * @see #getOriginalLanguageTitleType()
	 * @generated
	 */
	EAttribute getOriginalLanguageTitleType_Language();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PagesType <em>Pages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pages Type</em>'.
	 * @see org.crossref.schema._4._4.PagesType
	 * @generated
	 */
	EClass getPagesType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PagesType#getFirstPage <em>First Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page</em>'.
	 * @see org.crossref.schema._4._4.PagesType#getFirstPage()
	 * @see #getPagesType()
	 * @generated
	 */
	EAttribute getPagesType_FirstPage();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PagesType#getLastPage <em>Last Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Page</em>'.
	 * @see org.crossref.schema._4._4.PagesType#getLastPage()
	 * @see #getPagesType()
	 * @generated
	 */
	EAttribute getPagesType_LastPage();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PagesType#getOtherPages <em>Other Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Pages</em>'.
	 * @see org.crossref.schema._4._4.PagesType#getOtherPages()
	 * @see #getPagesType()
	 * @generated
	 */
	EAttribute getPagesType_OtherPages();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PeerReviewType <em>Peer Review Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peer Review Type</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType
	 * @generated
	 */
	EClass getPeerReviewType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PeerReviewType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getContributors()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EReference getPeerReviewType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PeerReviewType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getTitles()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EReference getPeerReviewType_Titles();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PeerReviewType#getReviewDate <em>Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Review Date</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getReviewDate()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EReference getPeerReviewType_ReviewDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.PeerReviewType#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institution</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getInstitution()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EReference getPeerReviewType_Institution();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PeerReviewType#getCompetingInterestStatement <em>Competing Interest Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Competing Interest Statement</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getCompetingInterestStatement()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EReference getPeerReviewType_CompetingInterestStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PeerReviewType#getRunningNumber <em>Running Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Number</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getRunningNumber()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EAttribute getPeerReviewType_RunningNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PeerReviewType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getProgram()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EReference getPeerReviewType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PeerReviewType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getProgram1()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EReference getPeerReviewType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PeerReviewType#getScnPolicies <em>Scn Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policies</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getScnPolicies()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EReference getPeerReviewType_ScnPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PeerReviewType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getDoiData()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EReference getPeerReviewType_DoiData();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PeerReviewType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getLanguage()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EAttribute getPeerReviewType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PeerReviewType#getRecommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getRecommendation()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EAttribute getPeerReviewType_Recommendation();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PeerReviewType#getRevisionRound <em>Revision Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Round</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getRevisionRound()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EAttribute getPeerReviewType_RevisionRound();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PeerReviewType#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getStage()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EAttribute getPeerReviewType_Stage();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PeerReviewType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.crossref.schema._4._4.PeerReviewType#getType()
	 * @see #getPeerReviewType()
	 * @generated
	 */
	EAttribute getPeerReviewType_Type();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PendingPublicationType <em>Pending Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pending Publication Type</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType
	 * @generated
	 */
	EClass getPendingPublicationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PendingPublicationType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getContributors()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PendingPublicationType#getPublication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publication</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getPublication()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_Publication();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PendingPublicationType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getTitles()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_Titles();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PendingPublicationType#getAcceptanceDate <em>Acceptance Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceptance Date</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getAcceptanceDate()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_AcceptanceDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.PendingPublicationType#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institution</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getInstitution()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_Institution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.PendingPublicationType#getItemNumber <em>Item Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Number</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getItemNumber()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_ItemNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PendingPublicationType#getIntentStatement <em>Intent Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intent Statement</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getIntentStatement()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_IntentStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.PendingPublicationType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getAbstract()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PendingPublicationType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getCrossmark()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PendingPublicationType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getProgram()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PendingPublicationType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getProgram1()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PendingPublicationType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getProgram2()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EReference getPendingPublicationType_Program2();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PendingPublicationType#getDoi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getDoi()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EAttribute getPendingPublicationType_Doi();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PendingPublicationType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.PendingPublicationType#getLanguage()
	 * @see #getPendingPublicationType()
	 * @generated
	 */
	EAttribute getPendingPublicationType_Language();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Name Type</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType
	 * @generated
	 */
	EClass getPersonNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PersonNameType#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getGivenName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_GivenName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PersonNameType#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getSurname()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_Surname();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PersonNameType#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getSuffix()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_Suffix();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.PersonNameType#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Affiliation</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getAffiliation()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_Affiliation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PersonNameType#getORCID <em>ORCID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ORCID</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getORCID()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EReference getPersonNameType_ORCID();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PersonNameType#getAltName <em>Alt Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alt Name</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getAltName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EReference getPersonNameType_AltName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PersonNameType#getContributorRole <em>Contributor Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contributor Role</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getContributorRole()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_ContributorRole();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PersonNameType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getLanguage()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PersonNameType#getNameStyle <em>Name Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Style</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getNameStyle()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_NameStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PersonNameType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.crossref.schema._4._4.PersonNameType#getSequence()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_Sequence();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PostedContentType <em>Posted Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Posted Content Type</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType
	 * @generated
	 */
	EClass getPostedContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PostedContentType#getGroupTitle <em>Group Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Title</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getGroupTitle()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EAttribute getPostedContentType_GroupTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getContributors()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getTitles()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_Titles();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getPostedDate <em>Posted Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Posted Date</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getPostedDate()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_PostedDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getAcceptanceDate <em>Acceptance Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceptance Date</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getAcceptanceDate()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_AcceptanceDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.PostedContentType#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institution</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getInstitution()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_Institution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.PostedContentType#getItemNumber <em>Item Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Number</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getItemNumber()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_ItemNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.PostedContentType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getAbstract()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getProgram()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getProgram1()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getProgram2()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getScnPolicies <em>Scn Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policies</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getScnPolicies()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_ScnPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getDoiData()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PostedContentType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getCitationList()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EReference getPostedContentType_CitationList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PostedContentType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getLanguage()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EAttribute getPostedContentType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PostedContentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.crossref.schema._4._4.PostedContentType#getType()
	 * @see #getPostedContentType()
	 * @generated
	 */
	EAttribute getPostedContentType_Type();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PostedDateType <em>Posted Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Posted Date Type</em>'.
	 * @see org.crossref.schema._4._4.PostedDateType
	 * @generated
	 */
	EClass getPostedDateType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PrefixType <em>Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix Type</em>'.
	 * @see org.crossref.schema._4._4.PrefixType
	 * @generated
	 */
	EClass getPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.PrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.PrefixType#getMixed()
	 * @see #getPrefixType()
	 * @generated
	 */
	EAttribute getPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PrefixType#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.crossref.schema._4._4.PrefixType#getContentType()
	 * @see #getPrefixType()
	 * @generated
	 */
	EAttribute getPrefixType_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PrefixType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.PrefixType#getLanguage()
	 * @see #getPrefixType()
	 * @generated
	 */
	EAttribute getPrefixType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PrefixType#getSpecificUse <em>Specific Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Use</em>'.
	 * @see org.crossref.schema._4._4.PrefixType#getSpecificUse()
	 * @see #getPrefixType()
	 * @generated
	 */
	EAttribute getPrefixType_SpecificUse();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ProceedingsMetadataType <em>Proceedings Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceedings Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType
	 * @generated
	 */
	EClass getProceedingsMetadataType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getProceedingsTitle <em>Proceedings Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proceedings Title</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getProceedingsTitle()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsMetadataType_ProceedingsTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getProceedingsSubject <em>Proceedings Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proceedings Subject</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getProceedingsSubject()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsMetadataType_ProceedingsSubject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getPublisher()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EReference getProceedingsMetadataType_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getPublicationDate()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EReference getProceedingsMetadataType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getIsbn()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EReference getProceedingsMetadataType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getNoisbn <em>Noisbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noisbn</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getNoisbn()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EReference getProceedingsMetadataType_Noisbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getPublisherItem()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EReference getProceedingsMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getArchiveLocations()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EReference getProceedingsMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getDoiData()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EReference getProceedingsMetadataType_DoiData();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getLanguage()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsMetadataType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType#getReferenceDistributionOpts()
	 * @see #getProceedingsMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType <em>Proceedings Series Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceedings Series Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType
	 * @generated
	 */
	EClass getProceedingsSeriesMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getSeriesMetadata <em>Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getSeriesMetadata()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_SeriesMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsTitle <em>Proceedings Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proceedings Title</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsTitle()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsSeriesMetadataType_ProceedingsTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getVolume()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsSeriesMetadataType_Volume();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getVolume1 <em>Volume1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume1</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getVolume1()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsSeriesMetadataType_Volume1();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsSubject <em>Proceedings Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proceedings Subject</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsSubject()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsSeriesMetadataType_ProceedingsSubject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisher()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublicationDate()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getIsbn()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getNoisbn <em>Noisbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noisbn</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getNoisbn()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_Noisbn();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsSubject1 <em>Proceedings Subject1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proceedings Subject1</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getProceedingsSubject1()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsSeriesMetadataType_ProceedingsSubject1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisher1 <em>Publisher1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher1</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisher1()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_Publisher1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublicationDate1 <em>Publication Date1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date1</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublicationDate1()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_PublicationDate1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getPublisherItem()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getArchiveLocations()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getDoiData()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EReference getProceedingsSeriesMetadataType_DoiData();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType#getReferenceDistributionOpts()
	 * @see #getProceedingsSeriesMetadataType()
	 * @generated
	 */
	EAttribute getProceedingsSeriesMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.crossref.schema._4._4.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.crossref.schema._4._4.PropertyType#getType()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Type();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PublicationDateType <em>Publication Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication Date Type</em>'.
	 * @see org.crossref.schema._4._4.PublicationDateType
	 * @generated
	 */
	EClass getPublicationDateType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PublicationType <em>Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication Type</em>'.
	 * @see org.crossref.schema._4._4.PublicationType
	 * @generated
	 */
	EClass getPublicationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.PublicationType#getFullTitle <em>Full Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Full Title</em>'.
	 * @see org.crossref.schema._4._4.PublicationType#getFullTitle()
	 * @see #getPublicationType()
	 * @generated
	 */
	EAttribute getPublicationType_FullTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PublicationType#getIssn <em>Issn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issn</em>'.
	 * @see org.crossref.schema._4._4.PublicationType#getIssn()
	 * @see #getPublicationType()
	 * @generated
	 */
	EReference getPublicationType_Issn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PublicationType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.PublicationType#getIsbn()
	 * @see #getPublicationType()
	 * @generated
	 */
	EReference getPublicationType_Isbn();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PublicationType#getDoi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi</em>'.
	 * @see org.crossref.schema._4._4.PublicationType#getDoi()
	 * @see #getPublicationType()
	 * @generated
	 */
	EAttribute getPublicationType_Doi();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PublicationType#getIssn1 <em>Issn1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issn1</em>'.
	 * @see org.crossref.schema._4._4.PublicationType#getIssn1()
	 * @see #getPublicationType()
	 * @generated
	 */
	EReference getPublicationType_Issn1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.PublicationType#getIsbn1 <em>Isbn1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Isbn1</em>'.
	 * @see org.crossref.schema._4._4.PublicationType#getIsbn1()
	 * @see #getPublicationType()
	 * @generated
	 */
	EReference getPublicationType_Isbn1();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PublisherItemType <em>Publisher Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher Item Type</em>'.
	 * @see org.crossref.schema._4._4.PublisherItemType
	 * @generated
	 */
	EClass getPublisherItemType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.PublisherItemType#getItemNumber <em>Item Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Number</em>'.
	 * @see org.crossref.schema._4._4.PublisherItemType#getItemNumber()
	 * @see #getPublisherItemType()
	 * @generated
	 */
	EReference getPublisherItemType_ItemNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.PublisherItemType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see org.crossref.schema._4._4.PublisherItemType#getIdentifier()
	 * @see #getPublisherItemType()
	 * @generated
	 */
	EReference getPublisherItemType_Identifier();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.PublisherType <em>Publisher Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher Type</em>'.
	 * @see org.crossref.schema._4._4.PublisherType
	 * @generated
	 */
	EClass getPublisherType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PublisherType#getPublisherName <em>Publisher Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Name</em>'.
	 * @see org.crossref.schema._4._4.PublisherType#getPublisherName()
	 * @see #getPublisherType()
	 * @generated
	 */
	EAttribute getPublisherType_PublisherName();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.PublisherType#getPublisherPlace <em>Publisher Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Place</em>'.
	 * @see org.crossref.schema._4._4.PublisherType#getPublisherPlace()
	 * @see #getPublisherType()
	 * @generated
	 */
	EAttribute getPublisherType_PublisherPlace();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ReportPaperMetadataType <em>Report Paper Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Paper Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType
	 * @generated
	 */
	EClass getReportPaperMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getContributors()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getTitles()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Titles();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getEditionNumber <em>Edition Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Number</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getEditionNumber()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperMetadataType_EditionNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getAbstract()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getPublicationDate()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getApprovalDate <em>Approval Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approval Date</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getApprovalDate()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_ApprovalDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getIsbn()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getPublisher()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institution</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getInstitution()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Institution();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getPublisherItem()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getContractNumber <em>Contract Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Number</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getContractNumber()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperMetadataType_ContractNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getCrossmark()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getProgram()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getProgram1()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getProgram2()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getArchiveLocations()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getScnPolicies <em>Scn Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scn Policies</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getScnPolicies()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_ScnPolicies();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getDoiData()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getCitationList()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EReference getReportPaperMetadataType_CitationList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getLanguage()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperMetadataType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType#getReferenceDistributionOpts()
	 * @see #getReportPaperMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType <em>Report Paper Series Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Paper Series Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType
	 * @generated
	 */
	EClass getReportPaperSeriesMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getSeriesMetadata <em>Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getSeriesMetadata()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_SeriesMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getContributors()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getTitles()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getAbstract()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getVolume()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperSeriesMetadataType_Volume();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getVolume1 <em>Volume1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume1</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getVolume1()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperSeriesMetadataType_Volume1();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getEditionNumber <em>Edition Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Number</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getEditionNumber()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperSeriesMetadataType_EditionNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication Date</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getPublicationDate()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_PublicationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getApprovalDate <em>Approval Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approval Date</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getApprovalDate()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_ApprovalDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getIsbn()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getPublisher()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institution</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getInstitution()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_Institution();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getPublisherItem()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getContractNumber <em>Contract Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Number</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getContractNumber()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperSeriesMetadataType_ContractNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getArchiveLocations()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getDoiData()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getCitationList()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_CitationList();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getProgram()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EReference getReportPaperSeriesMetadataType_Program();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getLanguage()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperSeriesMetadataType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType#getReferenceDistributionOpts()
	 * @see #getReportPaperSeriesMetadataType()
	 * @generated
	 */
	EAttribute getReportPaperSeriesMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ReportPaperType <em>Report Paper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Paper Type</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperType
	 * @generated
	 */
	EClass getReportPaperType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperType#getReportPaperMetadata <em>Report Paper Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report Paper Metadata</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperType#getReportPaperMetadata()
	 * @see #getReportPaperType()
	 * @generated
	 */
	EReference getReportPaperType_ReportPaperMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperType#getReportPaperSeriesMetadata <em>Report Paper Series Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report Paper Series Metadata</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperType#getReportPaperSeriesMetadata()
	 * @see #getReportPaperType()
	 * @generated
	 */
	EReference getReportPaperType_ReportPaperSeriesMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ReportPaperType#getContentItem <em>Content Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Item</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperType#getContentItem()
	 * @see #getReportPaperType()
	 * @generated
	 */
	EReference getReportPaperType_ContentItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.ReportPaperType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperType#getComponentList()
	 * @see #getReportPaperType()
	 * @generated
	 */
	EReference getReportPaperType_ComponentList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReportPaperType#getPublicationType <em>Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Type</em>'.
	 * @see org.crossref.schema._4._4.ReportPaperType#getPublicationType()
	 * @see #getReportPaperType()
	 * @generated
	 */
	EAttribute getReportPaperType_PublicationType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see org.crossref.schema._4._4.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ResourceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.ResourceType#getValue()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ResourceType#getContentVersion <em>Content Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Version</em>'.
	 * @see org.crossref.schema._4._4.ResourceType#getContentVersion()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ContentVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ResourceType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.crossref.schema._4._4.ResourceType#getMimeType()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_MimeType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ReviewDateType <em>Review Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review Date Type</em>'.
	 * @see org.crossref.schema._4._4.ReviewDateType
	 * @generated
	 */
	EClass getReviewDateType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReviewDateType#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.crossref.schema._4._4.ReviewDateType#getMonth()
	 * @see #getReviewDateType()
	 * @generated
	 */
	EAttribute getReviewDateType_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReviewDateType#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.crossref.schema._4._4.ReviewDateType#getDay()
	 * @see #getReviewDateType()
	 * @generated
	 */
	EAttribute getReviewDateType_Day();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ReviewDateType#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.crossref.schema._4._4.ReviewDateType#getYear()
	 * @see #getReviewDateType()
	 * @generated
	 */
	EAttribute getReviewDateType_Year();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.SaComponentType <em>Sa Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sa Component Type</em>'.
	 * @see org.crossref.schema._4._4.SaComponentType
	 * @generated
	 */
	EClass getSaComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SaComponentType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.SaComponentType#getComponentList()
	 * @see #getSaComponentType()
	 * @generated
	 */
	EReference getSaComponentType_ComponentList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.SaComponentType#getParentDoi <em>Parent Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Doi</em>'.
	 * @see org.crossref.schema._4._4.SaComponentType#getParentDoi()
	 * @see #getSaComponentType()
	 * @generated
	 */
	EAttribute getSaComponentType_ParentDoi();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ScnPoliciesType <em>Scn Policies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scn Policies Type</em>'.
	 * @see org.crossref.schema._4._4.ScnPoliciesType
	 * @generated
	 */
	EClass getScnPoliciesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ScnPoliciesType#getScnPolicySet <em>Scn Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scn Policy Set</em>'.
	 * @see org.crossref.schema._4._4.ScnPoliciesType#getScnPolicySet()
	 * @see #getScnPoliciesType()
	 * @generated
	 */
	EReference getScnPoliciesType_ScnPolicySet();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ScnPolicyRefType <em>Scn Policy Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scn Policy Ref Type</em>'.
	 * @see org.crossref.schema._4._4.ScnPolicyRefType
	 * @generated
	 */
	EClass getScnPolicyRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ScnPolicyRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.ScnPolicyRefType#getValue()
	 * @see #getScnPolicyRefType()
	 * @generated
	 */
	EAttribute getScnPolicyRefType_Value();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.ScnPolicySetType <em>Scn Policy Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scn Policy Set Type</em>'.
	 * @see org.crossref.schema._4._4.ScnPolicySetType
	 * @generated
	 */
	EClass getScnPolicySetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.ScnPolicySetType#getScnPolicyRef <em>Scn Policy Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scn Policy Ref</em>'.
	 * @see org.crossref.schema._4._4.ScnPolicySetType#getScnPolicyRef()
	 * @see #getScnPolicySetType()
	 * @generated
	 */
	EReference getScnPolicySetType_ScnPolicyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.ScnPolicySetType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.crossref.schema._4._4.ScnPolicySetType#getStartDate()
	 * @see #getScnPolicySetType()
	 * @generated
	 */
	EAttribute getScnPolicySetType_StartDate();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.SeriesMetadataType <em>Series Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType
	 * @generated
	 */
	EClass getSeriesMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SeriesMetadataType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getContributors()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SeriesMetadataType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getTitles()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SeriesMetadataType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getAbstract()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SeriesMetadataType#getIssn <em>Issn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issn</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getIssn()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_Issn();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.SeriesMetadataType#getCoden <em>Coden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coden</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getCoden()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EAttribute getSeriesMetadataType_Coden();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.SeriesMetadataType#getSeriesNumber <em>Series Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Number</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getSeriesNumber()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EAttribute getSeriesMetadataType_SeriesNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SeriesMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getPublisherItem()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SeriesMetadataType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getCrossmark()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SeriesMetadataType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getProgram()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SeriesMetadataType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getProgram1()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SeriesMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getArchiveLocations()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SeriesMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.SeriesMetadataType#getDoiData()
	 * @see #getSeriesMetadataType()
	 * @generated
	 */
	EReference getSeriesMetadataType_DoiData();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.SetMetadataType <em>Set Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.SetMetadataType
	 * @generated
	 */
	EClass getSetMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SetMetadataType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.SetMetadataType#getTitles()
	 * @see #getSetMetadataType()
	 * @generated
	 */
	EReference getSetMetadataType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SetMetadataType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.SetMetadataType#getIsbn()
	 * @see #getSetMetadataType()
	 * @generated
	 */
	EReference getSetMetadataType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SetMetadataType#getNoisbn <em>Noisbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Noisbn</em>'.
	 * @see org.crossref.schema._4._4.SetMetadataType#getNoisbn()
	 * @see #getSetMetadataType()
	 * @generated
	 */
	EReference getSetMetadataType_Noisbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SetMetadataType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.SetMetadataType#getContributors()
	 * @see #getSetMetadataType()
	 * @generated
	 */
	EReference getSetMetadataType_Contributors();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.SetMetadataType#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Number</em>'.
	 * @see org.crossref.schema._4._4.SetMetadataType#getPartNumber()
	 * @see #getSetMetadataType()
	 * @generated
	 */
	EAttribute getSetMetadataType_PartNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SetMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.SetMetadataType#getPublisherItem()
	 * @see #getSetMetadataType()
	 * @generated
	 */
	EReference getSetMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SetMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.SetMetadataType#getArchiveLocations()
	 * @see #getSetMetadataType()
	 * @generated
	 */
	EReference getSetMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.SetMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.SetMetadataType#getDoiData()
	 * @see #getSetMetadataType()
	 * @generated
	 */
	EReference getSetMetadataType_DoiData();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.StandardMetadataType <em>Standard Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Metadata Type</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType
	 * @generated
	 */
	EClass getStandardMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributors</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getContributors()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Contributors();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getTitles()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.StandardMetadataType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getAbstract()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getDesignators <em>Designators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Designators</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getDesignators()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Designators();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StandardMetadataType#getEditionNumber <em>Edition Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Number</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getEditionNumber()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EAttribute getStandardMetadataType_EditionNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getApprovalDate <em>Approval Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approval Date</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getApprovalDate()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_ApprovalDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.StandardMetadataType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isbn</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getIsbn()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getPublisher()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getStandardsBody <em>Standards Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standards Body</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getStandardsBody()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_StandardsBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getPublisherItem <em>Publisher Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher Item</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getPublisherItem()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_PublisherItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getCrossmark <em>Crossmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crossmark</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getCrossmark()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Crossmark();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getProgram()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getProgram1 <em>Program1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program1</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getProgram1()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Program1();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getProgram2 <em>Program2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program2</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getProgram2()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_Program2();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getArchiveLocations <em>Archive Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive Locations</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getArchiveLocations()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_ArchiveLocations();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getDoiData <em>Doi Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doi Data</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getDoiData()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_DoiData();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardMetadataType#getCitationList <em>Citation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation List</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getCitationList()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EReference getStandardMetadataType_CitationList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StandardMetadataType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getLanguage()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EAttribute getStandardMetadataType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StandardMetadataType#getPublicationStatus <em>Publication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Status</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getPublicationStatus()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EAttribute getStandardMetadataType_PublicationStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StandardMetadataType#getReferenceDistributionOpts <em>Reference Distribution Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Distribution Opts</em>'.
	 * @see org.crossref.schema._4._4.StandardMetadataType#getReferenceDistributionOpts()
	 * @see #getStandardMetadataType()
	 * @generated
	 */
	EAttribute getStandardMetadataType_ReferenceDistributionOpts();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.StandardsBodyType <em>Standards Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standards Body Type</em>'.
	 * @see org.crossref.schema._4._4.StandardsBodyType
	 * @generated
	 */
	EClass getStandardsBodyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardsBodyType#getStandardsBodyName <em>Standards Body Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standards Body Name</em>'.
	 * @see org.crossref.schema._4._4.StandardsBodyType#getStandardsBodyName()
	 * @see #getStandardsBodyType()
	 * @generated
	 */
	EReference getStandardsBodyType_StandardsBodyName();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardsBodyType#getStandardsBodyAcronym <em>Standards Body Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standards Body Acronym</em>'.
	 * @see org.crossref.schema._4._4.StandardsBodyType#getStandardsBodyAcronym()
	 * @see #getStandardsBodyType()
	 * @generated
	 */
	EReference getStandardsBodyType_StandardsBodyAcronym();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.StandardType <em>Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Type</em>'.
	 * @see org.crossref.schema._4._4.StandardType
	 * @generated
	 */
	EClass getStandardType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardType#getStandardMetadata <em>Standard Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard Metadata</em>'.
	 * @see org.crossref.schema._4._4.StandardType#getStandardMetadata()
	 * @see #getStandardType()
	 * @generated
	 */
	EReference getStandardType_StandardMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.StandardType#getContentItem <em>Content Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Item</em>'.
	 * @see org.crossref.schema._4._4.StandardType#getContentItem()
	 * @see #getStandardType()
	 * @generated
	 */
	EReference getStandardType_ContentItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.StandardType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.crossref.schema._4._4.StandardType#getComponentList()
	 * @see #getStandardType()
	 * @generated
	 */
	EReference getStandardType_ComponentList();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StandardType#getPublicationType <em>Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Type</em>'.
	 * @see org.crossref.schema._4._4.StandardType#getPublicationType()
	 * @see #getStandardType()
	 * @generated
	 */
	EAttribute getStandardType_PublicationType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.StdAltAsPublishedType <em>Std Alt As Published Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Alt As Published Type</em>'.
	 * @see org.crossref.schema._4._4.StdAltAsPublishedType
	 * @generated
	 */
	EClass getStdAltAsPublishedType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdAltAsPublishedType#getApprovedMonth <em>Approved Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approved Month</em>'.
	 * @see org.crossref.schema._4._4.StdAltAsPublishedType#getApprovedMonth()
	 * @see #getStdAltAsPublishedType()
	 * @generated
	 */
	EAttribute getStdAltAsPublishedType_ApprovedMonth();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdAltAsPublishedType#getApprovedYear <em>Approved Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approved Year</em>'.
	 * @see org.crossref.schema._4._4.StdAltAsPublishedType#getApprovedYear()
	 * @see #getStdAltAsPublishedType()
	 * @generated
	 */
	EAttribute getStdAltAsPublishedType_ApprovedYear();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdAltAsPublishedType#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.crossref.schema._4._4.StdAltAsPublishedType#getReason()
	 * @see #getStdAltAsPublishedType()
	 * @generated
	 */
	EAttribute getStdAltAsPublishedType_Reason();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.StdAsPublishedType <em>Std As Published Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std As Published Type</em>'.
	 * @see org.crossref.schema._4._4.StdAsPublishedType
	 * @generated
	 */
	EClass getStdAsPublishedType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdAsPublishedType#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.crossref.schema._4._4.StdAsPublishedType#getFamily()
	 * @see #getStdAsPublishedType()
	 * @generated
	 */
	EAttribute getStdAsPublishedType_Family();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdAsPublishedType#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see org.crossref.schema._4._4.StdAsPublishedType#getSet()
	 * @see #getStdAsPublishedType()
	 * @generated
	 */
	EAttribute getStdAsPublishedType_Set();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdAsPublishedType#getUndated <em>Undated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undated</em>'.
	 * @see org.crossref.schema._4._4.StdAsPublishedType#getUndated()
	 * @see #getStdAsPublishedType()
	 * @generated
	 */
	EAttribute getStdAsPublishedType_Undated();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.StdDesignatorT <em>Std Designator T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Designator T</em>'.
	 * @see org.crossref.schema._4._4.StdDesignatorT
	 * @generated
	 */
	EClass getStdDesignatorT();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdDesignatorT#getStdDesignator <em>Std Designator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Designator</em>'.
	 * @see org.crossref.schema._4._4.StdDesignatorT#getStdDesignator()
	 * @see #getStdDesignatorT()
	 * @generated
	 */
	EAttribute getStdDesignatorT_StdDesignator();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.StdDesignatorT#getStdAltScript <em>Std Alt Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Std Alt Script</em>'.
	 * @see org.crossref.schema._4._4.StdDesignatorT#getStdAltScript()
	 * @see #getStdDesignatorT()
	 * @generated
	 */
	EAttribute getStdDesignatorT_StdAltScript();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.StdDesignatorT#getStdVariantForm <em>Std Variant Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Std Variant Form</em>'.
	 * @see org.crossref.schema._4._4.StdDesignatorT#getStdVariantForm()
	 * @see #getStdDesignatorT()
	 * @generated
	 */
	EAttribute getStdDesignatorT_StdVariantForm();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.StdSetDesignatorType <em>Std Set Designator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Set Designator Type</em>'.
	 * @see org.crossref.schema._4._4.StdSetDesignatorType
	 * @generated
	 */
	EClass getStdSetDesignatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdSetDesignatorType#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.crossref.schema._4._4.StdSetDesignatorType#getFamily()
	 * @see #getStdSetDesignatorType()
	 * @generated
	 */
	EAttribute getStdSetDesignatorType_Family();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.StdUndatedDesignatorType <em>Std Undated Designator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Undated Designator Type</em>'.
	 * @see org.crossref.schema._4._4.StdUndatedDesignatorType
	 * @generated
	 */
	EClass getStdUndatedDesignatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdUndatedDesignatorType#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.crossref.schema._4._4.StdUndatedDesignatorType#getFamily()
	 * @see #getStdUndatedDesignatorType()
	 * @generated
	 */
	EAttribute getStdUndatedDesignatorType_Family();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StdUndatedDesignatorType#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see org.crossref.schema._4._4.StdUndatedDesignatorType#getSet()
	 * @see #getStdUndatedDesignatorType()
	 * @generated
	 */
	EAttribute getStdUndatedDesignatorType_Set();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.StringNameType <em>String Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Name Type</em>'.
	 * @see org.crossref.schema._4._4.StringNameType
	 * @generated
	 */
	EClass getStringNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.StringNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getMixed()
	 * @see #getStringNameType()
	 * @generated
	 */
	EAttribute getStringNameType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.StringNameType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getGroup()
	 * @see #getStringNameType()
	 * @generated
	 */
	EAttribute getStringNameType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.StringNameType#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Degrees</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getDegrees()
	 * @see #getStringNameType()
	 * @generated
	 */
	EReference getStringNameType_Degrees();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.StringNameType#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Given Name</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getGivenName()
	 * @see #getStringNameType()
	 * @generated
	 */
	EAttribute getStringNameType_GivenName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.StringNameType#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prefix</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getPrefix()
	 * @see #getStringNameType()
	 * @generated
	 */
	EReference getStringNameType_Prefix();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.StringNameType#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Surname</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getSurname()
	 * @see #getStringNameType()
	 * @generated
	 */
	EAttribute getStringNameType_Surname();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.StringNameType#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Suffix</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getSuffix()
	 * @see #getStringNameType()
	 * @generated
	 */
	EAttribute getStringNameType_Suffix();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StringNameType#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getContentType()
	 * @see #getStringNameType()
	 * @generated
	 */
	EAttribute getStringNameType_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StringNameType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getLanguage()
	 * @see #getStringNameType()
	 * @generated
	 */
	EAttribute getStringNameType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StringNameType#getNameStyle <em>Name Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Style</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getNameStyle()
	 * @see #getStringNameType()
	 * @generated
	 */
	EAttribute getStringNameType_NameStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.StringNameType#getSpecificUse <em>Specific Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Use</em>'.
	 * @see org.crossref.schema._4._4.StringNameType#getSpecificUse()
	 * @see #getStringNameType()
	 * @generated
	 */
	EAttribute getStringNameType_SpecificUse();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.SubtitleType <em>Subtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtitle Type</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType
	 * @generated
	 */
	EClass getSubtitleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.SubtitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getMixed()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EAttribute getSubtitleType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.SubtitleType#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getFaceMarkup()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EAttribute getSubtitleType_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getB()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getI()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getEm()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getStrong()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getU()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getOvl()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getSup()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getSub()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getScp()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getTt()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getFont()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.SubtitleType#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Math</em>'.
	 * @see org.crossref.schema._4._4.SubtitleType#getMath()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Math();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.TitlesType <em>Titles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titles Type</em>'.
	 * @see org.crossref.schema._4._4.TitlesType
	 * @generated
	 */
	EClass getTitlesType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.TitlesType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.crossref.schema._4._4.TitlesType#getTitle()
	 * @see #getTitlesType()
	 * @generated
	 */
	EReference getTitlesType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.TitlesType#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtitle</em>'.
	 * @see org.crossref.schema._4._4.TitlesType#getSubtitle()
	 * @see #getTitlesType()
	 * @generated
	 */
	EReference getTitlesType_Subtitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.TitlesType#getOriginalLanguageTitle <em>Original Language Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Language Title</em>'.
	 * @see org.crossref.schema._4._4.TitlesType#getOriginalLanguageTitle()
	 * @see #getTitlesType()
	 * @generated
	 */
	EReference getTitlesType_OriginalLanguageTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.schema._4._4.TitlesType#getSubtitle1 <em>Subtitle1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtitle1</em>'.
	 * @see org.crossref.schema._4._4.TitlesType#getSubtitle1()
	 * @see #getTitlesType()
	 * @generated
	 */
	EReference getTitlesType_Subtitle1();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Type</em>'.
	 * @see org.crossref.schema._4._4.TitleType
	 * @generated
	 */
	EClass getTitleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.TitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getMixed()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.TitleType#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getFaceMarkup()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getB()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getI()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getEm()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getStrong()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getU()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getOvl()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getSup()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getSub()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getScp()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getTt()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getFont()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.TitleType#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Math</em>'.
	 * @see org.crossref.schema._4._4.TitleType#getMath()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Math();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.UnassignedContentType <em>Unassigned Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unassigned Content Type</em>'.
	 * @see org.crossref.schema._4._4.UnassignedContentType
	 * @generated
	 */
	EClass getUnassignedContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.UnassignedContentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.crossref.schema._4._4.UnassignedContentType#getType()
	 * @see #getUnassignedContentType()
	 * @generated
	 */
	EAttribute getUnassignedContentType_Type();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.UnstructuredCitationType <em>Unstructured Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Citation Type</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType
	 * @generated
	 */
	EClass getUnstructuredCitationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getMixed()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EAttribute getUnstructuredCitationType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getFaceMarkup()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EAttribute getUnstructuredCitationType_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getB()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getI()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getEm()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getStrong()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getU()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getOvl()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getSup()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getSub()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getScp()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getTt()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getFont()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UnstructuredCitationType#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Math</em>'.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType#getMath()
	 * @see #getUnstructuredCitationType()
	 * @generated
	 */
	EReference getUnstructuredCitationType_Math();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.UpdateDateType <em>Update Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Date Type</em>'.
	 * @see org.crossref.schema._4._4.UpdateDateType
	 * @generated
	 */
	EClass getUpdateDateType();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.UpdatesType <em>Updates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Updates Type</em>'.
	 * @see org.crossref.schema._4._4.UpdatesType
	 * @generated
	 */
	EClass getUpdatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.UpdatesType#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update</em>'.
	 * @see org.crossref.schema._4._4.UpdatesType#getUpdate()
	 * @see #getUpdatesType()
	 * @generated
	 */
	EReference getUpdatesType_Update();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Type</em>'.
	 * @see org.crossref.schema._4._4.UpdateType
	 * @generated
	 */
	EClass getUpdateType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.UpdateType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.schema._4._4.UpdateType#getValue()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.UpdateType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.crossref.schema._4._4.UpdateType#getDate()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.schema._4._4.UpdateType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.crossref.schema._4._4.UpdateType#getType()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_Type();

	/**
	 * Returns the meta object for class '{@link org.crossref.schema._4._4.XrefFaces <em>Xref Faces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xref Faces</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces
	 * @generated
	 */
	EClass getXrefFaces();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.XrefFaces#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getMixed()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EAttribute getXrefFaces_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.schema._4._4.XrefFaces#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getFaceMarkup()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EAttribute getXrefFaces_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getB()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getI()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getEm()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getStrong()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getU()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getOvl()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getSup()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getSub()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getScp()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getTt()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getFont()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.schema._4._4.XrefFaces#getMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Math</em>'.
	 * @see org.crossref.schema._4._4.XrefFaces#getMath()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Math();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.BookTypeType <em>Book Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Book Type Type</em>'.
	 * @see org.crossref.schema._4._4.BookTypeType
	 * @generated
	 */
	EEnum getBookTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.CmUpdateType <em>Cm Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cm Update Type</em>'.
	 * @see org.crossref.schema._4._4.CmUpdateType
	 * @generated
	 */
	EEnum getCmUpdateType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.ComponentTypeType <em>Component Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type Type</em>'.
	 * @see org.crossref.schema._4._4.ComponentTypeType
	 * @generated
	 */
	EEnum getComponentTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.ContentVersionType <em>Content Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Version Type</em>'.
	 * @see org.crossref.schema._4._4.ContentVersionType
	 * @generated
	 */
	EEnum getContentVersionType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.ContributorRoleType <em>Contributor Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contributor Role Type</em>'.
	 * @see org.crossref.schema._4._4.ContributorRoleType
	 * @generated
	 */
	EEnum getContributorRoleType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Country Type</em>'.
	 * @see org.crossref.schema._4._4.CountryType
	 * @generated
	 */
	EEnum getCountryType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.CrawlerType <em>Crawler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Crawler Type</em>'.
	 * @see org.crossref.schema._4._4.CrawlerType
	 * @generated
	 */
	EEnum getCrawlerType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.DatasetTypeType <em>Dataset Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dataset Type Type</em>'.
	 * @see org.crossref.schema._4._4.DatasetTypeType
	 * @generated
	 */
	EEnum getDatasetTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.IdTypeType <em>Id Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Id Type Type</em>'.
	 * @see org.crossref.schema._4._4.IdTypeType
	 * @generated
	 */
	EEnum getIdTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Type</em>'.
	 * @see org.crossref.schema._4._4.LanguageType
	 * @generated
	 */
	EEnum getLanguageType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.LinkHeaderRelationshipType <em>Link Header Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Header Relationship Type</em>'.
	 * @see org.crossref.schema._4._4.LinkHeaderRelationshipType
	 * @generated
	 */
	EEnum getLinkHeaderRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.MediaTypeType <em>Media Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type Type</em>'.
	 * @see org.crossref.schema._4._4.MediaTypeType
	 * @generated
	 */
	EEnum getMediaTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.MediaTypeType1 <em>Media Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type Type1</em>'.
	 * @see org.crossref.schema._4._4.MediaTypeType1
	 * @generated
	 */
	EEnum getMediaTypeType1();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.MimeTypeType <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mime Type Type</em>'.
	 * @see org.crossref.schema._4._4.MimeTypeType
	 * @generated
	 */
	EEnum getMimeTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.MultiResolutionType <em>Multi Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multi Resolution Type</em>'.
	 * @see org.crossref.schema._4._4.MultiResolutionType
	 * @generated
	 */
	EEnum getMultiResolutionType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.NameStyleType <em>Name Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Style Type</em>'.
	 * @see org.crossref.schema._4._4.NameStyleType
	 * @generated
	 */
	EEnum getNameStyleType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.NameStyleType1 <em>Name Style Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Style Type1</em>'.
	 * @see org.crossref.schema._4._4.NameStyleType1
	 * @generated
	 */
	EEnum getNameStyleType1();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.NameStyleType2 <em>Name Style Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Style Type2</em>'.
	 * @see org.crossref.schema._4._4.NameStyleType2
	 * @generated
	 */
	EEnum getNameStyleType2();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Type</em>'.
	 * @see org.crossref.schema._4._4.NameType
	 * @generated
	 */
	EEnum getNameType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.ParentRelationType <em>Parent Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parent Relation Type</em>'.
	 * @see org.crossref.schema._4._4.ParentRelationType
	 * @generated
	 */
	EEnum getParentRelationType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.PropertyType1 <em>Property Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type1</em>'.
	 * @see org.crossref.schema._4._4.PropertyType1
	 * @generated
	 */
	EEnum getPropertyType1();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.PublicationStatusType <em>Publication Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Publication Status Type</em>'.
	 * @see org.crossref.schema._4._4.PublicationStatusType
	 * @generated
	 */
	EEnum getPublicationStatusType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.PublicationTypeType <em>Publication Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Publication Type Type</em>'.
	 * @see org.crossref.schema._4._4.PublicationTypeType
	 * @generated
	 */
	EEnum getPublicationTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.ReasonType1 <em>Reason Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reason Type1</em>'.
	 * @see org.crossref.schema._4._4.ReasonType1
	 * @generated
	 */
	EEnum getReasonType1();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.ReasonTypeItem <em>Reason Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reason Type Item</em>'.
	 * @see org.crossref.schema._4._4.ReasonTypeItem
	 * @generated
	 */
	EEnum getReasonTypeItem();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.RecommendationType <em>Recommendation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recommendation Type</em>'.
	 * @see org.crossref.schema._4._4.RecommendationType
	 * @generated
	 */
	EEnum getRecommendationType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.ReferenceDistributionOptsType <em>Reference Distribution Opts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Distribution Opts Type</em>'.
	 * @see org.crossref.schema._4._4.ReferenceDistributionOptsType
	 * @generated
	 */
	EEnum getReferenceDistributionOptsType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sequence Type</em>'.
	 * @see org.crossref.schema._4._4.SequenceType
	 * @generated
	 */
	EEnum getSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.StageType <em>Stage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stage Type</em>'.
	 * @see org.crossref.schema._4._4.StageType
	 * @generated
	 */
	EEnum getStageType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.crossref.schema._4._4.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.TypeType1 <em>Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type1</em>'.
	 * @see org.crossref.schema._4._4.TypeType1
	 * @generated
	 */
	EEnum getTypeType1();

	/**
	 * Returns the meta object for enum '{@link org.crossref.schema._4._4.TypeType2 <em>Type Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type2</em>'.
	 * @see org.crossref.schema._4._4.TypeType2
	 * @generated
	 */
	EEnum getTypeType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Abbrev Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abbrev Title Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='abbrev_title_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150' minLength='1'"
	 * @generated
	 */
	EDataType getAbbrevTitleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Affiliation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Affiliation Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='affiliation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512' minLength='1'"
	 * @generated
	 */
	EDataType getAffiliationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Approved Month Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Approved Month Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='approvedMonth_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' maxInclusive='12' minInclusive='01' totalDigits='2'"
	 * @generated
	 */
	EDataType getApprovedMonthType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Approved Year Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Approved Year Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='approvedYear_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#gYear'"
	 * @generated
	 */
	EDataType getApprovedYearType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.BookTypeType <em>Book Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Book Type Type Object</em>'.
	 * @see org.crossref.schema._4._4.BookTypeType
	 * @model instanceClass="org.crossref.schema._4._4.BookTypeType"
	 *        extendedMetaData="name='book_type_._type:Object' baseType='book_type_._type'"
	 * @generated
	 */
	EDataType getBookTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cm Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cm Assertion</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cm_assertion' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='1024' minLength='2'"
	 * @generated
	 */
	EDataType getCmAssertion();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cm Assertion Group Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cm Assertion Group Label</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cm_assertion_group_label' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150' minLength='2'"
	 * @generated
	 */
	EDataType getCmAssertionGroupLabel();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cm Assertion Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cm Assertion Group Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cm_assertion_group_name' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' maxLength='150' minLength='2'"
	 * @generated
	 */
	EDataType getCmAssertionGroupName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cm Assertion Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cm Assertion Label</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cm_assertion_label' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150' minLength='2'"
	 * @generated
	 */
	EDataType getCmAssertionLabel();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cm Assertion Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cm Assertion Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cm_assertion_name' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' maxLength='150' minLength='2'"
	 * @generated
	 */
	EDataType getCmAssertionName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cm Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cm Domain</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cm_domain' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='1024' minLength='4' pattern='[A-Za-z0-9_]+([-.][A-Za-z0-9_]+)*\\.[A-Za-z0-9_]+([-.][A-Za-z0-9_]+)*'"
	 * @generated
	 */
	EDataType getCmDomain();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.CmUpdateType <em>Cm Update Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cm Update Type Object</em>'.
	 * @see org.crossref.schema._4._4.CmUpdateType
	 * @model instanceClass="org.crossref.schema._4._4.CmUpdateType"
	 *        extendedMetaData="name='cm_update_type:Object' baseType='cm_update_type'"
	 * @generated
	 */
	EDataType getCmUpdateTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Coden Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coden Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='coden_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='6' minLength='1'"
	 * @generated
	 */
	EDataType getCodenType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Component Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='component_number_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50' minLength='1'"
	 * @generated
	 */
	EDataType getComponentNumberType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Component Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component Size Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='component_size_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getComponentSizeType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.ComponentTypeType <em>Component Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component Type Type Object</em>'.
	 * @see org.crossref.schema._4._4.ComponentTypeType
	 * @model instanceClass="org.crossref.schema._4._4.ComponentTypeType"
	 *        extendedMetaData="name='component_type_._type:Object' baseType='component_type_._type'"
	 * @generated
	 */
	EDataType getComponentTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Conference Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conference Acronym Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='conference_acronym_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='127' minLength='1'"
	 * @generated
	 */
	EDataType getConferenceAcronymType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Conference Date T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conference Date T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='conference_date_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100' minLength='0'"
	 * @generated
	 */
	EDataType getConferenceDateT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Conference Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conference Location Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='conference_location_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='2'"
	 * @generated
	 */
	EDataType getConferenceLocationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Conference Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conference Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='conference_name_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512' minLength='3'"
	 * @generated
	 */
	EDataType getConferenceNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Conference Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conference Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='conference_number_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='15' minLength='1'"
	 * @generated
	 */
	EDataType getConferenceNumberType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Conference Sponsor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conference Sponsor Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='conference_sponsor_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='1'"
	 * @generated
	 */
	EDataType getConferenceSponsorType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Conference Theme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conference Theme Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='conference_theme_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='1'"
	 * @generated
	 */
	EDataType getConferenceThemeType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.ContentVersionType <em>Content Version Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Content Version Type Object</em>'.
	 * @see org.crossref.schema._4._4.ContentVersionType
	 * @model instanceClass="org.crossref.schema._4._4.ContentVersionType"
	 *        extendedMetaData="name='content_version_._type:Object' baseType='content_version_._type'"
	 * @generated
	 */
	EDataType getContentVersionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Contract Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contract Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='contract_number_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='2'"
	 * @generated
	 */
	EDataType getContractNumberType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.ContributorRoleType <em>Contributor Role Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contributor Role Type Object</em>'.
	 * @see org.crossref.schema._4._4.ContributorRoleType
	 * @model instanceClass="org.crossref.schema._4._4.ContributorRoleType"
	 *        extendedMetaData="name='contributor_role_._type:Object' baseType='contributor_role_._type'"
	 * @generated
	 */
	EDataType getContributorRoleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.CountryType <em>Country Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Country Type Object</em>'.
	 * @see org.crossref.schema._4._4.CountryType
	 * @model instanceClass="org.crossref.schema._4._4.CountryType"
	 *        extendedMetaData="name='country_._type:Object' baseType='country_._type'"
	 * @generated
	 */
	EDataType getCountryTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.CrawlerType <em>Crawler Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Crawler Type Object</em>'.
	 * @see org.crossref.schema._4._4.CrawlerType
	 * @model instanceClass="org.crossref.schema._4._4.CrawlerType"
	 *        extendedMetaData="name='crawler_._type:Object' baseType='crawler_._type'"
	 * @generated
	 */
	EDataType getCrawlerTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.DatasetTypeType <em>Dataset Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dataset Type Type Object</em>'.
	 * @see org.crossref.schema._4._4.DatasetTypeType
	 * @model instanceClass="org.crossref.schema._4._4.DatasetTypeType"
	 *        extendedMetaData="name='dataset_type_._type:Object' baseType='dataset_type_._type'"
	 * @generated
	 */
	EDataType getDatasetTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Degree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Degree Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='degree_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='2'"
	 * @generated
	 */
	EDataType getDegreeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Depositor Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Depositor Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='depositor_name_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='130' minLength='1'"
	 * @generated
	 */
	EDataType getDepositorNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Doi Batch Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Doi Batch Id Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='doi_batch_id_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100' minLength='4'"
	 * @generated
	 */
	EDataType getDoiBatchIdType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Doi T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Doi T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='doi_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='2048' minLength='6' pattern='10\\.[0-9]{4,9}/.{1,200}'"
	 * @generated
	 */
	EDataType getDoiT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Doi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Doi Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='doi_._type' baseType='doi_t'"
	 * @generated
	 */
	EDataType getDoiType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Edition Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Edition Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='edition_number_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='15' minLength='1'"
	 * @generated
	 */
	EDataType getEditionNumberType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Email Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Email Address Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='email_address_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='200' minLength='6' pattern='[\\p{L}\\p{N}!/+\\-_]+(\\.[\\p{L}\\p{N}!/+\\-_]+)*@[\\p{L}\\p{N}!/+\\-_]+(\\.[\\p{L}_-]+)+'"
	 * @generated
	 */
	EDataType getEmailAddressType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>First Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>First Page Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='first_page_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='32' minLength='1'"
	 * @generated
	 */
	EDataType getFirstPageType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Format T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Format T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='format_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='130' minLength='0'"
	 * @generated
	 */
	EDataType getFormatT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Full Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Full Title Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='full_title_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='1'"
	 * @generated
	 */
	EDataType getFullTitleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Given Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Given Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='given_name_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='60' minLength='1' whiteSpace='collapse' pattern='[^\\d\\?]*'"
	 * @generated
	 */
	EDataType getGivenNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Group Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Group Title Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='group_title_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='1024' minLength='1'"
	 * @generated
	 */
	EDataType getGroupTitleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='identifier_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='1'"
	 * @generated
	 */
	EDataType getIdentifierT();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.IdTypeType <em>Id Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id Type Type Object</em>'.
	 * @see org.crossref.schema._4._4.IdTypeType
	 * @model instanceClass="org.crossref.schema._4._4.IdTypeType"
	 *        extendedMetaData="name='id_type_._type:Object' baseType='id_type_._type'"
	 * @generated
	 */
	EDataType getIdTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Institution Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Institution Acronym Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='institution_acronym_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='1'"
	 * @generated
	 */
	EDataType getInstitutionAcronymType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Institution Department Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Institution Department Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='institution_department_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='2'"
	 * @generated
	 */
	EDataType getInstitutionDepartmentType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Institution Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Institution Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='institution_name_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='1024' minLength='1'"
	 * @generated
	 */
	EDataType getInstitutionNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Institution Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Institution Place Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='institution_place_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='2'"
	 * @generated
	 */
	EDataType getInstitutionPlaceType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Isbn T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Isbn T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='isbn_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='17' minLength='10' pattern='(978-)?\\d[\\d%20\\-]+[\\dX]'"
	 * @generated
	 */
	EDataType getIsbnT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Issn T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Issn T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='issn_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='9' minLength='8' pattern='\\d{4}-?\\d{3}[\\dX]'"
	 * @generated
	 */
	EDataType getIssnT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Issue Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='issue_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='32' minLength='1'"
	 * @generated
	 */
	EDataType getIssueType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Item Number T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Item Number T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='item_number_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='32' minLength='1'"
	 * @generated
	 */
	EDataType getItemNumberT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Key Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='key_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='128' whiteSpace='collapse'"
	 * @generated
	 */
	EDataType getKeyType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Label Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='label_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128' minLength='3'"
	 * @generated
	 */
	EDataType getLabelType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.LanguageType <em>Language Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Language Type Object</em>'.
	 * @see org.crossref.schema._4._4.LanguageType
	 * @model instanceClass="org.crossref.schema._4._4.LanguageType"
	 *        extendedMetaData="name='language_._type:Object' baseType='language_._type'"
	 * @generated
	 */
	EDataType getLanguageTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Last Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Last Page Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='last_page_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='32' minLength='1'"
	 * @generated
	 */
	EDataType getLastPageType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Level Sequence Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Level Sequence Number Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='level_sequence_number_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' maxInclusive='9' minInclusive='1' totalDigits='1'"
	 * @generated
	 */
	EDataType getLevelSequenceNumberType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.LinkHeaderRelationshipType <em>Link Header Relationship Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Link Header Relationship Type Object</em>'.
	 * @see org.crossref.schema._4._4.LinkHeaderRelationshipType
	 * @model instanceClass="org.crossref.schema._4._4.LinkHeaderRelationshipType"
	 *        extendedMetaData="name='link_header_relationship_._type:Object' baseType='link_header_relationship_._type'"
	 * @generated
	 */
	EDataType getLinkHeaderRelationshipTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.MediaTypeType <em>Media Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Media Type Type Object</em>'.
	 * @see org.crossref.schema._4._4.MediaTypeType
	 * @model instanceClass="org.crossref.schema._4._4.MediaTypeType"
	 *        extendedMetaData="name='media_type_._type:Object' baseType='media_type_._type'"
	 * @generated
	 */
	EDataType getMediaTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.MediaTypeType1 <em>Media Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Media Type Type Object1</em>'.
	 * @see org.crossref.schema._4._4.MediaTypeType1
	 * @model instanceClass="org.crossref.schema._4._4.MediaTypeType1"
	 *        extendedMetaData="name='media_type_._1_._type:Object' baseType='media_type_._1_._type'"
	 * @generated
	 */
	EDataType getMediaTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.MimeTypeType <em>Mime Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mime Type Type Object</em>'.
	 * @see org.crossref.schema._4._4.MimeTypeType
	 * @model instanceClass="org.crossref.schema._4._4.MimeTypeType"
	 *        extendedMetaData="name='mime_type_._type:Object' baseType='mime_type_._type'"
	 * @generated
	 */
	EDataType getMimeTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.MultiResolutionType <em>Multi Resolution Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multi Resolution Type Object</em>'.
	 * @see org.crossref.schema._4._4.MultiResolutionType
	 * @model instanceClass="org.crossref.schema._4._4.MultiResolutionType"
	 *        extendedMetaData="name='multi-resolution_._type:Object' baseType='multi-resolution_._type'"
	 * @generated
	 */
	EDataType getMultiResolutionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.NameStyleType <em>Name Style Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Style Type Object</em>'.
	 * @see org.crossref.schema._4._4.NameStyleType
	 * @model instanceClass="org.crossref.schema._4._4.NameStyleType"
	 *        extendedMetaData="name='name-style_._type:Object' baseType='name-style_._type'"
	 * @generated
	 */
	EDataType getNameStyleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.NameStyleType1 <em>Name Style Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Style Type Object1</em>'.
	 * @see org.crossref.schema._4._4.NameStyleType1
	 * @model instanceClass="org.crossref.schema._4._4.NameStyleType1"
	 *        extendedMetaData="name='name-style_._1_._type:Object' baseType='name-style_._1_._type'"
	 * @generated
	 */
	EDataType getNameStyleTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.NameStyleType2 <em>Name Style Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Style Type Object2</em>'.
	 * @see org.crossref.schema._4._4.NameStyleType2
	 * @model instanceClass="org.crossref.schema._4._4.NameStyleType2"
	 *        extendedMetaData="name='name-style_._2_._type:Object' baseType='name-style_._2_._type'"
	 * @generated
	 */
	EDataType getNameStyleTypeObject2();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.NameType <em>Name Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type Object</em>'.
	 * @see org.crossref.schema._4._4.NameType
	 * @model instanceClass="org.crossref.schema._4._4.NameType"
	 *        extendedMetaData="name='name_._type:Object' baseType='name_._type'"
	 * @generated
	 */
	EDataType getNameTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Orcid T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orcid T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='orcid_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='https?://orcid.org/[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{3}[X0-9]{1}'"
	 * @generated
	 */
	EDataType getOrcidT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Organization T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Organization T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='organization_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='511' minLength='1' whiteSpace='collapse'"
	 * @generated
	 */
	EDataType getOrganizationT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Other Pages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Other Pages Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='other_pages_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100' minLength='1'"
	 * @generated
	 */
	EDataType getOtherPagesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Parent Doi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parent Doi Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='parent_doi_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='2048' minLength='6'"
	 * @generated
	 */
	EDataType getParentDoiType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.ParentRelationType <em>Parent Relation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parent Relation Type Object</em>'.
	 * @see org.crossref.schema._4._4.ParentRelationType
	 * @model instanceClass="org.crossref.schema._4._4.ParentRelationType"
	 *        extendedMetaData="name='parent_relation_._type:Object' baseType='parent_relation_._type'"
	 * @generated
	 */
	EDataType getParentRelationTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Part Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Part Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='part_number_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='15' minLength='1'"
	 * @generated
	 */
	EDataType getPartNumberType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Proceedings Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Proceedings Subject Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='proceedings_subject_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='1'"
	 * @generated
	 */
	EDataType getProceedingsSubjectType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Proceedings Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Proceedings Title Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='proceedings_title_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='511' minLength='1'"
	 * @generated
	 */
	EDataType getProceedingsTitleType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Property T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='property_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='2048' minLength='0'"
	 * @generated
	 */
	EDataType getPropertyT();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.PropertyType1 <em>Property Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Type Object</em>'.
	 * @see org.crossref.schema._4._4.PropertyType1
	 * @model instanceClass="org.crossref.schema._4._4.PropertyType1"
	 *        extendedMetaData="name='property_._1_._type:Object' baseType='property_._1_._type'"
	 * @generated
	 */
	EDataType getPropertyTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.PublicationStatusType <em>Publication Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Publication Status Type Object</em>'.
	 * @see org.crossref.schema._4._4.PublicationStatusType
	 * @model instanceClass="org.crossref.schema._4._4.PublicationStatusType"
	 *        extendedMetaData="name='publication_status_._type:Object' baseType='publication_status_._type'"
	 * @generated
	 */
	EDataType getPublicationStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.PublicationTypeType <em>Publication Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Publication Type Type Object</em>'.
	 * @see org.crossref.schema._4._4.PublicationTypeType
	 * @model instanceClass="org.crossref.schema._4._4.PublicationTypeType"
	 *        extendedMetaData="name='publication_type_._type:Object' baseType='publication_type_._type'"
	 * @generated
	 */
	EDataType getPublicationTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Publisher Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Publisher Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='publisher_name_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='1'"
	 * @generated
	 */
	EDataType getPublisherNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Publisher Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Publisher Place Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='publisher_place_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='2'"
	 * @generated
	 */
	EDataType getPublisherPlaceType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Reason Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reason Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='reason_._type' itemType='reason_._type_._item'"
	 * @generated
	 */
	EDataType getReasonType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.ReasonTypeItem <em>Reason Type Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reason Type Item Object</em>'.
	 * @see org.crossref.schema._4._4.ReasonTypeItem
	 * @model instanceClass="org.crossref.schema._4._4.ReasonTypeItem"
	 *        extendedMetaData="name='reason_._type_._item:Object' baseType='reason_._type_._item'"
	 * @generated
	 */
	EDataType getReasonTypeItemObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.ReasonType1 <em>Reason Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reason Type Object</em>'.
	 * @see org.crossref.schema._4._4.ReasonType1
	 * @model instanceClass="org.crossref.schema._4._4.ReasonType1"
	 *        extendedMetaData="name='reason_._1_._type:Object' baseType='reason_._1_._type'"
	 * @generated
	 */
	EDataType getReasonTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.RecommendationType <em>Recommendation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Recommendation Type Object</em>'.
	 * @see org.crossref.schema._4._4.RecommendationType
	 * @model instanceClass="org.crossref.schema._4._4.RecommendationType"
	 *        extendedMetaData="name='recommendation_._type:Object' baseType='recommendation_._type'"
	 * @generated
	 */
	EDataType getRecommendationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.ReferenceDistributionOptsType <em>Reference Distribution Opts Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reference Distribution Opts Type Object</em>'.
	 * @see org.crossref.schema._4._4.ReferenceDistributionOptsType
	 * @model instanceClass="org.crossref.schema._4._4.ReferenceDistributionOptsType"
	 *        extendedMetaData="name='reference_distribution_opts_._type:Object' baseType='reference_distribution_opts_._type'"
	 * @generated
	 */
	EDataType getReferenceDistributionOptsTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Reg Agency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reg Agency Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='reg-agency_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRegAgencyType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Registrant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Registrant Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='registrant_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255' minLength='1'"
	 * @generated
	 */
	EDataType getRegistrantType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Resource T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='resource_t' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' maxLength='2048' minLength='1' pattern='([hH][tT][tT][pP]|[hH][tT][tT][pP][sS]|[fF][tT][pP])://.*'"
	 * @generated
	 */
	EDataType getResourceT();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.SequenceType <em>Sequence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sequence Type Object</em>'.
	 * @see org.crossref.schema._4._4.SequenceType
	 * @model instanceClass="org.crossref.schema._4._4.SequenceType"
	 *        extendedMetaData="name='sequence_._type:Object' baseType='sequence_._type'"
	 * @generated
	 */
	EDataType getSequenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Series Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Series Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='series_number_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='15' minLength='1'"
	 * @generated
	 */
	EDataType getSeriesNumberType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Special Numbering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Special Numbering Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='special_numbering_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='15' minLength='1'"
	 * @generated
	 */
	EDataType getSpecialNumberingType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.StageType <em>Stage Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stage Type Object</em>'.
	 * @see org.crossref.schema._4._4.StageType
	 * @model instanceClass="org.crossref.schema._4._4.StageType"
	 *        extendedMetaData="name='stage_._type:Object' baseType='stage_._type'"
	 * @generated
	 */
	EDataType getStageTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Std Designatorvalue T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Std Designatorvalue T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='std_designatorvalue_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150' minLength='2'"
	 * @generated
	 */
	EDataType getStdDesignatorvalueT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Suffix Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='suffix_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='10' minLength='1'"
	 * @generated
	 */
	EDataType getSuffixType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Surname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Surname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='surname_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='60' minLength='1' whiteSpace='collapse' pattern='[^\\d\\?]*[^\\?\\s]+[^\\d]*'"
	 * @generated
	 */
	EDataType getSurnameType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.crossref.schema._4._4.TypeType
	 * @model instanceClass="org.crossref.schema._4._4.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.TypeType1 <em>Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object1</em>'.
	 * @see org.crossref.schema._4._4.TypeType1
	 * @model instanceClass="org.crossref.schema._4._4.TypeType1"
	 *        extendedMetaData="name='type_._1_._type:Object' baseType='type_._1_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.crossref.schema._4._4.TypeType2 <em>Type Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object2</em>'.
	 * @see org.crossref.schema._4._4.TypeType2
	 * @model instanceClass="org.crossref.schema._4._4.TypeType2"
	 *        extendedMetaData="name='type_._2_._type:Object' baseType='type_._2_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Volume Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='volume_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='32' minLength='1'"
	 * @generated
	 */
	EDataType getVolumeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Xref Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Xref Day</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='xrefDay' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' maxInclusive='31' minInclusive='01' totalDigits='2'"
	 * @generated
	 */
	EDataType getXrefDay();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Xref Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Xref Month</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='xrefMonth' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' maxInclusive='34' minInclusive='01' totalDigits='2'"
	 * @generated
	 */
	EDataType getXrefMonth();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Xref Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The following are basic data types for date
     * 				parts.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Xref Year</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='xrefYear' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' maxInclusive='2200' minInclusive='1400' totalDigits='4'"
	 * @generated
	 */
	EDataType getXrefYear();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_4Factory get_4Factory();

} //_4Package
