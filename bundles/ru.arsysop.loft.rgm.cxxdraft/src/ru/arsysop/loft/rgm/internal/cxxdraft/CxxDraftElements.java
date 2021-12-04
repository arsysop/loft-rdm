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

import java.util.function.Consumer;

import org.dom4j.Element;

public final class CxxDraftElements implements Consumer<Element> {

	@Override
	public void accept(Element node) {
		String name = node.getName();
		switch (name) {
		case "span": //$NON-NLS-1$
			processSpan(node);
			break;
		case "h1": //$NON-NLS-1$
		case "h2": //$NON-NLS-1$
		case "h3": //$NON-NLS-1$
		case "h4": //$NON-NLS-1$
			processHx(node);
			break;
		case "hr": //$NON-NLS-1$
			processHr(node);
			break;
		case "em": //$NON-NLS-1$
			processEm(node);
			break;
		case "br": //$NON-NLS-1$
			processBr(node);
			break;
		case "a": //$NON-NLS-1$
			processA(node);
			break;
		case "div": //$NON-NLS-1$
			processDiv(node);
			break;
		case "body": //$NON-NLS-1$
			break;
		case "link": //$NON-NLS-1$
			processLink(node);
			break;
		case "title": //$NON-NLS-1$
			processTitle(node);
			break;
		case "meta": //$NON-NLS-1$
			break;
		case "head": //$NON-NLS-1$
			break;
		case "html": //$NON-NLS-1$
			break;
		default:
			System.out.println("CxxDraftVisitor.visit(Element): " + node); //$NON-NLS-1$
			break;
		}
	}

	private void processSpan(Element node) {
		// TODO check for content
	}

	private void processHx(Element node) {
		// TODO check for content
	}

	private void processHr(Element node) {
		// TODO most probably ignored, check for content
	}

	private void processEm(Element node) {
		// TODO get the text from it
	}

	private void processBr(Element node) {
		// TODO most probably ignored, check for content
	}

	private void processA(Element node) {
		// TODO depends on parent element
	}

	private void processDiv(Element node) {
		// TODO process div attributes
	}

	private void processLink(Element node) {
		// TODO process link attributes

	}

	private void processTitle(Element node) {
		// TODO process text node

	}

}
