import java.util.Scanner;

public class HW5 {

	
	public static void main(String args[])
	{
		int cnt = 1, searchCnt = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("����:");
		String a = s.nextLine();
		System.out.print("�˻��� �ܾ�: ");
		String b = s.next();
		
		for(int i=0;i<=a.length()-b.length();i++)
		{
			if(a.charAt(i)==' ') cnt++;//���� ���ϱ�
			if(a.substring(i,i+b.length()).equalsIgnoreCase(b)) {
					searchCnt++;
					System.out.printf("%d����, ",cnt);
			}	
		}
	if(searchCnt!=0) {
		System.out.printf("\b\b �������� \"%s\"�� �˻��Ǿ�,  ",b);
		System.out.printf("�� %dȸ �˻��Ǿ����ϴ�\n", searchCnt);
	}
	else
		
	System.out.printf("�� %dȸ �˻��Ǿ����ϴ�\n", searchCnt);
	}
}

