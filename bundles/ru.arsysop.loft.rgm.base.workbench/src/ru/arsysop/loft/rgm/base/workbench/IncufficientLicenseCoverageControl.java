package ru.arsysop.loft.rgm.base.workbench;

import java.util.function.Supplier;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

//TODO: i18n
public final class IncufficientLicenseCoverageControl implements Supplier<Control> {

	private final Composite parent;
	private final String feature;

	public IncufficientLicenseCoverageControl(Composite parent, String feature) {
		this.parent = parent;
		this.feature = feature;
	}

	@Override
	public Control get() {
		Text text = new Text(parent, SWT.READ_ONLY | SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		text.setText(String.format("Incufficient license coverage for feature %s", feature)); //$NON-NLS-1$
		return text;
	}

}
