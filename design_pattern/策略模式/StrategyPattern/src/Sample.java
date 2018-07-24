
public class Sample {
	public static void main(String args[]){
		Context context = new Context(new AddClass());
		System.out.println(context.executeStrategy(1, 2));
		context = new Context(new SubstractClass());
		System.out.println(context.executeStrategy(1, 2));
		context = new Context(new MultiClass());
		System.out.println(context.executeStrategy(1, 2));
		
	}
}
