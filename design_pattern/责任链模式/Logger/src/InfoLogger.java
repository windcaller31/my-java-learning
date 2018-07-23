
public class InfoLogger extends AbstractLogger{
	
	public InfoLogger(int level) {
		this.level = level;
	}

	public void writeMessage(String message) {
		System.out.println(" info log :"+message);
	}

}
