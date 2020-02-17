package com.lgc.lh.hardcopy.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import com.lgc.lh.hardcopy.panel.ScaleParamComposite;

public class ScaleDialog extends Dialog {
	
	private final static String TITLE = "Set paper to Well length";
	
	private ScaleParamComposite composite;

	public ScaleDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(TITLE); 
		newShell.setSize(550, 270);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		composite = new ScaleParamComposite(parent, SWT.NONE);
		System.err.println("### composite = " + composite.hashCode());
		return composite;
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
//		createButton(parent, IDialogConstants.OK_ID, "Create page", true);
	}
	
	@Override
	protected Control createButtonBar(final Composite parent)
	{
	    final Composite buttonBar = new Composite(parent, SWT.NONE);

	    final GridLayout layout = new GridLayout();
	    layout.numColumns = 2;
	    layout.makeColumnsEqualWidth = false;
	    layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
	    buttonBar.setLayout(layout);

	    final GridData data = new GridData(SWT.FILL, SWT.BOTTOM, true, false);
	    data.grabExcessHorizontalSpace = true;
	    data.grabExcessVerticalSpace = false;
	    buttonBar.setLayoutData(data);

	    buttonBar.setFont(parent.getFont());

	    // place a button in the center
	    final Button button = new Button(buttonBar, SWT.PUSH);
	    button.setText("Create page");

	    final GridData leftButtonData = new GridData(SWT.CENTER, SWT.CENTER, true, true);
	    leftButtonData.grabExcessHorizontalSpace = true;
	    leftButtonData.horizontalIndent = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
	    button.setLayoutData(leftButtonData);

	    // add the dialog's button bar to the right
	    final Control buttonControl = super.createButtonBar(buttonBar);
	    buttonControl.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false));

	    return buttonBar;
	}

	@Override
	protected boolean isResizable() {
		return false;
	}

	public ScaleParamComposite getComposite() {
		System.err.println("### composite 2 = " + composite.hashCode());
		return composite;
	}

}
