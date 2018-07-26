
public class Mouse implements ComputerPart {
	public void accept(ComputerVisitor computerVisitor) {
		computerVisitor.visit(this);
	}
}
