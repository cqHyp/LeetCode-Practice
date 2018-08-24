import java.util.Arrays;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/7/20 下午2:25
 * @Description:
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        char[] ss = s.toCharArray();
        if (ss.length <= 0) {
            return -1;
        }

        int temp = ss[0];
        int count = 0;
        int res = -1;

        for (int i = 1; i < ss.length; i++) {
            if (ss[i] == temp) {
                count++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        firstUniqueCharacterInAString.firstUniqChar("leetcode");
    }
}
