/**
 * @Author: Poldi
 * @Date: 2019-01-17 16:20
 * @Description:
 */
public class SqrtX {
    public int mySqrt(int x) {
        int c = x;
        if (c * c > x) {
            c = ((c + x / c) / 2) | 0;
        }
        return 0;
    }
}
