import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/8/15 下午3:29
 * @Description:
 */
public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix.length <= 0 || matrix[0].length <= 0) return 0;
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                tempList.add(matrix[i][j]);
            }
        }

        Collections.sort(tempList);
        return tempList.get(k - 1);
    }


}
