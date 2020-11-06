import java.util.Scanner;
import java.lang.Math;
public class ArrayMethodTest {

	public static void main(String[] args) {
		int [][]arr = new int[3][2];
		
		Scanner s = new Scanner(System.in);
		
		initArr(arr); 
		printArr(arr);
		System.out.println();
		System.out.printf("�迭������: %d",sumArr(arr));
		System.out.println();
		System.out.printf("1����������: %d\n",colSumArr(arr,0));
		System.out.printf("2��������: %d\n",colSumArr(arr,1));
		
		System.out.printf("�ະ ���� �ִ�:%d", rowSumMaxArr(arr));
		System.out.println();
		indexMaxArr(arr);
		shuffleArr(arr);
		
	}
	
	static void initArr(int [][]arr) {//�迭 �Է�
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
	
	
	static void printArr(int [][]arr) {//��� ���� ���
		System.out.println("<����迭>");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	static int sumArr(int [][]arr) {//��� ������ ���� ��ȯ
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
	
	static int colSumArr(int [][]arr, int n) {//n������ ���� ��ȯ
		int sum = 0;
		for(int i=0;i<3;i++)
		{
			sum = sum+arr[i][n];
		}
		return sum;
	}
	
	static int rowSumMaxArr(int [][]arr) {//�ະ ���� �ִ��� ��ȯ
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
	
	static void indexMaxArr(int [][]arr) {//�ִ��� �ε����� ��ȯ
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
		
		System.out.printf("�迭�� �ִ��� �ε���:%d %d\n",indexi, indexj);
		
	}
	
	static void shuffleArr(int [][]arr) {//�迭 �������� ����
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
