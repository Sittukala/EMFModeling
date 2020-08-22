/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hw1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Hw1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hw1Switch<Adapter> modelSwitch = new Hw1Switch<Adapter>() {
		@Override
		public Adapter caseUsers(Users object) {
			return createUsersAdapter();
		}

		@Override
		public Adapter caseBloodDonor(BloodDonor object) {
			return createBloodDonorAdapter();
		}

		@Override
		public Adapter caseBloodReceiver(BloodReceiver object) {
			return createBloodReceiverAdapter();
		}

		@Override
		public Adapter caseRegistrationUsers(RegistrationUsers object) {
			return createRegistrationUsersAdapter();
		}

		@Override
		public Adapter caseOnlineRegistration(OnlineRegistration object) {
			return createOnlineRegistrationAdapter();
		}

		@Override
		public Adapter caseDirectRegistration(DirectRegistration object) {
			return createDirectRegistrationAdapter();
		}

		@Override
		public Adapter caseBloodBank(BloodBank object) {
			return createBloodBankAdapter();
		}

		@Override
		public Adapter caseHospital(Hospital object) {
			return createHospitalAdapter();
		}

		@Override
		public Adapter casePrivateHospital(PrivateHospital object) {
			return createPrivateHospitalAdapter();
		}

		@Override
		public Adapter caseStock(Stock object) {
			return createStockAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Users <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Users
	 * @generated
	 */
	public Adapter createUsersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.BloodDonor <em>Blood Donor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.BloodDonor
	 * @generated
	 */
	public Adapter createBloodDonorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.BloodReceiver <em>Blood Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.BloodReceiver
	 * @generated
	 */
	public Adapter createBloodReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.RegistrationUsers <em>Registration Users</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.RegistrationUsers
	 * @generated
	 */
	public Adapter createRegistrationUsersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.OnlineRegistration <em>Online Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.OnlineRegistration
	 * @generated
	 */
	public Adapter createOnlineRegistrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.DirectRegistration <em>Direct Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.DirectRegistration
	 * @generated
	 */
	public Adapter createDirectRegistrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.BloodBank <em>Blood Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.BloodBank
	 * @generated
	 */
	public Adapter createBloodBankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Hospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Hospital
	 * @generated
	 */
	public Adapter createHospitalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.PrivateHospital <em>Private Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.PrivateHospital
	 * @generated
	 */
	public Adapter createPrivateHospitalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Stock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Stock
	 * @generated
	 */
	public Adapter createStockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Hw1AdapterFactory
