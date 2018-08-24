import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Poldi
 * @Date: 2018/7/30 上午9:41
 * @Description:
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            int sum = 0;
            for (char c : strs[i].toCharArray()) {
                sum += c;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String s = "qwe";
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c;
        }
        System.out.println(sum);
    }
}
