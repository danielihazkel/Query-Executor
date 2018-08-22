/**
 * @author DANIEL
 *
 *
 * db and file location properties are in config.properties
 * i used openCsv and postgresql driver
 *
 * the arguments i used:
 * "SELECT * FROM pg_catalog.pg_am" csv
 *
 */
package app;

import java.util.Properties;

import logger.Logger;

public class Main {
	
	public static void main(String[] args) {	
		Logger.getLogger(Main.class.getName()).info("app started");
		Properties props = PropertyHolder.getInstance().getProps();
		String query = args[0];
		String format = args[1];
		try {
			DBQueryAndWrite.run(query,format, props);
		} catch (Throwable e) {
			Logger.getLogger(Main.class.getName()).error(e.getMessage());
		}

	}
	
}