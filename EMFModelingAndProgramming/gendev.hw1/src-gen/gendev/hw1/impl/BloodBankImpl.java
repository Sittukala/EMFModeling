/**
 */
package gendev.hw1.impl;

import gendev.hw1.BloodBank;
import gendev.hw1.Hospital;
import gendev.hw1.Hw1Package;
import gendev.hw1.RegistrationUsers;
import gendev.hw1.Stock;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blood Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.BloodBankImpl#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.BloodBankImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link gendev.hw1.impl.BloodBankImpl#getHospital <em>Hospital</em>}</li>
 *   <li>{@link gendev.hw1.impl.BloodBankImpl#getRegistrationusers <em>Registrationusers</em>}</li>
 *   <li>{@link gendev.hw1.impl.BloodBankImpl#getStocks <em>Stocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BloodBankImpl extends MinimalEObjectImpl.Container implements BloodBank {
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
	 * The cached value of the '{@link #getHospital() <em>Hospital</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospital()
	 * @generated
	 * @ordered
	 */
	protected EList<Hospital> hospital;

	/**
	 * The cached value of the '{@link #getRegistrationusers() <em>Registrationusers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationusers()
	 * @generated
	 * @ordered
	 */
	protected EList<RegistrationUsers> registrationusers;

	/**
	 * The cached value of the '{@link #getStocks() <em>Stocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Stock> stocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BloodBankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.BLOOD_BANK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BLOOD_BANK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BLOOD_BANK__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hospital> getHospital() {
		if (hospital == null) {
			hospital = new EObjectWithInverseResolvingEList.ManyInverse<Hospital>(Hospital.class, this,
					Hw1Package.BLOOD_BANK__HOSPITAL, Hw1Package.HOSPITAL__BLOODBANK);
		}
		return hospital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RegistrationUsers> getRegistrationusers() {
		if (registrationusers == null) {
			registrationusers = new EObjectWithInverseResolvingEList<RegistrationUsers>(RegistrationUsers.class, this,
					Hw1Package.BLOOD_BANK__REGISTRATIONUSERS, Hw1Package.REGISTRATION_USERS__BLOODBANK);
		}
		return registrationusers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stock> getStocks() {
		if (stocks == null) {
			stocks = new EObjectContainmentEList<Stock>(Stock.class, this, Hw1Package.BLOOD_BANK__STOCKS);
		}
		return stocks;
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
		case Hw1Package.BLOOD_BANK__HOSPITAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHospital()).basicAdd(otherEnd, msgs);
		case Hw1Package.BLOOD_BANK__REGISTRATIONUSERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRegistrationusers()).basicAdd(otherEnd,
					msgs);
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
		case Hw1Package.BLOOD_BANK__HOSPITAL:
			return ((InternalEList<?>) getHospital()).basicRemove(otherEnd, msgs);
		case Hw1Package.BLOOD_BANK__REGISTRATIONUSERS:
			return ((InternalEList<?>) getRegistrationusers()).basicRemove(otherEnd, msgs);
		case Hw1Package.BLOOD_BANK__STOCKS:
			return ((InternalEList<?>) getStocks()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.BLOOD_BANK__NAME:
			return getName();
		case Hw1Package.BLOOD_BANK__ADDRESS:
			return getAddress();
		case Hw1Package.BLOOD_BANK__HOSPITAL:
			return getHospital();
		case Hw1Package.BLOOD_BANK__REGISTRATIONUSERS:
			return getRegistrationusers();
		case Hw1Package.BLOOD_BANK__STOCKS:
			return getStocks();
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
		case Hw1Package.BLOOD_BANK__NAME:
			setName((String) newValue);
			return;
		case Hw1Package.BLOOD_BANK__ADDRESS:
			setAddress((String) newValue);
			return;
		case Hw1Package.BLOOD_BANK__HOSPITAL:
			getHospital().clear();
			getHospital().addAll((Collection<? extends Hospital>) newValue);
			return;
		case Hw1Package.BLOOD_BANK__REGISTRATIONUSERS:
			getRegistrationusers().clear();
			getRegistrationusers().addAll((Collection<? extends RegistrationUsers>) newValue);
			return;
		case Hw1Package.BLOOD_BANK__STOCKS:
			getStocks().clear();
			getStocks().addAll((Collection<? extends Stock>) newValue);
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
		case Hw1Package.BLOOD_BANK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Hw1Package.BLOOD_BANK__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case Hw1Package.BLOOD_BANK__HOSPITAL:
			getHospital().clear();
			return;
		case Hw1Package.BLOOD_BANK__REGISTRATIONUSERS:
			getRegistrationusers().clear();
			return;
		case Hw1Package.BLOOD_BANK__STOCKS:
			getStocks().clear();
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
		case Hw1Package.BLOOD_BANK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Hw1Package.BLOOD_BANK__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case Hw1Package.BLOOD_BANK__HOSPITAL:
			return hospital != null && !hospital.isEmpty();
		case Hw1Package.BLOOD_BANK__REGISTRATIONUSERS:
			return registrationusers != null && !registrationusers.isEmpty();
		case Hw1Package.BLOOD_BANK__STOCKS:
			return stocks != null && !stocks.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //BloodBankImpl
