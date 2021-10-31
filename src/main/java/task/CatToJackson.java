package task;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.File;

public class CatToJackson {
    private static final Logger logger = Logger.getLogger(CatToGson.class);
    private String name;
    private int age;

    public CatToJackson() {
    }

    public String getName() {
        return name;
    }

    public int age() {
        return age;
    }

    public static void main(String[] args) {
        //ObjectMapper mapper = new ObjectMapper();
        //String jsonInString = "{'name' : 'Murka'}";
        //try {


        // CatToJackson cat = mapper.readValue(new File("D:\\catToJackson.json"), CatToJackson.class);

//JSON from String to Object
        //User user = mapper.readValue(jsonInString, User.class);

        //}
    }
}
