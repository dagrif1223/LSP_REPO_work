package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;

public class MapUtilities {
    /**
     * Counts the number of common key/value pairs between two HashMaps.
     *
     * @param map1 The first HashMap to compare
     * @param map2 The second HashMap to compare
     * @return The number of common key/value pairs, or 0 if either map is null or empty
     */
    public static int commonKeyValuePairs(
            HashMap<String, String> map1,
            HashMap<String, String> map2) {

        // Check if either map is null or empty
        if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonPairs = 0;

        // Iterate through the entries of the smaller map for efficiency
        HashMap<String, String> smallerMap = (map1.size() <= map2.size()) ? map1 : map2;
        HashMap<String, String> largerMap = (map1.size() > map2.size()) ? map1 : map2;

        for (HashMap.Entry<String, String> entry : smallerMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // Check if the key exists in the larger map and has the same value
            if (largerMap.containsKey(key) && value.equals(largerMap.get(key))) {
                commonPairs++;
            }
        }

        return commonPairs;
    }
}
