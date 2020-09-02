/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.AttribType;
import gov.nih.nlm.ncbi.jats1.BoxedTextType;
import gov.nih.nlm.ncbi.jats1.CaptionType;
import gov.nih.nlm.ncbi.jats1.ChemStructWrapType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.DefListType;
import gov.nih.nlm.ncbi.jats1.DispFormulaGroupType;
import gov.nih.nlm.ncbi.jats1.DispFormulaType;
import gov.nih.nlm.ncbi.jats1.DispQuoteType;
import gov.nih.nlm.ncbi.jats1.FigGroupType;
import gov.nih.nlm.ncbi.jats1.FigType;
import gov.nih.nlm.ncbi.jats1.FnGroupType;
import gov.nih.nlm.ncbi.jats1.GlossaryType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.ListType;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.ObjectIdType;
import gov.nih.nlm.ncbi.jats1.OrientationType1;
import gov.nih.nlm.ncbi.jats1.PType;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.PositionType1;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.RefListType;
import gov.nih.nlm.ncbi.jats1.RelatedArticleType;
import gov.nih.nlm.ncbi.jats1.RelatedObjectType;
import gov.nih.nlm.ncbi.jats1.SecMetaType;
import gov.nih.nlm.ncbi.jats1.SecType;
import gov.nih.nlm.ncbi.jats1.SpeechType;
import gov.nih.nlm.ncbi.jats1.StatementType;
import gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.TableWrapGroupType;
import gov.nih.nlm.ncbi.jats1.TableWrapType;
import gov.nih.nlm.ncbi.jats1.TexMathType;
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

