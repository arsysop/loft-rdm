/**
 * Copyright (c) 2022 ArSysOp
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 	SPDX-License-Identifier: Apache-2.0
 * Contributors:
 * 	ArSysOp - initial API and implementation
 * 
 */
package ru.arsysop.loft.rgm.synopsis.edit.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import ru.arsysop.loft.rgm.synopsis.edit.SynopsisEditPlugin;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage;
import ru.arsysop.loft.rgm.synopsis.model.util.SynopsisAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SynopsisItemProviderAdapterFactory extends SynopsisAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(SynopsisEditPlugin.INSTANCE, SynopsisPackage.eNS_URI);

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
	public SynopsisItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
		supportedTypes.add(ITableItemColorProvider.class);
		supportedTypes.add(ITableItemFontProvider.class);
		supportedTypes.add(IItemColorProvider.class);
		supportedTypes.add(IItemFontProvider.class);
		supportedTypes.add(IItemStyledLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.Synopsis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynopsisItemProvider synopsisItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.Synopsis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynopsisAdapter() {
		if (synopsisItemProvider == null) {
			synopsisItemProvider = new SynopsisItemProvider(this);
		}

		return synopsisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.Namespace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceItemProvider namespaceItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.Namespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamespaceAdapter() {
		if (namespaceItemProvider == null) {
			namespaceItemProvider = new NamespaceItemProvider(this);
		}

		return namespaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.FunctionDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDeclItemProvider functionDeclItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.FunctionDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionDeclAdapter() {
		if (functionDeclItemProvider == null) {
			functionDeclItemProvider = new FunctionDeclItemProvider(this);
		}

		return functionDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.ClassDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDeclItemProvider classDeclItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.ClassDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassDeclAdapter() {
		if (classDeclItemProvider == null) {
			classDeclItemProvider = new ClassDeclItemProvider(this);
		}

		return classDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.EnumDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumDeclItemProvider enumDeclItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.EnumDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumDeclAdapter() {
		if (enumDeclItemProvider == null) {
			enumDeclItemProvider = new EnumDeclItemProvider(this);
		}

		return enumDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.StructDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructDeclItemProvider structDeclItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.StructDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructDeclAdapter() {
		if (structDeclItemProvider == null) {
			structDeclItemProvider = new StructDeclItemProvider(this);
		}

		return structDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.UnionDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionDeclItemProvider unionDeclItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.UnionDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnionDeclAdapter() {
		if (unionDeclItemProvider == null) {
			unionDeclItemProvider = new UnionDeclItemProvider(this);
		}

		return unionDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.FieldDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDeclItemProvider fieldDeclItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.FieldDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldDeclAdapter() {
		if (fieldDeclItemProvider == null) {
			fieldDeclItemProvider = new FieldDeclItemProvider(this);
		}

		return fieldDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.VarDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarDeclItemProvider varDeclItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.VarDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVarDeclAdapter() {
		if (varDeclItemProvider == null) {
			varDeclItemProvider = new VarDeclItemProvider(this);
		}

		return varDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.TypedefDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedefDeclItemProvider typedefDeclItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.TypedefDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypedefDeclAdapter() {
		if (typedefDeclItemProvider == null) {
			typedefDeclItemProvider = new TypedefDeclItemProvider(this);
		}

		return typedefDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.ParmDecl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParmDeclItemProvider parmDeclItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.ParmDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParmDeclAdapter() {
		if (parmDeclItemProvider == null) {
			parmDeclItemProvider = new ParmDeclItemProvider(this);
		}

		return parmDeclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.FunctionTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTemplateItemProvider functionTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.FunctionTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionTemplateAdapter() {
		if (functionTemplateItemProvider == null) {
			functionTemplateItemProvider = new FunctionTemplateItemProvider(this);
		}

		return functionTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.ClassTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassTemplateItemProvider classTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.ClassTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassTemplateAdapter() {
		if (classTemplateItemProvider == null) {
			classTemplateItemProvider = new ClassTemplateItemProvider(this);
		}

		return classTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.CXXMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CXXMethodItemProvider cxxMethodItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.CXXMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCXXMethodAdapter() {
		if (cxxMethodItemProvider == null) {
			cxxMethodItemProvider = new CXXMethodItemProvider(this);
		}

		return cxxMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.Constructor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorItemProvider constructorItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.Constructor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstructorAdapter() {
		if (constructorItemProvider == null) {
			constructorItemProvider = new ConstructorItemProvider(this);
		}

		return constructorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.Destructor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestructorItemProvider destructorItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.Destructor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDestructorAdapter() {
		if (destructorItemProvider == null) {
			destructorItemProvider = new DestructorItemProvider(this);
		}

		return destructorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ru.arsysop.loft.rgm.synopsis.model.api.TemplateTypeParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateTypeParameterItemProvider templateTypeParameterItemProvider;

	/**
	 * This creates an adapter for a {@link ru.arsysop.loft.rgm.synopsis.model.api.TemplateTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateTypeParameterAdapter() {
		if (templateTypeParameterItemProvider == null) {
			templateTypeParameterItemProvider = new TemplateTypeParameterItemProvider(this);
		}

		return templateTypeParameterItemProvider;
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
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
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
		if (synopsisItemProvider != null) synopsisItemProvider.dispose();
		if (namespaceItemProvider != null) namespaceItemProvider.dispose();
		if (functionDeclItemProvider != null) functionDeclItemProvider.dispose();
		if (classDeclItemProvider != null) classDeclItemProvider.dispose();
		if (enumDeclItemProvider != null) enumDeclItemProvider.dispose();
		if (structDeclItemProvider != null) structDeclItemProvider.dispose();
		if (unionDeclItemProvider != null) unionDeclItemProvider.dispose();
		if (fieldDeclItemProvider != null) fieldDeclItemProvider.dispose();
		if (varDeclItemProvider != null) varDeclItemProvider.dispose();
		if (typedefDeclItemProvider != null) typedefDeclItemProvider.dispose();
		if (parmDeclItemProvider != null) parmDeclItemProvider.dispose();
		if (functionTemplateItemProvider != null) functionTemplateItemProvider.dispose();
		if (classTemplateItemProvider != null) classTemplateItemProvider.dispose();
		if (cxxMethodItemProvider != null) cxxMethodItemProvider.dispose();
		if (constructorItemProvider != null) constructorItemProvider.dispose();
		if (destructorItemProvider != null) destructorItemProvider.dispose();
		if (templateTypeParameterItemProvider != null) templateTypeParameterItemProvider.dispose();
	}

}
