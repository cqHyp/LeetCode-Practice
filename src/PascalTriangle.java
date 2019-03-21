import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-08 14:51
 * @Description: 118. Pascal's Triangle
 * <p>
 *      1
 *     1 1
 *    1 2 1
 *   1 3 3 1
 *  1 4 6 4 1
 */
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            if (i == 0) {
                temp.add(1);
            } else {
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0) {
                        temp.add(1);
                    } else if (j == i) {
                        temp.add(1);
                    } else {
                        temp.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                    }
                }
            }
            res.add(temp);
        }

        return res;
    }
}
