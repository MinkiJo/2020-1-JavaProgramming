public class jamo{

	public static void main(String [] args)
	{
		String a = args[0];
		int ja = 0,mo=0;
		for(int i=0;i<a.length();i++)
		{
			
		if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' || 
				a.charAt(i) >='a' && a.charAt(i)<= 'z')
		{
			switch(a.charAt(i)) {
			case'a': case'A':
			case'e': case'E':
			case'i': case'I':
			case'o': case'O':
			case'u': case'U':
				mo++;
				break;
			default:
				ja++;		
			}
		}
			
		}
		
		System.out.printf("자음개수: %d", ja);
		System.out.printf("자음개수:%d", mo);
		
		
		
		
		
	}
}
