/**
 */
package gendev.hw1;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration Users</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.RegistrationUsers#getUsename <em>Usename</em>}</li>
 *   <li>{@link gendev.hw1.RegistrationUsers#getUser <em>User</em>}</li>
 *   <li>{@link gendev.hw1.RegistrationUsers#getBloodbank <em>Bloodbank</em>}</li>
 *   <li>{@link gendev.hw1.RegistrationUsers#getRegisterDate <em>Register Date</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getRegistrationUsers()
 * @model abstract="true"
 * @generated
 */
public interface RegistrationUsers extends EObject {
	/**
	 * Returns the value of the '<em><b>Usename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usename</em>' attribute.
	 * @see #setUsename(String)
	 * @see gendev.hw1.Hw1Package#getRegistrationUsers_Usename()
	 * @model
	 * @generated
	 */
	String getUsename();

	/**
	 * Sets the value of the '{@link gendev.hw1.RegistrationUsers#getUsename <em>Usename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usename</em>' attribute.
	 * @see #getUsename()
	 * @generated
	 */
	void setUsename(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Users#getRegistrations <em>Registrations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(Users)
	 * @see gendev.hw1.Hw1Package#getRegistrationUsers_User()
	 * @see gendev.hw1.Users#getRegistrations
	 * @model opposite="registrations"
	 * @generated
	 */
	Users getUser();

	/**
	 * Sets the value of the '{@link gendev.hw1.RegistrationUsers#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(Users value);

	/**
	 * Returns the value of the '<em><b>Bloodbank</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.BloodBank#getRegistrationusers <em>Registrationusers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloodbank</em>' reference.
	 * @see #setBloodbank(BloodBank)
	 * @see gendev.hw1.Hw1Package#getRegistrationUsers_Bloodbank()
	 * @see gendev.hw1.BloodBank#getRegistrationusers
	 * @model opposite="registrationusers"
	 * @generated
	 */
	BloodBank getBloodbank();

	/**
	 * Sets the value of the '{@link gendev.hw1.RegistrationUsers#getBloodbank <em>Bloodbank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloodbank</em>' reference.
	 * @see #getBloodbank()
	 * @generated
	 */
	void setBloodbank(BloodBank value);

	/**
	 * Returns the value of the '<em><b>Register Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Date</em>' attribute.
	 * @see #setRegisterDate(Date)
	 * @see gendev.hw1.Hw1Package#getRegistrationUsers_RegisterDate()
	 * @model
	 * @generated
	 */
	Date getRegisterDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.RegistrationUsers#getRegisterDate <em>Register Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Date</em>' attribute.
	 * @see #getRegisterDate()
	 * @generated
	 */
	void setRegisterDate(Date value);

} // RegistrationUsers
