package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;
import java.awt.Dimension;
import grid.view.GridPanel;


public class GridFrame extends JFrame
{
	
	private GridPanel gridPanel;
	
	private GridController baseController;

	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		this.gridPanel = new GridPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(gridPanel);
		this.setSize(new Dimension(600, 400));
		this.setTitle("2D Array Maze 2017");
		this.setResizable(false);
		this.setVisible(true);
	}
}
