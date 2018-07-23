
public class WarnLogger extends AbstractLogger {
	public WarnLogger(int level){
		this.level = level;
	}
	
	public void writeMessage(String message) {
		System.out.println(" warn log :"+message);
	}

}
