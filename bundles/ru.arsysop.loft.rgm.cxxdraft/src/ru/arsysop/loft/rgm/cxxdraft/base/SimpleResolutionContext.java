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
package ru.arsysop.loft.rgm.cxxdraft.base;

import java.util.Objects;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.osgi.util.NLS;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.Messages;
import ru.arsysop.loft.rgm.spec.model.api.ContentResolution;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.model.api.IndexEntry;
import ru.arsysop.loft.rgm.spec.model.api.Part;
import ru.arsysop.loft.rgm.spec.model.base.SimpleContentResolution;

public final class SimpleResolutionContext implements ResolutionContext {

	private final String location;
	private final Document document;
	private final ContentResolution<Part> parts;
	private final ContentResolution<IndexEntry> ientries;
	private final BasicDiagnostic status;

	public SimpleResolutionContext(String location, Document document) {
		this.location = Objects.requireNonNull(location, "SimpleResolutionContext::location"); //$NON-NLS-1$
		this.document = Objects.requireNonNull(document, "SimpleResolutionContext::document"); //$NON-NLS-1$
		this.parts = new SimpleContentResolution<>();
		this.ientries = new SimpleContentResolution<>();
		this.status = new BasicDiagnostic(Diagnostic.OK, getClass().getName(), 0, //
				NLS.bind(Messages.SimpleResolutionContext_d_base_message, location), //
				null);
	}

	@Override
	public String rootLocation() {
		return location;
	}

	@Override
	public String resolveLocation(String suffix) {
		return rootLocation() + suffix;
	}

	@Override
	public Document document() {
		return document;
	}

	@Override
	public Diagnostic diagnostic() {
		return status;
	}

	@Override
	public ContentResolution<Part> parts() {
		return parts;
	}

	@Override
	public ContentResolution<IndexEntry> indexEntries() {
		return ientries;
	}

}
