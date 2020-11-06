public class mid4 {
	public static void main(String []args)
	{
		
	if(args.length ==0|| Integer.parseInt(args[0])<3)
		{
			System.out.println("3이상의 정수를 입력하세요");
		}		
		int temp = Integer.parseInt(args[0]);
		System.out.printf("java Pattern %d\n", temp);
	if(temp %2 == 0)
		{
			for(int i=0;i<temp;i++)
			{
				for(int j=0;j<2*temp-2*i;j++)
					System.out.printf(" ");
				for(int k=0;k<4*i+1;k++) {
					System.out.printf("*");
				}
				
				System.out.println();
			}
		}

	else {	
		int prt= temp%10;
		for(int i=1;i<temp/2+1;i++)
			{
				for(int j=0;j<temp/2-i+1;j++)
					System.out.printf(" ");
				for(int k=0;k<i;k++) {
					System.out.printf("*");
				}
				System.out.println();
			}
		
		for(int i=0;i<=temp/2;i++)
		{
			for(int j=0;j<temp/2-i+1;j++)
				System.out.printf("*");
			for(int k=0;k<i;k++) {
				System.out.printf(" ");
			}
			System.out.println();
			
			
		}
		}
	}
}
