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
package ru.arsysop.loft.rgm.spec.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.arsysop.loft.rgm.spec.model.api.*;

import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;
import ru.arsysop.loft.rgm.spec.model.meta.SpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecFactoryImpl extends EFactoryImpl implements SpecFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecFactory init() {
		try {
			SpecFactory theSpecFactory = (SpecFactory)EPackage.Registry.INSTANCE.getEFactory(SpecPackage.eNS_URI);
			if (theSpecFactory != null) {
				return theSpecFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpecFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpecPackage.DOCUMENT: return createDocument();
			case SpecPackage.TOC: return createToc();
			case SpecPackage.TOC_CHAPTER: return createTocChapter();
			case SpecPackage.PARAGRAPH: return createParagraph();
			case SpecPackage.POINT: return createPoint();
			case SpecPackage.INDEX: return createIndex();
			case SpecPackage.INDEX_ENTRY: return createIndexEntry();
			case SpecPackage.STYLED_NODE: return createStyledNode();
			case SpecPackage.STYLED_LINE: return createStyledLine();
			case SpecPackage.TABLE: return createTable();
			case SpecPackage.TABLE_ROW: return createTableRow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toc createToc() {
		TocImpl toc = new TocImpl();
		return toc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TocChapter createTocChapter() {
		TocChapterImpl tocChapter = new TocChapterImpl();
		return tocChapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexEntry createIndexEntry() {
		IndexEntryImpl indexEntry = new IndexEntryImpl();
		return indexEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyledNode createStyledNode() {
		StyledNodeImpl styledNode = new StyledNodeImpl();
		return styledNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyledLine createStyledLine() {
		StyledLineImpl styledLine = new StyledLineImpl();
		return styledLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecPackage getSpecPackage() {
		return (SpecPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpecPackage getPackage() {
		return SpecPackage.eINSTANCE;
	}

} //SpecFactoryImpl
