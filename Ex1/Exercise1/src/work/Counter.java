package work;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Counter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Text: ");
        String word = scan.nextLine();
        System.out.println("Info: ");
        System.out.println(count(word));


    }

    public static Map<Character, Integer> count (String word) {
        Map<Character, Integer> myMap = new TreeMap<>();

        for (int i = 0; i < word.length(); i++) {
            int x = 1;
            char c  = word.charAt(i);
            myMap.put(c, x);
            for (int j = 0; j < word.length(); j++){
                if (j != i){
                    if (c == word.charAt(j)){
                        x++;
                        myMap.replace(c, x);
                    }
                }


            }


        }

        return myMap;
    }





}
