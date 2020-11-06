
import java.util.Scanner;
public class mid6 {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("문자열:");
		String a= s.nextLine();
		
		System.out.printf("줄임말:");
		System.out.printf("%c", a.charAt(0));
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) == ' ') {
				System.out.printf("%c", a.charAt(i+1));
			}
		}
		
		System.out.printf("\n역순문장:");
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.printf("%c",a.charAt(i));
		}
		
		
	}
}
