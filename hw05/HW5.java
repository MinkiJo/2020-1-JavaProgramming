import java.util.Scanner;

public class HW5 {

	
	public static void main(String args[])
	{
		int cnt = 1, searchCnt = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("문장:");
		String a = s.nextLine();
		System.out.print("검색할 단어: ");
		String b = s.next();
		
		for(int i=0;i<=a.length()-b.length();i++)
		{
			if(a.charAt(i)==' ') cnt++;//어절 구하기
			if(a.substring(i,i+b.length()).equalsIgnoreCase(b)) {
					searchCnt++;
					System.out.printf("%d번쨰, ",cnt);
			}	
		}
	if(searchCnt!=0) {
		System.out.printf("\b\b 어절에서 \"%s\"가 검색되어,  ",b);
		System.out.printf("총 %d회 검색되었습니다\n", searchCnt);
	}
	else
		
	System.out.printf("총 %d회 검색되었습니다\n", searchCnt);
	}
}

