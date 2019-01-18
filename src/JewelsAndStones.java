import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Poldi
 * @Date: 2019-01-18 10:24
 * @Description:
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        Set setJ = new HashSet();
        for (char j : J.toCharArray()) {
            setJ.add(j);
        }
        for (char s : S.toCharArray()) {
            if (setJ.contains(s)) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        JewelsAndStones.numJewelsInStones("aA", "aAAbbbb");
    }
}
