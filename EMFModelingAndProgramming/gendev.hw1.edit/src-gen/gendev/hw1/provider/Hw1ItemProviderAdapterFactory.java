/**
 */
package gendev.hw1.provider;

import gendev.hw1.util.Hw1AdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1ItemProviderAdapterFactory extends Hw1AdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link gendev.hw1.Users} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsersItemProvider usersItemProvider;

	/**
	 * This creates an adapter for a {@link gendev.hw1.Users}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsersAdapter() {
		if (usersItemProvider == null) {
			usersItemProvider = new UsersItemProvider(this);
		}

		return usersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gendev.hw1.BloodDonor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BloodDonorItemProvider bloodDonorItemProvider;

	/**
	 * This creates an adapter for a {@link gendev.hw1.BloodDonor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBloodDonorAdapter() {
		if (bloodDonorItemProvider == null) {
			bloodDonorItemProvider = new BloodDonorItemProvider(this);
		}

		return bloodDonorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gendev.hw1.BloodReceiver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BloodReceiverItemProvider bloodReceiverItemProvider;

	/**
	 * This creates an adapter for a {@link gendev.hw1.BloodReceiver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBloodReceiverAdapter() {
		if (bloodReceiverItemProvider == null) {
			bloodReceiverItemProvider = new BloodReceiverItemProvider(this);
		}

		return bloodReceiverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gendev.hw1.OnlineRegistration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlineRegistrationItemProvider onlineRegistrationItemProvider;

	/**
	 * This creates an adapter for a {@link gendev.hw1.OnlineRegistration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOnlineRegistrationAdapter() {
		if (onlineRegistrationItemProvider == null) {
			onlineRegistrationItemProvider = new OnlineRegistrationItemProvider(this);
		}

		return onlineRegistrationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gendev.hw1.DirectRegistration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectRegistrationItemProvider directRegistrationItemProvider;

	/**
	 * This creates an adapter for a {@link gendev.hw1.DirectRegistration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDirectRegistrationAdapter() {
		if (directRegistrationItemProvider == null) {
			directRegistrationItemProvider = new DirectRegistrationItemProvider(this);
		}

		return directRegistrationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gendev.hw1.BloodBank} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BloodBankItemProvider bloodBankItemProvider;

	/**
	 * This creates an adapter for a {@link gendev.hw1.BloodBank}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBloodBankAdapter() {
		if (bloodBankItemProvider == null) {
			bloodBankItemProvider = new BloodBankItemProvider(this);
		}

		return bloodBankItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gendev.hw1.Hospital} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalItemProvider hospitalItemProvider;

	/**
	 * This creates an adapter for a {@link gendev.hw1.Hospital}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHospitalAdapter() {
		if (hospitalItemProvider == null) {
			hospitalItemProvider = new HospitalItemProvider(this);
		}

		return hospitalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gendev.hw1.PrivateHospital} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateHospitalItemProvider privateHospitalItemProvider;

	/**
	 * This creates an adapter for a {@link gendev.hw1.PrivateHospital}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrivateHospitalAdapter() {
		if (privateHospitalItemProvider == null) {
			privateHospitalItemProvider = new PrivateHospitalItemProvider(this);
		}

		return privateHospitalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link gendev.hw1.Stock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockItemProvider stockItemProvider;

	/**
	 * This creates an adapter for a {@link gendev.hw1.Stock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStockAdapter() {
		if (stockItemProvider == null) {
			stockItemProvider = new StockItemProvider(this);
		}

		return stockItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (usersItemProvider != null)
			usersItemProvider.dispose();
		if (bloodDonorItemProvider != null)
			bloodDonorItemProvider.dispose();
		if (bloodReceiverItemProvider != null)
			bloodReceiverItemProvider.dispose();
		if (onlineRegistrationItemProvider != null)
			onlineRegistrationItemProvider.dispose();
		if (directRegistrationItemProvider != null)
			directRegistrationItemProvider.dispose();
		if (bloodBankItemProvider != null)
			bloodBankItemProvider.dispose();
		if (hospitalItemProvider != null)
			hospitalItemProvider.dispose();
		if (privateHospitalItemProvider != null)
			privateHospitalItemProvider.dispose();
		if (stockItemProvider != null)
			stockItemProvider.dispose();
	}

}
