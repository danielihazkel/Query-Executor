package app;

import writers.CsvWriter;
import writers.FormatWriter;
import writers.JsonWriter;

public class OutputFormatFactory {
	   public static FormatWriter getWriter(String format){
		switch(format) {
			case "csv": return new CsvWriter();
			case "json": return new JsonWriter();
		}
		return null;
	   }
}
