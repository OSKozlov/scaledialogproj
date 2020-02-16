package com.lgc.lh.hardcopy.dialog;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ScaleDialogUIMgr {
	
	private Display display;
	
	private Shell shell;
	
	private static ScaleDialogUIMgr instance;
	
	private ScaleDialogUIMgr() {
	}

	public static ScaleDialogUIMgr getInstance() {
		if (instance == null) {
			instance = new ScaleDialogUIMgr();
		}
		return instance;
	}

	public void openDialog() {
		display = Display.getDefault();
		shell = new Shell(display);
		
		ScaleDialog scaleDialog = new ScaleDialog(shell);
		scaleDialog.open();
	}
}
