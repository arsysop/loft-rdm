package ru.arsysop.loft.rgm.internal.spec.workbench;

import org.eclipse.passage.lic.jface.EquinoxPassageUI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import ru.arsysop.loft.rgm.seal.protection.RgmFeatures;

//TODO: i18n
@SuppressWarnings("restriction")
final class IncufficientLicenseCoverageControl {

	private final String feature;

	IncufficientLicenseCoverageControl() {
		this.feature = new RgmFeatures.Spec().browser();
	}

	void install(Composite parent) {
		installText(parent);
		installButton(parent);
	}

	private void installText(Composite parent) {
		Text text = new Text(parent, SWT.READ_ONLY | SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		text.setText(String.format("Incufficient license coverage for feature %s", feature)); //$NON-NLS-1$
	}

	private void installButton(Composite parent) {
		Button assess = new Button(parent, SWT.PUSH);
		assess.setLayoutData(new GridData(SWT.CENTER, SWT.NONE, false, false));
		assess.setText("Details..."); //$NON-NLS-1$
		assess.addSelectionListener(SelectionListener.widgetSelectedAdapter(this::assess));
	}

	private void assess(SelectionEvent e) {
		new EquinoxPassageUI(e.widget.getDisplay()::getActiveShell).assessLicensingStatus();
	}

}
