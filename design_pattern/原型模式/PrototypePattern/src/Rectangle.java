import java.awt.Window.Type;

public class Rectangle extends Shape {
	public Rectangle(){
		this.type = "rectangle"; 
	}
	
	public void draw(){
		System.out.println("rectangle");
	}
}
