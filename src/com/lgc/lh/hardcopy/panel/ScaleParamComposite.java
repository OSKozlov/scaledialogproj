package com.lgc.lh.hardcopy.panel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ScaleParamComposite extends Composite {

	private Label currentWellLabel;
	private Label paperWidthLabel;
	private Label scaleLabel;
	private Label paperNameLabel;
	private Label currentWellValueLabel;
	
	private Button openCorrEditorButton;
	
	private Text paperWidthText;
	private Text scaleText;
	private Text paperNameText;
	
	private Combo presetsCombo;
	private Combo measurementCombo;
	
	private Composite wellOptionComposite;
	private Composite paperWidthComposite;
	private Composite scaleComposite;
	private Composite paperNameComposite;
	
	private String[] PRESETS_ITEMS = { "Presets", "Test2", "Test3", "Test4" };
	private String[] MEASUREMENT_ITEMS = { "Inch", "Meter", "Feet", "Km" };

	public ScaleParamComposite(Composite parent, int style) {
		super(parent, style);
		createContent();
	}

	private void createContent() {
		GridLayout layout = new GridLayout(1, false);
		setLayout(layout);

		// --------- Start of first row ----------
		GridLayout wellOptionLayout = new GridLayout(3, false);
		wellOptionComposite = new Composite(this, SWT.NONE);
		wellOptionComposite.setLayout(wellOptionLayout);
		
		GridData gridData = new GridData(GridData.BEGINNING, GridData.CENTER, false, false);
		gridData.horizontalAlignment = GridData.BEGINNING;
		
		currentWellLabel = new Label(wellOptionComposite, SWT.NONE);
		currentWellLabel.setText("&Current Well:"); 
		currentWellLabel.setLayoutData(gridData);

		gridData = new GridData(GridData.END, GridData.CENTER, false, false);
		gridData.horizontalAlignment = GridData.BEGINNING; 

		currentWellValueLabel = new Label(wellOptionComposite, SWT.NONE);
		currentWellValueLabel.setLayoutData(gridData);
		currentWellValueLabel.setText("6507/7-B-3 H");
		currentWellValueLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Times New Roman", 10, SWT.BOLD));
		
        Image image = new Image(Display.getDefault(), "select_wells_24.png");
		
		gridData = new GridData(GridData.FILL, GridData.FILL, true, false);
		gridData.widthHint = 25;
		gridData.heightHint = 25;
		gridData.horizontalIndent = 40;
        
		openCorrEditorButton = new Button(wellOptionComposite, SWT.NONE);
		openCorrEditorButton.setLayoutData(gridData);
		openCorrEditorButton.setImage(image);
		openCorrEditorButton.setBounds(20, 20, 35, 35);
		// --------- End of first row ----------

		// --------- Start of second row ----------
		GridLayout paperWidthLayout = new GridLayout(4, false);
		paperWidthComposite = new Composite(this, SWT.NONE);
		paperWidthComposite.setLayout(paperWidthLayout);
		
		paperWidthLabel = new Label(paperWidthComposite, SWT.NONE);
		paperWidthLabel.setText("&Paper width"); 
		paperWidthLabel.setLayoutData(new GridData(GridData.END, GridData.CENTER, false, false));
		paperWidthLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Times New Roman", 10, SWT.BOLD));

		paperWidthText = new Text(paperWidthComposite, SWT.BORDER);
		gridData = new GridData(GridData.FILL, GridData.FILL, true, false);
		gridData.widthHint = 205;
		gridData.heightHint = 20;
		paperWidthText.setLayoutData(gridData);
		
		gridData = new GridData(GridData.FILL, GridData.FILL, true, false);
		gridData.widthHint = 125;
		gridData.heightHint = 20;
		
		presetsCombo = new Combo(paperWidthComposite, SWT.READ_ONLY);
		presetsCombo.setLayoutData(gridData);
		presetsCombo.setItems(PRESETS_ITEMS);
		presetsCombo.select(0);
		
		measurementCombo = new Combo(paperWidthComposite, SWT.READ_ONLY);
		measurementCombo.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
		measurementCombo.setItems(MEASUREMENT_ITEMS);
		measurementCombo.select(0);
		
		// --------- End of second row ----------
		
		GridLayout scaleLayout = new GridLayout(2, false);
		scaleComposite = new Composite(this, SWT.NONE);
		scaleComposite.setLayout(scaleLayout);
		
		gridData = new GridData(GridData.BEGINNING, GridData.CENTER, false, false);
		
		scaleLabel = new Label(scaleComposite, SWT.NONE);
		scaleLabel.setText("&Scale           "); 
		scaleLabel.setLayoutData(gridData);
		scaleLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Times New Roman", 10, SWT.BOLD));

		gridData = new GridData(GridData.BEGINNING, GridData.CENTER, false, false);
		gridData.widthHint = 205;
		gridData.heightHint = 20;
		gridData.horizontalIndent = 2;
		scaleText = new Text(scaleComposite, SWT.BORDER);
		scaleText.setLayoutData(gridData);
		
		
		GridLayout paperNameLayout = new GridLayout(2, false);
		paperNameComposite = new Composite(this, SWT.NONE);
		paperNameComposite.setLayout(paperNameLayout);
		
		gridData = new GridData(GridData.BEGINNING, GridData.CENTER, false, false);
		
		paperNameLabel = new Label(paperNameComposite, SWT.NONE);
		paperNameLabel.setText("&Paper name");
		paperNameLabel.setLayoutData(gridData);
		paperNameLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Times New Roman", 10, SWT.BOLD));

		gridData = new GridData(GridData.BEGINNING, GridData.CENTER, false, false);
		gridData.widthHint = 205;
		gridData.heightHint = 20;
		
		paperNameText = new Text(paperNameComposite, SWT.BORDER);
		paperNameText.setLayoutData(gridData);
		
	}

	public void setCurrentWellLabel(Label currentWellLabel) {
		this.currentWellLabel = currentWellLabel;
	}

	public void setPaperWidthText(String text) {
		if (!paperNameText.isDisposed()) {
			paperWidthText.setText(text);
		}
	}

	public void setScaleText(String text) {
		if (!scaleText.isDisposed()) {
			scaleText.setText(text);
		}
	}

	public void setPaperNameText(String text) {
		if (!paperNameText.isDisposed()) {
			paperNameText.setText(text);
		}
	}

}
