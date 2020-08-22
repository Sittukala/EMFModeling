/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hw1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Switch() {
		if (modelPackage == null) {
			modelPackage = Hw1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Hw1Package.USERS: {
			Users users = (Users) theEObject;
			T result = caseUsers(users);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.BLOOD_DONOR: {
			BloodDonor bloodDonor = (BloodDonor) theEObject;
			T result = caseBloodDonor(bloodDonor);
			if (result == null)
				result = caseUsers(bloodDonor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.BLOOD_RECEIVER: {
			BloodReceiver bloodReceiver = (BloodReceiver) theEObject;
			T result = caseBloodReceiver(bloodReceiver);
			if (result == null)
				result = caseUsers(bloodReceiver);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.REGISTRATION_USERS: {
			RegistrationUsers registrationUsers = (RegistrationUsers) theEObject;
			T result = caseRegistrationUsers(registrationUsers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.ONLINE_REGISTRATION: {
			OnlineRegistration onlineRegistration = (OnlineRegistration) theEObject;
			T result = caseOnlineRegistration(onlineRegistration);
			if (result == null)
				result = caseRegistrationUsers(onlineRegistration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.DIRECT_REGISTRATION: {
			DirectRegistration directRegistration = (DirectRegistration) theEObject;
			T result = caseDirectRegistration(directRegistration);
			if (result == null)
				result = caseRegistrationUsers(directRegistration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.BLOOD_BANK: {
			BloodBank bloodBank = (BloodBank) theEObject;
			T result = caseBloodBank(bloodBank);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.HOSPITAL: {
			Hospital hospital = (Hospital) theEObject;
			T result = caseHospital(hospital);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.PRIVATE_HOSPITAL: {
			PrivateHospital privateHospital = (PrivateHospital) theEObject;
			T result = casePrivateHospital(privateHospital);
			if (result == null)
				result = caseHospital(privateHospital);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Hw1Package.STOCK: {
			Stock stock = (Stock) theEObject;
			T result = caseStock(stock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Users</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Users</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsers(Users object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blood Donor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blood Donor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloodDonor(BloodDonor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blood Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blood Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloodReceiver(BloodReceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registration Users</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registration Users</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistrationUsers(RegistrationUsers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online Registration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online Registration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlineRegistration(OnlineRegistration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Registration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Registration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectRegistration(DirectRegistration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blood Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blood Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloodBank(BloodBank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospital(Hospital object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Hospital</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Hospital</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateHospital(PrivateHospital object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStock(Stock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Hw1Switch
