import java.util.Scanner;

class hw3 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		float a;
		a = s.nextFloat();
		if(a<0) a = ~(int)a+1;
		System.out.format("�����κ��� ����: %d\n", (int)a);
		System.out.format("���� ���ϱ�: %d\n", (int)a<<3);
		System.out.format("���� ������ 8 ��: %d ������ %d\n",(int)a>>3, (int)a - ((int)a>>3<<3));
	
	}

}
