package main;

public class Circle extends Figure{

	private double radius;
	Circle()
	{
		this.radius = 0;
	}
	Circle(double radius, double round, double width)
	{	
		super(round,width);
		this.radius = radius;		
	}
	
	public String toString()
	{
		return "이 도형은 Circle이고 "+super.toString()+"또 반지름은 "+radius+"입니다\n\n";
	}
	 public boolean equals(Circle c)
	 {
		 if(c.radius == this.radius)
			 return true;
		 else return false;
	 }
}
