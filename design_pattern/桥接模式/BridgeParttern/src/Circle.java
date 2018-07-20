
//桥接 xy 和 draw
public class Circle extends Shape {
	public int x;
	public int y;
	
	protected Circle(int x,int y,DrawApi drawApi) {
		super(drawApi);
		this.x = x;
		this.y = y;
	}

	@Override
	public void drawShape() {
		this.drawApi.draw(this.x, this.y);
	}

}
