import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-12 10:26
 * @Description:
 */
public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        recursion(n, n, "", res);
        return res;
    }

    private static void recursion(int left, int right, String str, List<String> res) {
        if (left < 0 || right < 0 || left > right) return;
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }

        recursion(left - 1, right, str + "(", res);
        recursion(left, right - 1, str + ")", res);
    }

    public static void main(String[] args) {
        System.out.println(GenerateParentheses.generateParenthesis(3));
    }
}
