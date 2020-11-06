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
		System.out.print("나는 Bike이고 "+distance+"m만큼 직진합니다.");
		System.out.println(" 이제까지 "+this.distance+"m만큼 직진했습니다");
	}
}
