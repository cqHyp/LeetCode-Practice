import java.util.Arrays;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/7/20 下午2:25
 * @Description: 387. First Unique Character in a String
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        char[] ss = s.toCharArray();
        if (ss.length <= 0) {
            return -1;
        }
        for (int i = 0; i < ss.length; i++) {

        }

        return 1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        firstUniqueCharacterInAString.firstUniqChar("leetcode");
    }
}
