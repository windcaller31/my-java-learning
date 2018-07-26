//访问者核心接口，暴露各种component 访问方式
public interface ComputerVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(KeyBoard keyboard);

	public void visit(Monitor monitor);
}
