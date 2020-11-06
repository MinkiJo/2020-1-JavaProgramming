package main;

public class student {
	private String name;
	private int age;
	private double score;
	
	student()
	{
		this.name = "홍길동";
		this.age = 20;
		this.score = 3.0;
	}
	student(String name, int age, double score)
	{
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("이름을"+name+" 으로 변경합니다");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<200 && 0<=age)
		{
		this.age = age;
		}
		System.out.println("나이를"+age+" 으로 변경합니다");
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		if(score<=4.3 && 0<=score)
		{
		this.score = score;
		}
		System.out.println("학점을"+score+" 으로 변경합니다");
	}
	
	public String toString() {
		return "이름 : " +name+", 나이: "+age+", 학점:"+score;
	}
	
}
