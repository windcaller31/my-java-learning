import color.color;
import shape.shape;

public class Sample {
	public static void main(String args[]) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		// 获取形状为 Circle 的对象
		shape shape1 = shapeFactory.getShape("circle");

		// 调用 Circle 的 draw 方法
		shape1.draw();

		// 获取形状为 Rectangle 的对象
		shape shape2 = shapeFactory.getShape("rectangle");

		// 调用 Rectangle 的 draw 方法
		shape2.draw();

		// 获取形状为 Square 的对象
		shape shape3 = shapeFactory.getShape("square");

		// 调用 Square 的 draw 方法
		shape3.draw();

		// 获取颜色为 Red 的对象
		color color1 = colorFactory.getColor("red");

		// 调用 Red 的 fill 方法
		color1.draw();

		// 获取颜色为 Green 的对象
		color color2 = colorFactory.getColor("green");

		// 调用 Green 的 fill 方法
		color2.draw();

		// 获取颜色为 Blue 的对象
		color color3 = colorFactory.getColor("blue");

		// 调用 Blue 的 fill 方法
		color3.draw();
	}
}
