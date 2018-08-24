import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/7/23 下午3:29
 * @Description:
 */
public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < S.toCharArray().length; i++) {
            if (S.toCharArray()[i] == C) {
                tempList.add(i);
            }
        }
        for (int i = 0; i < S.toCharArray().length; i++) {
            int min = S.length();
            for (int j = 0; j < tempList.size(); j++) {
                min = Math.min(Math.abs(tempList.get(j) - i), min);
            }
            res[i] = min;
        }

        return res;
    }

    public static void main(String[] args) {
        ShortestDistanceToACharacter shortestDistanceToACharacter = new ShortestDistanceToACharacter();
        shortestDistanceToACharacter.shortestToChar("loveleetcode", "e".toCharArray()[0]);
    }
}
