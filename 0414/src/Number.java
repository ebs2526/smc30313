import java.util.Random;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		System.out.println("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b;
		int diff=0;
		b = new int[10];
	
		
		for (int i=0; i<10;i++) {
		 b[i] = (int) (Math.random()* 50) + 1;
		System.out.print(b[i]+" ");

		}

		for (int j=0; j<10; j++) {
			if(b[j] == a){
				System.out.println("��÷");
				diff = 1;
			}
		}
		if(diff ==0) System.out.println("��");
		sc.close();
		
		
	
	
	}


}