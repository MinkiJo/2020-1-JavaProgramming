public class even{

	public static void main(String [] args)
	{
		if(args.length ==0)
			{System.out.println("문자열을 입력하세요");
			System.exit(1);
			}
		
		String a = args[0];
		
		
		int []arr = new int[args.length];
		
		for(int i=0;i<arr.length;i++)
		{
		arr[i] = Integer.parseInt(args[i]);
		
		if(arr[i]%2 ==0)
			System.out.printf("%d ",  arr[i]);
		}
		
		
	}
}
