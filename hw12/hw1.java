package main;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String [] arr = new String[3];
		for(int i=0;i<arr.length;i++)		
			arr[i]=s.nextLine();		
		transInt(arr);		
	}
	
	static void transInt(String [] arr) {
		try {
			for(int i=0;i<arr.length;i++)
				System.out.println(Integer.parseInt(arr[i])	);
		}catch(NumberFormatException e) {
			System.out.println("문자를 정수로 변환할수 없습니다");
		}
	}

}
