package main;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquilateralTriangle T = new EquilateralTriangle(3.00, 2.60,9.00,3.90);
		System.out.print(T.toString());
		
		Circle c1 = new Circle(3.00,18.85,28.27);
		System.out.print(c1.toString());
		
		Circle c2 = new Circle(1.00,6.28,3.14);
		System.out.print(c2.toString());
		
		if(c1.equals(c2))
			System.out.println("두 원은 합동입니다");
		else System.out.println("두 원은 합동이 아닙니다");
	}

}
