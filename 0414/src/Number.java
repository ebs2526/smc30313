import java.util.Random;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("10°³ÀÇ ·£´ý ¼ýÀÚ Áß ÇÏ³ª¸¦ ¸ÂÃçº¸¼¼¿ä(1~50±îÁö): ");
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
				System.out.println("´çÃ·");
				diff = 1;
			}
		}
		if(diff ==0) System.out.println("²Î");
		sc.close();
		
		
	
	
	}


}
=======
		System.out.println("10ê°œì˜ ëžœë¤ ìˆ«ìž ì¤‘ í•˜ë‚˜ë¥¼ ë§žì¶°ë³´ì„¸ìš”(1~50ê¹Œì§€): ");
		Scanner sc = new Scanner(System.in); // ìŠ¤ìºë„ˆ ìƒì„±
		int a = sc.nextInt();  //aì— ìˆ«ìžë¥¼ ìž…ë ¥
		int[] b;
		int diff=0;
		b = new int[10];
	
		
		for (int i=0; i<10;i++) {
		 b[i] = (int) (Math.random()* 50) + 1; //1~50ê¹Œì§€ ëžœë¤í•œ ìˆ«ìž ìƒì„± (10ë²ˆ ë°˜ë³µ)
		System.out.print(b[i]+" ");

		}

		for (int j=0; j<10; j++) {
			if(b[j] == a){
				System.out.println("ë‹¹ì²¨");
				diff = 1;
			}
		}
		if(diff ==0) System.out.println("ê½"); //1ì´ë©´ ë‹¹ì²¨ì´ê³  0ì´ë©´ ê½
		sc.close();
		
		
	
	
	}


}
>>>>>>> branch 'main' of https://github.com/ebs2526/smc30313.git
