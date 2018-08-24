/**
 * @Author: Poldi
 * @Date: 2018/3/30 下午3:17
 * @Description:
 */
public class TotalHammingDistance {

    private int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int j=0;j<32;j++) {
            int bitCount = 0;
            for (int i=0;i<n;i++)
                bitCount += (nums[i] >> j) & 1;
            total += bitCount*(n - bitCount);
        }
        return total;
    }


    public static void main(String[] args) {
        TotalHammingDistance totalHammingDistance = new TotalHammingDistance();
        int[] nums = {4, 14, 4};
        System.out.println(totalHammingDistance.totalHammingDistance(nums));
    }
}
