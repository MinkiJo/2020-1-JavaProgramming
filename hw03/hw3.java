import java.util.Scanner;

class hw3 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		float a;
		a = s.nextFloat();
		if(a<0) a = ~(int)a+1;
		System.out.format("Á¤¼öºÎºÐÀÇ Àý´ñ°ª: %d\n", (int)a);
		System.out.format("Àý´ñ°ª °öÇÏ±â: %d\n", (int)a<<3);
		System.out.format("Àý´ñ°ª ³ª´©±â 8 ¸ò: %d ³ª¸ÓÁö %d\n",(int)a>>3, (int)a - ((int)a>>3<<3));
	
	}

}
