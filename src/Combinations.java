import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/7/31 上午11:14
 * @Description:
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(res, temp, n, k, 1);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> temp, int n, int k, int start){
        if (temp.size() == k){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = start; i <= n; i++){
            temp.add(i);
            dfs(res, temp, n, k, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        combinations.combine(4,2);
    }
}
