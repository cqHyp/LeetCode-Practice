/**
 * @Author: Poldi
 * @Date: 2018/9/11 上午10:42
 * @Description: 459. Repeated Substring Pattern
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                String temp = s.substring(0, i);
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < l / i; j++) {
                    stringBuilder.append(temp);
                }
                if (stringBuilder.toString().equals(s)) return true;
            }
        }

        return false;
    }
}
