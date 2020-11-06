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
		System.out.print("나는 Car이고 "+distance+"m만큼 직진합니다.");
		System.out.println(" 이제까지 "+this.distance+"m만큼 직진했습니다");
	}
}
