import java.util.Random;
public class English extends subject{
	private int score;
	
	English(){
		this.score = (int)(Math.random()*100);
	
	}
	int getScore()
	{
	return score;
	}
	
}

public class Korean extends subject{
	private int score;
	Korean(){
		this.score = (int)(Math.random()*100);
	
	}
	int getScore()
	{
	return score;
	}
}

public class Mathematic extends subject{
	private int score;
	Mathematic(){
		this.score = (int)(Math.random()*100);
	
	}
	int getScore()
	{
	return score;
	}
}
public class test {
	public void report(subject a) {
		System.out.print(a.getClass().getName()+"의 점수는 "+a.getScore()+"입니다\n");
	}
}

public class Science extends subject{
	private int score;
	Science(){
		this.score = (int)(Math.random()*100);
	
	}
	int getScore()
	{
	return score;
	}
}
public class subject {
	private int score;
	
	int getScore()
	{
	return score;
	}
}


public class student {
	
	
	public static void main(String[] args) {
	English e = new English();
	Korean k = new Korean();
	Mathematic m = new Mathematic();
	Science s = new Science();
	
	test t = new test();
		t.report(e);
		t.report(k);
		t.report(m);
		t.report(s);
		
	}
}


