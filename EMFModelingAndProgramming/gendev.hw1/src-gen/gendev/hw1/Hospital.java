/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Hospital#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.Hospital#getAddress <em>Address</em>}</li>
 *   <li>{@link gendev.hw1.Hospital#getBloodbank <em>Bloodbank</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getHospital()
 * @model
 * @generated
 */
public interface Hospital extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getHospital_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Hospital#getName <em>Name</em>}' attribute.
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
	 * @see gendev.hw1.Hw1Package#getHospital_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link gendev.hw1.Hospital#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Bloodbank</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.BloodBank}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.BloodBank#getHospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloodbank</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getHospital_Bloodbank()
	 * @see gendev.hw1.BloodBank#getHospital
	 * @model opposite="hospital" lower="3" upper="5"
	 * @generated
	 */
	EList<BloodBank> getBloodbank();

} // Hospital
