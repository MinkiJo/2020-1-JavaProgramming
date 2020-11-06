package main;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
	
		
		try {
			after10();
		}catch(TooOldException e) {
			System.out.print("나이가 잘못되었습니다");
	
		}
	}
	
	static void after10() throws TooOldException{
		Scanner s= new Scanner(System.in);
		System.out.print("나이를 입력하세요");
		int age = s.nextInt();
		
		if(age>=200 || age<=0) 
			throw new TooOldException();
		
		System.out.printf("10년후 나이는 %d 세입니다", age+10);
		}
		
	
}

