
//作为接口 Shape 第一次实现为抽象类
public abstract class ShapeDecorator implements Shape  {
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
