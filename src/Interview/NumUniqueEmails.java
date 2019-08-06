package Interview;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Poldi
 * @Date: 2019-05-08 11:07
 * @Description:
 */
public class NumUniqueEmails {
    private static int numUniqueEmails(String[] emails) {
        Set set = new HashSet();
        for (String e : emails) {
            uniqueEmail(e, set);
        }
        return set.size();
    }

    private static void uniqueEmail(String s, Set set) {
        String[] strings = s.split("@");
        String left = strings[0];
        String right = strings[1];
        left = left.replace(".", "");
        if (left.indexOf("+") > 0) {
            left = left.substring(0, left.indexOf("+"));
        }
        System.out.println(left + "@" + right);
        set.add(left + "@" + right);
    }

    public static void main(String[] args) {
        String[] strings = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        NumUniqueEmails.numUniqueEmails(strings);
    }
}
