
public class RealImage implements image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	public void display() {
		System.out.println("display " + fileName);
	}

	public void loadFromDisk(String fileName) {
		System.out.println("realimage Loading " + fileName);
	}
}
