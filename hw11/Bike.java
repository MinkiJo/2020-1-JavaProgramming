package main;

public class Bike {
	protected int tire;	
	protected int distance;
	Bike(){
		this.tire = 4;		
		this.distance = 0;
	}
	Bike(int tire){
		this.tire = tire;		
		this.distance = 0;
	}
	
	
	protected void print(int distance)
	{
		this.distance += distance;
		System.out.print("���� Bike�̰� "+distance+"m��ŭ �����մϴ�.");
		System.out.println(" �������� "+this.distance+"m��ŭ �����߽��ϴ�");
	}
}
