package main;

public class Figure {
	private double round;
	private double width;
	
	Figure()
	{
		this.round = 0;
		this.width = 0;
	}
	Figure(double round, double width)
	{
		this.round = round;
		this.width = width;
	}
	
	public String toString()
	{
		return "둘레는 "+this.round+"이고 넓이는 "+this.width+"입니다\n";
	}
	
}

