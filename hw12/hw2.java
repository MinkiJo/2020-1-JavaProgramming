package main;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
	
		
		try {
			after10();
		}catch(TooOldException e) {
			System.out.print("���̰� �߸��Ǿ����ϴ�");
	
		}
	}
	
	static void after10() throws TooOldException{
		Scanner s= new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���");
		int age = s.nextInt();
		
		if(age>=200 || age<=0) 
			throw new TooOldException();
		
		System.out.printf("10���� ���̴� %d ���Դϴ�", age+10);
		}
		
	
}

