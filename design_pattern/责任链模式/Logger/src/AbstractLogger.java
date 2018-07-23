
public abstract class AbstractLogger {
	protected int level;
	// 责任链中的下一个元素
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger){
		this.nextLogger = nextLogger;
	}
	
	//核心方法，如果没有级别处理则传入下一个节点
	public void logMessage(int level,String message){
		if(this.level >= level){
			writeMessage(message);
		}
		if(nextLogger != null){
			nextLogger.logMessage(level, message);
		}
	}
	
	public abstract void writeMessage(String message);
}
