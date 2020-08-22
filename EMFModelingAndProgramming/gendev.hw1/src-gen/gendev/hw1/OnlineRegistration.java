/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.OnlineRegistration#getUserId <em>User Id</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getOnlineRegistration()
 * @model
 * @generated
 */
public interface OnlineRegistration extends RegistrationUsers {
	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see gendev.hw1.Hw1Package#getOnlineRegistration_UserId()
	 * @model
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link gendev.hw1.OnlineRegistration#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

} // OnlineRegistration
