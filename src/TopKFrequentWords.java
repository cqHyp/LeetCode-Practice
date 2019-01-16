import java.util.*;

/**
 * @Author: Poldi
 * @Date: 2018/9/18 上午11:47
 * @Description:
 */
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> tempList = Arrays.asList(words);
        Set<String> tempSet = new HashSet<>(tempList);
        
        return tempList;
    }

    public static void main(String[] args) {
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        topKFrequentWords.topKFrequent(words, 2);
    }
}
