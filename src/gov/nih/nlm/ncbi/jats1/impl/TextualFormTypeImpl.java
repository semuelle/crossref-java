/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
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
import gov.nih.nlm.ncbi.jats1.TexMathType;
import gov.nih.nlm.ncbi.jats1.TextualFormType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;

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
 * An implementation of the model object '<em><b>Textual Form Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getTextualFormElements <em>Textual Form Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TextualFormTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextualFormTypeImpl extends MinimalEObjectImpl.Container implements TextualFormType {
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
	protected TextualFormTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getTextualFormType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.TEXTUAL_FORM_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTextualFormElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getTextualFormType_TextualFormElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getTextualFormElements().list(Jats1Package.eINSTANCE.getTextualFormType_Sup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TEXTUAL_FORM_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TEXTUAL_FORM_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TEXTUAL_FORM_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TEXTUAL_FORM_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.TEXTUAL_FORM_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__TEXTUAL_FORM_ELEMENTS:
				return ((InternalEList<?>)getTextualFormElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.TEXTUAL_FORM_TYPE__SUP:
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
			case Jats1Package.TEXTUAL_FORM_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.TEXTUAL_FORM_TYPE__TEXTUAL_FORM_ELEMENTS:
				if (coreType) return getTextualFormElements();
				return ((FeatureMap.Internal)getTextualFormElements()).getWrapper();
			case Jats1Package.TEXTUAL_FORM_TYPE__BOLD:
				return getBold();
			case Jats1Package.TEXTUAL_FORM_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.TEXTUAL_FORM_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.TEXTUAL_FORM_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.TEXTUAL_FORM_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.TEXTUAL_FORM_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.TEXTUAL_FORM_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.TEXTUAL_FORM_TYPE__SC:
				return getSc();
			case Jats1Package.TEXTUAL_FORM_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.TEXTUAL_FORM_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.TEXTUAL_FORM_TYPE__RUBY:
				return getRuby();
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.TEXTUAL_FORM_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.TEXTUAL_FORM_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.TEXTUAL_FORM_TYPE__MATH:
				return getMath();
			case Jats1Package.TEXTUAL_FORM_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.TEXTUAL_FORM_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.TEXTUAL_FORM_TYPE__SUB:
				return getSub();
			case Jats1Package.TEXTUAL_FORM_TYPE__SUP:
				return getSup();
			case Jats1Package.TEXTUAL_FORM_TYPE__BASE:
				return getBase();
			case Jats1Package.TEXTUAL_FORM_TYPE__ID:
				return getId();
			case Jats1Package.TEXTUAL_FORM_TYPE__LANG:
				return getLang();
			case Jats1Package.TEXTUAL_FORM_TYPE__SPECIFIC_USE:
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
			case Jats1Package.TEXTUAL_FORM_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__TEXTUAL_FORM_ELEMENTS:
				((FeatureMap.Internal)getTextualFormElements()).set(newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SPECIFIC_USE:
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
			case Jats1Package.TEXTUAL_FORM_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__TEXTUAL_FORM_ELEMENTS:
				getTextualFormElements().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.TEXTUAL_FORM_TYPE__SPECIFIC_USE:
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
			case Jats1Package.TEXTUAL_FORM_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__TEXTUAL_FORM_ELEMENTS:
				return !getTextualFormElements().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.TEXTUAL_FORM_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.TEXTUAL_FORM_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.TEXTUAL_FORM_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.TEXTUAL_FORM_TYPE__SPECIFIC_USE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //TextualFormTypeImpl
