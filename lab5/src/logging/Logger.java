package logging;

public interface Logger {

	boolean isDebugEnabled();

	void log(String message);
}
