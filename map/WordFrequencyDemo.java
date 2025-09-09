// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online

import java.util.*;

public class WordFrequencyDemo {
    public static void main(String[] args) {
        String text = "This Is demo string";


        text = text.toLowerCase();

       
        HashMap<String, Integer> map = new HashMap<>();

        
        for (String word : text.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

       
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
