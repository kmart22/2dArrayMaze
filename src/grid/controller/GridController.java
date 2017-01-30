package grid.controller;

import javax.swing.JOptionPane;
import grid.view.GridFrame;

public class GridController
{
	private GridFrame appFrame;
	
	public GridController()
	{
		// create model objects here!
		
		appFrame = new GridFrame(this);
		
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, " hey look at my 2d creation!");
	}
}
