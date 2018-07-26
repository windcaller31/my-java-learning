
public class Monitor implements ComputerPart {
	public void accept(ComputerVisitor computerVisitor){
		computerVisitor.visit(this);
	};
}
