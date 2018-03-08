package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pramesh on 3/8/2018.
 */
public class Frequency {

    private Map<Character, Integer> frequencyCount(String str) {
        Map<Character, Integer> frequency = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            if(frequency.containsKey(str.charAt(i))) {
                int count = frequency.get(str.charAt(i));
                frequency.put(str.charAt(i), ++count);
            }else {
                frequency.put(str.charAt(i), 1);
            }
        }
        return frequency;
    }

    public static void main(String... args) {
        Frequency obj = new Frequency();
        Map<Character, Integer> result = obj.frequencyCount("aaaabbbccd");
        result.keySet().forEach(e -> {
            System.out.println(e.charValue() + " => " + result.get(e.charValue()));
        });
    }
}
