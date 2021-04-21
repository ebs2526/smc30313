import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("첫번째 숫자: ");
			int a = scan.nextInt();
			System.out.println("두번째 숫자: ");
			int b = scan.nextInt();
			int sum=0;
			for (int i=a;i<=b;++i) {
				sum += i;
				
			}
			
			
			
			
			System.out.println(a + "부터 " + b + "까지의 합은 " + sum);		
			}
	
		}

	