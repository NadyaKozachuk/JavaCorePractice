package task;

import com.google.gson.Gson;
import org.apache.log4j.Logger;


public class CatToGson {
    private static final Logger logger =Logger.getLogger(CatToGson.class);
    private String name;
    private int age;

    public CatToGson(){ }

    public String getName(){return name;}
    public int age(){return age;}

    public static void main(String[] args) {
        CatToGson murzik = new CatToGson();
        murzik.name = "Мурзик";
        murzik.age = 10;

        CatToGson barsik = new CatToGson();
        barsik.name = "Барсик";
        barsik.age = 2;

        Gson gson = new Gson();
        logger.info(gson.toJson(barsik));
        logger.info(gson.toJson(murzik));
    }
}
