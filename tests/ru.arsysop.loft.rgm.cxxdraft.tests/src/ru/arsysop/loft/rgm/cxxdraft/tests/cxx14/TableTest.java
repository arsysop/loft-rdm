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

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.DOMReader;
import org.junit.Test;
import org.w3c.tidy.Tidy;

import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.table.ParseTable;
import ru.arsysop.loft.rgm.spec.model.api.Section;
import ru.arsysop.loft.rgm.spec.model.api.Table;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class TableTest extends SpecTest {

	@Test
	public void defaultTable() {
		String raw = "<html><body><ul class='description'><li id='facet.num.get.virtuals-3.1'><div class='numberedTable' id='tab:localization.length.modifier.in'>Table <a href='#tab:localization.length.modifier.in'>74</a> — Length modifier<br><table ><tr class='rowsep'><td colspan='1' class='center'><b>Type</b></td><td class='center'> Length modifier </td></tr><tr class='capsep'><td class='left'> <span class='texttt'>short</span> </td><td class='center'> <span class='texttt'>h</span> </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>unsigned short</span> </td><td class='center'> <span class='texttt'>h</span> </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>long</span> </td><td class='center'> <span class='texttt'>l</span> </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>unsigned long</span> </td><td class='center'> <span class='texttt'>l</span> </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>long long</span> </td><td class='center'> <span class='texttt'>ll</span> </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>unsigned long long</span> </td><td class='center'> <span class='texttt'>ll</span> </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>double</span> </td><td class='center'> <span class='texttt'>l</span> </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>long double</span> </td><td class='center'> <span class='texttt'>L</span> </td></tr></table></div></li></div></ul></body></html>"; //$NON-NLS-1$
		Table table = parseTable(raw);
		assertEquals(table.getRows().get(0).getValues().get(0), "short"); //$NON-NLS-1$
		assertEquals(table.getTitle().getValues().get(0), "Type"); //$NON-NLS-1$
	}

	@Test
	public void complexTable() {
		String raw = "<!DOCTYPE html><html lang='en'><head><title>[fs.enum.copy.opts]</title><meta charset='UTF-8'/><link rel='stylesheet' type='text/css' href='14882.css'/><link rel='icon' href='icon.png'/></head><body><div class='wrapper'><h1 ><a class='secnum' style='min-width:73pt'>30</a> Input/output library <a class='abbr_ref' href='./#input.output'>[input.output]</a></h1><h2 ><a class='secnum' style='min-width:88pt'>30.10</a> File systems <a class='abbr_ref' href='filesystems#fs.enum.copy.opts'>[filesystems]</a></h2><h3 ><a class='secnum' style='min-width:103pt'>30.10.29</a> Enumerations <a class='abbr_ref' href='fs.enum#copy.opts'>[fs.enum]</a></h3><h4 ><a class='secnum' style='min-width:118pt'>30.10.29.3</a> Enum class <span class='texttt'>copy_&shy;options</span> <a class='abbr_ref'>[fs.enum.copy.opts]</a></h4><p ><span class='indexparent'><a class='index' id='lib:copy_options'></a></span></p><div class='para' id='1'><div class='marginalizedparent'><a class='marginalized' href='#1'>1</a></div><div class='sourceLinkParent'><a class='sourceLink' href='https://github.com/cplusplus/draft/tree/1af12266e2ba8c5a0eb0699f09fa5bde53dd70f3/source/iostreams.tex#L12434'>#</a></div><p >The <span class='texttt'>enum class</span> type <span class='texttt'>copy_&shy;options</span> is a bitmask type (<a href='bitmask.types'>[bitmask.types]</a>) that specifies bitmask constants used to control the semantics of copy operations. The constants are specified in option groups with the meanings listed in Table <a href='#tab:fs.enum.copy_options'>124</a>. Constant <span class='texttt'>none</span> is shown in each option group for purposes of exposition; implementations shall provide only a single definition.</p><div class='numberedTable' id='tab:fs.enum.copy_options'>Table <a href='#tab:fs.enum.copy_options'>124</a> — Enum class <span class='texttt'>copy_&shy;options</span><br><table ><tr class='rowsep'><td colspan='2' class='center'><b>Option group controlling <span class='texttt'>copy_&shy;file</span> function effects for existing target files</b></td></tr><tr class='rowsep'><td colspan='1' class='center'><b>Constant</b></td><td colspan='1' class='center'><b>Meaning</b></td></tr><tr class='capsep'><td class='left'> <span class='texttt'>none</span> </td><td class='justify'> (Default) Error; file already exists. </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>skip_&shy;existing</span> </td><td class='justify'> Do not overwrite existing file, do not report an error. </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>overwrite_&shy;existing</span> </td><td class='justify'> Overwrite the existing file. </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>update_&shy;existing</span> </td><td class='justify'> Overwrite the existing file if it is older than the replacement file. </td></tr><tr class='capsep'><td colspan='2' class='center'><b>Option group controlling <span class='texttt'>copy</span> function effects for sub-directories</b></td></tr><tr class='rowsep'><td colspan='1' class='center'><b>Constant</b></td><td colspan='1' class='center'><b>Meaning</b></td></tr><tr class='capsep'><td class='left'> <span class='texttt'>none</span> </td><td class='justify'> (Default) Do not copy sub-directories. </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>recursive</span> </td><td class='justify'> Recursively copy sub-directories and their contents. </td></tr><tr class='capsep'><td colspan='2' class='center'><b>Option group controlling <span class='texttt'>copy</span> function effects for symbolic links</b></td></tr><tr class='rowsep'><td colspan='1' class='center'><b>Constant</b></td><td colspan='1' class='center'><b>Meaning</b></td></tr><tr class='capsep'><td class='left'> <span class='texttt'>none</span> </td><td class='justify'> (Default) Follow symbolic links. </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>copy_&shy;symlinks</span> </td><td class='justify'> Copy symbolic links as symbolic links rather than copying the files that they point to. </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>skip_&shy;symlinks</span> </td><td class='justify'> Ignore symbolic links. </td></tr><tr class='capsep'><td colspan='2' class='center'><b>Option group controlling <span class='texttt'>copy</span> function effects for choosing the form of copying</b></td></tr><tr class='rowsep'><td colspan='1' class='center'><b>Constant</b></td><td colspan='1' class='center'><b>Meaning</b></td></tr><tr class='capsep'><td class='left'> <span class='texttt'>none</span> </td><td class='justify'> (Default) Copy content. </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>directories_&shy;only</span> </td><td class='justify'> Copy directory structure only, do not copy non-directory files. </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>create_&shy;symlinks</span> </td><td class='justify'> Make symbolic links instead of copies of files. The source path shall be an absolute path unless the destination path is in the current directory. </td></tr><tr class='rowsep'><td class='left'> <span class='texttt'>create_&shy;hard_&shy;links</span> </td><td class='justify'> Make hard links instead of copies of files. </td></tr></table></div></div></div></body></html>"; //$NON-NLS-1$
		Table table = parseTable(raw);
		assertEquals(table.getRows().get(4).getValues().get(0), "none"); //$NON-NLS-1$
		assertEquals(table.getTitle().getValues().get(0), "Constant"); //$NON-NLS-1$
	}

	private Table parseTable(String raw) {
		Section section = SpecFactory.eINSTANCE.createSection();
		section.setLocation(""); //$NON-NLS-1$
		Element tableElement = findTableElement(document(raw).getRootElement()).get();
		return new ParseTable(SpecFactory.eINSTANCE, context).apply(section, tableElement);
	}

	private Optional<Element> findTableElement(Element parent) {
		for (Element child : parent.elements()) {
			if ("div".equals(child.getName()) && new OfClass("numberedTable").test(child)) { //$NON-NLS-1$ //$NON-NLS-2$
				return Optional.of(child);
			}
			Optional<Element> tableInChild = findTableElement(child);
			if (tableInChild.isPresent()) {
				return tableInChild;
			}
		}
		return Optional.empty();
	}

	private Document document(String raw) {
		ByteArrayInputStream is = new ByteArrayInputStream(raw.getBytes(StandardCharsets.UTF_8));
		return new DOMReader().read(new Tidy().parseDOM(is, null /* no output */));
	}
}
