import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author: Poldi
 * @Date: 2018/8/1 下午6:28
 * @Description:
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        Set set = new HashSet(list);
        list.clear();
        list.addAll(set);
        List<Integer> tempList = new ArrayList<>(nums.length);
        for (int i = 1; i <= nums.length; i++){
            tempList.add(i);
        }
        tempList.removeAll(list);
        return tempList;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
        int[] nums = {1,8,2,3,4,5,5,6};
        findAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums);
    }
}
