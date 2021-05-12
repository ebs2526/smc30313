
public class TriangleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length=10.2, height=17.3;
		Triangle a = new Triangle(length, height);
		
		System.out.println("삼각형의 넓이  : " + a.Area());
		
		System.out.println("삼각형의 밑변과 높이 변경");
		
		a.Change();
		System.out.println("삼각형의 넓이  : " + a.Area());
		 
		
	}

}

class Triangle {
	double length,height;
	public Triangle(double length,double height){
		this.length=length;
		this.height=height;
		
	}
	public double Area(){
		return length * height / 2;
		
}
	public void Change(){
		length=7.5;
		height=9.2;
	}
}