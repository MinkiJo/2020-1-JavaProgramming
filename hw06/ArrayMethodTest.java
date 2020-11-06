import java.util.Scanner;
import java.lang.Math;
public class ArrayMethodTest {

	public static void main(String[] args) {
		int [][]arr = new int[3][2];
		
		Scanner s = new Scanner(System.in);
		
		initArr(arr); 
		printArr(arr);
		System.out.println();
		System.out.printf("배열의총합: %d",sumArr(arr));
		System.out.println();
		System.out.printf("1번열의총합: %d\n",colSumArr(arr,0));
		System.out.printf("2번열총합: %d\n",colSumArr(arr,1));
		
		System.out.printf("행별 합의 최댓값:%d", rowSumMaxArr(arr));
		System.out.println();
		indexMaxArr(arr);
		shuffleArr(arr);
		
	}
	
	static void initArr(int [][]arr) {//배열 입력
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				int a;
				a = s.nextInt();
				arr[i][j] = a;
			}
		}
	}
	
	
	static void printArr(int [][]arr) {//모든 원소 출력
		System.out.println("<현재배열>");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	static int sumArr(int [][]arr) {//모든 원소의 합을 반환
		int sum = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				sum = sum+arr[i][j];
			}
		}
		return sum;
	}
	
	static int colSumArr(int [][]arr, int n) {//n번열의 합을 반환
		int sum = 0;
		for(int i=0;i<3;i++)
		{
			sum = sum+arr[i][n];
		}
		return sum;
	}
	
	static int rowSumMaxArr(int [][]arr) {//행별 합의 최댓값을 반환
		int sum1=0,sum2 =0,sum3 = 0;
		for(int j=0;j<2;j++)
		{
			sum1 = sum1+arr[0][j];
		}
		for(int j=0;j<2;j++)
		{
			sum2 = sum2+arr[1][j];
		}
		for(int j=0;j<2;j++)
		{
			sum3 = sum3+arr[2][j];
		}
		
		
		return Math.max(sum1, Math.max(sum2, sum3));
		
	}
	
	static void indexMaxArr(int [][]arr) {//최댓값의 인덱스를 반환
		int max= 0, indexi=0, indexj=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(arr[i][j] > max)
					{
					max = arr[i][j];
					indexi = i;
					indexj = j;
					}
			}				
			
		}
		
		System.out.printf("배열의 최댓값의 인덱스:%d %d\n",indexi, indexj);
		
	}
	
	static void shuffleArr(int [][]arr) {//배열 랜덤으로 섞기
		int r1,r2;
		int temp;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				r1= (int)(Math.random()*3);
				r2= (int)(Math.random()*2);
				temp = arr[i][j];
				arr[i][j] = arr[r1][r2];
				arr[r1][r2] = temp;
			}				
			
		}
		
		printArr(arr);
		
	}	
	

}
