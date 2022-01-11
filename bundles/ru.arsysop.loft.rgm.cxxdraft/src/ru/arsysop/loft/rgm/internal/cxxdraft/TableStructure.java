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
package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.WithId;
import ru.arsysop.loft.rgm.spec.model.api.Table;
import ru.arsysop.loft.rgm.spec.model.api.TableRow;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class TableStructure extends BaseStructure<Table> {

	private final SpecFactory factory;

	protected TableStructure(Table container, ResolutionContext context) {
		super(container, context);
		factory = SpecFactory.eINSTANCE;
	}

	@Override
	public void body(Element body) {
		Optional<Element> paragraph = Optional.ofNullable(body.element("div")) //$NON-NLS-1$
				.map(div -> div.element("div")); //$NON-NLS-1$
		if (paragraph.isPresent()) {
			String id = container.getId().split("#")[1]; //$NON-NLS-1$
			paragraph.get().elements("div").stream() //$NON-NLS-1$
					.filter(new OfClass("para")) //$NON-NLS-1$
					.flatMap(para -> para.elements("div").stream()) //$NON-NLS-1$
					.filter(new OfClass("numberedTable")) // //$NON-NLS-1$
					.filter(new WithId(id)) //
					.forEach(this::fillTable);
		}
	}

	private void fillTable(Element div) {
		List<Element> rows = div.element("table").elements("tr"); //$NON-NLS-1$//$NON-NLS-2$
		container.setTitle(collectRow(rows.get(0)));
		if (rows.size() > 1) {
			List<Element> remaining = rows.subList(1, rows.size() - 1);
			container.getRows().addAll(remaining.stream().map(this::collectRow).collect(Collectors.toList()));
		}
	}

	private TableRow collectRow(Element tr) {
		List<Element> cells = tr.elements("td"); //$NON-NLS-1$
		TableRow row = factory.createTableRow();
		cells.stream().map(this::extractText).forEach(row.getValues()::add);
		return row;
	}

	private String extractText(Element cell) {
		return cell.content().stream().map(Node::getText).collect(Collectors.joining(" ")); //$NON-NLS-1$
	}

}
