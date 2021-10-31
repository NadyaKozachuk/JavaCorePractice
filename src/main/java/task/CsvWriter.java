package task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class CsvWriter {
    final static Logger logger = Logger.getLogger(CsvWriter.class);
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new File("d:\\SuiteStatisticsTest.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("Script");
            sb.append(',');
            sb.append("Last Status");
            sb.append('\n');

            sb.append("OrganizationGroups/Security");
            sb.append(',');
            sb.append("Success");
            sb.append('\n');
            Shape rectangle = new Rectangle(5,5);

            List<Shape> shapes = new ArrayList<>();
            logger.info("Adding rectangle");
            shapes.add(rectangle);
            Shape circle = new Circle(2.5);
            logger.info("Adding circle");
            shapes.add(circle);
            for (Shape shape:shapes){
                sb.append(shape.area());
            }
            writer.write(sb.toString());

            //System.out.println("done!");
            logger.info("Status: Success");

        } catch (FileNotFoundException e) {
            //System.out.println(e.getMessage());
            //logs an exception thrown from somewhere
            logger.error("This is error", e);
        }

    }
}
