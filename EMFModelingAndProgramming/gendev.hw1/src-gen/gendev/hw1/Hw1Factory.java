/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public interface Hw1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Factory eINSTANCE = gendev.hw1.impl.Hw1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Users</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Users</em>'.
	 * @generated
	 */
	Users createUsers();

	/**
	 * Returns a new object of class '<em>Blood Donor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blood Donor</em>'.
	 * @generated
	 */
	BloodDonor createBloodDonor();

	/**
	 * Returns a new object of class '<em>Blood Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blood Receiver</em>'.
	 * @generated
	 */
	BloodReceiver createBloodReceiver();

	/**
	 * Returns a new object of class '<em>Online Registration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Online Registration</em>'.
	 * @generated
	 */
	OnlineRegistration createOnlineRegistration();

	/**
	 * Returns a new object of class '<em>Direct Registration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Registration</em>'.
	 * @generated
	 */
	DirectRegistration createDirectRegistration();

	/**
	 * Returns a new object of class '<em>Blood Bank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blood Bank</em>'.
	 * @generated
	 */
	BloodBank createBloodBank();

	/**
	 * Returns a new object of class '<em>Hospital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital</em>'.
	 * @generated
	 */
	Hospital createHospital();

	/**
	 * Returns a new object of class '<em>Private Hospital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Hospital</em>'.
	 * @generated
	 */
	PrivateHospital createPrivateHospital();

	/**
	 * Returns a new object of class '<em>Stock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stock</em>'.
	 * @generated
	 */
	Stock createStock();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Hw1Package getHw1Package();

} //Hw1Factory
