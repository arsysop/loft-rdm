/*******************************************************************************
 * Copyright (c) 2022 ArSysOp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     Nikifor Fedorov (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.edit;

import java.util.Optional;
import java.util.function.Function;

import org.eclipse.emf.edit.provider.StyledString;

import ru.arsysop.loft.rgm.model.api.StyledNode;

public final class NodeStyle implements Function<StyledNode, StyledString> {

	@Override
	public StyledString apply(StyledNode node) {
		switch (node.getType()) {
		case "a": //$NON-NLS-1$
			return reference(node.getText());
		case "span": //$NON-NLS-1$
			return code(node.getText());
		default:
			return raw(Optional.ofNullable(node.getText()).orElse("")); //$NON-NLS-1$
		}
	}

	private StyledString code(String text) {
		return new StyledString(text, StyledString.Style.QUALIFIER_STYLER);
	}

	private StyledString reference(String text) {
		return new StyledString(text, StyledString.Style.COUNTER_STYLER);
	}

	private StyledString raw(String text) {
		return new StyledString(text);
	}


}
