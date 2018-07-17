import color.color;
import shape.Circle;
import shape.Rectangle;
import shape.Square;
import shape.shape;

public class shapeFactory extends AbstractFactory {

	public color getColor(String colorType) {
		return null;
	}

	public shape getShape(String shapeType) {
		switch (shapeType) {
		case "circle": 
			return new Circle();
		case "rectangle": 
			return new Rectangle();
		case "square": 
			return new Square();
		default:
			break;
		}
		return null;
	}

}
