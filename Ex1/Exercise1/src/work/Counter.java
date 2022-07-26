package work;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Counter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();


    }

    public static Map<String, Integer> count (String word) {
        Map<String, Integer> myMap = new TreeMap<String, Integer>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++){
                char c  = word.charAt(i);
                int x = 1;

            }


        }

        return myMap;
    }





}
