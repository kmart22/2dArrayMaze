package grid.controller;

import javax.swing.JOptionPane;
import grid.view.GridFrame;

public class GridController
{
	private GridFrame appFrame;
	private Number [][] grid;
	
	public GridController()
	{
		// create model objects here!
		
		grid = new Number[6][5];
		appFrame = new GridFrame(this);
		
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, " hey look at my 2d creation!");
	}
	
	public Number[][] getGrid()
	{
		return grid;
	}
	
	public GridFrame getFrame()
	{
		return appFrame;
	}
}
