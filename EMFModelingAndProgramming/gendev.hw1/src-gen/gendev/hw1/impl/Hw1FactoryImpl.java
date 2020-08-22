/**
 */
package gendev.hw1.impl;

import gendev.hw1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1FactoryImpl extends EFactoryImpl implements Hw1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Hw1Factory init() {
		try {
			Hw1Factory theHw1Factory = (Hw1Factory) EPackage.Registry.INSTANCE.getEFactory(Hw1Package.eNS_URI);
			if (theHw1Factory != null) {
				return theHw1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Hw1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Hw1Package.USERS:
			return createUsers();
		case Hw1Package.BLOOD_DONOR:
			return createBloodDonor();
		case Hw1Package.BLOOD_RECEIVER:
			return createBloodReceiver();
		case Hw1Package.ONLINE_REGISTRATION:
			return createOnlineRegistration();
		case Hw1Package.DIRECT_REGISTRATION:
			return createDirectRegistration();
		case Hw1Package.BLOOD_BANK:
			return createBloodBank();
		case Hw1Package.HOSPITAL:
			return createHospital();
		case Hw1Package.PRIVATE_HOSPITAL:
			return createPrivateHospital();
		case Hw1Package.STOCK:
			return createStock();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Users createUsers() {
		UsersImpl users = new UsersImpl();
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BloodDonor createBloodDonor() {
		BloodDonorImpl bloodDonor = new BloodDonorImpl();
		return bloodDonor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BloodReceiver createBloodReceiver() {
		BloodReceiverImpl bloodReceiver = new BloodReceiverImpl();
		return bloodReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnlineRegistration createOnlineRegistration() {
		OnlineRegistrationImpl onlineRegistration = new OnlineRegistrationImpl();
		return onlineRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectRegistration createDirectRegistration() {
		DirectRegistrationImpl directRegistration = new DirectRegistrationImpl();
		return directRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BloodBank createBloodBank() {
		BloodBankImpl bloodBank = new BloodBankImpl();
		return bloodBank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hospital createHospital() {
		HospitalImpl hospital = new HospitalImpl();
		return hospital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateHospital createPrivateHospital() {
		PrivateHospitalImpl privateHospital = new PrivateHospitalImpl();
		return privateHospital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stock createStock() {
		StockImpl stock = new StockImpl();
		return stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hw1Package getHw1Package() {
		return (Hw1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Hw1Package getPackage() {
		return Hw1Package.eINSTANCE;
	}

} //Hw1FactoryImpl
