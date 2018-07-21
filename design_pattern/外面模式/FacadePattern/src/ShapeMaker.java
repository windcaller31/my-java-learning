
public class ShapeMaker {
	private Shape square;
	private Shape rectangle;
	
	public ShapeMaker(){
		square = new Square();
		rectangle = new Rectangle();
	}
	
	public void getSquare(){
		this.square.draw();;
	}
	public void getRectangle(){
		this.rectangle.draw();
	}
}
