/*******************************************************************************
 * Copyright (c) ArSysOp 2018-2022
 * 
 * RGM Sources are publicly available only for 
 * informational, review, analysis and consulting purposes.
 * 
 * Definitions, terms and conditions for using RGM Sources are stated by ArSysOp Source License version 1.0.
 * See http://arsysop.ru/licenses/rgm/ArSysOpSourceLicense-1.0.txt
 * 
 * RGM Sources are provided on "as is" basis. 
 * ArSysOp is not responsible for any damages, losses, legal prosecution 
 * or other consequences of any sort that using RGM Sources can cause to you 
 * (as an individual or Legal Entity), even if aware of such consequences.
 * 
*******************************************************************************/
package ru.arsysop.loft.rgm.spec.model.api;

import java.util.List;
import java.util.Optional;

public interface DomElement {

	List<DomElement> elements();

	List<DomElement> elements(String name);

	Optional<DomElement> element(String name);

	Optional<DomElement> searchForElement(String name);

	int nodeCount();

	Optional<DomElement> node(int index) throws IndexOutOfBoundsException;

	String nodeText(int index) throws IndexOutOfBoundsException;

	String containingText();

	List<String> containingNames();

	Optional<String> attributeValue(String name);

	String name();

	String elementText(String name);

	String text();
}
