/**
 * @Author: Poldi
 * @Date: 2018/7/10 下午4:32
 * @Description:
 */
public class PalindromePartitioningII {
    public int minCut(String s) {
        int count = 0;
        char temp = s.charAt(0);
        for (char i : s.toCharArray()){
            if (temp != i){
                count++;
                temp = i;
            }
        }
        if (s.toCharArray().length > 2 && s.toCharArray().length - 1 == count){
            return 0;
        }
        if (s.toCharArray().length == 2){
            return 1;
        }
        return count;
    }

    public static void main(String[] args) {
        PalindromePartitioningII palindromePartitioningII = new PalindromePartitioningII();
        System.out.println(palindromePartitioningII.minCut("efe"));
    }
}
