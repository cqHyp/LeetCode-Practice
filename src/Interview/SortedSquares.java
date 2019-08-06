package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-05-10 10:18
 * @Description:
 */
public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int a : A) {
            list.add(Math.abs(a) * Math.abs(a));
        }
        Collections.sort(list);
        int[] res = new int[A.length];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
