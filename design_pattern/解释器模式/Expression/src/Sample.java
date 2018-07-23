
public class Sample {
	public static void main(String args[]){
		Expression e1 = new TerminalExpression("person");
		Expression e2 = new TerminalExpression("man");
		OrExpression ore = new OrExpression(e1, e2); 
		System.out.println("first or");
		System.out.println(ore.interpret("person female"));
		System.out.println("second or");
		System.out.println(ore.interpret("pig female"));
	}
}
