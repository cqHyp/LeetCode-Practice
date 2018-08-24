import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2018/7/23 上午11:30
 * @Description:
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return backString(S).equals(backString(T));
    }

    private String backString(String temp) {
        StringBuilder res = new StringBuilder();
        char[] chars = temp.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ("#").toCharArray()[0]) {
                res.append(chars[i]);
            }else if (chars[i] == ("#").toCharArray()[0]){
                if (res.length() > 0){
                    res.deleteCharAt(res.length() - 1);
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        backspaceStringCompare.backspaceCompare("ab##", "c#d#");
    }
}
