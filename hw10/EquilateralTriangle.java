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
		return "�� ������ EquilateralTriangle �̰� "+super.toString()+"�� �ﰢ���� �Ѻ��� ���̴�  "+this.length+"�̰� ���̴� "+this.height+"�Դϴ�\n\n";
	}
	
}
