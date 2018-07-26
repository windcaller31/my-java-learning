
public class RealObserver2 extends Observer {
	public RealObserver2(Subject subject){
		this.subject = subject;
		this.subject.linkeObserver(this);
	}
	
	public void update() {
		System.out.println(" real observer 1 get state:"+this.subject.getState());		
	}
}
