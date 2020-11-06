public class bubbleSort{

	public static void main(String [] args)
	{
		if(args.length ==0)
			{System.out.println("문자열을 입력하세요");
			System.exit(1);
			}
		
	
		
		int []arr = new int[args.length];
		
		for(int i=0;i<arr.length;i++)
		{
		arr[i] = Integer.parseInt(args[i]);
		
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",  arr[i]);
		}
		
	}
}
