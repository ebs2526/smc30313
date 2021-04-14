import java.util.Random;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		int a = sc.nextInt();  //a에 숫자를 입력
		int[] b;
		int diff=0;
		b = new int[10];
	
		
		for (int i=0; i<10;i++) {
		 b[i] = (int) (Math.random()* 50) + 1; //1~50까지 랜덤한 숫자 생성 (10번 반복)
		System.out.print(b[i]+" ");

		}

		for (int j=0; j<10; j++) {
			if(b[j] == a){
				System.out.println("당첨");
				diff = 1;
			}
		}
		if(diff ==0) System.out.println("꽝"); //1이면 당첨이고 0이면 꽝
		sc.close();
		
		
	
	
	}


}
