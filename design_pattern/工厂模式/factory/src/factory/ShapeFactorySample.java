package factory;

public class ShapeFactorySample {
	public static void main(String args[]) {
		ShapFactory sf = new ShapFactory();
		// 获取 Circle 的对象，并调用它的 draw 方法
		shape shape1 = sf.getShape("circle");

		// 调用 Circle 的 draw 方法
		shape1.draw();

		// 获取 Rectangle 的对象，并调用它的 draw 方法
		shape shape2 = sf.getShape("rectangle");

		// 调用 Rectangle 的 draw 方法
		shape2.draw();

		// 获取 Square 的对象，并调用它的 draw 方法
		shape shape3 = sf.getShape("square");

		// 调用 Square 的 draw 方法
		shape3.draw();
	}
}
