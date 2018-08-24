import java.util.*;

/**
 * @Author: Poldi
 * @Date: 2018/7/21 下午2:30
 * @Description:
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        for (int a : nums) {
            tempList.add(a);
        }
        if (tempList.size() <= 1) {
            return tempList;
        }
        Collections.sort(tempList);
        Map<Integer, Integer> map = new HashMap<>();
        int temp = tempList.get(0);
        int count = 0;
        for (int i = 0; i < tempList.size(); i++) {
            if (temp == tempList.get(i)) {
                count++;
            } else {
                map.put(temp, count);
                count = 1;
                temp = tempList.get(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] nums = {1, 2};
        System.out.println(topKFrequentElements.topKFrequent(nums, 2));
    }
}
