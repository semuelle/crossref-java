/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AddressType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.BodyType;
import gov.nih.nlm.ncbi.jats1.BoxedTextType;
import gov.nih.nlm.ncbi.jats1.ChemStructWrapType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.DefListType;
import gov.nih.nlm.ncbi.jats1.DispFormulaGroupType;
import gov.nih.nlm.ncbi.jats1.DispFormulaType;
import gov.nih.nlm.ncbi.jats1.DispQuoteType;
import gov.nih.nlm.ncbi.jats1.FigGroupType;
import gov.nih.nlm.ncbi.jats1.FigType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.ListType;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.PType;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.RelatedArticleType;
import gov.nih.nlm.ncbi.jats1.RelatedObjectType;
import gov.nih.nlm.ncbi.jats1.SecType;
import gov.nih.nlm.ncbi.jats1.SigBlockType;
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
 * An implementation of the model object '<em><b>Body Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getParaLevel <em>Para Level</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getDispFormula <em>Disp Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getDispFormulaGroup <em>Disp Formula Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getDispQuote <em>Disp Quote</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getVerseGroup <em>Verse Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getSecClass <em>Sec Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getSigBlock <em>Sig Block</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.BodyTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyTypeImpl extends MinimalEObjectImpl.Container implements BodyType {
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
	 * The cached value of the '{@link #getSigBlock() <em>Sig Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigBlock()
	 * @generated
	 * @ordered
	 */
	protected SigBlockType sigBlock;

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
	protected BodyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getBodyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getParaLevel() {
		if (paraLevel == null) {
			paraLevel = new BasicFeatureMap(this, Jats1Package.BODY_TYPE__PARA_LEVEL);
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
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxedTextType> getBoxedText() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_BoxedText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigType> getFig() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Fig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigGroupType> getFigGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_FigGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_TableWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapGroupType> getTableWrapGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_TableWrapGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaType> getDispFormula() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_DispFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispFormulaGroupType> getDispFormulaGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_DispFormulaGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PType> getP() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DispQuoteType> getDispQuote() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_DispQuote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpeechType> getSpeech() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Speech());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementType> getStatement() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_Statement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerseGroupType> getVerseGroup() {
		return getParaLevel().list(Jats1Package.eINSTANCE.getBodyType_VerseGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSecClass() {
		if (secClass == null) {
			secClass = new BasicFeatureMap(this, Jats1Package.BODY_TYPE__SEC_CLASS);
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
		return getSecClass().list(Jats1Package.eINSTANCE.getBodyType_Sec());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SigBlockType getSigBlock() {
		return sigBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSigBlock(SigBlockType newSigBlock, NotificationChain msgs) {
		SigBlockType oldSigBlock = sigBlock;
		sigBlock = newSigBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.BODY_TYPE__SIG_BLOCK, oldSigBlock, newSigBlock);
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
	public void setSigBlock(SigBlockType newSigBlock) {
		if (newSigBlock != sigBlock) {
			NotificationChain msgs = null;
			if (sigBlock != null)
				msgs = ((InternalEObject)sigBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BODY_TYPE__SIG_BLOCK, null, msgs);
			if (newSigBlock != null)
				msgs = ((InternalEObject)newSigBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.BODY_TYPE__SIG_BLOCK, null, msgs);
			msgs = basicSetSigBlock(newSigBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BODY_TYPE__SIG_BLOCK, newSigBlock, newSigBlock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BODY_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BODY_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.BODY_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.BODY_TYPE__PARA_LEVEL:
				return ((InternalEList<?>)getParaLevel()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__BOXED_TEXT:
				return ((InternalEList<?>)getBoxedText()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__FIG:
				return ((InternalEList<?>)getFig()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__FIG_GROUP:
				return ((InternalEList<?>)getFigGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__TABLE_WRAP_GROUP:
				return ((InternalEList<?>)getTableWrapGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__DISP_FORMULA:
				return ((InternalEList<?>)getDispFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__DISP_FORMULA_GROUP:
				return ((InternalEList<?>)getDispFormulaGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__DISP_QUOTE:
				return ((InternalEList<?>)getDispQuote()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__VERSE_GROUP:
				return ((InternalEList<?>)getVerseGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__SEC_CLASS:
				return ((InternalEList<?>)getSecClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__SEC:
				return ((InternalEList<?>)getSec()).basicRemove(otherEnd, msgs);
			case Jats1Package.BODY_TYPE__SIG_BLOCK:
				return basicSetSigBlock(null, msgs);
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
			case Jats1Package.BODY_TYPE__PARA_LEVEL:
				if (coreType) return getParaLevel();
				return ((FeatureMap.Internal)getParaLevel()).getWrapper();
			case Jats1Package.BODY_TYPE__ADDRESS:
				return getAddress();
			case Jats1Package.BODY_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.BODY_TYPE__ARRAY:
				return getArray();
			case Jats1Package.BODY_TYPE__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.BODY_TYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.BODY_TYPE__CODE:
				return getCode();
			case Jats1Package.BODY_TYPE__FIG:
				return getFig();
			case Jats1Package.BODY_TYPE__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.BODY_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.BODY_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.BODY_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.BODY_TYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.BODY_TYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.BODY_TYPE__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.BODY_TYPE__DISP_FORMULA:
				return getDispFormula();
			case Jats1Package.BODY_TYPE__DISP_FORMULA_GROUP:
				return getDispFormulaGroup();
			case Jats1Package.BODY_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.BODY_TYPE__LIST:
				return getList();
			case Jats1Package.BODY_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.BODY_TYPE__MATH:
				return getMath();
			case Jats1Package.BODY_TYPE__P:
				return getP();
			case Jats1Package.BODY_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.BODY_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.BODY_TYPE__DISP_QUOTE:
				return getDispQuote();
			case Jats1Package.BODY_TYPE__SPEECH:
				return getSpeech();
			case Jats1Package.BODY_TYPE__STATEMENT:
				return getStatement();
			case Jats1Package.BODY_TYPE__VERSE_GROUP:
				return getVerseGroup();
			case Jats1Package.BODY_TYPE__SEC_CLASS:
				if (coreType) return getSecClass();
				return ((FeatureMap.Internal)getSecClass()).getWrapper();
			case Jats1Package.BODY_TYPE__SEC:
				return getSec();
			case Jats1Package.BODY_TYPE__SIG_BLOCK:
				return getSigBlock();
			case Jats1Package.BODY_TYPE__BASE:
				return getBase();
			case Jats1Package.BODY_TYPE__ID:
				return getId();
			case Jats1Package.BODY_TYPE__SPECIFIC_USE:
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
			case Jats1Package.BODY_TYPE__PARA_LEVEL:
				((FeatureMap.Internal)getParaLevel()).set(newValue);
				return;
			case Jats1Package.BODY_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				getBoxedText().addAll((Collection<? extends BoxedTextType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__FIG:
				getFig().clear();
				getFig().addAll((Collection<? extends FigType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__FIG_GROUP:
				getFigGroup().clear();
				getFigGroup().addAll((Collection<? extends FigGroupType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				getTableWrapGroup().addAll((Collection<? extends TableWrapGroupType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				getDispFormula().addAll((Collection<? extends DispFormulaType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				getDispFormulaGroup().addAll((Collection<? extends DispFormulaGroupType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				getDispQuote().addAll((Collection<? extends DispQuoteType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends StatementType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				getVerseGroup().addAll((Collection<? extends VerseGroupType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__SEC_CLASS:
				((FeatureMap.Internal)getSecClass()).set(newValue);
				return;
			case Jats1Package.BODY_TYPE__SEC:
				getSec().clear();
				getSec().addAll((Collection<? extends SecType>)newValue);
				return;
			case Jats1Package.BODY_TYPE__SIG_BLOCK:
				setSigBlock((SigBlockType)newValue);
				return;
			case Jats1Package.BODY_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.BODY_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.BODY_TYPE__SPECIFIC_USE:
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
			case Jats1Package.BODY_TYPE__PARA_LEVEL:
				getParaLevel().clear();
				return;
			case Jats1Package.BODY_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case Jats1Package.BODY_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.BODY_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.BODY_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				return;
			case Jats1Package.BODY_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.BODY_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.BODY_TYPE__FIG:
				getFig().clear();
				return;
			case Jats1Package.BODY_TYPE__FIG_GROUP:
				getFigGroup().clear();
				return;
			case Jats1Package.BODY_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.BODY_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.BODY_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.BODY_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.BODY_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.BODY_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				return;
			case Jats1Package.BODY_TYPE__DISP_FORMULA:
				getDispFormula().clear();
				return;
			case Jats1Package.BODY_TYPE__DISP_FORMULA_GROUP:
				getDispFormulaGroup().clear();
				return;
			case Jats1Package.BODY_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.BODY_TYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.BODY_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.BODY_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.BODY_TYPE__P:
				getP().clear();
				return;
			case Jats1Package.BODY_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.BODY_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.BODY_TYPE__DISP_QUOTE:
				getDispQuote().clear();
				return;
			case Jats1Package.BODY_TYPE__SPEECH:
				getSpeech().clear();
				return;
			case Jats1Package.BODY_TYPE__STATEMENT:
				getStatement().clear();
				return;
			case Jats1Package.BODY_TYPE__VERSE_GROUP:
				getVerseGroup().clear();
				return;
			case Jats1Package.BODY_TYPE__SEC_CLASS:
				getSecClass().clear();
				return;
			case Jats1Package.BODY_TYPE__SEC:
				getSec().clear();
				return;
			case Jats1Package.BODY_TYPE__SIG_BLOCK:
				setSigBlock((SigBlockType)null);
				return;
			case Jats1Package.BODY_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.BODY_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.BODY_TYPE__SPECIFIC_USE:
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
			case Jats1Package.BODY_TYPE__PARA_LEVEL:
				return paraLevel != null && !paraLevel.isEmpty();
			case Jats1Package.BODY_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case Jats1Package.BODY_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.BODY_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.BODY_TYPE__BOXED_TEXT:
				return !getBoxedText().isEmpty();
			case Jats1Package.BODY_TYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.BODY_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.BODY_TYPE__FIG:
				return !getFig().isEmpty();
			case Jats1Package.BODY_TYPE__FIG_GROUP:
				return !getFigGroup().isEmpty();
			case Jats1Package.BODY_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.BODY_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.BODY_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.BODY_TYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.BODY_TYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.BODY_TYPE__TABLE_WRAP_GROUP:
				return !getTableWrapGroup().isEmpty();
			case Jats1Package.BODY_TYPE__DISP_FORMULA:
				return !getDispFormula().isEmpty();
			case Jats1Package.BODY_TYPE__DISP_FORMULA_GROUP:
				return !getDispFormulaGroup().isEmpty();
			case Jats1Package.BODY_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.BODY_TYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.BODY_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.BODY_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.BODY_TYPE__P:
				return !getP().isEmpty();
			case Jats1Package.BODY_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.BODY_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.BODY_TYPE__DISP_QUOTE:
				return !getDispQuote().isEmpty();
			case Jats1Package.BODY_TYPE__SPEECH:
				return !getSpeech().isEmpty();
			case Jats1Package.BODY_TYPE__STATEMENT:
				return !getStatement().isEmpty();
			case Jats1Package.BODY_TYPE__VERSE_GROUP:
				return !getVerseGroup().isEmpty();
			case Jats1Package.BODY_TYPE__SEC_CLASS:
				return secClass != null && !secClass.isEmpty();
			case Jats1Package.BODY_TYPE__SEC:
				return !getSec().isEmpty();
			case Jats1Package.BODY_TYPE__SIG_BLOCK:
				return sigBlock != null;
			case Jats1Package.BODY_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.BODY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.BODY_TYPE__SPECIFIC_USE:
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
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //BodyTypeImpl
