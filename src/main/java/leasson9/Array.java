package leasson9;

import java.util.HashMap;
import java.util.Map;

public class Array {


  public static String[] strings;

    public static Map<String, Integer> createFreqMap(String[] strings) {
        Array.strings = strings;
        Map<String, Integer> map = new HashMap<>();
        for (String key : strings) {
            Integer count = map.getOrDefault(key, 0);
            map.put(key, count + 1);
        }
        return map;
    }
}
