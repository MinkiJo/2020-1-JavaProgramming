package main;

public class Car {
	protected int tire;
	protected String Company;
	protected int distance;
	
	Car(){
		this.tire = 4;
		this.Company = "HYANDAI";
		this.distance = 0;
	}
	Car(int tire,String Company){
		this.tire = tire;
		this.Company = Company;
		this.distance = 0;
	}
	
	protected void print(int distance)
	{
		this.distance += distance;
		System.out.print("���� Car�̰� "+distance+"m��ŭ �����մϴ�.");
		System.out.println(" �������� "+this.distance+"m��ŭ �����߽��ϴ�");
	}
}
