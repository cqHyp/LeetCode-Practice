/**
 * @Author: Poldi
 * @Date: 2018/7/23 下午1:56
 * @Description:
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] res = new int[A.length][];
        for (int i = 0; i < A.length; i++) {
            res[i] = reverse(A[i]);
        }
        return res;
    }

    private int[] reverse(int[] reverseTemp) {
        for (int i = 0; i < reverseTemp.length / 2; i++) {
            int t = reverseTemp[i];
            reverseTemp[i] = reverseTemp[reverseTemp.length - i - 1];
            reverseTemp[reverseTemp.length - i - 1] = t;
        }
        for (int i = 0; i < reverseTemp.length; i++) {
            if (reverseTemp[i] == 0){
                reverseTemp[i] = 1;
            }else {
                reverseTemp[i] = 0;
            }
        }
        return reverseTemp;
    }

    public static void main(String[] args) {
        FlippingAnImage flippingAnImage = new FlippingAnImage();
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        flippingAnImage.flipAndInvertImage(A);
    }
}
