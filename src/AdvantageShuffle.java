/**
 * @Author: Poldi
 * @Date: 2018/9/7 下午2:30
 * @Description:
 */
public class AdvantageShuffle {
    public int[] advantageCount(int[] A, int[] B) {
        int[] res = new int[A.length];
        int temp = Math.max(A[0], B[0]);
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                temp = Math.min(Math.abs(A[j] - B[i]), temp);
            }
            res[i] = B[i] + temp;

        }
        return res;
    }
}
