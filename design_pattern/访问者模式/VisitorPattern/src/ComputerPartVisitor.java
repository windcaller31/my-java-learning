//访问实现类
public class ComputerPartVisitor implements ComputerVisitor {

	public void visit(Computer computer) {
		System.out.println("display computer");
	}

	public void visit(Mouse mouse) {
		System.out.println("display mouse");
		
	}

	public void visit(KeyBoard keyboard) {
		System.out.println("display keyboard");
	}

	public void visit(Monitor monitor) {
		System.out.println("display monitor");
	}

}
