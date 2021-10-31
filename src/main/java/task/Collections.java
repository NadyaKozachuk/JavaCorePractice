package task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.*;

public class Collections {
    public static void main(String[] args) throws IOException {
        try {

            FileInputStream stream = new FileInputStream("d:\\SuiteStatistics.csv");
            int length = stream.available();
            byte[] data = new byte[length];
            stream.read(data);

            String text = new String(data);

            List<String[]> logData = new LinkedList<>();

            String[] lines = text.split("\n");

            for (String line : lines) {
                String[] words = line.split(",");
                logData.add(words);
                //System.out.println(line);
                //System.out.println("---");
            }

            for (String[] words : logData) {
                if (words[1].equals("Failure")) {
                    for (String word : words) {
                        System.out.print("|");
                        System.out.print(word);
                    }
                    System.out.println("");
                    //System.out.print(words);
                    //System.out.print("|");
                }
            }
            Map<String, String> map = new HashMap<>();
            for (String[] words: logData){
                map.put(words[0], words[1]);
            }

            System.out.println(map.get("TestScripts/HIC-HZD-Security-Organization"));


        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

