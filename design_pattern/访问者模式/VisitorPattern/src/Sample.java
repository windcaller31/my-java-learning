
public class Sample {
	public static void main(String args[]){
		//实现computer的实现类
		ComputerPart computer = new Computer();
		//调用computer的accept 分部分调用每个part后调用整体
		computer.accept(new ComputerPartVisitor());
	}
}
