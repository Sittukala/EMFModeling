/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.RegistrationUsers;
import gendev.hw1.Users;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Users</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.UsersImpl#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.UsersImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gendev.hw1.impl.UsersImpl#getBloodGroup <em>Blood Group</em>}</li>
 *   <li>{@link gendev.hw1.impl.UsersImpl#getAge <em>Age</em>}</li>
 *   <li>{@link gendev.hw1.impl.UsersImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link gendev.hw1.impl.UsersImpl#getRegistrations <em>Registrations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsersImpl extends MinimalEObjectImpl.Container implements Users {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBloodGroup() <em>Blood Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOOD_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBloodGroup() <em>Blood Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodGroup()
	 * @generated
	 * @ordered
	 */
	protected String bloodGroup = BLOOD_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTACT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected int contact = CONTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegistrations() <em>Registrations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrations()
	 * @generated
	 * @ordered
	 */
	protected EList<RegistrationUsers> registrations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.USERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.USERS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.USERS__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBloodGroup(String newBloodGroup) {
		String oldBloodGroup = bloodGroup;
		bloodGroup = newBloodGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.USERS__BLOOD_GROUP, oldBloodGroup,
					bloodGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.USERS__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContact(int newContact) {
		int oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.USERS__CONTACT, oldContact, contact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RegistrationUsers> getRegistrations() {
		if (registrations == null) {
			registrations = new EObjectWithInverseResolvingEList<RegistrationUsers>(RegistrationUsers.class, this,
					Hw1Package.USERS__REGISTRATIONS, Hw1Package.REGISTRATION_USERS__USER);
		}
		return registrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.USERS__REGISTRATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRegistrations()).basicAdd(otherEnd, msgs);
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
		case Hw1Package.USERS__REGISTRATIONS:
			return ((InternalEList<?>) getRegistrations()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.USERS__NAME:
			return getName();
		case Hw1Package.USERS__ADDRESS:
			return getAddress();
		case Hw1Package.USERS__BLOOD_GROUP:
			return getBloodGroup();
		case Hw1Package.USERS__AGE:
			return getAge();
		case Hw1Package.USERS__CONTACT:
			return getContact();
		case Hw1Package.USERS__REGISTRATIONS:
			return getRegistrations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.USERS__NAME:
			setName((String) newValue);
			return;
		case Hw1Package.USERS__ADDRESS:
			setAddress((String) newValue);
			return;
		case Hw1Package.USERS__BLOOD_GROUP:
			setBloodGroup((String) newValue);
			return;
		case Hw1Package.USERS__AGE:
			setAge((Integer) newValue);
			return;
		case Hw1Package.USERS__CONTACT:
			setContact((Integer) newValue);
			return;
		case Hw1Package.USERS__REGISTRATIONS:
			getRegistrations().clear();
			getRegistrations().addAll((Collection<? extends RegistrationUsers>) newValue);
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
		case Hw1Package.USERS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Hw1Package.USERS__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case Hw1Package.USERS__BLOOD_GROUP:
			setBloodGroup(BLOOD_GROUP_EDEFAULT);
			return;
		case Hw1Package.USERS__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case Hw1Package.USERS__CONTACT:
			setContact(CONTACT_EDEFAULT);
			return;
		case Hw1Package.USERS__REGISTRATIONS:
			getRegistrations().clear();
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
		case Hw1Package.USERS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Hw1Package.USERS__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case Hw1Package.USERS__BLOOD_GROUP:
			return BLOOD_GROUP_EDEFAULT == null ? bloodGroup != null : !BLOOD_GROUP_EDEFAULT.equals(bloodGroup);
		case Hw1Package.USERS__AGE:
			return age != AGE_EDEFAULT;
		case Hw1Package.USERS__CONTACT:
			return contact != CONTACT_EDEFAULT;
		case Hw1Package.USERS__REGISTRATIONS:
			return registrations != null && !registrations.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", bloodGroup: ");
		result.append(bloodGroup);
		result.append(", age: ");
		result.append(age);
		result.append(", contact: ");
		result.append(contact);
		result.append(')');
		return result.toString();
	}

} //UsersImpl
