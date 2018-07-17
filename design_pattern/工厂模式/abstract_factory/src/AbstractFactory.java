import color.color;
import shape.shape;

public abstract class AbstractFactory {
	public abstract color getColor(String colorType);
	public abstract shape getShape(String shapeType);
}
