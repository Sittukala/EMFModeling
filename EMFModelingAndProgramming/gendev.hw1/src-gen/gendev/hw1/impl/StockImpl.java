/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.Stock;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.StockImpl#getAvailableStockCount <em>Available Stock Count</em>}</li>
 *   <li>{@link gendev.hw1.impl.StockImpl#isIsEmptyStock <em>Is Empty Stock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StockImpl extends MinimalEObjectImpl.Container implements Stock {
	/**
	 * The default value of the '{@link #getAvailableStockCount() <em>Available Stock Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableStockCount()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_STOCK_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableStockCount() <em>Available Stock Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableStockCount()
	 * @generated
	 * @ordered
	 */
	protected int availableStockCount = AVAILABLE_STOCK_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEmptyStock() <em>Is Empty Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmptyStock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EMPTY_STOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEmptyStock() <em>Is Empty Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmptyStock()
	 * @generated
	 * @ordered
	 */
	protected boolean isEmptyStock = IS_EMPTY_STOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.STOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAvailableStockCount() {
		return availableStockCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableStockCount(int newAvailableStockCount) {
		int oldAvailableStockCount = availableStockCount;
		availableStockCount = newAvailableStockCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.STOCK__AVAILABLE_STOCK_COUNT,
					oldAvailableStockCount, availableStockCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsEmptyStock() {
		return isEmptyStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEmptyStock(boolean newIsEmptyStock) {
		boolean oldIsEmptyStock = isEmptyStock;
		isEmptyStock = newIsEmptyStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.STOCK__IS_EMPTY_STOCK, oldIsEmptyStock,
					isEmptyStock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.STOCK__AVAILABLE_STOCK_COUNT:
			return getAvailableStockCount();
		case Hw1Package.STOCK__IS_EMPTY_STOCK:
			return isIsEmptyStock();
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
		case Hw1Package.STOCK__AVAILABLE_STOCK_COUNT:
			setAvailableStockCount((Integer) newValue);
			return;
		case Hw1Package.STOCK__IS_EMPTY_STOCK:
			setIsEmptyStock((Boolean) newValue);
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
		case Hw1Package.STOCK__AVAILABLE_STOCK_COUNT:
			setAvailableStockCount(AVAILABLE_STOCK_COUNT_EDEFAULT);
			return;
		case Hw1Package.STOCK__IS_EMPTY_STOCK:
			setIsEmptyStock(IS_EMPTY_STOCK_EDEFAULT);
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
		case Hw1Package.STOCK__AVAILABLE_STOCK_COUNT:
			return availableStockCount != AVAILABLE_STOCK_COUNT_EDEFAULT;
		case Hw1Package.STOCK__IS_EMPTY_STOCK:
			return isEmptyStock != IS_EMPTY_STOCK_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (AvailableStockCount: ");
		result.append(availableStockCount);
		result.append(", isEmptyStock: ");
		result.append(isEmptyStock);
		result.append(')');
		return result.toString();
	}

} //StockImpl
