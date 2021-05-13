import java.util.Scanner;

public class TestExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("500 이하의 자연수를 입력하세요.");
		int a = scan.nextInt();
		int i=1;
		int num=0;
		int sum=0;
		for ( i=1;i<a;i++){
				
				
			if (i%3==0 && i%7==0){
				num=i;
				System.out.println(num);
				sum += num;
				
			}
			
		}
		System.out.println("1~"+i +"까지 3의 배수이면서 7의 배수인 수의 합은 "+ sum +"입니다.");
	}
	

}
