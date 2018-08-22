package logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Logger {

	
	public static Log getLogger(String name) {
		return LogFactory.getLog(name);
	}

}
