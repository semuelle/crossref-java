/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.CountType;
import gov.nih.nlm.ncbi.jats1.CountsType;
import gov.nih.nlm.ncbi.jats1.EquationCountType;
import gov.nih.nlm.ncbi.jats1.FigCountType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.PageCountType;
import gov.nih.nlm.ncbi.jats1.RefCountType;
import gov.nih.nlm.ncbi.jats1.TableCountType;
import gov.nih.nlm.ncbi.jats1.WordCountType;

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
 * An implementation of the model object '<em><b>Counts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CountsTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CountsTypeImpl#getFigCount <em>Fig Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CountsTypeImpl#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CountsTypeImpl#getEquationCount <em>Equation Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CountsTypeImpl#getRefCount <em>Ref Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CountsTypeImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CountsTypeImpl#getWordCount <em>Word Count</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CountsTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CountsTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountsTypeImpl extends MinimalEObjectImpl.Container implements CountsType {
	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected EList<CountType> count;

	/**
	 * The cached value of the '{@link #getFigCount() <em>Fig Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigCount()
	 * @generated
	 * @ordered
	 */
	protected FigCountType figCount;

	/**
	 * The cached value of the '{@link #getTableCount() <em>Table Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCount()
	 * @generated
	 * @ordered
	 */
	protected TableCountType tableCount;

	/**
	 * The cached value of the '{@link #getEquationCount() <em>Equation Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquationCount()
	 * @generated
	 * @ordered
	 */
	protected EquationCountType equationCount;

	/**
	 * The cached value of the '{@link #getRefCount() <em>Ref Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefCount()
	 * @generated
	 * @ordered
	 */
	protected RefCountType refCount;

	/**
	 * The cached value of the '{@link #getPageCount() <em>Page Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageCount()
	 * @generated
	 * @ordered
	 */
	protected PageCountType pageCount;

	/**
	 * The cached value of the '{@link #getWordCount() <em>Word Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordCount()
	 * @generated
	 * @ordered
	 */
	protected WordCountType wordCount;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getCountsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CountType> getCount() {
		if (count == null) {
			count = new EObjectContainmentEList<CountType>(CountType.class, this, Jats1Package.COUNTS_TYPE__COUNT);
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigCountType getFigCount() {
		return figCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigCount(FigCountType newFigCount, NotificationChain msgs) {
		FigCountType oldFigCount = figCount;
		figCount = newFigCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__FIG_COUNT, oldFigCount, newFigCount);
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
	public void setFigCount(FigCountType newFigCount) {
		if (newFigCount != figCount) {
			NotificationChain msgs = null;
			if (figCount != null)
				msgs = ((InternalEObject)figCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__FIG_COUNT, null, msgs);
			if (newFigCount != null)
				msgs = ((InternalEObject)newFigCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__FIG_COUNT, null, msgs);
			msgs = basicSetFigCount(newFigCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__FIG_COUNT, newFigCount, newFigCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCountType getTableCount() {
		return tableCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableCount(TableCountType newTableCount, NotificationChain msgs) {
		TableCountType oldTableCount = tableCount;
		tableCount = newTableCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__TABLE_COUNT, oldTableCount, newTableCount);
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
	public void setTableCount(TableCountType newTableCount) {
		if (newTableCount != tableCount) {
			NotificationChain msgs = null;
			if (tableCount != null)
				msgs = ((InternalEObject)tableCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__TABLE_COUNT, null, msgs);
			if (newTableCount != null)
				msgs = ((InternalEObject)newTableCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__TABLE_COUNT, null, msgs);
			msgs = basicSetTableCount(newTableCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__TABLE_COUNT, newTableCount, newTableCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EquationCountType getEquationCount() {
		return equationCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquationCount(EquationCountType newEquationCount, NotificationChain msgs) {
		EquationCountType oldEquationCount = equationCount;
		equationCount = newEquationCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__EQUATION_COUNT, oldEquationCount, newEquationCount);
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
	public void setEquationCount(EquationCountType newEquationCount) {
		if (newEquationCount != equationCount) {
			NotificationChain msgs = null;
			if (equationCount != null)
				msgs = ((InternalEObject)equationCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__EQUATION_COUNT, null, msgs);
			if (newEquationCount != null)
				msgs = ((InternalEObject)newEquationCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__EQUATION_COUNT, null, msgs);
			msgs = basicSetEquationCount(newEquationCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__EQUATION_COUNT, newEquationCount, newEquationCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefCountType getRefCount() {
		return refCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefCount(RefCountType newRefCount, NotificationChain msgs) {
		RefCountType oldRefCount = refCount;
		refCount = newRefCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__REF_COUNT, oldRefCount, newRefCount);
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
	public void setRefCount(RefCountType newRefCount) {
		if (newRefCount != refCount) {
			NotificationChain msgs = null;
			if (refCount != null)
				msgs = ((InternalEObject)refCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__REF_COUNT, null, msgs);
			if (newRefCount != null)
				msgs = ((InternalEObject)newRefCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__REF_COUNT, null, msgs);
			msgs = basicSetRefCount(newRefCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__REF_COUNT, newRefCount, newRefCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageCountType getPageCount() {
		return pageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageCount(PageCountType newPageCount, NotificationChain msgs) {
		PageCountType oldPageCount = pageCount;
		pageCount = newPageCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__PAGE_COUNT, oldPageCount, newPageCount);
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
	public void setPageCount(PageCountType newPageCount) {
		if (newPageCount != pageCount) {
			NotificationChain msgs = null;
			if (pageCount != null)
				msgs = ((InternalEObject)pageCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__PAGE_COUNT, null, msgs);
			if (newPageCount != null)
				msgs = ((InternalEObject)newPageCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__PAGE_COUNT, null, msgs);
			msgs = basicSetPageCount(newPageCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__PAGE_COUNT, newPageCount, newPageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WordCountType getWordCount() {
		return wordCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWordCount(WordCountType newWordCount, NotificationChain msgs) {
		WordCountType oldWordCount = wordCount;
		wordCount = newWordCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__WORD_COUNT, oldWordCount, newWordCount);
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
	public void setWordCount(WordCountType newWordCount) {
		if (newWordCount != wordCount) {
			NotificationChain msgs = null;
			if (wordCount != null)
				msgs = ((InternalEObject)wordCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__WORD_COUNT, null, msgs);
			if (newWordCount != null)
				msgs = ((InternalEObject)newWordCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.COUNTS_TYPE__WORD_COUNT, null, msgs);
			msgs = basicSetWordCount(newWordCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__WORD_COUNT, newWordCount, newWordCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COUNTS_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.COUNTS_TYPE__COUNT:
				return ((InternalEList<?>)getCount()).basicRemove(otherEnd, msgs);
			case Jats1Package.COUNTS_TYPE__FIG_COUNT:
				return basicSetFigCount(null, msgs);
			case Jats1Package.COUNTS_TYPE__TABLE_COUNT:
				return basicSetTableCount(null, msgs);
			case Jats1Package.COUNTS_TYPE__EQUATION_COUNT:
				return basicSetEquationCount(null, msgs);
			case Jats1Package.COUNTS_TYPE__REF_COUNT:
				return basicSetRefCount(null, msgs);
			case Jats1Package.COUNTS_TYPE__PAGE_COUNT:
				return basicSetPageCount(null, msgs);
			case Jats1Package.COUNTS_TYPE__WORD_COUNT:
				return basicSetWordCount(null, msgs);
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
			case Jats1Package.COUNTS_TYPE__COUNT:
				return getCount();
			case Jats1Package.COUNTS_TYPE__FIG_COUNT:
				return getFigCount();
			case Jats1Package.COUNTS_TYPE__TABLE_COUNT:
				return getTableCount();
			case Jats1Package.COUNTS_TYPE__EQUATION_COUNT:
				return getEquationCount();
			case Jats1Package.COUNTS_TYPE__REF_COUNT:
				return getRefCount();
			case Jats1Package.COUNTS_TYPE__PAGE_COUNT:
				return getPageCount();
			case Jats1Package.COUNTS_TYPE__WORD_COUNT:
				return getWordCount();
			case Jats1Package.COUNTS_TYPE__BASE:
				return getBase();
			case Jats1Package.COUNTS_TYPE__ID:
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
			case Jats1Package.COUNTS_TYPE__COUNT:
				getCount().clear();
				getCount().addAll((Collection<? extends CountType>)newValue);
				return;
			case Jats1Package.COUNTS_TYPE__FIG_COUNT:
				setFigCount((FigCountType)newValue);
				return;
			case Jats1Package.COUNTS_TYPE__TABLE_COUNT:
				setTableCount((TableCountType)newValue);
				return;
			case Jats1Package.COUNTS_TYPE__EQUATION_COUNT:
				setEquationCount((EquationCountType)newValue);
				return;
			case Jats1Package.COUNTS_TYPE__REF_COUNT:
				setRefCount((RefCountType)newValue);
				return;
			case Jats1Package.COUNTS_TYPE__PAGE_COUNT:
				setPageCount((PageCountType)newValue);
				return;
			case Jats1Package.COUNTS_TYPE__WORD_COUNT:
				setWordCount((WordCountType)newValue);
				return;
			case Jats1Package.COUNTS_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.COUNTS_TYPE__ID:
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
			case Jats1Package.COUNTS_TYPE__COUNT:
				getCount().clear();
				return;
			case Jats1Package.COUNTS_TYPE__FIG_COUNT:
				setFigCount((FigCountType)null);
				return;
			case Jats1Package.COUNTS_TYPE__TABLE_COUNT:
				setTableCount((TableCountType)null);
				return;
			case Jats1Package.COUNTS_TYPE__EQUATION_COUNT:
				setEquationCount((EquationCountType)null);
				return;
			case Jats1Package.COUNTS_TYPE__REF_COUNT:
				setRefCount((RefCountType)null);
				return;
			case Jats1Package.COUNTS_TYPE__PAGE_COUNT:
				setPageCount((PageCountType)null);
				return;
			case Jats1Package.COUNTS_TYPE__WORD_COUNT:
				setWordCount((WordCountType)null);
				return;
			case Jats1Package.COUNTS_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.COUNTS_TYPE__ID:
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
			case Jats1Package.COUNTS_TYPE__COUNT:
				return count != null && !count.isEmpty();
			case Jats1Package.COUNTS_TYPE__FIG_COUNT:
				return figCount != null;
			case Jats1Package.COUNTS_TYPE__TABLE_COUNT:
				return tableCount != null;
			case Jats1Package.COUNTS_TYPE__EQUATION_COUNT:
				return equationCount != null;
			case Jats1Package.COUNTS_TYPE__REF_COUNT:
				return refCount != null;
			case Jats1Package.COUNTS_TYPE__PAGE_COUNT:
				return pageCount != null;
			case Jats1Package.COUNTS_TYPE__WORD_COUNT:
				return wordCount != null;
			case Jats1Package.COUNTS_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.COUNTS_TYPE__ID:
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
		result.append(" (base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CountsTypeImpl
