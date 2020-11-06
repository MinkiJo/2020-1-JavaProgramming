import java.util.Scanner;

class Hw {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a ,b;
		a = s.nextInt();
		b = s.nextInt();
		System.out.format("a+b의 값은 %+15d입니다\n",a+b);
		System.out.format("a*b의 값은 %#-15o입니다\n",a*b);
		System.out.format("a-b의 값은 %#15x입니다\n",a-b);
	}

}
