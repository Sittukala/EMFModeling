/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Users</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Users#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.Users#getAddress <em>Address</em>}</li>
 *   <li>{@link gendev.hw1.Users#getBloodGroup <em>Blood Group</em>}</li>
 *   <li>{@link gendev.hw1.Users#getAge <em>Age</em>}</li>
 *   <li>{@link gendev.hw1.Users#getContact <em>Contact</em>}</li>
 *   <li>{@link gendev.hw1.Users#getRegistrations <em>Registrations</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getUsers()
 * @model
 * @generated
 */
public interface Users extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getUsers_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Users#getName <em>Name</em>}' attribute.
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
	 * @see gendev.hw1.Hw1Package#getUsers_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link gendev.hw1.Users#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Blood Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blood Group</em>' attribute.
	 * @see #setBloodGroup(String)
	 * @see gendev.hw1.Hw1Package#getUsers_BloodGroup()
	 * @model
	 * @generated
	 */
	String getBloodGroup();

	/**
	 * Sets the value of the '{@link gendev.hw1.Users#getBloodGroup <em>Blood Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blood Group</em>' attribute.
	 * @see #getBloodGroup()
	 * @generated
	 */
	void setBloodGroup(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see gendev.hw1.Hw1Package#getUsers_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link gendev.hw1.Users#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(int)
	 * @see gendev.hw1.Hw1Package#getUsers_Contact()
	 * @model
	 * @generated
	 */
	int getContact();

	/**
	 * Sets the value of the '{@link gendev.hw1.Users#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(int value);

	/**
	 * Returns the value of the '<em><b>Registrations</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.RegistrationUsers}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.RegistrationUsers#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrations</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getUsers_Registrations()
	 * @see gendev.hw1.RegistrationUsers#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<RegistrationUsers> getRegistrations();

} // Users
