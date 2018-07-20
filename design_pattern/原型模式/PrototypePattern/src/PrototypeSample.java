
public class PrototypeSample {
	public static void main(String args[]){
		ShapeCache.loadCache();
		Shape a = ShapeCache.getShape("1");
		a.draw();
	}
}
