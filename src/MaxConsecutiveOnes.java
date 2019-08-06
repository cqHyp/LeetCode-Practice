/**
 * @Author: Poldi
 * @Date: 2019-06-01 17:34
 * @Description: 485. Max Consecutive Ones
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : nums) {
            stringBuilder.append(a);
        }
        int temp = sliceStr(stringBuilder.toString(), 0);
        return temp;
    }

    public static int sliceStr(String str, int temp) {
        if (str.equals("")) return temp;
        if (!str.contains("0")) {
            return temp > str.length() ? temp : str.length();
        }

        if (str.indexOf("0") > temp) {
            temp = str.indexOf("0");
        }
        str = str.substring(str.indexOf("0") + 1);
        return sliceStr(str, temp);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
    }
}
