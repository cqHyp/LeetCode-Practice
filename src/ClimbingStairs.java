/**
 * @Author: Poldi
 * @Date: 2018/7/18 下午4:17
 * @Description:
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] tempList = new int[n];
        return climb(n, tempList);
    }

    private int climb(int n, int[] tempList) {
        if (n == 1 || n == 0) {
            return 1;
        }

        if (tempList[n - 1] == 0) {
            tempList[n - 1] = climb(n - 1, tempList) + climb(n - 2, tempList);
        }
        return tempList[n - 1];
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        climbingStairs.climbStairs(3);
    }
}
