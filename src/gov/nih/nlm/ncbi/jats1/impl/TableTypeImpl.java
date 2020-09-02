/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.ColType;
import gov.nih.nlm.ncbi.jats1.ColgroupType;
import gov.nih.nlm.ncbi.jats1.FrameType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.RulesType;
import gov.nih.nlm.ncbi.jats1.TableType;
import gov.nih.nlm.ncbi.jats1.TbodyType;
import gov.nih.nlm.ncbi.jats1.TfootType;
import gov.nih.nlm.ncbi.jats1.TheadType;
import gov.nih.nlm.ncbi.jats1.TrType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getCol <em>Col</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getThead <em>Thead</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TableTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableTypeImpl extends MinimalEObjectImpl.Container implements TableType {
	/**
	 * The cached value of the '{@link #getCol() <em>Col</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected EList<ColType> col;

	/**
	 * The cached value of the '{@link #getColgroup() <em>Colgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColgroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ColgroupType> colgroup;

	/**
	 * The cached value of the '{@link #getThead() <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThead()
	 * @generated
	 * @ordered
	 */
	protected TheadType thead;

	/**
	 * The cached value of the '{@link #getTfoot() <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTfoot()
	 * @generated
	 * @ordered
	 */
	protected TfootType tfoot;

	/**
	 * The cached value of the '{@link #getTbody() <em>Tbody</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbody()
	 * @generated
	 * @ordered
	 */
	protected EList<TbodyType> tbody;

	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected EList<TrType> tr;

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
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected String border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellpadding() <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellpadding()
	 * @generated
	 * @ordered
	 */
	protected static final String CELLPADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellpadding() <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellpadding()
	 * @generated
	 * @ordered
	 */
	protected String cellpadding = CELLPADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellspacing() <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellspacing()
	 * @generated
	 * @ordered
	 */
	protected static final String CELLSPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellspacing() <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellspacing()
	 * @generated
	 * @ordered
	 */
	protected String cellspacing = CELLSPACING_EDEFAULT;

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
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final FrameType FRAME_EDEFAULT = FrameType.ABOVE;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected FrameType frame = FRAME_EDEFAULT;

	/**
	 * This is true if the Frame attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameESet;

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
	 * The default value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected static final RulesType RULES_EDEFAULT = RulesType.ALL;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected RulesType rules = RULES_EDEFAULT;

	/**
	 * This is true if the Rules attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rulesESet;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getTableType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColType> getCol() {
		if (col == null) {
			col = new EObjectContainmentEList<ColType>(ColType.class, this, Jats1Package.TABLE_TYPE__COL);
		}
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColgroupType> getColgroup() {
		if (colgroup == null) {
			colgroup = new EObjectContainmentEList<ColgroupType>(ColgroupType.class, this, Jats1Package.TABLE_TYPE__COLGROUP);
		}
		return colgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TheadType getThead() {
		return thead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThead(TheadType newThead, NotificationChain msgs) {
		TheadType oldThead = thead;
		thead = newThead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__THEAD, oldThead, newThead);
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
	public void setThead(TheadType newThead) {
		if (newThead != thead) {
			NotificationChain msgs = null;
			if (thead != null)
				msgs = ((InternalEObject)thead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_TYPE__THEAD, null, msgs);
			if (newThead != null)
				msgs = ((InternalEObject)newThead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_TYPE__THEAD, null, msgs);
			msgs = basicSetThead(newThead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__THEAD, newThead, newThead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TfootType getTfoot() {
		return tfoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTfoot(TfootType newTfoot, NotificationChain msgs) {
		TfootType oldTfoot = tfoot;
		tfoot = newTfoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__TFOOT, oldTfoot, newTfoot);
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
	public void setTfoot(TfootType newTfoot) {
		if (newTfoot != tfoot) {
			NotificationChain msgs = null;
			if (tfoot != null)
				msgs = ((InternalEObject)tfoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_TYPE__TFOOT, null, msgs);
			if (newTfoot != null)
				msgs = ((InternalEObject)newTfoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.TABLE_TYPE__TFOOT, null, msgs);
			msgs = basicSetTfoot(newTfoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__TFOOT, newTfoot, newTfoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TbodyType> getTbody() {
		if (tbody == null) {
			tbody = new EObjectContainmentEList<TbodyType>(TbodyType.class, this, Jats1Package.TABLE_TYPE__TBODY);
		}
		return tbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrType> getTr() {
		if (tr == null) {
			tr = new EObjectContainmentEList<TrType>(TrType.class, this, Jats1Package.TABLE_TYPE__TR);
		}
		return tr;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorder(String newBorder) {
		String oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCellpadding() {
		return cellpadding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellpadding(String newCellpadding) {
		String oldCellpadding = cellpadding;
		cellpadding = newCellpadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__CELLPADDING, oldCellpadding, cellpadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCellspacing() {
		return cellspacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellspacing(String newCellspacing) {
		String oldCellspacing = cellspacing;
		cellspacing = newCellspacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__CELLSPACING, oldCellspacing, cellspacing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameType getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrame(FrameType newFrame) {
		FrameType oldFrame = frame;
		frame = newFrame == null ? FRAME_EDEFAULT : newFrame;
		boolean oldFrameESet = frameESet;
		frameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__FRAME, oldFrame, frame, !oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFrame() {
		FrameType oldFrame = frame;
		boolean oldFrameESet = frameESet;
		frame = FRAME_EDEFAULT;
		frameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TABLE_TYPE__FRAME, oldFrame, FRAME_EDEFAULT, oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFrame() {
		return frameESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulesType getRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRules(RulesType newRules) {
		RulesType oldRules = rules;
		rules = newRules == null ? RULES_EDEFAULT : newRules;
		boolean oldRulesESet = rulesESet;
		rulesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__RULES, oldRules, rules, !oldRulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRules() {
		RulesType oldRules = rules;
		boolean oldRulesESet = rulesESet;
		rules = RULES_EDEFAULT;
		rulesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TABLE_TYPE__RULES, oldRules, RULES_EDEFAULT, oldRulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRules() {
		return rulesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TABLE_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.TABLE_TYPE__COL:
				return ((InternalEList<?>)getCol()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_TYPE__COLGROUP:
				return ((InternalEList<?>)getColgroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_TYPE__THEAD:
				return basicSetThead(null, msgs);
			case Jats1Package.TABLE_TYPE__TFOOT:
				return basicSetTfoot(null, msgs);
			case Jats1Package.TABLE_TYPE__TBODY:
				return ((InternalEList<?>)getTbody()).basicRemove(otherEnd, msgs);
			case Jats1Package.TABLE_TYPE__TR:
				return ((InternalEList<?>)getTr()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.TABLE_TYPE__COL:
				return getCol();
			case Jats1Package.TABLE_TYPE__COLGROUP:
				return getColgroup();
			case Jats1Package.TABLE_TYPE__THEAD:
				return getThead();
			case Jats1Package.TABLE_TYPE__TFOOT:
				return getTfoot();
			case Jats1Package.TABLE_TYPE__TBODY:
				return getTbody();
			case Jats1Package.TABLE_TYPE__TR:
				return getTr();
			case Jats1Package.TABLE_TYPE__BASE:
				return getBase();
			case Jats1Package.TABLE_TYPE__BORDER:
				return getBorder();
			case Jats1Package.TABLE_TYPE__CELLPADDING:
				return getCellpadding();
			case Jats1Package.TABLE_TYPE__CELLSPACING:
				return getCellspacing();
			case Jats1Package.TABLE_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.TABLE_TYPE__FRAME:
				return getFrame();
			case Jats1Package.TABLE_TYPE__ID:
				return getId();
			case Jats1Package.TABLE_TYPE__RULES:
				return getRules();
			case Jats1Package.TABLE_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.TABLE_TYPE__STYLE:
				return getStyle();
			case Jats1Package.TABLE_TYPE__SUMMARY:
				return getSummary();
			case Jats1Package.TABLE_TYPE__WIDTH:
				return getWidth();
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
			case Jats1Package.TABLE_TYPE__COL:
				getCol().clear();
				getCol().addAll((Collection<? extends ColType>)newValue);
				return;
			case Jats1Package.TABLE_TYPE__COLGROUP:
				getColgroup().clear();
				getColgroup().addAll((Collection<? extends ColgroupType>)newValue);
				return;
			case Jats1Package.TABLE_TYPE__THEAD:
				setThead((TheadType)newValue);
				return;
			case Jats1Package.TABLE_TYPE__TFOOT:
				setTfoot((TfootType)newValue);
				return;
			case Jats1Package.TABLE_TYPE__TBODY:
				getTbody().clear();
				getTbody().addAll((Collection<? extends TbodyType>)newValue);
				return;
			case Jats1Package.TABLE_TYPE__TR:
				getTr().clear();
				getTr().addAll((Collection<? extends TrType>)newValue);
				return;
			case Jats1Package.TABLE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.TABLE_TYPE__BORDER:
				setBorder((String)newValue);
				return;
			case Jats1Package.TABLE_TYPE__CELLPADDING:
				setCellpadding((String)newValue);
				return;
			case Jats1Package.TABLE_TYPE__CELLSPACING:
				setCellspacing((String)newValue);
				return;
			case Jats1Package.TABLE_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.TABLE_TYPE__FRAME:
				setFrame((FrameType)newValue);
				return;
			case Jats1Package.TABLE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.TABLE_TYPE__RULES:
				setRules((RulesType)newValue);
				return;
			case Jats1Package.TABLE_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.TABLE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case Jats1Package.TABLE_TYPE__SUMMARY:
				setSummary((String)newValue);
				return;
			case Jats1Package.TABLE_TYPE__WIDTH:
				setWidth((String)newValue);
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
			case Jats1Package.TABLE_TYPE__COL:
				getCol().clear();
				return;
			case Jats1Package.TABLE_TYPE__COLGROUP:
				getColgroup().clear();
				return;
			case Jats1Package.TABLE_TYPE__THEAD:
				setThead((TheadType)null);
				return;
			case Jats1Package.TABLE_TYPE__TFOOT:
				setTfoot((TfootType)null);
				return;
			case Jats1Package.TABLE_TYPE__TBODY:
				getTbody().clear();
				return;
			case Jats1Package.TABLE_TYPE__TR:
				getTr().clear();
				return;
			case Jats1Package.TABLE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.TABLE_TYPE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case Jats1Package.TABLE_TYPE__CELLPADDING:
				setCellpadding(CELLPADDING_EDEFAULT);
				return;
			case Jats1Package.TABLE_TYPE__CELLSPACING:
				setCellspacing(CELLSPACING_EDEFAULT);
				return;
			case Jats1Package.TABLE_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.TABLE_TYPE__FRAME:
				unsetFrame();
				return;
			case Jats1Package.TABLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.TABLE_TYPE__RULES:
				unsetRules();
				return;
			case Jats1Package.TABLE_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.TABLE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Jats1Package.TABLE_TYPE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case Jats1Package.TABLE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case Jats1Package.TABLE_TYPE__COL:
				return col != null && !col.isEmpty();
			case Jats1Package.TABLE_TYPE__COLGROUP:
				return colgroup != null && !colgroup.isEmpty();
			case Jats1Package.TABLE_TYPE__THEAD:
				return thead != null;
			case Jats1Package.TABLE_TYPE__TFOOT:
				return tfoot != null;
			case Jats1Package.TABLE_TYPE__TBODY:
				return tbody != null && !tbody.isEmpty();
			case Jats1Package.TABLE_TYPE__TR:
				return tr != null && !tr.isEmpty();
			case Jats1Package.TABLE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.TABLE_TYPE__BORDER:
				return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
			case Jats1Package.TABLE_TYPE__CELLPADDING:
				return CELLPADDING_EDEFAULT == null ? cellpadding != null : !CELLPADDING_EDEFAULT.equals(cellpadding);
			case Jats1Package.TABLE_TYPE__CELLSPACING:
				return CELLSPACING_EDEFAULT == null ? cellspacing != null : !CELLSPACING_EDEFAULT.equals(cellspacing);
			case Jats1Package.TABLE_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.TABLE_TYPE__FRAME:
				return isSetFrame();
			case Jats1Package.TABLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.TABLE_TYPE__RULES:
				return isSetRules();
			case Jats1Package.TABLE_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.TABLE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Jats1Package.TABLE_TYPE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case Jats1Package.TABLE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (base: ");
		result.append(base);
		result.append(", border: ");
		result.append(border);
		result.append(", cellpadding: ");
		result.append(cellpadding);
		result.append(", cellspacing: ");
		result.append(cellspacing);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", frame: ");
		if (frameESet) result.append(frame); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", rules: ");
		if (rulesESet) result.append(rules); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", style: ");
		result.append(style);
		result.append(", summary: ");
		result.append(summary);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //TableTypeImpl
