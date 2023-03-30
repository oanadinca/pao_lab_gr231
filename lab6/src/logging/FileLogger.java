package logging;

import java.text.MessageFormat;

public interface FileLogger extends Logger {
	public static final String FILENAME = "log.txt"; //public static final are redundant here

	 default void logInfo(String message) {
		logDetails(message, "INFO");
	}

	default void logError(String message) {
		logDetails(message, "ERROR");
	}

	private void logDetails(String message, String level) {
		System.out.println(MessageFormat.format(
				"In the file {0} the following message was logged {1} with the log level {2}",
				FILENAME, message, level));
	}
}
