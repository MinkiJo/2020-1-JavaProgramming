import java.util.Scanner;

public class mid2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("a:");
		int a = s.nextInt();
		System.out.printf("b:");
		int b = s.nextInt();
		
		if(a>b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		
		int i;
		if(a%2 == 0) i = a+1;
		else i = a;
		
		for(;i<5;i =i+2) {
			System.out.printf("(%d,%.2f)\n",i,3*Math.sin(i));
		}
		for(;i<=b;i =i+2) {
			System.out.printf("(%d,%.2f)\n",i,Math.sqrt((i-1)*(i-4)));
		}
		
	}

}


	