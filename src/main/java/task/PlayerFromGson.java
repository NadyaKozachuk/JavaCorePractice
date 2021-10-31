package task;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;


public class PlayerFromGson {
    private static final Logger logger =Logger.getLogger(PlayerFromGson.class);
    private String name;
    private String sport;
    private int age;


    public String getName(){return name;}
    public String sport(){return sport;}
    public int age(){return age;}

    public static void main(String[] args) {
        String jsonText = "{\"name\":\"Ronaldo\",\"sport\":soccer,\"age\":25}";

        //GsonBuilder builder = new GsonBuilder();
        //Gson gson = builder.create();
        PlayerFromGson player = new Gson().fromJson(jsonText, PlayerFromGson.class);
        logger.info("GSON Имя: " + player.name + "\nВозраст: "  + player.age + "Спорт: " + player.sport);

    }
}
