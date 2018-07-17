package factory;

public class ShapFactory {
	public shape getShape(String type){
		switch (type) {
		case "circle":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		case "square":
			return new Square();
		default:
			return null;
		}
	}
}
