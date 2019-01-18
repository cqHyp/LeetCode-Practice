/**
 * @Author: Poldi
 * @Date: 2019-01-17 16:34
 * @Description:
 */
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int start = 1;
        int end = num;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid * mid == num){
                return true;
            }else if (mid * mid < num){
                start = mid + 1;
            }else if (mid * mid > num){
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ValidPerfectSquare.isPerfectSquare(16));
    }
}
