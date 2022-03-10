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

import java.io.InputStream;
import java.net.URL;
import java.util.Objects;

import org.dom4j.io.DOMReader;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.w3c.tidy.Tidy;

import ru.arsysop.loft.rgm.cxxdraft.Structure;
import ru.arsysop.loft.rgm.internal.cxxdraft.Messages;

public final class PublishedHtml implements ICoreRunnable {

	private final String location;
	private final Structure structure;

	public PublishedHtml(String from, Structure to) {
		this.location = Objects.requireNonNull(from, "PublishedHtml::location"); //$NON-NLS-1$
		this.structure = Objects.requireNonNull(to, "PublishedHtml::structure"); //$NON-NLS-1$
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		try (InputStream is = new URL(location).openStream()) {
			Tidy tidy = new Tidy();
			tidy.setShowWarnings(false);
			structure.read(//
					new DOMReader()//
							.read(tidy.parseDOM(is, /* no output */null)));
		} catch (Exception e) {
			e.printStackTrace();
			throw new CoreException(//
					new Status(IStatus.ERROR, getClass().getName(), //
							NLS.bind(Messages.PublishedHtml_e_parsing_failed, location, e)));
		}
	}
}
