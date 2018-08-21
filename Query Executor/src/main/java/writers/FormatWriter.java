package writers;

import java.sql.ResultSet;
import java.util.UUID;

public interface FormatWriter {

	public void write(ResultSet resultSet,String path) throws Throwable;
	
	public default String generateName() {
		return UUID.randomUUID().toString().substring(0, 11);
	}
	public default void succesfulWrite(String fullPathName) {
		System.out.println("file written succesfuly to: "+fullPathName);
	}
}
