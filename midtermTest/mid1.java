public class mid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= new int[6];
		for(int i=0;i<6;i++)
		{
			arr[i] = (int)(Math.random()*9);
		}
		System.out.println("비밀번호: ");
		
		for(int i=0;i<6;i++)
		{
			System.out.printf("%d", arr[i]);
		}
	}

}
