/**
 * Copyright (c) 2021 ArSysOp
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
package ru.arsysop.loft.rgm.spec.model.util;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import ru.arsysop.loft.rgm.seal.protection.RgmLicenseProtection;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.spec.model.util.SpecResourceFactoryImpl
 * @generated
 */
public class SpecResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public SpecResourceImpl(URI uri) {
		super(uri);
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void init() {
		new RgmLicenseProtection().checkCanLoadSpec();
		super.init();
		Map<Object, Object> options = getDefaultLoadOptions();
		options.put(OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		options.put(OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
	}

} //SpecResourceImpl
