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

import java.util.ArrayList;
import java.util.List;

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

import ru.arsysop.loft.rgm.cxxdraft.Structure;

public final class CxxDraftVisitor implements Visitor {

	private final List<Structure> structures;

	public CxxDraftVisitor() {
		this.structures = new ArrayList<>();
	}

	@Override
	public void visit(Text node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ProcessingInstruction node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Namespace namespace) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Entity node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Comment node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(CDATA node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Attribute node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Element node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(DocumentType documentType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Document document) {
		// TODO Auto-generated method stub
		
	}

	public List<Structure> structures() {
		return new ArrayList<>(structures);
	}
}