package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;
/**
 * A driver class to demonstrate the functionality of the MapUtilities class.
 */
public class MapUtilitiesDriver {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        // Populate map1
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        map1.put("key3", "value3");

        // Populate map2
        map2.put("key2", "value2");
        map2.put("key3", "value3");
        map2.put("key4", "value4");

        int commonPairs = MapUtilities.commonKeyValuePairs(map1, map2);
        System.out.println("Number of common key/value pairs: " + commonPairs);

        // Test with empty maps
        System.out.println("Empty map test: " + MapUtilities.commonKeyValuePairs(new HashMap<>(), map2));
        System.out.println("Null map test: " + MapUtilities.commonKeyValuePairs(null, map2));
    }
}
