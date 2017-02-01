package grid.view;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.Dimension;
import java.awt.Color;
import grid.controller.GridController;


public class GridPanel extends JPanel
{
	private JTextField rowField;
	private JTextField colField;
	private JTextField inputField;
	private JLabel inputLabel;
	private JLabel rowLabel;
	private JLabel colLabel;
	private JButton submitButton;
	private JTable gridTable;
	private JScrollPane gridPane;
	
	private SpringLayout baseLayout;
	private GridController baseController;
	
	
	public GridPanel(GridController baseController)
	{
		super();
		
		this.rowField = new JTextField("rowField");
		this.inputField = new JTextField("inputField");
		this.inputLabel = new JLabel("inputLabel");
		this.rowLabel = new JLabel("rowLabel");
		this.colLabel = new JLabel("colLabel");
		this.submitButton = new JButton("sumbitButton");
		this.gridTable = new JTable();
		
		this.baseLayout = new SpringLayout();
		
		this.baseController = baseController;
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();	
		
	}
 	
	private void setupTable()
	{
		//load model
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one", "two", "three", "four", "five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		
		gridPane.setViewportView(gridTable);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(700, 700));
		this.setBackground(Color.PINK);
		this.add(gridPane);
		
		this.add(rowField);
		this.add(inputField);
		this.add(inputLabel);
		this.add(rowLabel);
		this.add(colLabel);
		this.add(submitButton);
		this.colField = new JTextField("colField");
		
		add(colField);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, inputLabel, 0, SpringLayout.NORTH, colLabel);
		baseLayout.putConstraint(SpringLayout.WEST, inputLabel, 0, SpringLayout.WEST, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, colLabel, 14, SpringLayout.SOUTH, rowLabel);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 41, SpringLayout.EAST, rowLabel);
		baseLayout.putConstraint(SpringLayout.WEST, colLabel, 0, SpringLayout.WEST, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 5, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 6, SpringLayout.EAST, rowField);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, 0, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 6, SpringLayout.SOUTH, gridPane);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 6, SpringLayout.SOUTH, gridPane);
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -85, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, colField, 4, SpringLayout.SOUTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, colField, 23, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 0, SpringLayout.WEST, colField);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, 63, SpringLayout.WEST, colField);
	}
	
	private void setupListeners()
	{
		
	}

	public GridController getBaseController()
	{
		return baseController;
	}
}
