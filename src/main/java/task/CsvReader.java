package task;

import com.google.gson.Gson;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.PrintWriter;

public class CsvReader{
    final static org.apache.log4j.Logger logger = Logger.getLogger(CsvWriter.class);

        public static void main(String[] args) throws IOException {
            try {

                Reader in = new FileReader("d:\\SuiteStatistics.xlsx");
                Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
                for (CSVRecord record : records) {
                    String script = record.get("Script");
                    String lastStatus = record.get("Last Status");

                }
                logger.info("Status: Success");


            }

            catch (FileNotFoundException e){
                    System.out.println("File not found!");
            }


        }
}