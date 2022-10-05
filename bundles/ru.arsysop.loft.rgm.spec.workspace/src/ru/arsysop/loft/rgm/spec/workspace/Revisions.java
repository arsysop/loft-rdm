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
package ru.arsysop.loft.rgm.spec.workspace;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import ru.arsysop.loft.rgm.internal.spec.workspace.Messages;
import ru.arsysop.loft.rgm.spec.model.api.Revision;

public final class Revisions {

	public List<Revision> fromExtensions() {
		return Stream.of(Platform.getExtensionRegistry()) //
				.map(r -> r.getExtensionPoint("ru.arsysop.loft.rgm.spec.model.revisions")) //$NON-NLS-1$
				.map(p -> p.getConfigurationElements()) //
				.flatMap(Stream::of) //
				.filter(e -> e.getName().equals("revision")) //$NON-NLS-1$
				.map(this::fromExtension) //
				.filter(Optional::isPresent) //
				.map(Optional::get) //
				.collect(Collectors.toList());
	}

	private Optional<Revision> fromExtension(IConfigurationElement element) {
		try {
			return Optional.of(element.createExecutableExtension("class")) //$NON-NLS-1$
					.filter(Revision.class::isInstance) //
					.map(Revision.class::cast);
		} catch (CoreException e) {
			Platform.getLog(getClass()).error(Messages.Revision_e_creationFailure, e);
			return Optional.empty();
		}
	}

}
