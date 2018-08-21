package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import writers.FormatWriter;

public class DBQueryAndWrite {
	public static void run(String query, String format, Properties props) throws Throwable {
		try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			executeWriter(format, props.getProperty("file_path"), rs);
		}
	}

	public static void executeWriter(String format, String path, ResultSet rs) throws Throwable {
		FormatWriter writer = OutputFormatFactory.getWriter(format);
		writer.write(rs, path);
	}

}
