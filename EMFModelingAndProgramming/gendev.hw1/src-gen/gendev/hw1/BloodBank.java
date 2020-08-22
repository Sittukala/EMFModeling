/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blood Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.BloodBank#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.BloodBank#getAddress <em>Address</em>}</li>
 *   <li>{@link gendev.hw1.BloodBank#getHospital <em>Hospital</em>}</li>
 *   <li>{@link gendev.hw1.BloodBank#getRegistrationusers <em>Registrationusers</em>}</li>
 *   <li>{@link gendev.hw1.BloodBank#getStocks <em>Stocks</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getBloodBank()
 * @model
 * @generated
 */
public interface BloodBank extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getBloodBank_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.BloodBank#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see gendev.hw1.Hw1Package#getBloodBank_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link gendev.hw1.BloodBank#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Hospital</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Hospital}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Hospital#getBloodbank <em>Bloodbank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospital</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getBloodBank_Hospital()
	 * @see gendev.hw1.Hospital#getBloodbank
	 * @model opposite="bloodbank"
	 * @generated
	 */
	EList<Hospital> getHospital();

	/**
	 * Returns the value of the '<em><b>Registrationusers</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.RegistrationUsers}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.RegistrationUsers#getBloodbank <em>Bloodbank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrationusers</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getBloodBank_Registrationusers()
	 * @see gendev.hw1.RegistrationUsers#getBloodbank
	 * @model opposite="bloodbank"
	 * @generated
	 */
	EList<RegistrationUsers> getRegistrationusers();

	/**
	 * Returns the value of the '<em><b>Stocks</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Stock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stocks</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getBloodBank_Stocks()
	 * @model containment="true" lower="3" upper="8"
	 * @generated
	 */
	EList<Stock> getStocks();

} // BloodBank
