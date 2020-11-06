package main;

public class ParkTest {
	
	public static void main(String [] args) {
		Object [] arr = {new Bike(2), new Car(4,"HYANDAI"), new Bike(4), new Car(4,"FERRARI")};
		((Bike) arr[0]).print(30);
		((Car)arr[1]).print(30);
		
		Stone s = new Stone();
		Garage gar=new Garage();
		
		gar.park(arr[0]);
		gar.park(arr[1]);
		gar.park(arr[2]);
		gar.park(arr[3]);
		gar.park(s);
		gar.park(gar);
	}
	
}

