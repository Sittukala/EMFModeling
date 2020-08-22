/**
 */
package gendev.hw1.impl;

import gendev.hw1.BloodReceiver;
import gendev.hw1.Hw1Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blood Receiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.BloodReceiverImpl#getReceiverID <em>Receiver ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BloodReceiverImpl extends UsersImpl implements BloodReceiver {
	/**
	 * The default value of the '{@link #getReceiverID() <em>Receiver ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverID()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiverID() <em>Receiver ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverID()
	 * @generated
	 * @ordered
	 */
	protected String receiverID = RECEIVER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BloodReceiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.BLOOD_RECEIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReceiverID() {
		return receiverID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiverID(String newReceiverID) {
		String oldReceiverID = receiverID;
		receiverID = newReceiverID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BLOOD_RECEIVER__RECEIVER_ID, oldReceiverID,
					receiverID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.BLOOD_RECEIVER__RECEIVER_ID:
			return getReceiverID();
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
		case Hw1Package.BLOOD_RECEIVER__RECEIVER_ID:
			setReceiverID((String) newValue);
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
		case Hw1Package.BLOOD_RECEIVER__RECEIVER_ID:
			setReceiverID(RECEIVER_ID_EDEFAULT);
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
		case Hw1Package.BLOOD_RECEIVER__RECEIVER_ID:
			return RECEIVER_ID_EDEFAULT == null ? receiverID != null : !RECEIVER_ID_EDEFAULT.equals(receiverID);
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
		result.append(" (receiverID: ");
		result.append(receiverID);
		result.append(')');
		return result.toString();
	}

} //BloodReceiverImpl
