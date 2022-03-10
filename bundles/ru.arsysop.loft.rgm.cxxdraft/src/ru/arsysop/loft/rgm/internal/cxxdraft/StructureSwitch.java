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
package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.Objects;

import org.dom4j.Element;
import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.cxxdraft.Structure;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.model.api.Index;
import ru.arsysop.loft.rgm.spec.model.api.Paragraph;
import ru.arsysop.loft.rgm.spec.model.api.Toc;
import ru.arsysop.loft.rgm.spec.model.util.SpecSwitch;

public final class StructureSwitch extends SpecSwitch<Structure> {

	private final ResolutionContext context;

	public StructureSwitch(ResolutionContext context) {
		this.context = Objects.requireNonNull(context, "StructureSwitch::context"); //$NON-NLS-1$
	}

	@Override
	public Structure caseDocument(Document object) {
		return caseToc(object.getToc());
	}

	@Override
	public Structure caseIndex(Index object) {
		return new IndexStructure(object, context);
	}

	@Override
	public Structure caseToc(Toc object) {
		return new TocStructure(object, context);
	}

	@Override
	public Structure caseParagraph(Paragraph object) {
		return new ParagraphStructure(object, context);
	}

	@Override
	public Structure defaultCase(EObject object) {
		System.err.println("No structure for: " + object); //$NON-NLS-1$
		return new BaseStructure<EObject>(object, context) {

			@Override
			public void body(Element body) {
				// nothing for default case
			}
		};
	}

}
