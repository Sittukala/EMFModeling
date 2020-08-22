/**
 */
package gendev.hw1.impl;

import gendev.hw1.BloodBank;
import gendev.hw1.BloodDonor;
import gendev.hw1.BloodReceiver;
import gendev.hw1.DirectRegistration;
import gendev.hw1.Hospital;
import gendev.hw1.Hw1Factory;
import gendev.hw1.Hw1Package;
import gendev.hw1.OnlineRegistration;
import gendev.hw1.PrivateHospital;
import gendev.hw1.RegistrationUsers;
import gendev.hw1.Stock;
import gendev.hw1.Users;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1PackageImpl extends EPackageImpl implements Hw1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bloodDonorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bloodReceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationUsersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlineRegistrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directRegistrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bloodBankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateHospitalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gendev.hw1.Hw1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hw1PackageImpl() {
		super(eNS_URI, Hw1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Hw1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Hw1Package init() {
		if (isInited)
			return (Hw1Package) EPackage.Registry.INSTANCE.getEPackage(Hw1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredHw1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Hw1PackageImpl theHw1Package = registeredHw1Package instanceof Hw1PackageImpl
				? (Hw1PackageImpl) registeredHw1Package
				: new Hw1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHw1Package.createPackageContents();

		// Initialize created meta-data
		theHw1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHw1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hw1Package.eNS_URI, theHw1Package);
		return theHw1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsers() {
		return usersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsers_Name() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsers_Address() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsers_BloodGroup() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsers_Age() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsers_Contact() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsers_Registrations() {
		return (EReference) usersEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBloodDonor() {
		return bloodDonorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBloodDonor_IsEligible() {
		return (EAttribute) bloodDonorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBloodReceiver() {
		return bloodReceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBloodReceiver_ReceiverID() {
		return (EAttribute) bloodReceiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegistrationUsers() {
		return registrationUsersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegistrationUsers_Usename() {
		return (EAttribute) registrationUsersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegistrationUsers_User() {
		return (EReference) registrationUsersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegistrationUsers_Bloodbank() {
		return (EReference) registrationUsersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegistrationUsers_RegisterDate() {
		return (EAttribute) registrationUsersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOnlineRegistration() {
		return onlineRegistrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnlineRegistration_UserId() {
		return (EAttribute) onlineRegistrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectRegistration() {
		return directRegistrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDirectRegistration_RegId() {
		return (EAttribute) directRegistrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBloodBank() {
		return bloodBankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBloodBank_Name() {
		return (EAttribute) bloodBankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBloodBank_Address() {
		return (EAttribute) bloodBankEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBloodBank_Hospital() {
		return (EReference) bloodBankEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBloodBank_Registrationusers() {
		return (EReference) bloodBankEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBloodBank_Stocks() {
		return (EReference) bloodBankEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospital() {
		return hospitalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHospital_Name() {
		return (EAttribute) hospitalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHospital_Address() {
		return (EAttribute) hospitalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHospital_Bloodbank() {
		return (EReference) hospitalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivateHospital() {
		return privateHospitalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateHospital_TrackLocation() {
		return (EAttribute) privateHospitalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStock() {
		return stockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStock_AvailableStockCount() {
		return (EAttribute) stockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStock_IsEmptyStock() {
		return (EAttribute) stockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hw1Factory getHw1Factory() {
		return (Hw1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		usersEClass = createEClass(USERS);
		createEAttribute(usersEClass, USERS__NAME);
		createEAttribute(usersEClass, USERS__ADDRESS);
		createEAttribute(usersEClass, USERS__BLOOD_GROUP);
		createEAttribute(usersEClass, USERS__AGE);
		createEAttribute(usersEClass, USERS__CONTACT);
		createEReference(usersEClass, USERS__REGISTRATIONS);

		bloodDonorEClass = createEClass(BLOOD_DONOR);
		createEAttribute(bloodDonorEClass, BLOOD_DONOR__IS_ELIGIBLE);

		bloodReceiverEClass = createEClass(BLOOD_RECEIVER);
		createEAttribute(bloodReceiverEClass, BLOOD_RECEIVER__RECEIVER_ID);

		registrationUsersEClass = createEClass(REGISTRATION_USERS);
		createEAttribute(registrationUsersEClass, REGISTRATION_USERS__USENAME);
		createEReference(registrationUsersEClass, REGISTRATION_USERS__USER);
		createEReference(registrationUsersEClass, REGISTRATION_USERS__BLOODBANK);
		createEAttribute(registrationUsersEClass, REGISTRATION_USERS__REGISTER_DATE);

		onlineRegistrationEClass = createEClass(ONLINE_REGISTRATION);
		createEAttribute(onlineRegistrationEClass, ONLINE_REGISTRATION__USER_ID);

		directRegistrationEClass = createEClass(DIRECT_REGISTRATION);
		createEAttribute(directRegistrationEClass, DIRECT_REGISTRATION__REG_ID);

		bloodBankEClass = createEClass(BLOOD_BANK);
		createEAttribute(bloodBankEClass, BLOOD_BANK__NAME);
		createEAttribute(bloodBankEClass, BLOOD_BANK__ADDRESS);
		createEReference(bloodBankEClass, BLOOD_BANK__HOSPITAL);
		createEReference(bloodBankEClass, BLOOD_BANK__REGISTRATIONUSERS);
		createEReference(bloodBankEClass, BLOOD_BANK__STOCKS);

		hospitalEClass = createEClass(HOSPITAL);
		createEAttribute(hospitalEClass, HOSPITAL__NAME);
		createEAttribute(hospitalEClass, HOSPITAL__ADDRESS);
		createEReference(hospitalEClass, HOSPITAL__BLOODBANK);

		privateHospitalEClass = createEClass(PRIVATE_HOSPITAL);
		createEAttribute(privateHospitalEClass, PRIVATE_HOSPITAL__TRACK_LOCATION);

		stockEClass = createEClass(STOCK);
		createEAttribute(stockEClass, STOCK__AVAILABLE_STOCK_COUNT);
		createEAttribute(stockEClass, STOCK__IS_EMPTY_STOCK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bloodDonorEClass.getESuperTypes().add(this.getUsers());
		bloodReceiverEClass.getESuperTypes().add(this.getUsers());
		onlineRegistrationEClass.getESuperTypes().add(this.getRegistrationUsers());
		directRegistrationEClass.getESuperTypes().add(this.getRegistrationUsers());
		privateHospitalEClass.getESuperTypes().add(this.getHospital());

		// Initialize classes, features, and operations; add parameters
		initEClass(usersEClass, Users.class, "Users", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsers_Name(), ecorePackage.getEString(), "name", null, 0, 1, Users.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsers_Address(), ecorePackage.getEString(), "address", null, 0, 1, Users.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsers_BloodGroup(), ecorePackage.getEString(), "bloodGroup", null, 0, 1, Users.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsers_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Users.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsers_Contact(), ecorePackage.getEInt(), "contact", null, 0, 1, Users.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsers_Registrations(), this.getRegistrationUsers(), this.getRegistrationUsers_User(),
				"registrations", null, 0, -1, Users.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bloodDonorEClass, BloodDonor.class, "BloodDonor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBloodDonor_IsEligible(), ecorePackage.getEBoolean(), "isEligible", null, 0, 1,
				BloodDonor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(bloodReceiverEClass, BloodReceiver.class, "BloodReceiver", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBloodReceiver_ReceiverID(), ecorePackage.getEString(), "receiverID", null, 0, 1,
				BloodReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(registrationUsersEClass, RegistrationUsers.class, "RegistrationUsers", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistrationUsers_Usename(), ecorePackage.getEString(), "usename", null, 0, 1,
				RegistrationUsers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRegistrationUsers_User(), this.getUsers(), this.getUsers_Registrations(), "user", null, 0, 1,
				RegistrationUsers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistrationUsers_Bloodbank(), this.getBloodBank(), this.getBloodBank_Registrationusers(),
				"bloodbank", null, 0, 1, RegistrationUsers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrationUsers_RegisterDate(), ecorePackage.getEDate(), "registerDate", null, 0, 1,
				RegistrationUsers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(onlineRegistrationEClass, OnlineRegistration.class, "OnlineRegistration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnlineRegistration_UserId(), ecorePackage.getEString(), "userId", null, 0, 1,
				OnlineRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(directRegistrationEClass, DirectRegistration.class, "DirectRegistration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectRegistration_RegId(), ecorePackage.getEString(), "RegId", null, 0, 1,
				DirectRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(bloodBankEClass, BloodBank.class, "BloodBank", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBloodBank_Name(), ecorePackage.getEString(), "name", null, 0, 1, BloodBank.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBloodBank_Address(), ecorePackage.getEString(), "address", null, 0, 1, BloodBank.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBloodBank_Hospital(), this.getHospital(), this.getHospital_Bloodbank(), "hospital", null, 0,
				-1, BloodBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBloodBank_Registrationusers(), this.getRegistrationUsers(),
				this.getRegistrationUsers_Bloodbank(), "registrationusers", null, 0, -1, BloodBank.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBloodBank_Stocks(), this.getStock(), null, "stocks", null, 3, 8, BloodBank.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hospitalEClass, Hospital.class, "Hospital", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHospital_Name(), ecorePackage.getEString(), "name", null, 0, 1, Hospital.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHospital_Address(), ecorePackage.getEString(), "address", null, 0, 1, Hospital.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospital_Bloodbank(), this.getBloodBank(), this.getBloodBank_Hospital(), "bloodbank", null, 3,
				5, Hospital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privateHospitalEClass, PrivateHospital.class, "PrivateHospital", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivateHospital_TrackLocation(), ecorePackage.getEString(), "trackLocation", null, 0, 1,
				PrivateHospital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stockEClass, Stock.class, "Stock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStock_AvailableStockCount(), ecorePackage.getEInt(), "AvailableStockCount", null, 0, 1,
				Stock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStock_IsEmptyStock(), ecorePackage.getEBoolean(), "isEmptyStock", null, 0, 1, Stock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Hw1PackageImpl
