
public class Sample {
	//设置责任链
	private static AbstractLogger setChain() {
		AbstractLogger infoLogger = new InfoLogger(1);
		AbstractLogger warnLogger = new WarnLogger(2);
		AbstractLogger errorLogger = new ErrorLogger(3);
		infoLogger.setNextLogger(warnLogger);
		warnLogger.setNextLogger(errorLogger);
		return infoLogger;
	}

	public static void main(String args[]) {
		int errorLevel = 3;
		int warnLevel = 2;
		int infoLevel = 1;
		AbstractLogger loggerChain = setChain();

		loggerChain.logMessage(errorLevel, "This is an error.");
		loggerChain.logMessage(warnLevel, "This is an warn.");
		loggerChain.logMessage(infoLevel, "This is an info.");

	}
}
