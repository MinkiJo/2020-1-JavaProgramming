import java.util.Scanner;

class Hw {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a ,b;
		a = s.nextInt();
		b = s.nextInt();
		System.out.format("a+b�� ���� %+15d�Դϴ�\n",a+b);
		System.out.format("a*b�� ���� %#-15o�Դϴ�\n",a*b);
		System.out.format("a-b�� ���� %#15x�Դϴ�\n",a-b);
	}

}
