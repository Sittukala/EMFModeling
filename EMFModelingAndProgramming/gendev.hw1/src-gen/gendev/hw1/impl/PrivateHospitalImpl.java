/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.PrivateHospital;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Hospital</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.PrivateHospitalImpl#getTrackLocation <em>Track Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateHospitalImpl extends HospitalImpl implements PrivateHospital {
	/**
	 * The default value of the '{@link #getTrackLocation() <em>Track Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACK_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackLocation() <em>Track Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackLocation()
	 * @generated
	 * @ordered
	 */
	protected String trackLocation = TRACK_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateHospitalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PRIVATE_HOSPITAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackLocation() {
		return trackLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackLocation(String newTrackLocation) {
		String oldTrackLocation = trackLocation;
		trackLocation = newTrackLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PRIVATE_HOSPITAL__TRACK_LOCATION,
					oldTrackLocation, trackLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.PRIVATE_HOSPITAL__TRACK_LOCATION:
			return getTrackLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.PRIVATE_HOSPITAL__TRACK_LOCATION:
			setTrackLocation((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Hw1Package.PRIVATE_HOSPITAL__TRACK_LOCATION:
			setTrackLocation(TRACK_LOCATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Hw1Package.PRIVATE_HOSPITAL__TRACK_LOCATION:
			return TRACK_LOCATION_EDEFAULT == null ? trackLocation != null
					: !TRACK_LOCATION_EDEFAULT.equals(trackLocation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (trackLocation: ");
		result.append(trackLocation);
		result.append(')');
		return result.toString();
	}

} //PrivateHospitalImpl
