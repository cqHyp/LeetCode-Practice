import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/7/31 上午11:51
 * @Description:
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        dfs(res, new ArrayList<>(), nums, 0);
        return res;
    }

    public static void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        if (start == nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            res.add(new ArrayList<>(temp));
            dfs(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        int[] nums = {1, 2, 3};
        subsets.subsets(nums);
    }
}
