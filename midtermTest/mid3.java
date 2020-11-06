import java.util.Scanner;
public class mid3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("πÆ¿Â:");
		String a = s.nextLine();
		String alp = "abcdefghijklmnopqrstuvwxyz";
		String alp2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] res = new int[alp.length()];
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<alp.length();j++)
			{
			if(a.charAt(i) == alp.charAt(j) ||a.charAt(i) == alp2.charAt(j))
				res[j]++;			
			}			
		}
		
		for(int i=0;i<alp.length();i++) {
			if(res[i] != 0)	{
				System.out.printf("%c: %d\n",alp2.charAt(i),res[i]);
			}
		}
		
		

}
}
