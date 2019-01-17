import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Poldi
 * @Date: 2019-01-16 10:36
 * @Description:
 */
public class IntersectionOfTwoArrays {
    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i2 : nums1) {
            set1.add(i2);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i1 : nums2) {
            if (set1.contains(i1)) {
                set2.add(i1);
            }
        }

        int[] result = new int[set2.size()];
        int i = 0;
        for (int cell : set2) {
            result[i++] = cell;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] res = IntersectionOfTwoArrays.intersection(nums1, nums2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
