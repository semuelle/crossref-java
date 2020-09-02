/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.BioType;
import gov.nih.nlm.ncbi.jats1.BoxedTextType;
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
import gov.nih.nlm.ncbi.jats1.PType;
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
import gov.nih.nlm.ncbi.jats1.TitleType;
import gov.nih.nlm.ncbi.jats1.VerseGroupType;

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

import org.w3._1998.math.math.ml.MathType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bio Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getSecMeta <em>Sec Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getParaLevel <em>Para Level</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getSecClass <em>Sec Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getSecBackClass <em>Sec Back Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getFnGroup <em>Fn Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getRefList <em>Ref List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getRid <em>Rid</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BioTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BioTypeImpl extends MinimalEObjectImpl.Container implements BioType {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	 * The default value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected String title1 = TITLE1_EDEFAULT;

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
	protected BioTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getBioType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__SEC_META, oldSecMeta, newSecMeta);
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
				msgs = ((InternalEObject)secMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BIO_TYPE__SEC_META, null, msgs);
			if (newSecMeta != null)
				msgs = ((InternalEObject)newSecMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BIO_TYPE__SEC_META, null, msgs);
			msgs = basicSetSecMeta(newSecMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__SEC_META, newSecMeta, newSecMeta));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BIO_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BIO_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__TITLE, oldTitle, newTitle);
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
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BIO_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BIO_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getParaLevel() {
		if (paraLevel == null) {
			paraLevel = new BasicFeatureMap(this, Jats1Package.BIO_TYPE__PARA_LEVEL);
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
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxedTextType> getBoxedText() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_BoxedText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigType> getFig() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Fig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigGroupType> getFigGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_FigGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_TableWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapGroupType> getTableWrapGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_TableWrapGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PType> getP() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispQuoteType> getDispQuote() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_DispQuote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechType> getSpeech() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Speech());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementType> getStatement() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_Statement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBioType_VerseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSecClass() {
		if (secClass == null) {
			secClass = new BasicFeatureMap(this, Jats1Package.BIO_TYPE__SEC_CLASS);
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
		return getSecClass().list(Jats1Package.eINSTANCE.getBioType_Sec());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSecBackClass() {
		if (secBackClass == null) {
			secBackClass = new BasicFeatureMap(this, Jats1Package.BIO_TYPE__SEC_BACK_CLASS);
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
		return getSecBackClass().list(Jats1Package.eINSTANCE.getBioType_FnGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryType> getGlossary() {
		return getSecBackClass().list(Jats1Package.eINSTANCE.getBioType_Glossary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefListType> getRefList() {
		return getSecBackClass().list(Jats1Package.eINSTANCE.getBioType_RefList());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.BIO_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__RID, oldRid, rid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.BIO_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle1() {
		return title1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle1(String newTitle1) {
		String oldTitle1 = title1;
		title1 = newTitle1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__TITLE1, oldTitle1, title1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BIO_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.BIO_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case Jats1Package.BIO_TYPE__SEC_META:
				return basicSetSecMeta(null, msgs);
			case Jats1Package.BIO_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.BIO_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case Jats1Package.BIO_TYPE__PARA_LEVEL:
				return ((InternalEList<?>)getParaLevel()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__BOXED_TEXT:
				return ((InternalEList<?>)getBoxedText()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__FIG:
				return ((InternalEList<?>)getFig()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__FIG_GROUP:
				return ((InternalEList<?>)getFigGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__TABLE_WRAP_GROUP:
				return ((InternalEList<?>)getTableWrapGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__DISP_QUOTE:
				return ((InternalEList<?>)getDispQuote()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__VERSE_GROUP:
				return ((InternalEList<?>)getVerseGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__SEC_CLASS:
				return ((InternalEList<?>)getSecClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__SEC:
				return ((InternalEList<?>)getSec()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__SEC_BACK_CLASS:
				return ((InternalEList<?>)getSecBackClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__FN_GROUP:
				return ((InternalEList<?>)getFnGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__GLOSSARY:
				return ((InternalEList<?>)getGlossary()).basicRemove(otherEnd, msgs);
			case Jats1Package.BIO_TYPE__REF_LIST:
				return ((InternalEList<?>)getRefList()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.BIO_TYPE__SEC_META:
				return getSecMeta();
			case Jats1Package.BIO_TYPE__LABEL:
				return getLabel();
			case Jats1Package.BIO_TYPE__TITLE:
				return getTitle();
			case Jats1Package.BIO_TYPE__PARA_LEVEL:
				if (coreType) return getParaLevel();
				return ((FeatureMap.Internal)getParaLevel()).getWrapper();
			case Jats1Package.BIO_TYPE__ADDRESS:
				return getAddress();
			case Jats1Package.BIO_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.BIO_TYPE__ARRAY:
				return getArray();
			case Jats1Package.BIO_TYPE__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.BIO_TYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.BIO_TYPE__CODE:
				return getCode();
			case Jats1Package.BIO_TYPE__FIG:
				return getFig();
			case Jats1Package.BIO_TYPE__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.BIO_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.BIO_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.BIO_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.BIO_TYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.BIO_TYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.BIO_TYPE__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.BIO_TYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.BIO_TYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.BIO_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.BIO_TYPE__LIST:
				return getList();
			case Jats1Package.BIO_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.BIO_TYPE__MATH:
				return getMath();
			case Jats1Package.BIO_TYPE__P:
				return getP();
			case Jats1Package.BIO_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.BIO_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.BIO_TYPE__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.BIO_TYPE__SPEECH:
				return getSpeech();
			case Jats1Package.BIO_TYPE__STATEMENT:
				return getStatement();
			case Jats1Package.BIO_TYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.BIO_TYPE__SEC_CLASS:
				if (coreType) return getSecClass();
				return ((FeatureMap.Internal)getSecClass()).getWrapper();
			case Jats1Package.BIO_TYPE__SEC:
				return getSec();
			case Jats1Package.BIO_TYPE__SEC_BACK_CLASS:
				if (coreType) return getSecBackClass();
				return ((FeatureMap.Internal)getSecBackClass()).getWrapper();
			case Jats1Package.BIO_TYPE__FN_GROUP:
				return getFnGroup();
			case Jats1Package.BIO_TYPE__GLOSSARY:
				return getGlossary();
			case Jats1Package.BIO_TYPE__REF_LIST:
				return getRefList();
			case Jats1Package.BIO_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.BIO_TYPE__BASE:
				return getBase();
			case Jats1Package.BIO_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.BIO_TYPE__HREF:
				return getHref();
			case Jats1Package.BIO_TYPE__ID:
				return getId();
			case Jats1Package.BIO_TYPE__LANG:
				return getLang();
			case Jats1Package.BIO_TYPE__RID:
				return getRid();
			case Jats1Package.BIO_TYPE__ROLE:
				return getRole();
			case Jats1Package.BIO_TYPE__SHOW:
				return getShow();
			case Jats1Package.BIO_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.BIO_TYPE__TITLE1:
				return getTitle1();
			case Jats1Package.BIO_TYPE__TYPE:
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
			case Jats1Package.BIO_TYPE__SEC_META:
				setSecMeta((SecMetaType)newValue);
				return;
			case Jats1Package.BIO_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.BIO_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case Jats1Package.BIO_TYPE__PARA_LEVEL:
				((FeatureMap.Internal)getParaLevel()).set(newValue);
				return;
			case Jats1Package.BIO_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				getBoxedText().addAll((Collection<? extends BoxedTextType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__FIG:
				getFig().clear();
				getFig().addAll((Collection<? extends FigType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__FIG_GROUP:
				getFigGroup().clear();
				getFigGroup().addAll((Collection<? extends FigGroupType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				getTableWrapGroup().addAll((Collection<? extends TableWrapGroupType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				getDispQuote().addAll((Collection<? extends DispQuoteType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends StatementType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__SEC_CLASS:
				((FeatureMap.Internal)getSecClass()).set(newValue);
				return;
			case Jats1Package.BIO_TYPE__SEC:
				getSec().clear();
				getSec().addAll((Collection<? extends SecType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__SEC_BACK_CLASS:
				((FeatureMap.Internal)getSecBackClass()).set(newValue);
				return;
			case Jats1Package.BIO_TYPE__FN_GROUP:
				getFnGroup().clear();
				getFnGroup().addAll((Collection<? extends FnGroupType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__GLOSSARY:
				getGlossary().clear();
				getGlossary().addAll((Collection<? extends GlossaryType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__REF_LIST:
				getRefList().clear();
				getRefList().addAll((Collection<? extends RefListType>)newValue);
				return;
			case Jats1Package.BIO_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.BIO_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.BIO_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.BIO_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.BIO_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.BIO_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.BIO_TYPE__RID:
				setRid((List<String>)newValue);
				return;
			case Jats1Package.BIO_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case Jats1Package.BIO_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.BIO_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.BIO_TYPE__TITLE1:
				setTitle1((String)newValue);
				return;
			case Jats1Package.BIO_TYPE__TYPE:
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
			case Jats1Package.BIO_TYPE__SEC_META:
				setSecMeta((SecMetaType)null);
				return;
			case Jats1Package.BIO_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.BIO_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case Jats1Package.BIO_TYPE__PARA_LEVEL:
				getParaLevel().clear();
				return;
			case Jats1Package.BIO_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.BIO_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.BIO_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.BIO_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				return;
			case Jats1Package.BIO_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.BIO_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.BIO_TYPE__FIG:
				getFig().clear();
				return;
			case Jats1Package.BIO_TYPE__FIG_GROUP:
				getFigGroup().clear();
				return;
			case Jats1Package.BIO_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.BIO_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.BIO_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.BIO_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.BIO_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.BIO_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				return;
			case Jats1Package.BIO_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.BIO_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.BIO_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.BIO_TYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.BIO_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.BIO_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.BIO_TYPE__P:
				getP().clear();
				return;
			case Jats1Package.BIO_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.BIO_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.BIO_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				return;
			case Jats1Package.BIO_TYPE__SPEECH:
				getSpeech().clear();
				return;
			case Jats1Package.BIO_TYPE__STATEMENT:
				getStatement().clear();
				return;
			case Jats1Package.BIO_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.BIO_TYPE__SEC_CLASS:
				getSecClass().clear();
				return;
			case Jats1Package.BIO_TYPE__SEC:
				getSec().clear();
				return;
			case Jats1Package.BIO_TYPE__SEC_BACK_CLASS:
				getSecBackClass().clear();
				return;
			case Jats1Package.BIO_TYPE__FN_GROUP:
				getFnGroup().clear();
				return;
			case Jats1Package.BIO_TYPE__GLOSSARY:
				getGlossary().clear();
				return;
			case Jats1Package.BIO_TYPE__REF_LIST:
				getRefList().clear();
				return;
			case Jats1Package.BIO_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.BIO_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.BIO_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.BIO_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.BIO_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.BIO_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.BIO_TYPE__RID:
				setRid(RID_EDEFAULT);
				return;
			case Jats1Package.BIO_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Jats1Package.BIO_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.BIO_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.BIO_TYPE__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case Jats1Package.BIO_TYPE__TYPE:
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
			case Jats1Package.BIO_TYPE__SEC_META:
				return secMeta != null;
			case Jats1Package.BIO_TYPE__LABEL:
				return label != null;
			case Jats1Package.BIO_TYPE__TITLE:
				return title != null;
			case Jats1Package.BIO_TYPE__PARA_LEVEL:
				return paraLevel != null && !paraLevel.isEmpty();
			case Jats1Package.BIO_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.BIO_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.BIO_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.BIO_TYPE__BOXED_TEXT:
				return !getBoxedText().isEmpty();
			case Jats1Package.BIO_TYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.BIO_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.BIO_TYPE__FIG:
				return !getFig().isEmpty();
			case Jats1Package.BIO_TYPE__FIG_GROUP:
				return !getFigGroup().isEmpty();
			case Jats1Package.BIO_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.BIO_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.BIO_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.BIO_TYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.BIO_TYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.BIO_TYPE__TABLE_WRAP_GROUP:
				return !getTableWrapGroup().isEmpty();
			case Jats1Package.BIO_TYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.BIO_TYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.BIO_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.BIO_TYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.BIO_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.BIO_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.BIO_TYPE__P:
				return !getP().isEmpty();
			case Jats1Package.BIO_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.BIO_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.BIO_TYPE__DISP_QUOTE:
				return !getDispQuote().isEmpty();
			case Jats1Package.BIO_TYPE__SPEECH:
				return !getSpeech().isEmpty();
			case Jats1Package.BIO_TYPE__STATEMENT:
				return !getStatement().isEmpty();
			case Jats1Package.BIO_TYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.BIO_TYPE__SEC_CLASS:
				return secClass != null && !secClass.isEmpty();
			case Jats1Package.BIO_TYPE__SEC:
				return !getSec().isEmpty();
			case Jats1Package.BIO_TYPE__SEC_BACK_CLASS:
				return secBackClass != null && !secBackClass.isEmpty();
			case Jats1Package.BIO_TYPE__FN_GROUP:
				return !getFnGroup().isEmpty();
			case Jats1Package.BIO_TYPE__GLOSSARY:
				return !getGlossary().isEmpty();
			case Jats1Package.BIO_TYPE__REF_LIST:
				return !getRefList().isEmpty();
			case Jats1Package.BIO_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.BIO_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.BIO_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.BIO_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.BIO_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.BIO_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.BIO_TYPE__RID:
				return RID_EDEFAULT == null ? rid != null : !RID_EDEFAULT.equals(rid);
			case Jats1Package.BIO_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Jats1Package.BIO_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.BIO_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.BIO_TYPE__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case Jats1Package.BIO_TYPE__TYPE:
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
		result.append(" (paraLevel: ");
		result.append(paraLevel);
		result.append(", secClass: ");
		result.append(secClass);
		result.append(", secBackClass: ");
		result.append(secBackClass);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", rid: ");
		result.append(rid);
		result.append(", role: ");
		result.append(role);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", title1: ");
		result.append(title1);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BioTypeImpl
