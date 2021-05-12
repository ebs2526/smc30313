import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int max=0;
		int locate=0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0;i<arr.length;i++){
			
			System.out.println((i+1)+"번 입력 :");
			arr[i] = scan.nextInt();
			if(arr[i]>max){
				max = arr[i];
				locate = i+1;
			}
		
			
		}
		
		System.out.println("가장 큰 수는 "+ locate +"번째 숫자는" + max + "입니다.");
	}

}
