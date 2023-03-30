package logging;

public class MyFileLogger implements FileLogger {

	@Override
	public boolean isDebugEnabled() {
		return true;
	}

	@Override
	public void log(String message) {
		System.out.println("Simple log: " + message);
		//if check something on message -> info or error
	}
}
