
public class Computer implements ComputerPart {
	ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[] { new Mouse(), new KeyBoard(), new Monitor() };
	}

	//开机，访问整个电脑
	public void accept(ComputerVisitor computerVisitor) {
		//先打开并访问各个部件
		for(int i =0; i<parts.length;i++){
			parts[i].accept(computerVisitor);
		}
		//最后访问电脑本身
		computerVisitor.visit(this);
	}
}
