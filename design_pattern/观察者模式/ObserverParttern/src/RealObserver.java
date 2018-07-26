
public class RealObserver extends Observer {

	public RealObserver(Subject subject){
		this.subject = subject;
		this.subject.linkeObserver(this);
	}
	
	public void update() {
		System.out.println(" real observer 0 get state:"+this.subject.getState());		
	}

}
