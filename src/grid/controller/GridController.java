package grid.controller;

import javax.swing.JOptionPane;
import grid.view.GridFrame;
import grid.model.Number;

public class GridController
{
	private GridFrame appFrame;
	private Number [][] grid;
	
	public GridController()
	{
		// create model objects here!
		
		grid = new Number[6][5];
		fillGrid();
		appFrame = new GridFrame(this);
		
	}
	
	private void fillGrid()
	{
		for (int row =0; row < grid.length; row++)
		{
			for ( int col = 0; col < grid[0].length; col++)
			{
				grid[row][col] = new Number(1);
			}
		}
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
	
	public void updateNumber(String row, String col, String value)
	{
		if(isValid(row) && isValid(col) && isValid(value))
		{
			grid[Integer.parseInt(row)][Integer.parseInt(col)].setNumber(Integer.parseInt(value));
		}
	}
	
	private boolean isValid(String temp)
	{
		try
		{
			Integer.parseInt(temp);
			return true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "use ints silly");
			return false;
		}
	}
}
