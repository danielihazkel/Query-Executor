package writers;

import java.io.FileWriter;
import java.sql.ResultSet;

import com.opencsv.CSVWriter;

public class CsvWriter implements FormatWriter {

	@Override
	public void write(ResultSet resultSet,String path) throws Throwable{
		String fullPathName = path+"/"+generateName()+".csv";
		try (CSVWriter writer = new CSVWriter(new FileWriter(fullPathName))){
			Boolean includeHeaders = true;
			writer.writeAll(resultSet, includeHeaders);
			succesfulWrite(fullPathName);
		}
	}

}
