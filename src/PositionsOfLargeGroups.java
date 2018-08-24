import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/7/23 下午2:47
 * @Description:
 */
public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        char temp = S.toCharArray()[0];
        int count = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length(); i++) {
            List<Integer> list = new ArrayList<>();
            if (temp == S.toCharArray()[i]) {
                count++;
            } else {
                if (count >= 3) {
                    end = i - 1;
                    list.add(start);
                    list.add(end);
                    res.add(list);
                }
                start = i;
                temp = S.toCharArray()[i];
                count = 1;
            }
            if (i == S.length() - 1) {
                if (count >= 3){
                    end = i;
                    list.add(start);
                    list.add(end);
                    res.add(list);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PositionsOfLargeGroups positionsOfLargeGroups = new PositionsOfLargeGroups();
        positionsOfLargeGroups.largeGroupPositions("aaaaaaaabbb");
    }
}
