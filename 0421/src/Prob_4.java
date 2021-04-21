
public class Prob_4 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(0,0);
		System.out.println(zeroPoint.toString()+"입니다.");
		ColorPoint cp =new ColorPoint(5,5);
		cp.setXY(5,5);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(cp.toString()+"입니다.");

	}

}
class Point {
		int x,y;
		public Point(int x,int y){this.x=x; this.y=y;}
		public int getX() {return x; }
		public int getY() { return y; }
		protected void move(int x,int y){this.x=x; this.y=y; }
		
}

class ColorPoint extends Point{
	String color;
	public ColorPoint(int x,int y){
			super(x,y);
			this.color =color;
			color = "BLACK";
	}
	public void setXY(int x,int y){
		move(x,y);
		
	}
	public void setColor(String color){
			this.color = color;
			
			
	}
	public String toString(){
			String tmp=color+"색의"+"("+getX()+","+getY()+")의 점";
			return tmp;
	}
}
