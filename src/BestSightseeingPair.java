/**
 * @Author: Poldi
 * @Date: 2019-04-15 14:38
 * @Description:
 */
public class BestSightseeingPair {
    public static int maxScoreSightseeingPair(int[] A) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                res = Math.max(res, A[i] + A[j] + i - j);
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] A = {8,1,5,2,6};
        BestSightseeingPair.maxScoreSightseeingPair(A);
    }
}
