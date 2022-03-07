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
package ru.arsysop.loft.rgm.synopsis.model.util;

import org.eclipse.emf.common.util.URI;

import ru.arsysop.loft.rgm.base.emf.xmi.RestrictedXmiResourceImpl;
import ru.arsysop.loft.rgm.seal.protection.RgmFeatures;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.synopsis.model.util.SynopsisResourceFactoryImpl
 * @generated NOT
 */
public final class SynopsisResourceImpl extends RestrictedXmiResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public SynopsisResourceImpl(URI uri) {
		super(uri, new RgmFeatures.Synopsis().load());
	}

} //synopsisResourceImpl
