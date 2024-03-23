package HashMap;
// import java.util.HashMap;/

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        // Country(key), population(value)
        Map<String, Integer> map = new java.util.HashMap<>();

        // insertion of elements in the hashmap
        map.put("USA", 321000);
        map.put("UK", 67890);
        map.put( "France", 54321 );
        System.out.println(map.get("USA"));   // Output: 3
        System.out.println(map);
        // HashMap <Integer, Integer> map= new HashMap<>();
        map.put("UK", 123123123);
        System.out.println(map);
        
        // searching in Hashmap
        if (map.containsKey("Germany")){
            System.out.println("The country Germany exists.");
        } else {
            System.out.println("The country Germany does not exist.");
        }
        System.out.println(map.get("UK"));
        System.out.println(map.get("USA"));

        }
        }

