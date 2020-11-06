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
		return "�� ������ Circle�̰� "+super.toString()+"�� �������� "+radius+"�Դϴ�\n\n";
	}
	 public boolean equals(Circle c)
	 {
		 if(c.radius == this.radius)
			 return true;
		 else return false;
	 }
}
