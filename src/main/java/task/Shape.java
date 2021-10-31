package task;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;
import task.Circle;
import task.Rectangle;

import static task.CsvWriter.logger;

public abstract class Shape {
    public abstract double area();

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        Circle circle = new Circle(2.5);
        System.out.println(rectangle.area());
        System.out.println(circle.area());

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String json = gson.toJson(rectangle);
        logger.info(gson.toJson(rectangle));
        System.out.println(json);

    }
}


