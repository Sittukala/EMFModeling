/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Hospital</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.PrivateHospital#getTrackLocation <em>Track Location</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getPrivateHospital()
 * @model
 * @generated
 */
public interface PrivateHospital extends Hospital {
	/**
	 * Returns the value of the '<em><b>Track Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Location</em>' attribute.
	 * @see #setTrackLocation(String)
	 * @see gendev.hw1.Hw1Package#getPrivateHospital_TrackLocation()
	 * @model
	 * @generated
	 */
	String getTrackLocation();

	/**
	 * Sets the value of the '{@link gendev.hw1.PrivateHospital#getTrackLocation <em>Track Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Location</em>' attribute.
	 * @see #getTrackLocation()
	 * @generated
	 */
	void setTrackLocation(String value);

} // PrivateHospital
