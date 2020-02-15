package com.lgc.lh.hardcopy.panel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ScaleParamComposite extends Composite {

	private Label currentWellLabel;
	private Label paperWidthLabel;
	private Label scaleLabel;
	private Label paperNameLabel;

	private Text currentWellText;
	private Text paperWidthText;
	private Text scaleText;
	private Text paperNameText;
	
	private Combo presetsCombo;
	private Combo measurementCombo;

	public ScaleParamComposite(Composite parent, int style) {
		super(parent, style);
		createContent();
	}

	private void createContent() {
		GridLayout layout = new GridLayout(2, false);
		setLayout(layout);

		currentWellLabel = new Label(this, SWT.NONE);
		currentWellLabel.setText("&Current Well:"); 
		currentWellLabel.setLayoutData(new GridData(GridData.END, GridData.CENTER, false, false));

		currentWellText = new Text(this, SWT.BORDER);
		currentWellText.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));

		paperWidthLabel = new Label(this, SWT.NONE);
		paperWidthLabel.setText("&Paper width:"); 
		paperWidthLabel.setLayoutData(new GridData(GridData.END, GridData.CENTER, false, false));

		paperWidthText = new Text(this, SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL, GridData.FILL, true, false);
		gridData.widthHint = 200;
		paperWidthText.setLayoutData(gridData);
		
		scaleLabel = new Label(this, SWT.NONE);
		scaleLabel.setText("&Scale:"); 
		scaleLabel.setLayoutData(new GridData(GridData.END, GridData.CENTER, false, false));

		scaleText = new Text(this, SWT.BORDER);
		scaleText.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
		
		paperNameLabel = new Label(this, SWT.NONE);
		paperNameLabel.setText("&Paper name:");
		paperNameLabel.setLayoutData(new GridData(GridData.END, GridData.CENTER, true, false));

		paperNameText = new Text(this, SWT.BORDER);
		paperNameText.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
		
		presetsCombo = new Combo(this, SWT.READ_ONLY);
		presetsCombo.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
		
		measurementCombo = new Combo(this, SWT.READ_ONLY);
		measurementCombo.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
	}

}
