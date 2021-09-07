package collectionsExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("firstName","Astha");
        map.put("lastName","Singh");
        map.put("subject","Selenium");
        map.put("location","America");

        System.out.println(map);
        System.out.println(map.size());

        System.out.println("The value of key lastName is: " +map.get("lastName"));

        Set<String> keys = map.keySet();
        for (String key:keys){
            System.out.println("Key--->" + key + " value--->" + map.get(key));
        }
    }
}
