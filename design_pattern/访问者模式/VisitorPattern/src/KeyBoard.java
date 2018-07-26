
public class KeyBoard implements ComputerPart {
	public void accept(ComputerVisitor computerVisitor) {
		computerVisitor.visit(this);
	}
}
