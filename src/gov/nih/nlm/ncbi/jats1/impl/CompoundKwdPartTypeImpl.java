/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.CompoundKwdPartType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.InlineFormulaType;
import gov.nih.nlm.ncbi.jats1.InlineGraphicType;
import gov.nih.nlm.ncbi.jats1.InlineMediaType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PrivateCharType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.TargetType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.XrefType;

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
 * An implementation of the model object '<em><b>Compound Kwd Part Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getCompoundKwdPartElements <em>Compound Kwd Part Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CompoundKwdPartTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundKwdPartTypeImpl extends MinimalEObjectImpl.Container implements CompoundKwdPartType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundKwdPartTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getCompoundKwdPartType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.COMPOUND_KWD_PART_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCompoundKwdPartElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getCompoundKwdPartType_CompoundKwdPartElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getCompoundKwdPartElements().list(Jats1Package.eINSTANCE.getCompoundKwdPartType_Sup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_PART_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_PART_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COMPOUND_KWD_PART_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__COMPOUND_KWD_PART_ELEMENTS:
				return ((InternalEList<?>)getCompoundKwdPartElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__COMPOUND_KWD_PART_ELEMENTS:
				if (coreType) return getCompoundKwdPartElements();
				return ((FeatureMap.Internal)getCompoundKwdPartElements()).getWrapper();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__BOLD:
				return getBold();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SC:
				return getSc();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__RUBY:
				return getRuby();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FN:
				return getFn();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__TARGET:
				return getTarget();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__XREF:
				return getXref();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUB:
				return getSub();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUP:
				return getSup();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__BASE:
				return getBase();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ID:
				return getId();
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
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__COMPOUND_KWD_PART_ELEMENTS:
				((FeatureMap.Internal)getCompoundKwdPartElements()).set(newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ID:
				setId((String)newValue);
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
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__COMPOUND_KWD_PART_ELEMENTS:
				getCompoundKwdPartElements().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__COMPOUND_KWD_PART_ELEMENTS:
				return !getCompoundKwdPartElements().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.COMPOUND_KWD_PART_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.COMPOUND_KWD_PART_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", base: ");
		result.append(base);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CompoundKwdPartTypeImpl
