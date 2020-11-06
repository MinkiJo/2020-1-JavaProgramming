package main;
import java.util.*;
public class studentTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("이름:");
		String name = s.nextLine();
		System.out.print("나이:");
		int age = s.nextInt();
		System.out.print("학점:");
		double score = s.nextDouble();
		
		
		student a = new student(name,age,score);
		
		a.setScore(4.3);
		System.out.println("학생정보");
		System.out.println(a.toString());
	}

}
