//红色图形的装饰类 装饰一次shape抽象类
public class RedShapeDecorator extends ShapeDecorator {

	//初始化shape，再shape外再装一层
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	//先调用原始shape的方法
	//核心方法，相当于重写接口，加上自己想要的功能 ；主要用于增强实现方法，加入更多方法的功能
	public void draw() {
		decoratedShape.draw();
		//装饰自己的方法
		setRedBorder();
	}

	private void setRedBorder() {
		System.out.println("fill color red");
	}
}
