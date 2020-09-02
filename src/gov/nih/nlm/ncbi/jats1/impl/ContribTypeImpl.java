/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AffAlternativesType;
import gov.nih.nlm.ncbi.jats1.AffType;
import gov.nih.nlm.ncbi.jats1.AnonymousType;
import gov.nih.nlm.ncbi.jats1.AuthorCommentType;
import gov.nih.nlm.ncbi.jats1.BioType;
import gov.nih.nlm.ncbi.jats1.CollabAlternativesType;
import gov.nih.nlm.ncbi.jats1.CollabType;
import gov.nih.nlm.ncbi.jats1.ContribIdType;
import gov.nih.nlm.ncbi.jats1.ContribType;
import gov.nih.nlm.ncbi.jats1.CorrespType1;
import gov.nih.nlm.ncbi.jats1.DeceasedType;
import gov.nih.nlm.ncbi.jats1.DegreesType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.EqualContribType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.NameAlternativesType;
import gov.nih.nlm.ncbi.jats1.NameType;
import gov.nih.nlm.ncbi.jats1.OnBehalfOfType;
import gov.nih.nlm.ncbi.jats1.RoleType;
import gov.nih.nlm.ncbi.jats1.StringNameType;
import gov.nih.nlm.ncbi.jats1.UriType;
import gov.nih.nlm.ncbi.jats1.XrefType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrib Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getContribIdClass <em>Contrib Id Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getContribId <em>Contrib Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getNameClass <em>Name Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getCollab <em>Collab</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getCollabAlternatives <em>Collab Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getNameAlternatives <em>Name Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getStringName <em>String Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getDegreeClass <em>Degree Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getContribInfoClass <em>Contrib Info Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getAff <em>Aff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getAffAlternatives <em>Aff Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getAuthorComment <em>Author Comment</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getBio <em>Bio</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getContribType <em>Contrib Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getCorresp <em>Corresp</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getDeceased <em>Deceased</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getEqualContrib <em>Equal Contrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getRid <em>Rid</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ContribTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContribTypeImpl extends MinimalEObjectImpl.Container implements ContribType {
	/**
	 * The cached value of the '{@link #getContribIdClass() <em>Contrib Id Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribIdClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contribIdClass;

	/**
	 * The cached value of the '{@link #getNameClass() <em>Name Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap nameClass;

	/**
	 * The cached value of the '{@link #getDegreeClass() <em>Degree Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreeClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap degreeClass;

	/**
	 * The cached value of the '{@link #getContribInfoClass() <em>Contrib Info Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribInfoClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contribInfoClass;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

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
	 * The default value of the '{@link #getContribType() <em>Contrib Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContribType() <em>Contrib Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribType()
	 * @generated
	 * @ordered
	 */
	protected String contribType = CONTRIB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorresp() <em>Corresp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorresp()
	 * @generated
	 * @ordered
	 */
	protected static final CorrespType1 CORRESP_EDEFAULT = CorrespType1.NO;

	/**
	 * The cached value of the '{@link #getCorresp() <em>Corresp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorresp()
	 * @generated
	 * @ordered
	 */
	protected CorrespType1 corresp = CORRESP_EDEFAULT;

	/**
	 * This is true if the Corresp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean correspESet;

	/**
	 * The default value of the '{@link #getDeceased() <em>Deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceased()
	 * @generated
	 * @ordered
	 */
	protected static final DeceasedType DECEASED_EDEFAULT = DeceasedType.NO;

	/**
	 * The cached value of the '{@link #getDeceased() <em>Deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceased()
	 * @generated
	 * @ordered
	 */
	protected DeceasedType deceased = DECEASED_EDEFAULT;

	/**
	 * This is true if the Deceased attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deceasedESet;

	/**
	 * The default value of the '{@link #getEqualContrib() <em>Equal Contrib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualContrib()
	 * @generated
	 * @ordered
	 */
	protected static final EqualContribType EQUAL_CONTRIB_EDEFAULT = EqualContribType.NO;

	/**
	 * The cached value of the '{@link #getEqualContrib() <em>Equal Contrib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualContrib()
	 * @generated
	 * @ordered
	 */
	protected EqualContribType equalContrib = EQUAL_CONTRIB_EDEFAULT;

	/**
	 * This is true if the Equal Contrib attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean equalContribESet;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

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
	 * The default value of the '{@link #getRid() <em>Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRid()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> RID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRid() <em>Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRid()
	 * @generated
	 * @ordered
	 */
	protected List<String> rid = RID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected String role1 = ROLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContribTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getContribType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getContribIdClass() {
		if (contribIdClass == null) {
			contribIdClass = new BasicFeatureMap(this, Jats1Package.CONTRIB_TYPE__CONTRIB_ID_CLASS);
		}
		return contribIdClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContribIdType> getContribId() {
		return getContribIdClass().list(Jats1Package.eINSTANCE.getContribType_ContribId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNameClass() {
		if (nameClass == null) {
			nameClass = new BasicFeatureMap(this, Jats1Package.CONTRIB_TYPE__NAME_CLASS);
		}
		return nameClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnonymousType> getAnonymous() {
		return getNameClass().list(Jats1Package.eINSTANCE.getContribType_Anonymous());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabType> getCollab() {
		return getNameClass().list(Jats1Package.eINSTANCE.getContribType_Collab());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollabAlternativesType> getCollabAlternatives() {
		return getNameClass().list(Jats1Package.eINSTANCE.getContribType_CollabAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameType> getName() {
		return getNameClass().list(Jats1Package.eINSTANCE.getContribType_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameAlternativesType> getNameAlternatives() {
		return getNameClass().list(Jats1Package.eINSTANCE.getContribType_NameAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringNameType> getStringName() {
		return getNameClass().list(Jats1Package.eINSTANCE.getContribType_StringName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDegreeClass() {
		if (degreeClass == null) {
			degreeClass = new BasicFeatureMap(this, Jats1Package.CONTRIB_TYPE__DEGREE_CLASS);
		}
		return degreeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreesType> getDegrees() {
		return getDegreeClass().list(Jats1Package.eINSTANCE.getContribType_Degrees());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getContribInfoClass() {
		if (contribInfoClass == null) {
			contribInfoClass = new BasicFeatureMap(this, Jats1Package.CONTRIB_TYPE__CONTRIB_INFO_CLASS);
		}
		return contribInfoClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffType> getAff() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_Aff());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffAlternativesType> getAffAlternatives() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_AffAlternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorCommentType> getAuthorComment() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_AuthorComment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BioType> getBio() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_Bio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnBehalfOfType> getOnBehalfOf() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_OnBehalfOf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleType> getRole() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_Role());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getContribInfoClass().list(Jats1Package.eINSTANCE.getContribType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONTRIB_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActuate() {
		return actuateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContribType() {
		return contribType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContribType(String newContribType) {
		String oldContribType = contribType;
		contribType = newContribType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__CONTRIB_TYPE, oldContribType, contribType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrespType1 getCorresp() {
		return corresp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorresp(CorrespType1 newCorresp) {
		CorrespType1 oldCorresp = corresp;
		corresp = newCorresp == null ? CORRESP_EDEFAULT : newCorresp;
		boolean oldCorrespESet = correspESet;
		correspESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__CORRESP, oldCorresp, corresp, !oldCorrespESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCorresp() {
		CorrespType1 oldCorresp = corresp;
		boolean oldCorrespESet = correspESet;
		corresp = CORRESP_EDEFAULT;
		correspESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONTRIB_TYPE__CORRESP, oldCorresp, CORRESP_EDEFAULT, oldCorrespESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCorresp() {
		return correspESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeceasedType getDeceased() {
		return deceased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeceased(DeceasedType newDeceased) {
		DeceasedType oldDeceased = deceased;
		deceased = newDeceased == null ? DECEASED_EDEFAULT : newDeceased;
		boolean oldDeceasedESet = deceasedESet;
		deceasedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__DECEASED, oldDeceased, deceased, !oldDeceasedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDeceased() {
		DeceasedType oldDeceased = deceased;
		boolean oldDeceasedESet = deceasedESet;
		deceased = DECEASED_EDEFAULT;
		deceasedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONTRIB_TYPE__DECEASED, oldDeceased, DECEASED_EDEFAULT, oldDeceasedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDeceased() {
		return deceasedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualContribType getEqualContrib() {
		return equalContrib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEqualContrib(EqualContribType newEqualContrib) {
		EqualContribType oldEqualContrib = equalContrib;
		equalContrib = newEqualContrib == null ? EQUAL_CONTRIB_EDEFAULT : newEqualContrib;
		boolean oldEqualContribESet = equalContribESet;
		equalContribESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__EQUAL_CONTRIB, oldEqualContrib, equalContrib, !oldEqualContribESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEqualContrib() {
		EqualContribType oldEqualContrib = equalContrib;
		boolean oldEqualContribESet = equalContribESet;
		equalContrib = EQUAL_CONTRIB_EDEFAULT;
		equalContribESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONTRIB_TYPE__EQUAL_CONTRIB, oldEqualContrib, EQUAL_CONTRIB_EDEFAULT, oldEqualContribESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEqualContrib() {
		return equalContribESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getRid() {
		return rid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRid(List<String> newRid) {
		List<String> oldRid = rid;
		rid = newRid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__RID, oldRid, rid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole1() {
		return role1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole1(String newRole1) {
		String oldRole1 = role1;
		role1 = newRole1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__ROLE1, oldRole1, role1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONTRIB_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShow() {
		return showESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CONTRIB_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CONTRIB_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID_CLASS:
				return ((InternalEList<?>)getContribIdClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID:
				return ((InternalEList<?>)getContribId()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__NAME_CLASS:
				return ((InternalEList<?>)getNameClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__ANONYMOUS:
				return ((InternalEList<?>)getAnonymous()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__COLLAB:
				return ((InternalEList<?>)getCollab()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__COLLAB_ALTERNATIVES:
				return ((InternalEList<?>)getCollabAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__NAME_ALTERNATIVES:
				return ((InternalEList<?>)getNameAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__STRING_NAME:
				return ((InternalEList<?>)getStringName()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__DEGREE_CLASS:
				return ((InternalEList<?>)getDegreeClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__DEGREES:
				return ((InternalEList<?>)getDegrees()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__CONTRIB_INFO_CLASS:
				return ((InternalEList<?>)getContribInfoClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__AFF:
				return ((InternalEList<?>)getAff()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__AFF_ALTERNATIVES:
				return ((InternalEList<?>)getAffAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__AUTHOR_COMMENT:
				return ((InternalEList<?>)getAuthorComment()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__BIO:
				return ((InternalEList<?>)getBio()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__ON_BEHALF_OF:
				return ((InternalEList<?>)getOnBehalfOf()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.CONTRIB_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID_CLASS:
				if (coreType) return getContribIdClass();
				return ((FeatureMap.Internal)getContribIdClass()).getWrapper();
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID:
				return getContribId();
			case Jats1Package.CONTRIB_TYPE__NAME_CLASS:
				if (coreType) return getNameClass();
				return ((FeatureMap.Internal)getNameClass()).getWrapper();
			case Jats1Package.CONTRIB_TYPE__ANONYMOUS:
				return getAnonymous();
			case Jats1Package.CONTRIB_TYPE__COLLAB:
				return getCollab();
			case Jats1Package.CONTRIB_TYPE__COLLAB_ALTERNATIVES:
				return getCollabAlternatives();
			case Jats1Package.CONTRIB_TYPE__NAME:
				return getName();
			case Jats1Package.CONTRIB_TYPE__NAME_ALTERNATIVES:
				return getNameAlternatives();
			case Jats1Package.CONTRIB_TYPE__STRING_NAME:
				return getStringName();
			case Jats1Package.CONTRIB_TYPE__DEGREE_CLASS:
				if (coreType) return getDegreeClass();
				return ((FeatureMap.Internal)getDegreeClass()).getWrapper();
			case Jats1Package.CONTRIB_TYPE__DEGREES:
				return getDegrees();
			case Jats1Package.CONTRIB_TYPE__CONTRIB_INFO_CLASS:
				if (coreType) return getContribInfoClass();
				return ((FeatureMap.Internal)getContribInfoClass()).getWrapper();
			case Jats1Package.CONTRIB_TYPE__ADDRESS:
				return getAddress();
			case Jats1Package.CONTRIB_TYPE__AFF:
				return getAff();
			case Jats1Package.CONTRIB_TYPE__AFF_ALTERNATIVES:
				return getAffAlternatives();
			case Jats1Package.CONTRIB_TYPE__AUTHOR_COMMENT:
				return getAuthorComment();
			case Jats1Package.CONTRIB_TYPE__BIO:
				return getBio();
			case Jats1Package.CONTRIB_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.CONTRIB_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.CONTRIB_TYPE__ON_BEHALF_OF:
				return getOnBehalfOf();
			case Jats1Package.CONTRIB_TYPE__ROLE:
				return getRole();
			case Jats1Package.CONTRIB_TYPE__URI:
				return getUri();
			case Jats1Package.CONTRIB_TYPE__XREF:
				return getXref();
			case Jats1Package.CONTRIB_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.CONTRIB_TYPE__BASE:
				return getBase();
			case Jats1Package.CONTRIB_TYPE__CONTRIB_TYPE:
				return getContribType();
			case Jats1Package.CONTRIB_TYPE__CORRESP:
				return getCorresp();
			case Jats1Package.CONTRIB_TYPE__DECEASED:
				return getDeceased();
			case Jats1Package.CONTRIB_TYPE__EQUAL_CONTRIB:
				return getEqualContrib();
			case Jats1Package.CONTRIB_TYPE__HREF:
				return getHref();
			case Jats1Package.CONTRIB_TYPE__ID:
				return getId();
			case Jats1Package.CONTRIB_TYPE__RID:
				return getRid();
			case Jats1Package.CONTRIB_TYPE__ROLE1:
				return getRole1();
			case Jats1Package.CONTRIB_TYPE__SHOW:
				return getShow();
			case Jats1Package.CONTRIB_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.CONTRIB_TYPE__TITLE:
				return getTitle();
			case Jats1Package.CONTRIB_TYPE__TYPE:
				return getType();
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
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID_CLASS:
				((FeatureMap.Internal)getContribIdClass()).set(newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID:
				getContribId().clear();
				getContribId().addAll((Collection<? extends ContribIdType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__NAME_CLASS:
				((FeatureMap.Internal)getNameClass()).set(newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__ANONYMOUS:
				getAnonymous().clear();
				getAnonymous().addAll((Collection<? extends AnonymousType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__COLLAB:
				getCollab().clear();
				getCollab().addAll((Collection<? extends CollabType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__COLLAB_ALTERNATIVES:
				getCollabAlternatives().clear();
				getCollabAlternatives().addAll((Collection<? extends CollabAlternativesType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends NameType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__NAME_ALTERNATIVES:
				getNameAlternatives().clear();
				getNameAlternatives().addAll((Collection<? extends NameAlternativesType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__STRING_NAME:
				getStringName().clear();
				getStringName().addAll((Collection<? extends StringNameType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__DEGREE_CLASS:
				((FeatureMap.Internal)getDegreeClass()).set(newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__DEGREES:
				getDegrees().clear();
				getDegrees().addAll((Collection<? extends DegreesType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__CONTRIB_INFO_CLASS:
				((FeatureMap.Internal)getContribInfoClass()).set(newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__AFF:
				getAff().clear();
				getAff().addAll((Collection<? extends AffType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				getAffAlternatives().addAll((Collection<? extends AffAlternativesType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__AUTHOR_COMMENT:
				getAuthorComment().clear();
				getAuthorComment().addAll((Collection<? extends AuthorCommentType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__BIO:
				getBio().clear();
				getBio().addAll((Collection<? extends BioType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__ON_BEHALF_OF:
				getOnBehalfOf().clear();
				getOnBehalfOf().addAll((Collection<? extends OnBehalfOfType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends RoleType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__CONTRIB_TYPE:
				setContribType((String)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__CORRESP:
				setCorresp((CorrespType1)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__DECEASED:
				setDeceased((DeceasedType)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__EQUAL_CONTRIB:
				setEqualContrib((EqualContribType)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__RID:
				setRid((List<String>)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__ROLE1:
				setRole1((String)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.CONTRIB_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID_CLASS:
				getContribIdClass().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID:
				getContribId().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__NAME_CLASS:
				getNameClass().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__ANONYMOUS:
				getAnonymous().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__COLLAB:
				getCollab().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__COLLAB_ALTERNATIVES:
				getCollabAlternatives().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__NAME:
				getName().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__NAME_ALTERNATIVES:
				getNameAlternatives().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__STRING_NAME:
				getStringName().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__DEGREE_CLASS:
				getDegreeClass().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__DEGREES:
				getDegrees().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__CONTRIB_INFO_CLASS:
				getContribInfoClass().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__AFF:
				getAff().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__AFF_ALTERNATIVES:
				getAffAlternatives().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__AUTHOR_COMMENT:
				getAuthorComment().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__BIO:
				getBio().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__ON_BEHALF_OF:
				getOnBehalfOf().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__ROLE:
				getRole().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.CONTRIB_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.CONTRIB_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_TYPE__CONTRIB_TYPE:
				setContribType(CONTRIB_TYPE_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_TYPE__CORRESP:
				unsetCorresp();
				return;
			case Jats1Package.CONTRIB_TYPE__DECEASED:
				unsetDeceased();
				return;
			case Jats1Package.CONTRIB_TYPE__EQUAL_CONTRIB:
				unsetEqualContrib();
				return;
			case Jats1Package.CONTRIB_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_TYPE__RID:
				setRid(RID_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.CONTRIB_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.CONTRIB_TYPE__TYPE:
				unsetType();
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
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID_CLASS:
				return contribIdClass != null && !contribIdClass.isEmpty();
			case Jats1Package.CONTRIB_TYPE__CONTRIB_ID:
				return !getContribId().isEmpty();
			case Jats1Package.CONTRIB_TYPE__NAME_CLASS:
				return nameClass != null && !nameClass.isEmpty();
			case Jats1Package.CONTRIB_TYPE__ANONYMOUS:
				return !getAnonymous().isEmpty();
			case Jats1Package.CONTRIB_TYPE__COLLAB:
				return !getCollab().isEmpty();
			case Jats1Package.CONTRIB_TYPE__COLLAB_ALTERNATIVES:
				return !getCollabAlternatives().isEmpty();
			case Jats1Package.CONTRIB_TYPE__NAME:
				return !getName().isEmpty();
			case Jats1Package.CONTRIB_TYPE__NAME_ALTERNATIVES:
				return !getNameAlternatives().isEmpty();
			case Jats1Package.CONTRIB_TYPE__STRING_NAME:
				return !getStringName().isEmpty();
			case Jats1Package.CONTRIB_TYPE__DEGREE_CLASS:
				return degreeClass != null && !degreeClass.isEmpty();
			case Jats1Package.CONTRIB_TYPE__DEGREES:
				return !getDegrees().isEmpty();
			case Jats1Package.CONTRIB_TYPE__CONTRIB_INFO_CLASS:
				return contribInfoClass != null && !contribInfoClass.isEmpty();
			case Jats1Package.CONTRIB_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.CONTRIB_TYPE__AFF:
				return !getAff().isEmpty();
			case Jats1Package.CONTRIB_TYPE__AFF_ALTERNATIVES:
				return !getAffAlternatives().isEmpty();
			case Jats1Package.CONTRIB_TYPE__AUTHOR_COMMENT:
				return !getAuthorComment().isEmpty();
			case Jats1Package.CONTRIB_TYPE__BIO:
				return !getBio().isEmpty();
			case Jats1Package.CONTRIB_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.CONTRIB_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.CONTRIB_TYPE__ON_BEHALF_OF:
				return !getOnBehalfOf().isEmpty();
			case Jats1Package.CONTRIB_TYPE__ROLE:
				return !getRole().isEmpty();
			case Jats1Package.CONTRIB_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.CONTRIB_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.CONTRIB_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.CONTRIB_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CONTRIB_TYPE__CONTRIB_TYPE:
				return CONTRIB_TYPE_EDEFAULT == null ? contribType != null : !CONTRIB_TYPE_EDEFAULT.equals(contribType);
			case Jats1Package.CONTRIB_TYPE__CORRESP:
				return isSetCorresp();
			case Jats1Package.CONTRIB_TYPE__DECEASED:
				return isSetDeceased();
			case Jats1Package.CONTRIB_TYPE__EQUAL_CONTRIB:
				return isSetEqualContrib();
			case Jats1Package.CONTRIB_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.CONTRIB_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.CONTRIB_TYPE__RID:
				return RID_EDEFAULT == null ? rid != null : !RID_EDEFAULT.equals(rid);
			case Jats1Package.CONTRIB_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case Jats1Package.CONTRIB_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.CONTRIB_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.CONTRIB_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.CONTRIB_TYPE__TYPE:
				return isSetType();
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
		result.append(" (contribIdClass: ");
		result.append(contribIdClass);
		result.append(", nameClass: ");
		result.append(nameClass);
		result.append(", degreeClass: ");
		result.append(degreeClass);
		result.append(", contribInfoClass: ");
		result.append(contribInfoClass);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", base: ");
		result.append(base);
		result.append(", contribType: ");
		result.append(contribType);
		result.append(", corresp: ");
		if (correspESet) result.append(corresp); else result.append("<unset>");
		result.append(", deceased: ");
		if (deceasedESet) result.append(deceased); else result.append("<unset>");
		result.append(", equalContrib: ");
		if (equalContribESet) result.append(equalContrib); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", rid: ");
		result.append(rid);
		result.append(", role1: ");
		result.append(role1);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ContribTypeImpl
