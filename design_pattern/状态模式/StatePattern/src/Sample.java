
public class Sample {
	public static void main(String args[]){
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(startState.toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(stopState.toString());
	}
}
