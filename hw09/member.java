package main;

public class member {
	private String name;
	private int age;
	static int num;
	member(){
		System.out.println("디폴트 생성자 통해 동호회 멤버 생성");
		num++;
	}
	member(String name, int age)
	{
		System.out.println("이름과 나이가 존재하는 동호회 멤버 생성");
		this.name = name;
		this.age = age;
		num++;		
	}
	
	
}
