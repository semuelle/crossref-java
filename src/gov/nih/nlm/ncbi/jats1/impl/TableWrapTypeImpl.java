/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;
import gov.nih.nlm.ncbi.jats1.AltTextType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.AttribType;
import gov.nih.nlm.ncbi.jats1.CaptionType;
import gov.nih.nlm.ncbi.jats1.ChemStructWrapType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.DefListType;
import gov.nih.nlm.ncbi.jats1.DispFormulaType;
import gov.nih.nlm.ncbi.jats1.DispQuoteType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.KwdGroupType;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.ListType;
import gov.nih.nlm.ncbi.jats1.LongDescType;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.ObjectIdType;
import gov.nih.nlm.ncbi.jats1.OrientationType5;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.PositionType9;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.SpeechType;
import gov.nih.nlm.ncbi.jats1.StatementType;
import gov.nih.nlm.ncbi.jats1.TableType;
import gov.nih.nlm.ncbi.jats1.TableWrapFootType;
import gov.nih.nlm.ncbi.jats1.TableWrapType;
import gov.nih.nlm.ncbi.jats1.UriType;
import gov.nih.nlm.ncbi.jats1.VerseGroupType;

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
 * An implementation of the model object '<em><b>Table Wrap Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getIdClass <em>Id Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getAbstractClass <em>Abstract Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getKwdGroupClass <em>Kwd Group Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getKwdGroup <em>Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getInsideTableWrap <em>Inside Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getTableWrapFoot <em>Table Wrap Foot</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableWrapTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableWrapTypeImpl extends MinimalEObjectImpl.Container implements TableWrapType {
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
	 * The cached value of the '{@link #getInsideTableWrap() <em>Inside Table Wrap</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideTableWrap()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap insideTableWrap;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

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
	protected static final OrientationType5 ORIENTATION_EDEFAULT = OrientationType5.PORTRAIT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType5 orientation = ORIENTATION_EDEFAULT;

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
	protected static final PositionType9 POSITION_EDEFAULT = PositionType9.FLOAT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType9 position = POSITION_EDEFAULT;

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
	protected TableWrapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getTableWrapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIdClass() {
		if (idClass == null) {
			idClass = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_TYPE__ID_CLASS);
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
		return getIdClass().list(Jats1Package.eINSTANCE.getTableWrapType_ObjectId());
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_WRAP_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_WRAP_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__CAPTION, oldCaption, newCaption);
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
				msgs = ((InternalEObject)caption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_WRAP_TYPE__CAPTION, null, msgs);
			if (newCaption != null)
				msgs = ((InternalEObject)newCaption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_WRAP_TYPE__CAPTION, null, msgs);
			msgs = basicSetCaption(newCaption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__CAPTION, newCaption, newCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractClass() {
		if (abstractClass == null) {
			abstractClass = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_TYPE__ABSTRACT_CLASS);
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
		return getAbstractClass().list(Jats1Package.eINSTANCE.getTableWrapType_Abstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getKwdGroupClass() {
		if (kwdGroupClass == null) {
			kwdGroupClass = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP_CLASS);
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
		return getKwdGroupClass().list(Jats1Package.eINSTANCE.getTableWrapType_KwdGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_TYPE__GROUP);
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
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapType_AltText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LongDescType> getLongDesc() {
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapType_LongDesc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getGroup().list(Jats1Package.eINSTANCE.getTableWrapType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getInsideTableWrap() {
		if (insideTableWrap == null) {
			insideTableWrap = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_TYPE__INSIDE_TABLE_WRAP);
		}
		return insideTableWrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispQuoteType> getDispQuote() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_DispQuote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechType> getSpeech() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_Speech());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementType> getStatement() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_Statement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_VerseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable() {
		return getInsideTableWrap().list(Jats1Package.eINSTANCE.getTableWrapType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, Jats1Package.TABLE_WRAP_TYPE__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapFootType> getTableWrapFoot() {
		return getGroup1().list(Jats1Package.eINSTANCE.getTableWrapType_TableWrapFoot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttribType> getAttrib() {
		return getGroup1().list(Jats1Package.eINSTANCE.getTableWrapType_Attrib());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PermissionsType> getPermissions() {
		return getGroup1().list(Jats1Package.eINSTANCE.getTableWrapType_Permissions());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType5 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(OrientationType5 newOrientation) {
		OrientationType5 oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrientation() {
		OrientationType5 oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TABLE_WRAP_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
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
	public PositionType9 getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(PositionType9 newPosition) {
		PositionType9 oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		boolean oldPositionESet = positionESet;
		positionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__POSITION, oldPosition, position, !oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPosition() {
		PositionType9 oldPosition = position;
		boolean oldPositionESet = positionESet;
		position = POSITION_EDEFAULT;
		positionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TABLE_WRAP_TYPE__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_WRAP_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.TABLE_WRAP_TYPE__ID_CLASS:
				return ((InternalEList<?>)getIdClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__OBJECT_ID:
				return ((InternalEList<?>)getObjectId()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__CAPTION:
				return basicSetCaption(null, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT_CLASS:
				return ((InternalEList<?>)getAbstractClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT:
				return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP_CLASS:
				return ((InternalEList<?>)getKwdGroupClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP:
				return ((InternalEList<?>)getKwdGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__ALT_TEXT:
				return ((InternalEList<?>)getAltText()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__LONG_DESC:
				return ((InternalEList<?>)getLongDesc()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__INSIDE_TABLE_WRAP:
				return ((InternalEList<?>)getInsideTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__DISP_QUOTE:
				return ((InternalEList<?>)getDispQuote()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__VERSE_GROUP:
				return ((InternalEList<?>)getVerseGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__TABLE_WRAP_FOOT:
				return ((InternalEList<?>)getTableWrapFoot()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__ATTRIB:
				return ((InternalEList<?>)getAttrib()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_WRAP_TYPE__PERMISSIONS:
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
			case Jats1Package.TABLE_WRAP_TYPE__ID_CLASS:
				if (coreType) return getIdClass();
				return ((FeatureMap.Internal)getIdClass()).getWrapper();
			case Jats1Package.TABLE_WRAP_TYPE__OBJECT_ID:
				return getObjectId();
			case Jats1Package.TABLE_WRAP_TYPE__LABEL:
				return getLabel();
			case Jats1Package.TABLE_WRAP_TYPE__CAPTION:
				return getCaption();
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT_CLASS:
				if (coreType) return getAbstractClass();
				return ((FeatureMap.Internal)getAbstractClass()).getWrapper();
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT:
				return getAbstract();
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP_CLASS:
				if (coreType) return getKwdGroupClass();
				return ((FeatureMap.Internal)getKwdGroupClass()).getWrapper();
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP:
				return getKwdGroup();
			case Jats1Package.TABLE_WRAP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Jats1Package.TABLE_WRAP_TYPE__ALT_TEXT:
				return getAltText();
			case Jats1Package.TABLE_WRAP_TYPE__LONG_DESC:
				return getLongDesc();
			case Jats1Package.TABLE_WRAP_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.TABLE_WRAP_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.TABLE_WRAP_TYPE__URI:
				return getUri();
			case Jats1Package.TABLE_WRAP_TYPE__INSIDE_TABLE_WRAP:
				if (coreType) return getInsideTableWrap();
				return ((FeatureMap.Internal)getInsideTableWrap()).getWrapper();
			case Jats1Package.TABLE_WRAP_TYPE__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.TABLE_WRAP_TYPE__SPEECH:
				return getSpeech();
			case Jats1Package.TABLE_WRAP_TYPE__STATEMENT:
				return getStatement();
			case Jats1Package.TABLE_WRAP_TYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.TABLE_WRAP_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.TABLE_WRAP_TYPE__LIST:
				return getList();
			case Jats1Package.TABLE_WRAP_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.TABLE_WRAP_TYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.TABLE_WRAP_TYPE__CODE:
				return getCode();
			case Jats1Package.TABLE_WRAP_TYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.TABLE_WRAP_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.TABLE_WRAP_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.TABLE_WRAP_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.TABLE_WRAP_TYPE__TABLE:
				return getTable();
			case Jats1Package.TABLE_WRAP_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case Jats1Package.TABLE_WRAP_TYPE__TABLE_WRAP_FOOT:
				return getTableWrapFoot();
			case Jats1Package.TABLE_WRAP_TYPE__ATTRIB:
				return getAttrib();
			case Jats1Package.TABLE_WRAP_TYPE__PERMISSIONS:
				return getPermissions();
			case Jats1Package.TABLE_WRAP_TYPE__BASE:
				return getBase();
			case Jats1Package.TABLE_WRAP_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.TABLE_WRAP_TYPE__ID:
				return getId();
			case Jats1Package.TABLE_WRAP_TYPE__LANG:
				return getLang();
			case Jats1Package.TABLE_WRAP_TYPE__ORIENTATION:
				return getOrientation();
			case Jats1Package.TABLE_WRAP_TYPE__POSITION:
				return getPosition();
			case Jats1Package.TABLE_WRAP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.TABLE_WRAP_TYPE__ID_CLASS:
				((FeatureMap.Internal)getIdClass()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__OBJECT_ID:
				getObjectId().clear();
				getObjectId().addAll((Collection<? extends ObjectIdType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT_CLASS:
				((FeatureMap.Internal)getAbstractClass()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT:
				getAbstract().clear();
				getAbstract().addAll((Collection<? extends AbstractType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP_CLASS:
				((FeatureMap.Internal)getKwdGroupClass()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				getKwdGroup().addAll((Collection<? extends KwdGroupType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ALT_TEXT:
				getAltText().clear();
				getAltText().addAll((Collection<? extends AltTextType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__LONG_DESC:
				getLongDesc().clear();
				getLongDesc().addAll((Collection<? extends LongDescType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__INSIDE_TABLE_WRAP:
				((FeatureMap.Internal)getInsideTableWrap()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				getDispQuote().addAll((Collection<? extends DispQuoteType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends StatementType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__TABLE_WRAP_FOOT:
				getTableWrapFoot().clear();
				getTableWrapFoot().addAll((Collection<? extends TableWrapFootType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ATTRIB:
				getAttrib().clear();
				getAttrib().addAll((Collection<? extends AttribType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends PermissionsType>)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ORIENTATION:
				setOrientation((OrientationType5)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__POSITION:
				setPosition((PositionType9)newValue);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.TABLE_WRAP_TYPE__ID_CLASS:
				getIdClass().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__OBJECT_ID:
				getObjectId().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__CAPTION:
				setCaption((CaptionType)null);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT_CLASS:
				getAbstractClass().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT:
				getAbstract().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP_CLASS:
				getKwdGroupClass().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP:
				getKwdGroup().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__GROUP:
				getGroup().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ALT_TEXT:
				getAltText().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__LONG_DESC:
				getLongDesc().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__INSIDE_TABLE_WRAP:
				getInsideTableWrap().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__SPEECH:
				getSpeech().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__STATEMENT:
				getStatement().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__TABLE:
				getTable().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__TABLE_WRAP_FOOT:
				getTableWrapFoot().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ATTRIB:
				getAttrib().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__PERMISSIONS:
				getPermissions().clear();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.TABLE_WRAP_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__POSITION:
				unsetPosition();
				return;
			case Jats1Package.TABLE_WRAP_TYPE__SPECIFIC_USE:
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
			case Jats1Package.TABLE_WRAP_TYPE__ID_CLASS:
				return idClass != null && !idClass.isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__OBJECT_ID:
				return !getObjectId().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__LABEL:
				return label != null;
			case Jats1Package.TABLE_WRAP_TYPE__CAPTION:
				return caption != null;
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT_CLASS:
				return abstractClass != null && !abstractClass.isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__ABSTRACT:
				return !getAbstract().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP_CLASS:
				return kwdGroupClass != null && !kwdGroupClass.isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__KWD_GROUP:
				return !getKwdGroup().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__ALT_TEXT:
				return !getAltText().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__LONG_DESC:
				return !getLongDesc().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__INSIDE_TABLE_WRAP:
				return insideTableWrap != null && !insideTableWrap.isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__DISP_QUOTE:
				return !getDispQuote().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__SPEECH:
				return !getSpeech().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__STATEMENT:
				return !getStatement().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__TABLE:
				return !getTable().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__TABLE_WRAP_FOOT:
				return !getTableWrapFoot().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__ATTRIB:
				return !getAttrib().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__PERMISSIONS:
				return !getPermissions().isEmpty();
			case Jats1Package.TABLE_WRAP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.TABLE_WRAP_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.TABLE_WRAP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.TABLE_WRAP_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.TABLE_WRAP_TYPE__ORIENTATION:
				return isSetOrientation();
			case Jats1Package.TABLE_WRAP_TYPE__POSITION:
				return isSetPosition();
			case Jats1Package.TABLE_WRAP_TYPE__SPECIFIC_USE:
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
		result.append(", insideTableWrap: ");
		result.append(insideTableWrap);
		result.append(", group1: ");
		result.append(group1);
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

} //TableWrapTypeImpl
