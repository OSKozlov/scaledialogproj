package com.lgc.lh.hardcopy.panel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
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
	
	private String[] PRESETS_ITEMS = { "Presets", "1:100", "1:300", "1:500", 
												  "1:700", "1:1000", "1:1200",
												  "1:2400", "1:2500", "1:4800",
												  "1:5000", "1:10000", "1:12000",
												  "1:24000", "1:25000", "1:48000",
												  "1:50000", "1:96000", "1:100000",
												  "1:144000", "1:192000", "1:200000",
												  "1:250000", "1:288000", "1:500000",
												  "1:576000", "1:1000000" };
	private String[] MEASUREMENT_ITEMS = { "Inch", "Meter", "Feet", "Km" };

	public ScaleParamComposite(Composite parent, int style) {
		super(parent, style);
		createContent();
		
		initListeners();
	}
	
	private void initListeners() {
		openCorrEditorButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				System.err.println("### Test Well button");
			}
		});
	}

	private void createContent() {
		GridLayout layout = new GridLayout(1, false);
		setLayout(layout);

		createWellOptionComponent();
		createPaperWidthComponent();
		createScaleComponent();
		createWellNameComponent();
	}
	
	private void createWellOptionComponent() {
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
		openCorrEditorButton.setToolTipText("Option to open up correlation editor wells");
	}
	
	private void createPaperWidthComponent() {

		GridLayout paperWidthLayout = new GridLayout(4, false);
		paperWidthComposite = new Composite(this, SWT.NONE);
		paperWidthComposite.setLayout(paperWidthLayout);
		
		paperWidthLabel = new Label(paperWidthComposite, SWT.NONE);
		paperWidthLabel.setText("&Paper width"); 
		paperWidthLabel.setLayoutData(new GridData(GridData.END, GridData.CENTER, false, false));
		paperWidthLabel.setFont(new org.eclipse.swt.graphics.Font(null, "Times New Roman", 10, SWT.BOLD));

		paperWidthText = new Text(paperWidthComposite, SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL, GridData.FILL, true, false);
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
	}
	
	private void createScaleComponent() {
		GridLayout scaleLayout = new GridLayout(2, false);
		scaleComposite = new Composite(this, SWT.NONE);
		scaleComposite.setLayout(scaleLayout);
		
		GridData gridData = new GridData(GridData.BEGINNING, GridData.CENTER, false, false);
		
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
	}
	
	private void createWellNameComponent() {
		GridLayout paperNameLayout = new GridLayout(2, false);
		paperNameComposite = new Composite(this, SWT.NONE);
		paperNameComposite.setLayout(paperNameLayout);
		
		GridData gridData = new GridData(GridData.BEGINNING, GridData.CENTER, false, false);
		
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

	public void setCurrentWellLabel(String text) {
		currentWellValueLabel.setText(text);
	}

	public void setPaperWidthText(String text) {
		paperWidthText.setText(text);
	}

	public void setScaleText(String text) {
		scaleText.setText(text);
	}

	public void setPaperNameText(String text) {
		paperNameText.setText(text);
	}

}