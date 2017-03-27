package grid.model;

public class Number
{
	private int row;
	private int col;
	private int number;
	private int quadrant;
	
	
	public Number(int value)
	{
		this.number = value;
	}
	
	
	@Override
	public String toString()
	{
		// must return 5 characters for test.
		return Integer.toString(number);
	}


	public int getRow() 
	{
		return row;
	}


	public void setRow(int row) 
	{
		this.row = row;
	}


	public int getCol() 
	{
		return col;
	}


	public void setCol(int col) 
	{
		this.col = col;
	}


	public int getNumber() 
	{
		return number;
	}


	public void setNumber(int number) 
	{
		this.number = number;
	}


	public int getQuadrant() 
	{
		return quadrant;
	}


	public void setQuadrant(int quadrant) 
	{
		this.quadrant = quadrant;
	}
}
