package task;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.media.jfxmedia.logging.Logger;
import org.apache.commons.logging.Log;

import static task.CsvWriter.logger;

public class Circle extends Shape {
    double r;
    public Circle(double r) {
        this.r=r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }


}
