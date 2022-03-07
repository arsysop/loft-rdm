package ru.arsysop.loft.rgm.base.workbench;

import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.passage.lic.api.requirements.Feature;
import org.eclipse.passage.lic.jface.EquinoxPassageUI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;

public final class RestrictedControls {

	private final Feature feature;
	private final Consumer<SelectionEvent> click;

	public RestrictedControls(Feature feature) {
		this.feature = feature;
		this.click = this::assess;
	}

	public boolean isRestricted(Control control) {
		return Optional.ofNullable(control)//
				.map(c -> c.getData(feature.identifier()))//
				.isPresent();
	}

	public Control createLink(Composite parent) {
		Link link = new Link(parent, SWT.WRAP | SWT.NO_FOCUS);
		link.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		link.setText("<a>" + //$NON-NLS-1$
		// FIXME: AF: i18n
				String.format("Incufficient license coverage for feature \"%s\"", feature.name()) //$NON-NLS-1$
				+ "</a>"); //$NON-NLS-1$
		link.setData(feature.identifier(), feature);
		link.addSelectionListener(SelectionListener.widgetSelectedAdapter(click));
		return link;
	}

	private void assess(SelectionEvent e) {
		new EquinoxPassageUI(e.widget.getDisplay()::getActiveShell).assessLicensingStatus();
	}

}