import org.w3._1998.math.math.ml.MathType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boxed Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getIdClass <em>Id Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getSecMeta <em>Sec Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getParaLevel <em>Para Level</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getSecClass <em>Sec Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getSecBackClass <em>Sec Back Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getFnGroup <em>Fn Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getRefList <em>Ref List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getDisplayBackMatterClass <em>Display Back Matter Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BoxedTextTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoxedTextTypeImpl extends MinimalEObjectImpl.Container implements BoxedTextType {
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
	 * The cached value of the '{@link #getSecMeta() <em>Sec Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecMeta()
	 * @generated
	 * @ordered
	 */
	protected SecMetaType secMeta;

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
	 * The cached value of the '{@link #getParaLevel() <em>Para Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParaLevel()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap paraLevel;

	/**
	 * The cached value of the '{@link #getSecClass() <em>Sec Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap secClass;

	/**
	 * The cached value of the '{@link #getSecBackClass() <em>Sec Back Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecBackClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap secBackClass;

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
	protected static final OrientationType1 ORIENTATION_EDEFAULT = OrientationType1.PORTRAIT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType1 orientation = ORIENTATION_EDEFAULT;

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
	protected static final PositionType1 POSITION_EDEFAULT = PositionType1.FLOAT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType1 position = POSITION_EDEFAULT;

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
	protected BoxedTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getBoxedTextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIdClass() {
		if (idClass == null) {
			idClass = new BasicFeatureMap(this, Jats1Package.BOXED_TEXT_TYPE__ID_CLASS);
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
		return getIdClass().list(Jats1Package.eINSTANCE.getBoxedTextType_ObjectId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecMetaType getSecMeta() {
		return secMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecMeta(SecMetaType newSecMeta, NotificationChain msgs) {
		SecMetaType oldSecMeta = secMeta;
		secMeta = newSecMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__SEC_META, oldSecMeta, newSecMeta);
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
	public void setSecMeta(SecMetaType newSecMeta) {
		if (newSecMeta != secMeta) {
			NotificationChain msgs = null;
			if (secMeta != null)
				msgs = ((InternalEObject)secMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BOXED_TEXT_TYPE__SEC_META, null, msgs);
			if (newSecMeta != null)
				msgs = ((InternalEObject)newSecMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BOXED_TEXT_TYPE__SEC_META, null, msgs);
			msgs = basicSetSecMeta(newSecMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__SEC_META, newSecMeta, newSecMeta));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BOXED_TEXT_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BOXED_TEXT_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__CAPTION, oldCaption, newCaption);
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
				msgs = ((InternalEObject)caption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BOXED_TEXT_TYPE__CAPTION, null, msgs);
			if (newCaption != null)
				msgs = ((InternalEObject)newCaption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BOXED_TEXT_TYPE__CAPTION, null, msgs);
			msgs = basicSetCaption(newCaption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__CAPTION, newCaption, newCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getParaLevel() {
		if (paraLevel == null) {
			paraLevel = new BasicFeatureMap(this, Jats1Package.BOXED_TEXT_TYPE__PARA_LEVEL);
		}
		return paraLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddressType> getAddress() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxedTextType> getBoxedText() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_BoxedText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigType> getFig() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Fig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigGroupType> getFigGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_FigGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_TableWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapGroupType> getTableWrapGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_TableWrapGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PType> getP() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispQuoteType> getDispQuote() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_DispQuote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechType> getSpeech() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Speech());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementType> getStatement() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_Statement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBoxedTextType_VerseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSecClass() {
		if (secClass == null) {
			secClass = new BasicFeatureMap(this, Jats1Package.BOXED_TEXT_TYPE__SEC_CLASS);
		}
		return secClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecType> getSec() {
		return getSecClass().list(Jats1Package.eINSTANCE.getBoxedTextType_Sec());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSecBackClass() {
		if (secBackClass == null) {
			secBackClass = new BasicFeatureMap(this, Jats1Package.BOXED_TEXT_TYPE__SEC_BACK_CLASS);
		}
		return secBackClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnGroupType> getFnGroup() {
		return getSecBackClass().list(Jats1Package.eINSTANCE.getBoxedTextType_FnGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryType> getGlossary() {
		return getSecBackClass().list(Jats1Package.eINSTANCE.getBoxedTextType_Glossary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefListType> getRefList() {
		return getSecBackClass().list(Jats1Package.eINSTANCE.getBoxedTextType_RefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDisplayBackMatterClass() {
		if (displayBackMatterClass == null) {
			displayBackMatterClass = new BasicFeatureMap(this, Jats1Package.BOXED_TEXT_TYPE__DISPLAY_BACK_MATTER_CLASS);
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
		return getDisplayBackMatterClass().list(Jats1Package.eINSTANCE.getBoxedTextType_Attrib());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PermissionsType> getPermissions() {
		return getDisplayBackMatterClass().list(Jats1Package.eINSTANCE.getBoxedTextType_Permissions());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType1 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(OrientationType1 newOrientation) {
		OrientationType1 oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrientation() {
		OrientationType1 oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.BOXED_TEXT_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
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
	public PositionType1 getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(PositionType1 newPosition) {
		PositionType1 oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		boolean oldPositionESet = positionESet;
		positionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__POSITION, oldPosition, position, !oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPosition() {
		PositionType1 oldPosition = position;
		boolean oldPositionESet = positionESet;
		position = POSITION_EDEFAULT;
		positionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.BOXED_TEXT_TYPE__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BOXED_TEXT_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.BOXED_TEXT_TYPE__ID_CLASS:
				return ((InternalEList<?>)getIdClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__OBJECT_ID:
				return ((InternalEList<?>)getObjectId()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__SEC_META:
				return basicSetSecMeta(null, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__CAPTION:
				return basicSetCaption(null, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__PARA_LEVEL:
				return ((InternalEList<?>)getParaLevel()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__BOXED_TEXT:
				return ((InternalEList<?>)getBoxedText()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__FIG:
				return ((InternalEList<?>)getFig()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__FIG_GROUP:
				return ((InternalEList<?>)getFigGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP_GROUP:
				return ((InternalEList<?>)getTableWrapGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__DISP_QUOTE:
				return ((InternalEList<?>)getDispQuote()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__VERSE_GROUP:
				return ((InternalEList<?>)getVerseGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__SEC_CLASS:
				return ((InternalEList<?>)getSecClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__SEC:
				return ((InternalEList<?>)getSec()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__SEC_BACK_CLASS:
				return ((InternalEList<?>)getSecBackClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__FN_GROUP:
				return ((InternalEList<?>)getFnGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__GLOSSARY:
				return ((InternalEList<?>)getGlossary()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__REF_LIST:
				return ((InternalEList<?>)getRefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__DISPLAY_BACK_MATTER_CLASS:
				return ((InternalEList<?>)getDisplayBackMatterClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__ATTRIB:
				return ((InternalEList<?>)getAttrib()).basicRemove(otherEnd, msgs);
			case Jats1Package.BOXED_TEXT_TYPE__PERMISSIONS:
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
			case Jats1Package.BOXED_TEXT_TYPE__ID_CLASS:
				if (coreType) return getIdClass();
				return ((FeatureMap.Internal)getIdClass()).getWrapper();
			case Jats1Package.BOXED_TEXT_TYPE__OBJECT_ID:
				return getObjectId();
			case Jats1Package.BOXED_TEXT_TYPE__SEC_META:
				return getSecMeta();
			case Jats1Package.BOXED_TEXT_TYPE__LABEL:
				return getLabel();
			case Jats1Package.BOXED_TEXT_TYPE__CAPTION:
				return getCaption();
			case Jats1Package.BOXED_TEXT_TYPE__PARA_LEVEL:
				if (coreType) return getParaLevel();
				return ((FeatureMap.Internal)getParaLevel()).getWrapper();
			case Jats1Package.BOXED_TEXT_TYPE__ADDRESS:
				return getAddress();
			case Jats1Package.BOXED_TEXT_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.BOXED_TEXT_TYPE__ARRAY:
				return getArray();
			case Jats1Package.BOXED_TEXT_TYPE__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.BOXED_TEXT_TYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.BOXED_TEXT_TYPE__CODE:
				return getCode();
			case Jats1Package.BOXED_TEXT_TYPE__FIG:
				return getFig();
			case Jats1Package.BOXED_TEXT_TYPE__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.BOXED_TEXT_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.BOXED_TEXT_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.BOXED_TEXT_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.BOXED_TEXT_TYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.BOXED_TEXT_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.BOXED_TEXT_TYPE__LIST:
				return getList();
			case Jats1Package.BOXED_TEXT_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.BOXED_TEXT_TYPE__MATH:
				return getMath();
			case Jats1Package.BOXED_TEXT_TYPE__P:
				return getP();
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.BOXED_TEXT_TYPE__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.BOXED_TEXT_TYPE__SPEECH:
				return getSpeech();
			case Jats1Package.BOXED_TEXT_TYPE__STATEMENT:
				return getStatement();
			case Jats1Package.BOXED_TEXT_TYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.BOXED_TEXT_TYPE__SEC_CLASS:
				if (coreType) return getSecClass();
				return ((FeatureMap.Internal)getSecClass()).getWrapper();
			case Jats1Package.BOXED_TEXT_TYPE__SEC:
				return getSec();
			case Jats1Package.BOXED_TEXT_TYPE__SEC_BACK_CLASS:
				if (coreType) return getSecBackClass();
				return ((FeatureMap.Internal)getSecBackClass()).getWrapper();
			case Jats1Package.BOXED_TEXT_TYPE__FN_GROUP:
				return getFnGroup();
			case Jats1Package.BOXED_TEXT_TYPE__GLOSSARY:
				return getGlossary();
			case Jats1Package.BOXED_TEXT_TYPE__REF_LIST:
				return getRefList();
			case Jats1Package.BOXED_TEXT_TYPE__DISPLAY_BACK_MATTER_CLASS:
				if (coreType) return getDisplayBackMatterClass();
				return ((FeatureMap.Internal)getDisplayBackMatterClass()).getWrapper();
			case Jats1Package.BOXED_TEXT_TYPE__ATTRIB:
				return getAttrib();
			case Jats1Package.BOXED_TEXT_TYPE__PERMISSIONS:
				return getPermissions();
			case Jats1Package.BOXED_TEXT_TYPE__BASE:
				return getBase();
			case Jats1Package.BOXED_TEXT_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.BOXED_TEXT_TYPE__ID:
				return getId();
			case Jats1Package.BOXED_TEXT_TYPE__LANG:
				return getLang();
			case Jats1Package.BOXED_TEXT_TYPE__ORIENTATION:
				return getOrientation();
			case Jats1Package.BOXED_TEXT_TYPE__POSITION:
				return getPosition();
			case Jats1Package.BOXED_TEXT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.BOXED_TEXT_TYPE__ID_CLASS:
				((FeatureMap.Internal)getIdClass()).set(newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__OBJECT_ID:
				getObjectId().clear();
				getObjectId().addAll((Collection<? extends ObjectIdType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SEC_META:
				setSecMeta((SecMetaType)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__PARA_LEVEL:
				((FeatureMap.Internal)getParaLevel()).set(newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				getBoxedText().addAll((Collection<? extends BoxedTextType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__FIG:
				getFig().clear();
				getFig().addAll((Collection<? extends FigType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__FIG_GROUP:
				getFigGroup().clear();
				getFigGroup().addAll((Collection<? extends FigGroupType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				getTableWrapGroup().addAll((Collection<? extends TableWrapGroupType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				getDispQuote().addAll((Collection<? extends DispQuoteType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends StatementType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SEC_CLASS:
				((FeatureMap.Internal)getSecClass()).set(newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SEC:
				getSec().clear();
				getSec().addAll((Collection<? extends SecType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SEC_BACK_CLASS:
				((FeatureMap.Internal)getSecBackClass()).set(newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__FN_GROUP:
				getFnGroup().clear();
				getFnGroup().addAll((Collection<? extends FnGroupType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__GLOSSARY:
				getGlossary().clear();
				getGlossary().addAll((Collection<? extends GlossaryType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__REF_LIST:
				getRefList().clear();
				getRefList().addAll((Collection<? extends RefListType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DISPLAY_BACK_MATTER_CLASS:
				((FeatureMap.Internal)getDisplayBackMatterClass()).set(newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ATTRIB:
				getAttrib().clear();
				getAttrib().addAll((Collection<? extends AttribType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends PermissionsType>)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ORIENTATION:
				setOrientation((OrientationType1)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__POSITION:
				setPosition((PositionType1)newValue);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.BOXED_TEXT_TYPE__ID_CLASS:
				getIdClass().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__OBJECT_ID:
				getObjectId().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SEC_META:
				setSecMeta((SecMetaType)null);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__CAPTION:
				setCaption((CaptionType)null);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__PARA_LEVEL:
				getParaLevel().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__FIG:
				getFig().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__FIG_GROUP:
				getFigGroup().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__P:
				getP().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SPEECH:
				getSpeech().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__STATEMENT:
				getStatement().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SEC_CLASS:
				getSecClass().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SEC:
				getSec().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SEC_BACK_CLASS:
				getSecBackClass().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__FN_GROUP:
				getFnGroup().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__GLOSSARY:
				getGlossary().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__REF_LIST:
				getRefList().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__DISPLAY_BACK_MATTER_CLASS:
				getDisplayBackMatterClass().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ATTRIB:
				getAttrib().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__PERMISSIONS:
				getPermissions().clear();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.BOXED_TEXT_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__POSITION:
				unsetPosition();
				return;
			case Jats1Package.BOXED_TEXT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.BOXED_TEXT_TYPE__ID_CLASS:
				return idClass != null && !idClass.isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__OBJECT_ID:
				return !getObjectId().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__SEC_META:
				return secMeta != null;
			case Jats1Package.BOXED_TEXT_TYPE__LABEL:
				return label != null;
			case Jats1Package.BOXED_TEXT_TYPE__CAPTION:
				return caption != null;
			case Jats1Package.BOXED_TEXT_TYPE__PARA_LEVEL:
				return paraLevel != null && !paraLevel.isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__BOXED_TEXT:
				return !getBoxedText().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__FIG:
				return !getFig().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__FIG_GROUP:
				return !getFigGroup().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__TABLE_WRAP_GROUP:
				return !getTableWrapGroup().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__P:
				return !getP().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__DISP_QUOTE:
				return !getDispQuote().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__SPEECH:
				return !getSpeech().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__STATEMENT:
				return !getStatement().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__SEC_CLASS:
				return secClass != null && !secClass.isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__SEC:
				return !getSec().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__SEC_BACK_CLASS:
				return secBackClass != null && !secBackClass.isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__FN_GROUP:
				return !getFnGroup().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__GLOSSARY:
				return !getGlossary().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__REF_LIST:
				return !getRefList().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__DISPLAY_BACK_MATTER_CLASS:
				return displayBackMatterClass != null && !displayBackMatterClass.isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__ATTRIB:
				return !getAttrib().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__PERMISSIONS:
				return !getPermissions().isEmpty();
			case Jats1Package.BOXED_TEXT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.BOXED_TEXT_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.BOXED_TEXT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.BOXED_TEXT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.BOXED_TEXT_TYPE__ORIENTATION:
				return isSetOrientation();
			case Jats1Package.BOXED_TEXT_TYPE__POSITION:
				return isSetPosition();
			case Jats1Package.BOXED_TEXT_TYPE__SPECIFIC_USE:
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
		result.append(", paraLevel: ");
		result.append(paraLevel);
		result.append(", secClass: ");
		result.append(secClass);
		result.append(", secBackClass: ");
		result.append(secBackClass);
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

} //BoxedTextTypeImpl
