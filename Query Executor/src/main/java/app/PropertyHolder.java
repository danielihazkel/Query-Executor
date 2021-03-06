package app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHolder {

	private static PropertyHolder single_instance = null;
	private static Properties props;

	private PropertyHolder() {
		props = new Properties();
		try {
			props.load(new FileInputStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static PropertyHolder getInstance() {
		if (single_instance == null)
			single_instance = new PropertyHolder();

		return single_instance;
	}
	
	public Properties getProps() {
		return props;
	}
}
