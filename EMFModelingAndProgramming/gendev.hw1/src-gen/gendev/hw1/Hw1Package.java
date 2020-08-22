/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Factory
 * @model kind="package"
 * @generated
 */
public interface Hw1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hw1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hw1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hw1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Package eINSTANCE = gendev.hw1.impl.Hw1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.UsersImpl <em>Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.UsersImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getUsers()
	 * @generated
	 */
	int USERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Blood Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__BLOOD_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__AGE = 3;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__CONTACT = 4;

	/**
	 * The feature id for the '<em><b>Registrations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__REGISTRATIONS = 5;

	/**
	 * The number of structural features of the '<em>Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.BloodDonorImpl <em>Blood Donor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.BloodDonorImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getBloodDonor()
	 * @generated
	 */
	int BLOOD_DONOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_DONOR__NAME = USERS__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_DONOR__ADDRESS = USERS__ADDRESS;

	/**
	 * The feature id for the '<em><b>Blood Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_DONOR__BLOOD_GROUP = USERS__BLOOD_GROUP;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_DONOR__AGE = USERS__AGE;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_DONOR__CONTACT = USERS__CONTACT;

	/**
	 * The feature id for the '<em><b>Registrations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_DONOR__REGISTRATIONS = USERS__REGISTRATIONS;

	/**
	 * The feature id for the '<em><b>Is Eligible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_DONOR__IS_ELIGIBLE = USERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blood Donor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_DONOR_FEATURE_COUNT = USERS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blood Donor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_DONOR_OPERATION_COUNT = USERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.BloodReceiverImpl <em>Blood Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.BloodReceiverImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getBloodReceiver()
	 * @generated
	 */
	int BLOOD_RECEIVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_RECEIVER__NAME = USERS__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_RECEIVER__ADDRESS = USERS__ADDRESS;

	/**
	 * The feature id for the '<em><b>Blood Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_RECEIVER__BLOOD_GROUP = USERS__BLOOD_GROUP;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_RECEIVER__AGE = USERS__AGE;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_RECEIVER__CONTACT = USERS__CONTACT;

	/**
	 * The feature id for the '<em><b>Registrations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_RECEIVER__REGISTRATIONS = USERS__REGISTRATIONS;

	/**
	 * The feature id for the '<em><b>Receiver ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_RECEIVER__RECEIVER_ID = USERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blood Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_RECEIVER_FEATURE_COUNT = USERS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blood Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_RECEIVER_OPERATION_COUNT = USERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.RegistrationUsersImpl <em>Registration Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.RegistrationUsersImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getRegistrationUsers()
	 * @generated
	 */
	int REGISTRATION_USERS = 3;

	/**
	 * The feature id for the '<em><b>Usename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_USERS__USENAME = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_USERS__USER = 1;

	/**
	 * The feature id for the '<em><b>Bloodbank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_USERS__BLOODBANK = 2;

	/**
	 * The feature id for the '<em><b>Register Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_USERS__REGISTER_DATE = 3;

	/**
	 * The number of structural features of the '<em>Registration Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_USERS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Registration Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_USERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.OnlineRegistrationImpl <em>Online Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.OnlineRegistrationImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getOnlineRegistration()
	 * @generated
	 */
	int ONLINE_REGISTRATION = 4;

	/**
	 * The feature id for the '<em><b>Usename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_REGISTRATION__USENAME = REGISTRATION_USERS__USENAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_REGISTRATION__USER = REGISTRATION_USERS__USER;

	/**
	 * The feature id for the '<em><b>Bloodbank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_REGISTRATION__BLOODBANK = REGISTRATION_USERS__BLOODBANK;

	/**
	 * The feature id for the '<em><b>Register Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_REGISTRATION__REGISTER_DATE = REGISTRATION_USERS__REGISTER_DATE;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_REGISTRATION__USER_ID = REGISTRATION_USERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Online Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_REGISTRATION_FEATURE_COUNT = REGISTRATION_USERS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Online Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_REGISTRATION_OPERATION_COUNT = REGISTRATION_USERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.DirectRegistrationImpl <em>Direct Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.DirectRegistrationImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getDirectRegistration()
	 * @generated
	 */
	int DIRECT_REGISTRATION = 5;

	/**
	 * The feature id for the '<em><b>Usename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REGISTRATION__USENAME = REGISTRATION_USERS__USENAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REGISTRATION__USER = REGISTRATION_USERS__USER;

	/**
	 * The feature id for the '<em><b>Bloodbank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REGISTRATION__BLOODBANK = REGISTRATION_USERS__BLOODBANK;

	/**
	 * The feature id for the '<em><b>Register Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REGISTRATION__REGISTER_DATE = REGISTRATION_USERS__REGISTER_DATE;

	/**
	 * The feature id for the '<em><b>Reg Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REGISTRATION__REG_ID = REGISTRATION_USERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direct Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REGISTRATION_FEATURE_COUNT = REGISTRATION_USERS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Direct Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REGISTRATION_OPERATION_COUNT = REGISTRATION_USERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.BloodBankImpl <em>Blood Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.BloodBankImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getBloodBank()
	 * @generated
	 */
	int BLOOD_BANK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_BANK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_BANK__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Hospital</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_BANK__HOSPITAL = 2;

	/**
	 * The feature id for the '<em><b>Registrationusers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_BANK__REGISTRATIONUSERS = 3;

	/**
	 * The feature id for the '<em><b>Stocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_BANK__STOCKS = 4;

	/**
	 * The number of structural features of the '<em>Blood Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_BANK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Blood Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOOD_BANK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.HospitalImpl <em>Hospital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.HospitalImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getHospital()
	 * @generated
	 */
	int HOSPITAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Bloodbank</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__BLOODBANK = 2;

	/**
	 * The number of structural features of the '<em>Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PrivateHospitalImpl <em>Private Hospital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PrivateHospitalImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPrivateHospital()
	 * @generated
	 */
	int PRIVATE_HOSPITAL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_HOSPITAL__NAME = HOSPITAL__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_HOSPITAL__ADDRESS = HOSPITAL__ADDRESS;

	/**
	 * The feature id for the '<em><b>Bloodbank</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_HOSPITAL__BLOODBANK = HOSPITAL__BLOODBANK;

	/**
	 * The feature id for the '<em><b>Track Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_HOSPITAL__TRACK_LOCATION = HOSPITAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Private Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_HOSPITAL_FEATURE_COUNT = HOSPITAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Private Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_HOSPITAL_OPERATION_COUNT = HOSPITAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.StockImpl <em>Stock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.StockImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getStock()
	 * @generated
	 */
	int STOCK = 9;

	/**
	 * The feature id for the '<em><b>Available Stock Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK__AVAILABLE_STOCK_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Is Empty Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK__IS_EMPTY_STOCK = 1;

	/**
	 * The number of structural features of the '<em>Stock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Users <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Users</em>'.
	 * @see gendev.hw1.Users
	 * @generated
	 */
	EClass getUsers();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Users#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Users#getName()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Users#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see gendev.hw1.Users#getAddress()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_Address();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Users#getBloodGroup <em>Blood Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blood Group</em>'.
	 * @see gendev.hw1.Users#getBloodGroup()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_BloodGroup();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Users#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see gendev.hw1.Users#getAge()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_Age();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Users#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see gendev.hw1.Users#getContact()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_Contact();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Users#getRegistrations <em>Registrations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registrations</em>'.
	 * @see gendev.hw1.Users#getRegistrations()
	 * @see #getUsers()
	 * @generated
	 */
	EReference getUsers_Registrations();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.BloodDonor <em>Blood Donor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blood Donor</em>'.
	 * @see gendev.hw1.BloodDonor
	 * @generated
	 */
	EClass getBloodDonor();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.BloodDonor#isIsEligible <em>Is Eligible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Eligible</em>'.
	 * @see gendev.hw1.BloodDonor#isIsEligible()
	 * @see #getBloodDonor()
	 * @generated
	 */
	EAttribute getBloodDonor_IsEligible();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.BloodReceiver <em>Blood Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blood Receiver</em>'.
	 * @see gendev.hw1.BloodReceiver
	 * @generated
	 */
	EClass getBloodReceiver();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.BloodReceiver#getReceiverID <em>Receiver ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver ID</em>'.
	 * @see gendev.hw1.BloodReceiver#getReceiverID()
	 * @see #getBloodReceiver()
	 * @generated
	 */
	EAttribute getBloodReceiver_ReceiverID();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.RegistrationUsers <em>Registration Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Users</em>'.
	 * @see gendev.hw1.RegistrationUsers
	 * @generated
	 */
	EClass getRegistrationUsers();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.RegistrationUsers#getUsename <em>Usename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usename</em>'.
	 * @see gendev.hw1.RegistrationUsers#getUsename()
	 * @see #getRegistrationUsers()
	 * @generated
	 */
	EAttribute getRegistrationUsers_Usename();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.RegistrationUsers#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see gendev.hw1.RegistrationUsers#getUser()
	 * @see #getRegistrationUsers()
	 * @generated
	 */
	EReference getRegistrationUsers_User();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.RegistrationUsers#getBloodbank <em>Bloodbank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bloodbank</em>'.
	 * @see gendev.hw1.RegistrationUsers#getBloodbank()
	 * @see #getRegistrationUsers()
	 * @generated
	 */
	EReference getRegistrationUsers_Bloodbank();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.RegistrationUsers#getRegisterDate <em>Register Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Date</em>'.
	 * @see gendev.hw1.RegistrationUsers#getRegisterDate()
	 * @see #getRegistrationUsers()
	 * @generated
	 */
	EAttribute getRegistrationUsers_RegisterDate();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.OnlineRegistration <em>Online Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online Registration</em>'.
	 * @see gendev.hw1.OnlineRegistration
	 * @generated
	 */
	EClass getOnlineRegistration();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.OnlineRegistration#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see gendev.hw1.OnlineRegistration#getUserId()
	 * @see #getOnlineRegistration()
	 * @generated
	 */
	EAttribute getOnlineRegistration_UserId();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.DirectRegistration <em>Direct Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Registration</em>'.
	 * @see gendev.hw1.DirectRegistration
	 * @generated
	 */
	EClass getDirectRegistration();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.DirectRegistration#getRegId <em>Reg Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Id</em>'.
	 * @see gendev.hw1.DirectRegistration#getRegId()
	 * @see #getDirectRegistration()
	 * @generated
	 */
	EAttribute getDirectRegistration_RegId();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.BloodBank <em>Blood Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blood Bank</em>'.
	 * @see gendev.hw1.BloodBank
	 * @generated
	 */
	EClass getBloodBank();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.BloodBank#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.BloodBank#getName()
	 * @see #getBloodBank()
	 * @generated
	 */
	EAttribute getBloodBank_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.BloodBank#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see gendev.hw1.BloodBank#getAddress()
	 * @see #getBloodBank()
	 * @generated
	 */
	EAttribute getBloodBank_Address();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.BloodBank#getHospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hospital</em>'.
	 * @see gendev.hw1.BloodBank#getHospital()
	 * @see #getBloodBank()
	 * @generated
	 */
	EReference getBloodBank_Hospital();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.BloodBank#getRegistrationusers <em>Registrationusers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registrationusers</em>'.
	 * @see gendev.hw1.BloodBank#getRegistrationusers()
	 * @see #getBloodBank()
	 * @generated
	 */
	EReference getBloodBank_Registrationusers();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.BloodBank#getStocks <em>Stocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stocks</em>'.
	 * @see gendev.hw1.BloodBank#getStocks()
	 * @see #getBloodBank()
	 * @generated
	 */
	EReference getBloodBank_Stocks();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Hospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital</em>'.
	 * @see gendev.hw1.Hospital
	 * @generated
	 */
	EClass getHospital();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Hospital#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Hospital#getName()
	 * @see #getHospital()
	 * @generated
	 */
	EAttribute getHospital_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Hospital#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see gendev.hw1.Hospital#getAddress()
	 * @see #getHospital()
	 * @generated
	 */
	EAttribute getHospital_Address();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Hospital#getBloodbank <em>Bloodbank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bloodbank</em>'.
	 * @see gendev.hw1.Hospital#getBloodbank()
	 * @see #getHospital()
	 * @generated
	 */
	EReference getHospital_Bloodbank();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.PrivateHospital <em>Private Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Hospital</em>'.
	 * @see gendev.hw1.PrivateHospital
	 * @generated
	 */
	EClass getPrivateHospital();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.PrivateHospital#getTrackLocation <em>Track Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Location</em>'.
	 * @see gendev.hw1.PrivateHospital#getTrackLocation()
	 * @see #getPrivateHospital()
	 * @generated
	 */
	EAttribute getPrivateHospital_TrackLocation();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Stock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock</em>'.
	 * @see gendev.hw1.Stock
	 * @generated
	 */
	EClass getStock();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Stock#getAvailableStockCount <em>Available Stock Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Stock Count</em>'.
	 * @see gendev.hw1.Stock#getAvailableStockCount()
	 * @see #getStock()
	 * @generated
	 */
	EAttribute getStock_AvailableStockCount();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Stock#isIsEmptyStock <em>Is Empty Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Empty Stock</em>'.
	 * @see gendev.hw1.Stock#isIsEmptyStock()
	 * @see #getStock()
	 * @generated
	 */
	EAttribute getStock_IsEmptyStock();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hw1Factory getHw1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.UsersImpl <em>Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.UsersImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getUsers()
		 * @generated
		 */
		EClass USERS = eINSTANCE.getUsers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__NAME = eINSTANCE.getUsers_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__ADDRESS = eINSTANCE.getUsers_Address();

		/**
		 * The meta object literal for the '<em><b>Blood Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__BLOOD_GROUP = eINSTANCE.getUsers_BloodGroup();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__AGE = eINSTANCE.getUsers_Age();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__CONTACT = eINSTANCE.getUsers_Contact();

		/**
		 * The meta object literal for the '<em><b>Registrations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERS__REGISTRATIONS = eINSTANCE.getUsers_Registrations();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.BloodDonorImpl <em>Blood Donor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.BloodDonorImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getBloodDonor()
		 * @generated
		 */
		EClass BLOOD_DONOR = eINSTANCE.getBloodDonor();

		/**
		 * The meta object literal for the '<em><b>Is Eligible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOOD_DONOR__IS_ELIGIBLE = eINSTANCE.getBloodDonor_IsEligible();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.BloodReceiverImpl <em>Blood Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.BloodReceiverImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getBloodReceiver()
		 * @generated
		 */
		EClass BLOOD_RECEIVER = eINSTANCE.getBloodReceiver();

		/**
		 * The meta object literal for the '<em><b>Receiver ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOOD_RECEIVER__RECEIVER_ID = eINSTANCE.getBloodReceiver_ReceiverID();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.RegistrationUsersImpl <em>Registration Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.RegistrationUsersImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getRegistrationUsers()
		 * @generated
		 */
		EClass REGISTRATION_USERS = eINSTANCE.getRegistrationUsers();

		/**
		 * The meta object literal for the '<em><b>Usename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_USERS__USENAME = eINSTANCE.getRegistrationUsers_Usename();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION_USERS__USER = eINSTANCE.getRegistrationUsers_User();

		/**
		 * The meta object literal for the '<em><b>Bloodbank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION_USERS__BLOODBANK = eINSTANCE.getRegistrationUsers_Bloodbank();

		/**
		 * The meta object literal for the '<em><b>Register Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_USERS__REGISTER_DATE = eINSTANCE.getRegistrationUsers_RegisterDate();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.OnlineRegistrationImpl <em>Online Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.OnlineRegistrationImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getOnlineRegistration()
		 * @generated
		 */
		EClass ONLINE_REGISTRATION = eINSTANCE.getOnlineRegistration();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_REGISTRATION__USER_ID = eINSTANCE.getOnlineRegistration_UserId();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.DirectRegistrationImpl <em>Direct Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.DirectRegistrationImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getDirectRegistration()
		 * @generated
		 */
		EClass DIRECT_REGISTRATION = eINSTANCE.getDirectRegistration();

		/**
		 * The meta object literal for the '<em><b>Reg Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECT_REGISTRATION__REG_ID = eINSTANCE.getDirectRegistration_RegId();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.BloodBankImpl <em>Blood Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.BloodBankImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getBloodBank()
		 * @generated
		 */
		EClass BLOOD_BANK = eINSTANCE.getBloodBank();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOOD_BANK__NAME = eINSTANCE.getBloodBank_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOOD_BANK__ADDRESS = eINSTANCE.getBloodBank_Address();

		/**
		 * The meta object literal for the '<em><b>Hospital</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOOD_BANK__HOSPITAL = eINSTANCE.getBloodBank_Hospital();

		/**
		 * The meta object literal for the '<em><b>Registrationusers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOOD_BANK__REGISTRATIONUSERS = eINSTANCE.getBloodBank_Registrationusers();

		/**
		 * The meta object literal for the '<em><b>Stocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOOD_BANK__STOCKS = eINSTANCE.getBloodBank_Stocks();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.HospitalImpl <em>Hospital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.HospitalImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getHospital()
		 * @generated
		 */
		EClass HOSPITAL = eINSTANCE.getHospital();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL__NAME = eINSTANCE.getHospital_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL__ADDRESS = eINSTANCE.getHospital_Address();

		/**
		 * The meta object literal for the '<em><b>Bloodbank</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITAL__BLOODBANK = eINSTANCE.getHospital_Bloodbank();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PrivateHospitalImpl <em>Private Hospital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PrivateHospitalImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPrivateHospital()
		 * @generated
		 */
		EClass PRIVATE_HOSPITAL = eINSTANCE.getPrivateHospital();

		/**
		 * The meta object literal for the '<em><b>Track Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_HOSPITAL__TRACK_LOCATION = eINSTANCE.getPrivateHospital_TrackLocation();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.StockImpl <em>Stock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.StockImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getStock()
		 * @generated
		 */
		EClass STOCK = eINSTANCE.getStock();

		/**
		 * The meta object literal for the '<em><b>Available Stock Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK__AVAILABLE_STOCK_COUNT = eINSTANCE.getStock_AvailableStockCount();

		/**
		 * The meta object literal for the '<em><b>Is Empty Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK__IS_EMPTY_STOCK = eINSTANCE.getStock_IsEmptyStock();

	}

} //Hw1Package
