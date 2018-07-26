
public class Sample {
	public static void main(String args[]){
		Subject subject = new Subject();
		new RealObserver(subject);
		new RealObserver2(subject);
		
		System.out.println("First 1");
		subject.setState(11);
		System.out.println("Second 1");
		subject.setState(31);
	}
}
