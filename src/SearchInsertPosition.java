/**
 * @Author: Poldi
 * @Date: 2018/8/15 下午3:05
 * @Description:
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        while (index < nums.length) {
            if (nums[index] < target){
                index++;
            }else if (nums[index] >= target){
                return index;
            }
            if (index == nums.length - 1 && nums[index] < target){
                return index + 1;
            }
        }
        return index;
    }
}
