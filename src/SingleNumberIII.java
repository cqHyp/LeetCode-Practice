/**
 * @Author: Poldi
 * @Date: 2018/9/13 下午2:17
 * @Description:
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int temp = 2;
        System.out.println(temp ^ nums[0]);
        for (int i = 1; i < nums.length; i++) {
//            if (temp ^ nums[i] == 0){
//
//            }
        }
        return res;
    }

    public static void main(String[] args) {
        SingleNumberIII singleNumberIII = new SingleNumberIII();
        int[] nums = {1, 2, 3, 1, 2, 3};
        singleNumberIII.singleNumber(nums);
    }
}
