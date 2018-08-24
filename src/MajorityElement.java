import java.util.*;

/**
 * 169. Majority Element
 *
 * @Author: Poldi
 * @Date: 2018/7/20 上午9:51
 * @Description:
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        double avg = nums.length / 2;
        int res =  0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Set set = new HashSet<>(list);
        for (Integer s : (Iterable<Integer>) set) {
            int count = 0;
            for (int num : nums) {
                if (s == num) {
                    count++;
                }
            }
            if (count > avg) {
                res = s;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {1, 1, 1, 1, 2, 3, 2, 2, 2, 2};
        majorityElement.majorityElement(nums);
    }
}
