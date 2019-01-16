/**
 * @Author: Poldi
 * @Date: 2018/9/11 上午10:42
 * @Description:
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0){

            }
        }

        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();
        repeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc");
    }
}
