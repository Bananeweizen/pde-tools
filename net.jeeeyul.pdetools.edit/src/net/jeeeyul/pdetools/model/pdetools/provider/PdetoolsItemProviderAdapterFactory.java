/**
 */
package net.jeeeyul.pdetools.model.pdetools.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.jeeeyul.pdetools.model.pdetools.util.PdetoolsAdapterFactory;

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
public class PdetoolsItemProviderAdapterFactory extends PdetoolsAdapterFactory
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
	public PdetoolsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.ClipboardElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipboardElementItemProvider clipboardElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.ClipboardElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClipboardElementAdapter() {
		if (clipboardElementItemProvider == null) {
			clipboardElementItemProvider = new ClipboardElementItemProvider(
					this);
		}

		return clipboardElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.ClipHistory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipHistoryItemProvider clipHistoryItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.ClipHistory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClipHistoryAdapter() {
		if (clipHistoryItemProvider == null) {
			clipHistoryItemProvider = new ClipHistoryItemProvider(this);
		}

		return clipHistoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.ClipboardEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipboardEntryItemProvider clipboardEntryItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.ClipboardEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClipboardEntryAdapter() {
		if (clipboardEntryItemProvider == null) {
			clipboardEntryItemProvider = new ClipboardEntryItemProvider(this);
		}

		return clipboardEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.TextRange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextRangeItemProvider textRangeItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.TextRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextRangeAdapter() {
		if (textRangeItemProvider == null) {
			textRangeItemProvider = new TextRangeItemProvider(this);
		}

		return textRangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.JavaInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaInfoItemProvider javaInfoItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.JavaInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaInfoAdapter() {
		if (javaInfoItemProvider == null) {
			javaInfoItemProvider = new JavaInfoItemProvider(this);
		}

		return javaInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.Palette} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaletteItemProvider paletteItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.Palette}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaletteAdapter() {
		if (paletteItemProvider == null) {
			paletteItemProvider = new PaletteItemProvider(this);
		}

		return paletteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.ImageFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageFileItemProvider imageFileItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.ImageFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageFileAdapter() {
		if (imageFileItemProvider == null) {
			imageFileItemProvider = new ImageFileItemProvider(this);
		}

		return imageFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.SnapshotRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnapshotRepositoryItemProvider snapshotRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.SnapshotRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSnapshotRepositoryAdapter() {
		if (snapshotRepositoryItemProvider == null) {
			snapshotRepositoryItemProvider = new SnapshotRepositoryItemProvider(
					this);
		}

		return snapshotRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.SnapshotGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnapshotGroupItemProvider snapshotGroupItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.SnapshotGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSnapshotGroupAdapter() {
		if (snapshotGroupItemProvider == null) {
			snapshotGroupItemProvider = new SnapshotGroupItemProvider(this);
		}

		return snapshotGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.SnapshotEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnapshotEntryItemProvider snapshotEntryItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.SnapshotEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSnapshotEntryAdapter() {
		if (snapshotEntryItemProvider == null) {
			snapshotEntryItemProvider = new SnapshotEntryItemProvider(this);
		}

		return snapshotEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.ShellInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShellInfoItemProvider shellInfoItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.ShellInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShellInfoAdapter() {
		if (shellInfoItemProvider == null) {
			shellInfoItemProvider = new ShellInfoItemProvider(this);
		}

		return shellInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.CommandHistory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandHistoryItemProvider commandHistoryItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.CommandHistory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandHistoryAdapter() {
		if (commandHistoryItemProvider == null) {
			commandHistoryItemProvider = new CommandHistoryItemProvider(this);
		}

		return commandHistoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.jeeeyul.pdetools.model.pdetools.CommandEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandEventItemProvider commandEventItemProvider;

	/**
	 * This creates an adapter for a {@link net.jeeeyul.pdetools.model.pdetools.CommandEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandEventAdapter() {
		if (commandEventItemProvider == null) {
			commandEventItemProvider = new CommandEventItemProvider(this);
		}

		return commandEventItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
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
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
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
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void dispose() {
		if (clipboardElementItemProvider != null)
			clipboardElementItemProvider.dispose();
		if (clipHistoryItemProvider != null)
			clipHistoryItemProvider.dispose();
		if (clipboardEntryItemProvider != null)
			clipboardEntryItemProvider.dispose();
		if (textRangeItemProvider != null)
			textRangeItemProvider.dispose();
		if (javaInfoItemProvider != null)
			javaInfoItemProvider.dispose();
		if (paletteItemProvider != null)
			paletteItemProvider.dispose();
		if (imageFileItemProvider != null)
			imageFileItemProvider.dispose();
		if (snapshotRepositoryItemProvider != null)
			snapshotRepositoryItemProvider.dispose();
		if (snapshotGroupItemProvider != null)
			snapshotGroupItemProvider.dispose();
		if (snapshotEntryItemProvider != null)
			snapshotEntryItemProvider.dispose();
		if (shellInfoItemProvider != null)
			shellInfoItemProvider.dispose();
		if (commandHistoryItemProvider != null)
			commandHistoryItemProvider.dispose();
		if (commandEventItemProvider != null)
			commandEventItemProvider.dispose();
	}

}