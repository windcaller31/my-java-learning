
public class PorxyImage implements image {
	private RealImage realImage;
	private String fileName;

	public PorxyImage(String fileName) {
		this.fileName = fileName;
	}

	//核心方法: 控制display方法，代理了 Realimage类，如果没有image 则加载之。减少image的加载成本
	public void display() {
		if (realImage == null) {
			System.out.println("没找到image loading。。。。");
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
