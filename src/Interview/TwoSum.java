package Interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-22 10:18
 * @Description:
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[1];
        List<Integer> list = new ArrayList<>();
        for (int a : nums) {
            list.add(a);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            list.remove(0);
            count++;
            List<Integer> tempList = list;
            for (int j = 0; j < tempList.size(); j++) {
                if (nums[i] + tempList.get(j) == target) {
                    res = new int[]{i, j + count};
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        System.out.println(TwoSum.twoSum(nums, 6));
    }
}
