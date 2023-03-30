package logging;

public class Main {

	public static void main(String[] args) {

		MyFileLogger myFileLogger = new MyFileLogger();
		myFileLogger.log("There was a NullPointerException in the main method");
		myFileLogger.logInfo("The main class was called");
		myFileLogger.logError("An error occurred");
	}

}
