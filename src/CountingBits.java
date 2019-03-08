/**
 * @Author: Poldi
 * @Date: 2019-02-27 10:52
 * @Description: 338. Counting Bits
 */
public class CountingBits {
    public static int[] countBits(int num) {
        int[] res = new int[num + 1];
        int i = 1;
        int offset = 1;
        while (i < num + 1) {
            if (offset * 2 == i) {
                offset = offset * 2;
            }
            res[i] = res[i - offset] + 1;
            i++;
        }
        return res;
    }

}
