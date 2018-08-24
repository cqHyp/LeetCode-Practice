/**
 * @Author: Poldi
 * @Date: 2018/7/17 下午3:07
 * @Description:
 */
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            bg:if (sum < k) {
                for (int j = i + 1; j < nums.length; j++) {
                    sum = sum + nums[j];
                    if (sum > k) {
                        break bg;
                    } else if (sum == k) {
                        count++;
                        break bg;
                    }
                }
            }else if (sum == k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
        int[] nums = {1, 2, 3};
        System.out.println(subarraySumEqualsK.subarraySum(nums, 3));
    }
}
