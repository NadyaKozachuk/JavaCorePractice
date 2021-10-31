package task;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.File;
import java.nio.file.Paths;

public class PlayerFromJackson {
    private static final Logger logger =Logger.getLogger(PlayerFromGson.class);
    private String name;
    private int age;

    public String getName(){return name;}
    public int age(){return age;}

    public static void main(String[] args) {
        String jsonText = "{\"name\":\"Andriy\",\"age\":25}";

        try {

            //ObjectMapper mapper = new ObjectMapper();

            //PlayerFromJackson player = mapper.readValue(Paths.get(jsonText).toString(),PlayerFromJackson.class);
            PlayerFromJackson player = new ObjectMapper().readValue(jsonText, PlayerFromJackson.class);

            System.out.println(player);
            logger.info(player);

        } catch (Exception ex) {
            ex.printStackTrace();
       }
    }
}
