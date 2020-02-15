package com.lgc.lh.hardcopy.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
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
		newShell.setSize(400, 400);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		composite = new ScaleParamComposite(parent, SWT.NONE);
		return composite;
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Create page", true);
	}
	
	@Override
	protected boolean isResizable() {
		return true;
	}

}
