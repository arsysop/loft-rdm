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
package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import ru.arsysop.loft.rgm.spec.model.api.Point;
import ru.arsysop.loft.rgm.spec.model.api.Section;

public final class PointContentTest extends SpecTest {

	@Test
	public final void hasContent() {
		document.getSections().forEach(this::checkParagraph);
	}

	private void checkParagraph(Section paragraph) {
		paragraph.getContents().stream() //
				.filter(Section.class::isInstance) //
				.map(Section.class::cast) //
				.forEach(this::checkParagraph);
		List<Point> collect = paragraph.getContents().stream() //
				.filter(Point.class::isInstance) //
				.map(Point.class::cast) //
				.collect(Collectors.toList());
		collect.forEach(this::checkPoint);
	}

	private void checkPoint(Point point) {
		assertFalse(String.format("Point %s has no content.", //$NON-NLS-1$
				point.getNumber()), //
				point.getContents().isEmpty());
	}

}
