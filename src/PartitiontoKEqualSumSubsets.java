/**
 * @Author: Poldi
 * @Date: 2018/4/4 上午11:19
 * @Description:
 */
public class PartitiontoKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int i = toAverage(nums);
        for (int num : nums) {
            if (num > i) {
                return false;
            }
        }

        return false;
    }

    private int toAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    public static void main(String[] args) {
        PartitiontoKEqualSumSubsets partitiontoKEqualSumSubsets = new PartitiontoKEqualSumSubsets();
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        System.out.println(partitiontoKEqualSumSubsets.canPartitionKSubsets(nums, 5));
    }
}
