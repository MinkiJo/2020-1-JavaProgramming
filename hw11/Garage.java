package main;

public class Garage {
	protected int num;
	
	protected void park(Object o)
	{
		if(o instanceof Car || o instanceof Bike) {
			num++;
			System.out.println(o.getClass().getName()+"을 주차했습니다. (총 "+num+"대 주차됨)");
		}
		
		else
			System.out.println(o.getClass().getName()+"은 주차 불가합니다");
			
	}
}
