package com.lgc.lh.hardcopy.dialog;

public class LaunchDialog {
	
	public static void main(String[] args) {
		
		System.err.println("### Launch Scale Dialog ###");
		
		ScaleDialogUIMgr scaleDialogUIMgr = ScaleDialogUIMgr.getInstance();
		scaleDialogUIMgr.openDialog();
		
		scaleDialogUIMgr.setPaperWidth("2.5");
		scaleDialogUIMgr.setScale("78.1");
		scaleDialogUIMgr.setPaperName("6507/7-B-3H");

	}

}
