import java.util.Stack;

/**
 * @Author: Poldi
 * @Date: 2019-03-07 14:46
 * @Description: 20. Valid Parentheses
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                temp.push(chars[i]);
            } else {
                if (temp.empty()) return false;
                if (chars[i] == ')' && temp.peek() != '(') return false;
                if (chars[i] == '}' && temp.peek() != '{') return false;
                if (chars[i] == ']' && temp.peek() != '[') return false;
                temp.pop();
            }
        }
        return temp.empty();
    }
}
