/**
 */
package gendev.hw1.impl;

import gendev.hw1.BloodBank;
import gendev.hw1.Hw1Package;
import gendev.hw1.RegistrationUsers;
import gendev.hw1.Users;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registration Users</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.RegistrationUsersImpl#getUsename <em>Usename</em>}</li>
 *   <li>{@link gendev.hw1.impl.RegistrationUsersImpl#getUser <em>User</em>}</li>
 *   <li>{@link gendev.hw1.impl.RegistrationUsersImpl#getBloodbank <em>Bloodbank</em>}</li>
 *   <li>{@link gendev.hw1.impl.RegistrationUsersImpl#getRegisterDate <em>Register Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RegistrationUsersImpl extends MinimalEObjectImpl.Container implements RegistrationUsers {
	/**
	 * The default value of the '{@link #getUsename() <em>Usename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsename()
	 * @generated
	 * @ordered
	 */
	protected static final String USENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsename() <em>Usename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsename()
	 * @generated
	 * @ordered
	 */
	protected String usename = USENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected Users user;

	/**
	 * The cached value of the '{@link #getBloodbank() <em>Bloodbank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodbank()
	 * @generated
	 * @ordered
	 */
	protected BloodBank bloodbank;

	/**
	 * The default value of the '{@link #getRegisterDate() <em>Register Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REGISTER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterDate() <em>Register Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterDate()
	 * @generated
	 * @ordered
	 */
	protected Date registerDate = REGISTER_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistrationUsersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.REGISTRATION_USERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsename() {
		return usename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsename(String newUsename) {
		String oldUsename = usename;
		usename = newUsename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.REGISTRATION_USERS__USENAME, oldUsename,
					usename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Users getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject) user;
			user = (Users) eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.REGISTRATION_USERS__USER,
							oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Users basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(Users newUser, NotificationChain msgs) {
		Users oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.REGISTRATION_USERS__USER, oldUser, newUser);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(Users newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this, Hw1Package.USERS__REGISTRATIONS, Users.class,
						msgs);
			if (newUser != null)
				msgs = ((InternalEObject) newUser).eInverseAdd(this, Hw1Package.USERS__REGISTRATIONS, Users.class,
						msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.REGISTRATION_USERS__USER, newUser,
					newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BloodBank getBloodbank() {
		if (bloodbank != null && bloodbank.eIsProxy()) {
			InternalEObject oldBloodbank = (InternalEObject) bloodbank;
			bloodbank = (BloodBank) eResolveProxy(oldBloodbank);
			if (bloodbank != oldBloodbank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.REGISTRATION_USERS__BLOODBANK,
							oldBloodbank, bloodbank));
			}
		}
		return bloodbank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BloodBank basicGetBloodbank() {
		return bloodbank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBloodbank(BloodBank newBloodbank, NotificationChain msgs) {
		BloodBank oldBloodbank = bloodbank;
		bloodbank = newBloodbank;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.REGISTRATION_USERS__BLOODBANK, oldBloodbank, newBloodbank);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBloodbank(BloodBank newBloodbank) {
		if (newBloodbank != bloodbank) {
			NotificationChain msgs = null;
			if (bloodbank != null)
				msgs = ((InternalEObject) bloodbank).eInverseRemove(this, Hw1Package.BLOOD_BANK__REGISTRATIONUSERS,
						BloodBank.class, msgs);
			if (newBloodbank != null)
				msgs = ((InternalEObject) newBloodbank).eInverseAdd(this, Hw1Package.BLOOD_BANK__REGISTRATIONUSERS,
						BloodBank.class, msgs);
			msgs = basicSetBloodbank(newBloodbank, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.REGISTRATION_USERS__BLOODBANK,
					newBloodbank, newBloodbank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getRegisterDate() {
		return registerDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisterDate(Date newRegisterDate) {
		Date oldRegisterDate = registerDate;
		registerDate = newRegisterDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.REGISTRATION_USERS__REGISTER_DATE,
					oldRegisterDate, registerDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.REGISTRATION_USERS__USER:
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this, Hw1Package.USERS__REGISTRATIONS, Users.class,
						msgs);
			return basicSetUser((Users) otherEnd, msgs);
		case Hw1Package.REGISTRATION_USERS__BLOODBANK:
			if (bloodbank != null)
				msgs = ((InternalEObject) bloodbank).eInverseRemove(this, Hw1Package.BLOOD_BANK__REGISTRATIONUSERS,
						BloodBank.class, msgs);
			return basicSetBloodbank((BloodBank) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.REGISTRATION_USERS__USER:
			return basicSetUser(null, msgs);
		case Hw1Package.REGISTRATION_USERS__BLOODBANK:
			return basicSetBloodbank(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.REGISTRATION_USERS__USENAME:
			return getUsename();
		case Hw1Package.REGISTRATION_USERS__USER:
			if (resolve)
				return getUser();
			return basicGetUser();
		case Hw1Package.REGISTRATION_USERS__BLOODBANK:
			if (resolve)
				return getBloodbank();
			return basicGetBloodbank();
		case Hw1Package.REGISTRATION_USERS__REGISTER_DATE:
			return getRegisterDate();
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
		case Hw1Package.REGISTRATION_USERS__USENAME:
			setUsename((String) newValue);
			return;
		case Hw1Package.REGISTRATION_USERS__USER:
			setUser((Users) newValue);
			return;
		case Hw1Package.REGISTRATION_USERS__BLOODBANK:
			setBloodbank((BloodBank) newValue);
			return;
		case Hw1Package.REGISTRATION_USERS__REGISTER_DATE:
			setRegisterDate((Date) newValue);
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
		case Hw1Package.REGISTRATION_USERS__USENAME:
			setUsename(USENAME_EDEFAULT);
			return;
		case Hw1Package.REGISTRATION_USERS__USER:
			setUser((Users) null);
			return;
		case Hw1Package.REGISTRATION_USERS__BLOODBANK:
			setBloodbank((BloodBank) null);
			return;
		case Hw1Package.REGISTRATION_USERS__REGISTER_DATE:
			setRegisterDate(REGISTER_DATE_EDEFAULT);
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
		case Hw1Package.REGISTRATION_USERS__USENAME:
			return USENAME_EDEFAULT == null ? usename != null : !USENAME_EDEFAULT.equals(usename);
		case Hw1Package.REGISTRATION_USERS__USER:
			return user != null;
		case Hw1Package.REGISTRATION_USERS__BLOODBANK:
			return bloodbank != null;
		case Hw1Package.REGISTRATION_USERS__REGISTER_DATE:
			return REGISTER_DATE_EDEFAULT == null ? registerDate != null : !REGISTER_DATE_EDEFAULT.equals(registerDate);
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
		result.append(" (usename: ");
		result.append(usename);
		result.append(", registerDate: ");
		result.append(registerDate);
		result.append(')');
		return result.toString();
	}

} //RegistrationUsersImpl
