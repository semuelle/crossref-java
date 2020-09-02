/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;
import gov.nih.nlm.ncbi.jats1.AltTextType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.AttribType;
import gov.nih.nlm.ncbi.jats1.CaptionType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.ChemStructWrapType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.KwdGroupType;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.LongDescType;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.ObjectIdType;
import gov.nih.nlm.ncbi.jats1.OrientationType3;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.PositionType6;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.TextualFormType;
import gov.nih.nlm.ncbi.jats1.UriType;

import java.util.Collection;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chem Struct Wrap Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getIdClass <em>Id Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getAbstractClass <em>Abstract Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getKwdGroupClass <em>Kwd Group Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getKwdGroup <em>Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getInsideChemStructWrapClass <em>Inside Chem Struct Wrap Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getTextualForm <em>Textual Form</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getDisplayBackMatterClass <em>Display Back Matter Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructWrapTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChemStructWrapTypeImpl extends MinimalEObjectImpl.Container implements ChemStructWrapType {
	/**
	 * The cached value of the '{@link #getIdClass() <em>Id Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap idClass;

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
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected CaptionType caption;

	/**
	 * The cached value of the '{@link #getAbstractClass() <em>Abstract Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractClass;

	/**
	 * The cached value of the '{@link #getKwdGroupClass() <em>Kwd Group Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKwdGroupClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap kwdGroupClass;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getInsideChemStructWrapClass() <em>Inside Chem Struct Wrap Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideChemStructWrapClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap insideChemStructWrapClass;

	/**
	 * The cached value of the '{@link #getDisplayBackMatterClass() <em>Display Back Matter Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayBackMatterClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap displayBackMatterClass;

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
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationType3 ORIENTATION_EDEFAULT = OrientationType3.PORTRAIT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType3 orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final PositionType6 POSITION_EDEFAULT = PositionType6.FLOAT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType6 position = POSITION_EDEFAULT;

	/**
	 * This is true if the Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionESet;

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
	protected ChemStructWrapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getChemStructWrapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIdClass() {
		if (idClass == null) {
			idClass = new BasicFeatureMap(this, Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID_CLASS);
		}
		return idClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectIdType> getObjectId() {
		return getIdClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_ObjectId());
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CHEM_STRUCT_WRAP_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CHEM_STRUCT_WRAP_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CaptionType newCaption, NotificationChain msgs) {
		CaptionType oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__CAPTION, oldCaption, newCaption);
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
	public void setCaption(CaptionType newCaption) {
		if (newCaption != caption) {
			NotificationChain msgs = null;
			if (caption != null)
				msgs = ((InternalEObject)caption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CHEM_STRUCT_WRAP_TYPE__CAPTION, null, msgs);
			if (newCaption != null)
				msgs = ((InternalEObject)newCaption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.CHEM_STRUCT_WRAP_TYPE__CAPTION, null, msgs);
			msgs = basicSetCaption(newCaption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__CAPTION, newCaption, newCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractClass() {
		if (abstractClass == null) {
			abstractClass = new BasicFeatureMap(this, Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT_CLASS);
		}
		return abstractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractType> getAbstract() {
		return getAbstractClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_Abstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getKwdGroupClass() {
		if (kwdGroupClass == null) {
			kwdGroupClass = new BasicFeatureMap(this, Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP_CLASS);
		}
		return kwdGroupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KwdGroupType> getKwdGroup() {
		return getKwdGroupClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_KwdGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.CHEM_STRUCT_WRAP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltTextType> getAltText() {
		return getGroup().list(Jats1Package.eINSTANCE.getChemStructWrapType_AltText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LongDescType> getLongDesc() {
		return getGroup().list(Jats1Package.eINSTANCE.getChemStructWrapType_LongDesc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getGroup().list(Jats1Package.eINSTANCE.getChemStructWrapType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getGroup().list(Jats1Package.eINSTANCE.getChemStructWrapType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getGroup().list(Jats1Package.eINSTANCE.getChemStructWrapType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getInsideChemStructWrapClass() {
		if (insideChemStructWrapClass == null) {
			insideChemStructWrapClass = new BasicFeatureMap(this, Jats1Package.CHEM_STRUCT_WRAP_TYPE__INSIDE_CHEM_STRUCT_WRAP_CLASS);
		}
		return insideChemStructWrapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getInsideChemStructWrapClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getInsideChemStructWrapClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getInsideChemStructWrapClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getInsideChemStructWrapClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getInsideChemStructWrapClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getInsideChemStructWrapClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextualFormType> getTextualForm() {
		return getInsideChemStructWrapClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_TextualForm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDisplayBackMatterClass() {
		if (displayBackMatterClass == null) {
			displayBackMatterClass = new BasicFeatureMap(this, Jats1Package.CHEM_STRUCT_WRAP_TYPE__DISPLAY_BACK_MATTER_CLASS);
		}
		return displayBackMatterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttribType> getAttrib() {
		return getDisplayBackMatterClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_Attrib());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PermissionsType> getPermissions() {
		return getDisplayBackMatterClass().list(Jats1Package.eINSTANCE.getChemStructWrapType_Permissions());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType3 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(OrientationType3 newOrientation) {
		OrientationType3 oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrientation() {
		OrientationType3 oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionType6 getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(PositionType6 newPosition) {
		PositionType6 oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		boolean oldPositionESet = positionESet;
		positionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__POSITION, oldPosition, position, !oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPosition() {
		PositionType6 oldPosition = position;
		boolean oldPositionESet = positionESet;
		position = POSITION_EDEFAULT;
		positionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPosition() {
		return positionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_WRAP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID_CLASS:
				return ((InternalEList<?>)getIdClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__OBJECT_ID:
				return ((InternalEList<?>)getObjectId()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CAPTION:
				return basicSetCaption(null, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT_CLASS:
				return ((InternalEList<?>)getAbstractClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP_CLASS:
				return ((InternalEList<?>)getKwdGroupClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP:
				return ((InternalEList<?>)getKwdGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALT_TEXT:
				return ((InternalEList<?>)getAltText()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LONG_DESC:
				return ((InternalEList<?>)getLongDesc()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__INSIDE_CHEM_STRUCT_WRAP_CLASS:
				return ((InternalEList<?>)getInsideChemStructWrapClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__TEXTUAL_FORM:
				return ((InternalEList<?>)getTextualForm()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				return ((InternalEList<?>)getDisplayBackMatterClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ATTRIB:
				return ((InternalEList<?>)getAttrib()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID_CLASS:
				if (coreType) return getIdClass();
				return ((FeatureMap.Internal)getIdClass()).getWrapper();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__OBJECT_ID:
				return getObjectId();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LABEL:
				return getLabel();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CAPTION:
				return getCaption();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT_CLASS:
				if (coreType) return getAbstractClass();
				return ((FeatureMap.Internal)getAbstractClass()).getWrapper();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT:
				return getAbstract();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP_CLASS:
				if (coreType) return getKwdGroupClass();
				return ((FeatureMap.Internal)getKwdGroupClass()).getWrapper();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP:
				return getKwdGroup();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALT_TEXT:
				return getAltText();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LONG_DESC:
				return getLongDesc();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__URI:
				return getUri();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__INSIDE_CHEM_STRUCT_WRAP_CLASS:
				if (coreType) return getInsideChemStructWrapClass();
				return ((FeatureMap.Internal)getInsideChemStructWrapClass()).getWrapper();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CODE:
				return getCode();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__TEXTUAL_FORM:
				return getTextualForm();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				if (coreType) return getDisplayBackMatterClass();
				return ((FeatureMap.Internal)getDisplayBackMatterClass()).getWrapper();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ATTRIB:
				return getAttrib();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PERMISSIONS:
				return getPermissions();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__BASE:
				return getBase();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID:
				return getId();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LANG:
				return getLang();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ORIENTATION:
				return getOrientation();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__POSITION:
				return getPosition();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__SPECIFIC_USE:
				return getSpecificUse();
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
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID_CLASS:
				((FeatureMap.Internal)getIdClass()).set(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__OBJECT_ID:
				getObjectId().clear();
				getObjectId().addAll((Collection<? extends ObjectIdType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT_CLASS:
				((FeatureMap.Internal)getAbstractClass()).set(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP_CLASS:
				((FeatureMap.Internal)getKwdGroupClass()).set(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				getKwdGroup().addAll((Collection<? extends KwdGroupType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALT_TEXT:
				getAltText().clear();
				getAltText().addAll((Collection<? extends AltTextType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LONG_DESC:
				getLongDesc().clear();
				getLongDesc().addAll((Collection<? extends LongDescType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__INSIDE_CHEM_STRUCT_WRAP_CLASS:
				((FeatureMap.Internal)getInsideChemStructWrapClass()).set(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__TEXTUAL_FORM:
				getTextualForm().clear();
				getTextualForm().addAll((Collection<? extends TextualFormType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				((FeatureMap.Internal)getDisplayBackMatterClass()).set(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ATTRIB:
				getAttrib().clear();
				getAttrib().addAll((Collection<? extends AttribType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends PermissionsType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ORIENTATION:
				setOrientation((OrientationType3)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__POSITION:
				setPosition((PositionType6)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID_CLASS:
				getIdClass().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__OBJECT_ID:
				getObjectId().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CAPTION:
				setCaption((CaptionType)null);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT_CLASS:
				getAbstractClass().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP_CLASS:
				getKwdGroupClass().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALT_TEXT:
				getAltText().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LONG_DESC:
				getLongDesc().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__INSIDE_CHEM_STRUCT_WRAP_CLASS:
				getInsideChemStructWrapClass().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__TEXTUAL_FORM:
				getTextualForm().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				getDisplayBackMatterClass().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ATTRIB:
				getAttrib().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PERMISSIONS:
				getPermissions().clear();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__POSITION:
				unsetPosition();
				return;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID_CLASS:
				return idClass != null && !idClass.isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__OBJECT_ID:
				return !getObjectId().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LABEL:
				return label != null;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CAPTION:
				return caption != null;
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT_CLASS:
				return abstractClass != null && !abstractClass.isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ABSTRACT:
				return !getAbstract().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP_CLASS:
				return kwdGroupClass != null && !kwdGroupClass.isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__KWD_GROUP:
				return !getKwdGroup().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALT_TEXT:
				return !getAltText().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LONG_DESC:
				return !getLongDesc().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__INSIDE_CHEM_STRUCT_WRAP_CLASS:
				return insideChemStructWrapClass != null && !insideChemStructWrapClass.isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__TEXTUAL_FORM:
				return !getTextualForm().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__DISPLAY_BACK_MATTER_CLASS:
				return displayBackMatterClass != null && !displayBackMatterClass.isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ATTRIB:
				return !getAttrib().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__PERMISSIONS:
				return !getPermissions().isEmpty();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__ORIENTATION:
				return isSetOrientation();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__POSITION:
				return isSetPosition();
			case Jats1Package.CHEM_STRUCT_WRAP_TYPE__SPECIFIC_USE:
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
		result.append(" (idClass: ");
		result.append(idClass);
		result.append(", abstractClass: ");
		result.append(abstractClass);
		result.append(", kwdGroupClass: ");
		result.append(kwdGroupClass);
		result.append(", group: ");
		result.append(group);
		result.append(", insideChemStructWrapClass: ");
		result.append(insideChemStructWrapClass);
		result.append(", displayBackMatterClass: ");
		result.append(displayBackMatterClass);
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", position: ");
		if (positionESet) result.append(position); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //ChemStructWrapTypeImpl
