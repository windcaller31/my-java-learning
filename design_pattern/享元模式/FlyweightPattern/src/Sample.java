
public class Sample {
	public static String colors[] = { "red", "green", "blue" };

	public static void main(String args[]) {
		for (int i = 0; i < 5; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX((int)( Math.random() * 10));
			circle.setY((int)( Math.random() * 10));
			circle.draw();
		}

	}

	public static String getRandomColor() {
		int r = (int) (Math.random() * 2);
		return colors[r];
	}
}
