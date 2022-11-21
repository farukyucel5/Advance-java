package Collections;

import java.util.Dictionary;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,String> dictionary=new HashMap<>();
        dictionary.put("book","kitap");
        dictionary.put("table","masa");
        dictionary.put("cup","kupa");
        dictionary.put("software","yazılım");

        System.out.println(dictionary);

        System.out.println(dictionary.get("software"));
        System.out.println("--------------------------------");
        dictionary.remove("cup");
        System.out.println(dictionary);
        System.out.println("---------------");
        dictionary.clear();
        System.out.println(dictionary);

        System.out.println("--------------------");

        HashMap<String,String> dictionary1=new HashMap<>();
        dictionary1.put("book","kitap");
        dictionary1.put("table","masa");
        dictionary1.put("cup","kupa");
        dictionary1.put("software","yazılım");

        System.out.println(dictionary1.size());
        System.out.println("-------------------");

        for (String item:dictionary1.keySet())
        {
            System.out.println(item);
        }

        System.out.println("-------------------");
        for (String item:dictionary1.values())
        {
            System.out.println(item);
        }

        System.out.println("-------------------");

        for (String each:dictionary1.keySet())
        {
            System.out.println(each+": "+dictionary1.get(each));
        }
    }
}
