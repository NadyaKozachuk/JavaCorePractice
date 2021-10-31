package task;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;

public class Rectangle extends Shape {
        double a;
        double b;

    private static final Logger log = Logger.getLogger(Rectangle.class);

        public Rectangle(double a,double b){
            this.a=a;
            this.b=b;
        }
        public Rectangle(int a,int b){
            this.a=a;
            this.b=b;
        }

    @Override
    public double area(){
        return a*b;
    }

    }

