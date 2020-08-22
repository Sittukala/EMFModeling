/**
 */
package gendev.hw1.impl;

import gendev.hw1.BloodDonor;
import gendev.hw1.Hw1Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blood Donor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.BloodDonorImpl#isIsEligible <em>Is Eligible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BloodDonorImpl extends UsersImpl implements BloodDonor {
	/**
	 * The default value of the '{@link #isIsEligible() <em>Is Eligible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEligible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ELIGIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEligible() <em>Is Eligible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEligible()
	 * @generated
	 * @ordered
	 */
	protected boolean isEligible = IS_ELIGIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BloodDonorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.BLOOD_DONOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsEligible() {
		return isEligible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEligible(boolean newIsEligible) {
		boolean oldIsEligible = isEligible;
		isEligible = newIsEligible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BLOOD_DONOR__IS_ELIGIBLE, oldIsEligible,
					isEligible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.BLOOD_DONOR__IS_ELIGIBLE:
			return isIsEligible();
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
		case Hw1Package.BLOOD_DONOR__IS_ELIGIBLE:
			setIsEligible((Boolean) newValue);
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
		case Hw1Package.BLOOD_DONOR__IS_ELIGIBLE:
			setIsEligible(IS_ELIGIBLE_EDEFAULT);
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
		case Hw1Package.BLOOD_DONOR__IS_ELIGIBLE:
			return isEligible != IS_ELIGIBLE_EDEFAULT;
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
		result.append(" (isEligible: ");
		result.append(isEligible);
		result.append(')');
		return result.toString();
	}

} //BloodDonorImpl
