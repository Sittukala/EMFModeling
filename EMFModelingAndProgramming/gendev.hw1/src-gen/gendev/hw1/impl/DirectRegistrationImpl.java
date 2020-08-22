/**
 */
package gendev.hw1.impl;

import gendev.hw1.DirectRegistration;
import gendev.hw1.Hw1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Registration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.DirectRegistrationImpl#getRegId <em>Reg Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectRegistrationImpl extends RegistrationUsersImpl implements DirectRegistration {
	/**
	 * The default value of the '{@link #getRegId() <em>Reg Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegId()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegId() <em>Reg Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegId()
	 * @generated
	 * @ordered
	 */
	protected String regId = REG_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectRegistrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.DIRECT_REGISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegId() {
		return regId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegId(String newRegId) {
		String oldRegId = regId;
		regId = newRegId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DIRECT_REGISTRATION__REG_ID, oldRegId,
					regId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.DIRECT_REGISTRATION__REG_ID:
			return getRegId();
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
		case Hw1Package.DIRECT_REGISTRATION__REG_ID:
			setRegId((String) newValue);
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
		case Hw1Package.DIRECT_REGISTRATION__REG_ID:
			setRegId(REG_ID_EDEFAULT);
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
		case Hw1Package.DIRECT_REGISTRATION__REG_ID:
			return REG_ID_EDEFAULT == null ? regId != null : !REG_ID_EDEFAULT.equals(regId);
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
		result.append(" (RegId: ");
		result.append(regId);
		result.append(')');
		return result.toString();
	}

} //DirectRegistrationImpl
