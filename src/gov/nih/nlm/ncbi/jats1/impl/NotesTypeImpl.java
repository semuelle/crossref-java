/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
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
import gov.nih.nlm.ncbi.jats1.NotesType;
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
 * An implementation of the model object '<em><b>Notes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getSecMeta <em>Sec Meta</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getParaLevel <em>Para Level</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getSecClass <em>Sec Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getSecBackClass <em>Sec Back Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getFnGroup <em>Fn Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getRefList <em>Ref List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getNotesType <em>Notes Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NotesTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotesTypeImpl extends MinimalEObjectImpl.Container implements NotesType {
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
	 * The default value of the '{@link #getNotesType() <em>Notes Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotesType()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotesType() <em>Notes Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotesType()
	 * @generated
	 * @ordered
	 */
	protected String notesType = NOTES_TYPE_EDEFAULT;

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
	protected NotesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getNotesType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__SEC_META, oldSecMeta, newSecMeta);
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
				msgs = ((InternalEObject)secMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NOTES_TYPE__SEC_META, null, msgs);
			if (newSecMeta != null)
				msgs = ((InternalEObject)newSecMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NOTES_TYPE__SEC_META, null, msgs);
			msgs = basicSetSecMeta(newSecMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__SEC_META, newSecMeta, newSecMeta));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NOTES_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NOTES_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NOTES_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NOTES_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getParaLevel() {
		if (paraLevel == null) {
			paraLevel = new BasicFeatureMap(this, Jats1Package.NOTES_TYPE__PARA_LEVEL);
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
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxedTextType> getBoxedText() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_BoxedText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigType> getFig() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Fig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigGroupType> getFigGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_FigGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_TableWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapGroupType> getTableWrapGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_TableWrapGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PType> getP() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispQuoteType> getDispQuote() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_DispQuote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechType> getSpeech() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Speech());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementType> getStatement() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_Statement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getNotesType_VerseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSecClass() {
		if (secClass == null) {
			secClass = new BasicFeatureMap(this, Jats1Package.NOTES_TYPE__SEC_CLASS);
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
		return getSecClass().list(Jats1Package.eINSTANCE.getNotesType_Sec());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSecBackClass() {
		if (secBackClass == null) {
			secBackClass = new BasicFeatureMap(this, Jats1Package.NOTES_TYPE__SEC_BACK_CLASS);
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
		return getSecBackClass().list(Jats1Package.eINSTANCE.getNotesType_FnGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryType> getGlossary() {
		return getSecBackClass().list(Jats1Package.eINSTANCE.getNotesType_Glossary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefListType> getRefList() {
		return getSecBackClass().list(Jats1Package.eINSTANCE.getNotesType_RefList());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotesType() {
		return notesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotesType(String newNotesType) {
		String oldNotesType = notesType;
		notesType = newNotesType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__NOTES_TYPE, oldNotesType, notesType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NOTES_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.NOTES_TYPE__SEC_META:
				return basicSetSecMeta(null, msgs);
			case Jats1Package.NOTES_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.NOTES_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case Jats1Package.NOTES_TYPE__PARA_LEVEL:
				return ((InternalEList<?>)getParaLevel()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__BOXED_TEXT:
				return ((InternalEList<?>)getBoxedText()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__FIG:
				return ((InternalEList<?>)getFig()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__FIG_GROUP:
				return ((InternalEList<?>)getFigGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__TABLE_WRAP_GROUP:
				return ((InternalEList<?>)getTableWrapGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__DISP_QUOTE:
				return ((InternalEList<?>)getDispQuote()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__VERSE_GROUP:
				return ((InternalEList<?>)getVerseGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__SEC_CLASS:
				return ((InternalEList<?>)getSecClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__SEC:
				return ((InternalEList<?>)getSec()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__SEC_BACK_CLASS:
				return ((InternalEList<?>)getSecBackClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__FN_GROUP:
				return ((InternalEList<?>)getFnGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__GLOSSARY:
				return ((InternalEList<?>)getGlossary()).basicRemove(otherEnd, msgs);
			case Jats1Package.NOTES_TYPE__REF_LIST:
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
			case Jats1Package.NOTES_TYPE__SEC_META:
				return getSecMeta();
			case Jats1Package.NOTES_TYPE__LABEL:
				return getLabel();
			case Jats1Package.NOTES_TYPE__TITLE:
				return getTitle();
			case Jats1Package.NOTES_TYPE__PARA_LEVEL:
				if (coreType) return getParaLevel();
				return ((FeatureMap.Internal)getParaLevel()).getWrapper();
			case Jats1Package.NOTES_TYPE__ADDRESS:
				return getAddress();
			case Jats1Package.NOTES_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.NOTES_TYPE__ARRAY:
				return getArray();
			case Jats1Package.NOTES_TYPE__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.NOTES_TYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.NOTES_TYPE__CODE:
				return getCode();
			case Jats1Package.NOTES_TYPE__FIG:
				return getFig();
			case Jats1Package.NOTES_TYPE__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.NOTES_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.NOTES_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.NOTES_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.NOTES_TYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.NOTES_TYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.NOTES_TYPE__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.NOTES_TYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.NOTES_TYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.NOTES_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.NOTES_TYPE__LIST:
				return getList();
			case Jats1Package.NOTES_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.NOTES_TYPE__MATH:
				return getMath();
			case Jats1Package.NOTES_TYPE__P:
				return getP();
			case Jats1Package.NOTES_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.NOTES_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.NOTES_TYPE__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.NOTES_TYPE__SPEECH:
				return getSpeech();
			case Jats1Package.NOTES_TYPE__STATEMENT:
				return getStatement();
			case Jats1Package.NOTES_TYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.NOTES_TYPE__SEC_CLASS:
				if (coreType) return getSecClass();
				return ((FeatureMap.Internal)getSecClass()).getWrapper();
			case Jats1Package.NOTES_TYPE__SEC:
				return getSec();
			case Jats1Package.NOTES_TYPE__SEC_BACK_CLASS:
				if (coreType) return getSecBackClass();
				return ((FeatureMap.Internal)getSecBackClass()).getWrapper();
			case Jats1Package.NOTES_TYPE__FN_GROUP:
				return getFnGroup();
			case Jats1Package.NOTES_TYPE__GLOSSARY:
				return getGlossary();
			case Jats1Package.NOTES_TYPE__REF_LIST:
				return getRefList();
			case Jats1Package.NOTES_TYPE__BASE:
				return getBase();
			case Jats1Package.NOTES_TYPE__ID:
				return getId();
			case Jats1Package.NOTES_TYPE__LANG:
				return getLang();
			case Jats1Package.NOTES_TYPE__NOTES_TYPE:
				return getNotesType();
			case Jats1Package.NOTES_TYPE__SPECIFIC_USE:
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
			case Jats1Package.NOTES_TYPE__SEC_META:
				setSecMeta((SecMetaType)newValue);
				return;
			case Jats1Package.NOTES_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.NOTES_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case Jats1Package.NOTES_TYPE__PARA_LEVEL:
				((FeatureMap.Internal)getParaLevel()).set(newValue);
				return;
			case Jats1Package.NOTES_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				getBoxedText().addAll((Collection<? extends BoxedTextType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__FIG:
				getFig().clear();
				getFig().addAll((Collection<? extends FigType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__FIG_GROUP:
				getFigGroup().clear();
				getFigGroup().addAll((Collection<? extends FigGroupType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				getTableWrapGroup().addAll((Collection<? extends TableWrapGroupType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				getDispQuote().addAll((Collection<? extends DispQuoteType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends StatementType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__SEC_CLASS:
				((FeatureMap.Internal)getSecClass()).set(newValue);
				return;
			case Jats1Package.NOTES_TYPE__SEC:
				getSec().clear();
				getSec().addAll((Collection<? extends SecType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__SEC_BACK_CLASS:
				((FeatureMap.Internal)getSecBackClass()).set(newValue);
				return;
			case Jats1Package.NOTES_TYPE__FN_GROUP:
				getFnGroup().clear();
				getFnGroup().addAll((Collection<? extends FnGroupType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__GLOSSARY:
				getGlossary().clear();
				getGlossary().addAll((Collection<? extends GlossaryType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__REF_LIST:
				getRefList().clear();
				getRefList().addAll((Collection<? extends RefListType>)newValue);
				return;
			case Jats1Package.NOTES_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.NOTES_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.NOTES_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.NOTES_TYPE__NOTES_TYPE:
				setNotesType((String)newValue);
				return;
			case Jats1Package.NOTES_TYPE__SPECIFIC_USE:
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
			case Jats1Package.NOTES_TYPE__SEC_META:
				setSecMeta((SecMetaType)null);
				return;
			case Jats1Package.NOTES_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.NOTES_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case Jats1Package.NOTES_TYPE__PARA_LEVEL:
				getParaLevel().clear();
				return;
			case Jats1Package.NOTES_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.NOTES_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.NOTES_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.NOTES_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				return;
			case Jats1Package.NOTES_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.NOTES_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.NOTES_TYPE__FIG:
				getFig().clear();
				return;
			case Jats1Package.NOTES_TYPE__FIG_GROUP:
				getFigGroup().clear();
				return;
			case Jats1Package.NOTES_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.NOTES_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.NOTES_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.NOTES_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.NOTES_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.NOTES_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				return;
			case Jats1Package.NOTES_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.NOTES_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.NOTES_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.NOTES_TYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.NOTES_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.NOTES_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.NOTES_TYPE__P:
				getP().clear();
				return;
			case Jats1Package.NOTES_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.NOTES_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.NOTES_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				return;
			case Jats1Package.NOTES_TYPE__SPEECH:
				getSpeech().clear();
				return;
			case Jats1Package.NOTES_TYPE__STATEMENT:
				getStatement().clear();
				return;
			case Jats1Package.NOTES_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.NOTES_TYPE__SEC_CLASS:
				getSecClass().clear();
				return;
			case Jats1Package.NOTES_TYPE__SEC:
				getSec().clear();
				return;
			case Jats1Package.NOTES_TYPE__SEC_BACK_CLASS:
				getSecBackClass().clear();
				return;
			case Jats1Package.NOTES_TYPE__FN_GROUP:
				getFnGroup().clear();
				return;
			case Jats1Package.NOTES_TYPE__GLOSSARY:
				getGlossary().clear();
				return;
			case Jats1Package.NOTES_TYPE__REF_LIST:
				getRefList().clear();
				return;
			case Jats1Package.NOTES_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.NOTES_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.NOTES_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.NOTES_TYPE__NOTES_TYPE:
				setNotesType(NOTES_TYPE_EDEFAULT);
				return;
			case Jats1Package.NOTES_TYPE__SPECIFIC_USE:
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
			case Jats1Package.NOTES_TYPE__SEC_META:
				return secMeta != null;
			case Jats1Package.NOTES_TYPE__LABEL:
				return label != null;
			case Jats1Package.NOTES_TYPE__TITLE:
				return title != null;
			case Jats1Package.NOTES_TYPE__PARA_LEVEL:
				return paraLevel != null && !paraLevel.isEmpty();
			case Jats1Package.NOTES_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.NOTES_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.NOTES_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.NOTES_TYPE__BOXED_TEXT:
				return !getBoxedText().isEmpty();
			case Jats1Package.NOTES_TYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.NOTES_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.NOTES_TYPE__FIG:
				return !getFig().isEmpty();
			case Jats1Package.NOTES_TYPE__FIG_GROUP:
				return !getFigGroup().isEmpty();
			case Jats1Package.NOTES_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.NOTES_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.NOTES_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.NOTES_TYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.NOTES_TYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.NOTES_TYPE__TABLE_WRAP_GROUP:
				return !getTableWrapGroup().isEmpty();
			case Jats1Package.NOTES_TYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.NOTES_TYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.NOTES_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.NOTES_TYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.NOTES_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.NOTES_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.NOTES_TYPE__P:
				return !getP().isEmpty();
			case Jats1Package.NOTES_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.NOTES_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.NOTES_TYPE__DISP_QUOTE:
				return !getDispQuote().isEmpty();
			case Jats1Package.NOTES_TYPE__SPEECH:
				return !getSpeech().isEmpty();
			case Jats1Package.NOTES_TYPE__STATEMENT:
				return !getStatement().isEmpty();
			case Jats1Package.NOTES_TYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.NOTES_TYPE__SEC_CLASS:
				return secClass != null && !secClass.isEmpty();
			case Jats1Package.NOTES_TYPE__SEC:
				return !getSec().isEmpty();
			case Jats1Package.NOTES_TYPE__SEC_BACK_CLASS:
				return secBackClass != null && !secBackClass.isEmpty();
			case Jats1Package.NOTES_TYPE__FN_GROUP:
				return !getFnGroup().isEmpty();
			case Jats1Package.NOTES_TYPE__GLOSSARY:
				return !getGlossary().isEmpty();
			case Jats1Package.NOTES_TYPE__REF_LIST:
				return !getRefList().isEmpty();
			case Jats1Package.NOTES_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.NOTES_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.NOTES_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.NOTES_TYPE__NOTES_TYPE:
				return NOTES_TYPE_EDEFAULT == null ? notesType != null : !NOTES_TYPE_EDEFAULT.equals(notesType);
			case Jats1Package.NOTES_TYPE__SPECIFIC_USE:
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
		result.append(" (paraLevel: ");
		result.append(paraLevel);
		result.append(", secClass: ");
		result.append(secClass);
		result.append(", secBackClass: ");
		result.append(secBackClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", notesType: ");
		result.append(notesType);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //NotesTypeImpl
