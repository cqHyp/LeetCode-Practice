import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/9/20 上午10:00
 * @Description:
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int n1 : nums1) {
            list1.add(n1);
        }
        for (int n2 : nums2) {
            list2.add(n2);
        }
        list1.addAll(list2);
        Collections.sort(list1);
        if (list1.size() % 2 == 0){
            return (double)(list1.get(list1.size() / 2) + list1.get(list1.size() / 2 - 1)) / 2;
        }else {
            return (double)(list1.get(list1.size() / 2));
        }
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        int[] nums1 = {};
        int[] nums2 = {3, 2};
        medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
    }
}
