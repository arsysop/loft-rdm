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
package ru.arsysop.loft.rgm.model.meta;

import org.eclipse.emf.ecore.EFactory;
import ru.arsysop.loft.rgm.model.api.CXXMethod;
import ru.arsysop.loft.rgm.model.api.Citation;
import ru.arsysop.loft.rgm.model.api.ClassDecl;
import ru.arsysop.loft.rgm.model.api.ClassTemplate;
import ru.arsysop.loft.rgm.model.api.Constructor;
import ru.arsysop.loft.rgm.model.api.Contract;
import ru.arsysop.loft.rgm.model.api.Destructor;
import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.EnumDecl;
import ru.arsysop.loft.rgm.model.api.FieldDecl;
import ru.arsysop.loft.rgm.model.api.FunctionDecl;
import ru.arsysop.loft.rgm.model.api.FunctionTemplate;
import ru.arsysop.loft.rgm.model.api.Header;
import ru.arsysop.loft.rgm.model.api.Index;
import ru.arsysop.loft.rgm.model.api.IndexEntry;
import ru.arsysop.loft.rgm.model.api.Markup;
import ru.arsysop.loft.rgm.model.api.Namespace;
import ru.arsysop.loft.rgm.model.api.Paragraph;
import ru.arsysop.loft.rgm.model.api.ParmDecl;
import ru.arsysop.loft.rgm.model.api.Requirement;
import ru.arsysop.loft.rgm.model.api.StructDecl;
import ru.arsysop.loft.rgm.model.api.Point;
import ru.arsysop.loft.rgm.model.api.Tag;
import ru.arsysop.loft.rgm.model.api.TemplateTypeParameter;
import ru.arsysop.loft.rgm.model.api.Toc;
import ru.arsysop.loft.rgm.model.api.TocChapter;
import ru.arsysop.loft.rgm.model.api.TypedefDecl;
import ru.arsysop.loft.rgm.model.api.UnionDecl;
import ru.arsysop.loft.rgm.model.api.VarDecl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.model.meta.RgmPackage
 * @generated
 */
public interface RgmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RgmFactory eINSTANCE = ru.arsysop.loft.rgm.model.impl.RgmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
	Paragraph createParagraph();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Markup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markup</em>'.
	 * @generated
	 */
	Markup createMarkup();

	/**
	 * Returns a new object of class '<em>Function Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Decl</em>'.
	 * @generated
	 */
	FunctionDecl createFunctionDecl();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Citation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Citation</em>'.
	 * @generated
	 */
	Citation createCitation();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	Namespace createNamespace();

	/**
	 * Returns a new object of class '<em>Class Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Decl</em>'.
	 * @generated
	 */
	ClassDecl createClassDecl();

	/**
	 * Returns a new object of class '<em>Enum Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Decl</em>'.
	 * @generated
	 */
	EnumDecl createEnumDecl();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Struct Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Decl</em>'.
	 * @generated
	 */
	StructDecl createStructDecl();

	/**
	 * Returns a new object of class '<em>Union Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Decl</em>'.
	 * @generated
	 */
	UnionDecl createUnionDecl();

	/**
	 * Returns a new object of class '<em>Field Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Decl</em>'.
	 * @generated
	 */
	FieldDecl createFieldDecl();

	/**
	 * Returns a new object of class '<em>Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Decl</em>'.
	 * @generated
	 */
	VarDecl createVarDecl();

	/**
	 * Returns a new object of class '<em>Typedef Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typedef Decl</em>'.
	 * @generated
	 */
	TypedefDecl createTypedefDecl();

	/**
	 * Returns a new object of class '<em>Parm Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parm Decl</em>'.
	 * @generated
	 */
	ParmDecl createParmDecl();

	/**
	 * Returns a new object of class '<em>Function Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Template</em>'.
	 * @generated
	 */
	FunctionTemplate createFunctionTemplate();

	/**
	 * Returns a new object of class '<em>Class Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Template</em>'.
	 * @generated
	 */
	ClassTemplate createClassTemplate();

	/**
	 * Returns a new object of class '<em>CXX Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CXX Method</em>'.
	 * @generated
	 */
	CXXMethod createCXXMethod();

	/**
	 * Returns a new object of class '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor</em>'.
	 * @generated
	 */
	Constructor createConstructor();

	/**
	 * Returns a new object of class '<em>Destructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destructor</em>'.
	 * @generated
	 */
	Destructor createDestructor();

	/**
	 * Returns a new object of class '<em>Template Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Type Parameter</em>'.
	 * @generated
	 */
	TemplateTypeParameter createTemplateTypeParameter();

	/**
	 * Returns a new object of class '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index</em>'.
	 * @generated
	 */
	Index createIndex();

	/**
	 * Returns a new object of class '<em>Index Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Entry</em>'.
	 * @generated
	 */
	IndexEntry createIndexEntry();

	/**
	 * Returns a new object of class '<em>Toc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toc</em>'.
	 * @generated
	 */
	Toc createToc();

	/**
	 * Returns a new object of class '<em>Toc Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toc Chapter</em>'.
	 * @generated
	 */
	TocChapter createTocChapter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RgmPackage getRgmPackage();

} //RgmFactory
