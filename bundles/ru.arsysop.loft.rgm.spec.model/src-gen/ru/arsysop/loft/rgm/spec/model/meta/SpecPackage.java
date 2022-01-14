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
package ru.arsysop.loft.rgm.spec.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecFactory
 * @model kind="package"
 * @generated
 */
public interface SpecPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spec"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.arsysop.ru/rgm/spec/0.1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spec"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecPackage eINSTANCE = ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.DocumentImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__REVISION = 3;

	/**
	 * The feature id for the '<em><b>Toc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TOC = 4;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PARAGRAPHS = 5;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__INDEXES = 6;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.PartImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getPart()
	 * @generated
	 */
	int PART = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = 1;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.WithPartsImpl <em>With Parts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.WithPartsImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getWithParts()
	 * @generated
	 */
	int WITH_PARTS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_PARTS__ID = PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_PARTS__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_PARTS__PARTS = PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>With Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_PARTS_FEATURE_COUNT = PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>With Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_PARTS_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.WithTocChaptersImpl <em>With Toc Chapters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.WithTocChaptersImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getWithTocChapters()
	 * @generated
	 */
	int WITH_TOC_CHAPTERS = 3;

	/**
	 * The feature id for the '<em><b>Chapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_TOC_CHAPTERS__CHAPTERS = 0;

	/**
	 * The number of structural features of the '<em>With Toc Chapters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_TOC_CHAPTERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>With Toc Chapters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_TOC_CHAPTERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.TocImpl <em>Toc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.TocImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getToc()
	 * @generated
	 */
	int TOC = 4;

	/**
	 * The feature id for the '<em><b>Chapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC__CHAPTERS = WITH_TOC_CHAPTERS__CHAPTERS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC__DOCUMENT = WITH_TOC_CHAPTERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_FEATURE_COUNT = WITH_TOC_CHAPTERS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Toc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_OPERATION_COUNT = WITH_TOC_CHAPTERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.TocChapterImpl <em>Toc Chapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.TocChapterImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getTocChapter()
	 * @generated
	 */
	int TOC_CHAPTER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_CHAPTER__ID = PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_CHAPTER__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Chapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_CHAPTER__CHAPTERS = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_CHAPTER__NUMBER = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_CHAPTER__PART = PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Toc Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_CHAPTER_FEATURE_COUNT = PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Toc Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_CHAPTER_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.ParagraphImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ID = WITH_PARTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__NAME = WITH_PARTS__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__PARTS = WITH_PARTS__PARTS;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__NUMBER = WITH_PARTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = WITH_PARTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = WITH_PARTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.PointImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ID = PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__REFERENCES = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__TEXT = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__TABLES = PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.IndexImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ID = PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ENTRIES = PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.IndexEntryImpl <em>Index Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.IndexEntryImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getIndexEntry()
	 * @generated
	 */
	int INDEX_ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__KEYWORD = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__PARTS = 3;

	/**
	 * The feature id for the '<em><b>See</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__SEE = 4;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__SUBENTRIES = 5;

	/**
	 * The number of structural features of the '<em>Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.StyledNodeImpl <em>Styled Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.StyledNodeImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getStyledNode()
	 * @generated
	 */
	int STYLED_NODE = 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_NODE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_NODE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Styled Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Styled Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.StyledLineImpl <em>Styled Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.StyledLineImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getStyledLine()
	 * @generated
	 */
	int STYLED_LINE = 11;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_LINE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Styled Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Styled Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_LINE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.TableImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE = PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.arsysop.loft.rgm.spec.model.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.loft.rgm.spec.model.impl.TableRowImpl
	 * @see ru.arsysop.loft.rgm.spec.model.impl.SpecPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ID = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.Document#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Document#getId()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Id();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.Document#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Document#getVersion()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Version();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.Document#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Document#getRevision()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Revision();

	/**
	 * Returns the meta object for the containment reference '{@link ru.arsysop.loft.rgm.spec.model.api.Document#getToc <em>Toc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Toc</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Document#getToc()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Toc();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.spec.model.api.Document#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Document#getParagraphs()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Paragraphs();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.spec.model.api.Document#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Document#getIndexes()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Indexes();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.Part#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Part#getId()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Id();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.Part#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Part#getName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Name();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.WithParts <em>With Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>With Parts</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.WithParts
	 * @generated
	 */
	EClass getWithParts();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.spec.model.api.WithParts#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.WithParts#getParts()
	 * @see #getWithParts()
	 * @generated
	 */
	EReference getWithParts_Parts();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.WithTocChapters <em>With Toc Chapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>With Toc Chapters</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.WithTocChapters
	 * @generated
	 */
	EClass getWithTocChapters();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.spec.model.api.WithTocChapters#getChapters <em>Chapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chapters</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.WithTocChapters#getChapters()
	 * @see #getWithTocChapters()
	 * @generated
	 */
	EReference getWithTocChapters_Chapters();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.Toc <em>Toc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toc</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Toc
	 * @generated
	 */
	EClass getToc();

	/**
	 * Returns the meta object for the container reference '{@link ru.arsysop.loft.rgm.spec.model.api.Toc#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Toc#getDocument()
	 * @see #getToc()
	 * @generated
	 */
	EReference getToc_Document();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter <em>Toc Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toc Chapter</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.TocChapter
	 * @generated
	 */
	EClass getTocChapter();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.TocChapter#getNumber()
	 * @see #getTocChapter()
	 * @generated
	 */
	EAttribute getTocChapter_Number();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.TocChapter#getPart()
	 * @see #getTocChapter()
	 * @generated
	 */
	EReference getTocChapter_Part();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.Paragraph#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Paragraph#getNumber()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Number();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.spec.model.api.Point#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Point#getReferences()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_References();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.spec.model.api.Point#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Point#getText()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.spec.model.api.Point#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Point#getTables()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Tables();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.spec.model.api.Index#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Index#getEntries()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Entries();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.IndexEntry <em>Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Entry</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.IndexEntry
	 * @generated
	 */
	EClass getIndexEntry();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getId()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EAttribute getIndexEntry_Id();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getKeyword()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EAttribute getIndexEntry_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getText()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EAttribute getIndexEntry_Text();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parts</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getParts()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EReference getIndexEntry_Parts();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getSee <em>See</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>See</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getSee()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EReference getIndexEntry_See();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getSubentries <em>Subentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subentries</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.IndexEntry#getSubentries()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EReference getIndexEntry_Subentries();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.StyledNode <em>Styled Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled Node</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.StyledNode
	 * @generated
	 */
	EClass getStyledNode();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.StyledNode#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.StyledNode#getText()
	 * @see #getStyledNode()
	 * @generated
	 */
	EAttribute getStyledNode_Text();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.StyledNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.StyledNode#getType()
	 * @see #getStyledNode()
	 * @generated
	 */
	EAttribute getStyledNode_Type();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.StyledLine <em>Styled Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled Line</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.StyledLine
	 * @generated
	 */
	EClass getStyledLine();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.loft.rgm.spec.model.api.StyledLine#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.StyledLine#getText()
	 * @see #getStyledLine()
	 * @generated
	 */
	EReference getStyledLine_Text();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the reference list '{@link ru.arsysop.loft.rgm.spec.model.api.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rows</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for the reference '{@link ru.arsysop.loft.rgm.spec.model.api.Table#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Table#getTitle()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Title();

	/**
	 * Returns the meta object for class '{@link ru.arsysop.loft.rgm.spec.model.api.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.loft.rgm.spec.model.api.TableRow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.TableRow#getId()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Id();

	/**
	 * Returns the meta object for the attribute list '{@link ru.arsysop.loft.rgm.spec.model.api.TableRow#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see ru.arsysop.loft.rgm.spec.model.api.TableRow#getValues()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Values();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecFactory getSpecFactory();

} //SpecPackage
