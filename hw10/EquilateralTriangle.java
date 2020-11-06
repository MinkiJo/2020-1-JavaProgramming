package main;

public class EquilateralTriangle extends Figure{
	private double length;
	private double height;
	EquilateralTriangle()
	{
		this.length = 0;
		this.height = 0;
	}
	EquilateralTriangle(double length,double height, double round, double width)
	{	
		super(round,width);
		this.length = length;
		this.height = height;
	}
	public String toString()
	{
		return "이 도형은 EquilateralTriangle 이고 "+super.toString()+"이 삼각형의 한변의 길이는  "+this.length+"이고 높이는 "+this.height+"입니다\n\n";
	}
	
}
