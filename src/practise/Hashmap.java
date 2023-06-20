package practise;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        // creation
        // Hashtable<key, Integer>  key allows unique values
        Hashtable<String,Integer> map=new Hashtable<>();

        // Insertion
         map.put("US",80);
         map.put("china",90);
         map.put("India",180);
         // change the value in List
         map.put("china",210);
        System.out.println(map);

        // iternation
        // Entry sets - which gives the set of all the keys and value, so the entrysets has entries and each of the entry their
        // is the particular key that is tied up with value.

        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // Set is type of collection - that not allows the duplicate elements
        Set<String> keys=map.keySet();
        for(String key:keys)                 // In singleline--> (String key : keySet())
        {
            System.out.println(key);
        }
       // Set<Integer> vals= (Set<Integer>) map.values();

        Collection<Integer> vals=map.values();

        for (Integer v:vals)
        {
            System.out.println(v);
        }

   // Note :entrySet() – returns a collection-view of the map, whose elements are from the Map.Entry class. The entry.getKey() method returns the key, and entry.getValue() returns the corresponding value
        //  keySet() – returns all keys contained in this map as a Set
        //  values() – returns all values contained in this map as a Set

        // Searching
        if(map.containsKey("china"))
        {
            System.out.println("The elemnt is found");
        }else {
            System.out.println("The elemnt is not found");
        }
    }
}
