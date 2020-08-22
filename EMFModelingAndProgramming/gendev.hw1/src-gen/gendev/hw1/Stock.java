/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Stock#getAvailableStockCount <em>Available Stock Count</em>}</li>
 *   <li>{@link gendev.hw1.Stock#isIsEmptyStock <em>Is Empty Stock</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getStock()
 * @model
 * @generated
 */
public interface Stock extends EObject {
	/**
	 * Returns the value of the '<em><b>Available Stock Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Stock Count</em>' attribute.
	 * @see #setAvailableStockCount(int)
	 * @see gendev.hw1.Hw1Package#getStock_AvailableStockCount()
	 * @model
	 * @generated
	 */
	int getAvailableStockCount();

	/**
	 * Sets the value of the '{@link gendev.hw1.Stock#getAvailableStockCount <em>Available Stock Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Stock Count</em>' attribute.
	 * @see #getAvailableStockCount()
	 * @generated
	 */
	void setAvailableStockCount(int value);

	/**
	 * Returns the value of the '<em><b>Is Empty Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Empty Stock</em>' attribute.
	 * @see #setIsEmptyStock(boolean)
	 * @see gendev.hw1.Hw1Package#getStock_IsEmptyStock()
	 * @model
	 * @generated
	 */
	boolean isIsEmptyStock();

	/**
	 * Sets the value of the '{@link gendev.hw1.Stock#isIsEmptyStock <em>Is Empty Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Empty Stock</em>' attribute.
	 * @see #isIsEmptyStock()
	 * @generated
	 */
	void setIsEmptyStock(boolean value);

} // Stock
