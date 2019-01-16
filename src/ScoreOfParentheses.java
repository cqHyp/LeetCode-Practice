/**
 * @Author: Poldi
 * @Date: 2018/11/7 3:25 PM
 * @Description:
 */
public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        return recursion(S.toCharArray(), 0, S.length() - 1);
    }

    public int recursion(char[] str, int s, int e) {
        if (e - s == 1) return 1;
        int b = 0;
        for (int i = s; i < e; i++) {
            if (str[i] == '(') b++;
            if (str[i] == ')') b--;
            if (b == 0) return recursion(str, s, i) + recursion(str, i + 1, e);
        }
        return 2 * recursion(str, s + 1, e - 1);
    }

    public static void main(String[] args) {
        ScoreOfParentheses scoreOfParentheses = new ScoreOfParentheses();
        System.out.println(scoreOfParentheses.scoreOfParentheses("(()())"));
    }
}
