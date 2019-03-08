import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-01 14:06
 * @Description:
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        for(int i = 0; i < A.length; i++){
            res[i] = Math.abs(A[i]) * Math.abs(A[i]);
        }
        return res;
    }
}
