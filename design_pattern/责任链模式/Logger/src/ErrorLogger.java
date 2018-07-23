
public class ErrorLogger extends AbstractLogger{

	public ErrorLogger(int level){
		this.level = level;
	}
	
	public void writeMessage(String message) {
		System.out.println(" error log :"+message);
	}

}
