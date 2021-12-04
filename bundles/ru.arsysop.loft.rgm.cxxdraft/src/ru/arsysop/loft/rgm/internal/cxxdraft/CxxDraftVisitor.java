/*******************************************************************************
 * Copyright (c) 2021 ArSysOp.
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
 *     (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.internal.cxxdraft;

import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.ProcessingInstruction;
import org.dom4j.Text;
import org.dom4j.Visitor;

public final class CxxDraftVisitor implements Visitor {

	private final CxxDraftElements elements;

	public CxxDraftVisitor(DefaultDraft draft) {
		this.elements = new CxxDraftElements();
	}

	@Override
	public void visit(Text node) {
		// processed with Element node
	}

	@Override
	public void visit(ProcessingInstruction node) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Namespace namespace) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Entity node) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Comment node) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(CDATA node) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Attribute node) {
		// processed with Element node
	}

	@Override
	public void visit(Element node) {
		elements.accept(node);
	}

	@Override
	public void visit(DocumentType documentType) {
		// so far there is nothing interesting here
	}

	@Override
	public void visit(Document document) {
		// so far there is nothing interesting here
	}

}