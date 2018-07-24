
public class Sample {
	public static void main(String ars[]) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("state #1");
		originator.setState("state #2");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("state #3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #4");

		System.out.println("Current State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());
	}
}
