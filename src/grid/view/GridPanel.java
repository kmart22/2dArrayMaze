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
		this.colField = new JTextField("colField");
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
		this.add(colField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

	public GridController getBaseController()
	{
		return baseController;
	}
}
