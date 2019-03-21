import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Poldi
 * @Date: 2019-03-11 14:03
 * @Description: 890. Find and Replace Pattern
 */
public class FindAndReplacePattern {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            map.putIfAbsent(pattern.charAt(i), i);
        }

        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                wordMap.putIfAbsent(word.charAt(i), wordMap.size());
            }
            if (mapIndictor(map).equals(mapIndictor(wordMap))) {
                res.add(word);
            }
        }

        return res;
    }

    public static String mapIndictor(Map<Character, Integer> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            stringBuilder.append(m.getValue());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        FindAndReplacePattern.findAndReplacePattern(words, "abb");
    }
}
