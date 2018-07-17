import color.Blue;
import color.Green;
import color.Red;
import color.color;
import shape.shape;

public class colorFactroy extends AbstractFactory{

	
	public color getColor(String colorType) {
		switch (colorType) {
		case "blue":
			return new Blue();
		case "green":
			return new Green();
		case "red":
			return new Red();
		default:
			break;
		}
		return null;
	}

	
	public shape getShape(String shapeType) {
		return null;
	}

}
