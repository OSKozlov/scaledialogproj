package com.lgc.lh.hardcopy.dialog;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class LaunchDialog {
	
	public static void main(String[] args) {
		
		System.err.println("### Launch Scale Dialog ###");
		
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		
		ScaleDialog scaleDialog = new ScaleDialog(shell);
		scaleDialog.open();

	}

}
