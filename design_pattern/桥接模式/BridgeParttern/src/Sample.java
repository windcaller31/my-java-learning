
public class Sample {
	public static void main(String args[]){
		//将 x y 和 circle的类型分别传进去
		Shape red = new Circle(10, 9, new RedCircle());
		Shape green = new Circle(29,8,new GreenCircle());
		red.drawShape();
		green.drawShape();
	}
}
