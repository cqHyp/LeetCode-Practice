import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Poldi
 * @Date: 2019-01-18 11:39
 * @Description: 929. Unique Email Addresses
 */
public class UniqueEmailAddresses {
    public static int numUniqueEmails(String[] emails) {
        Set set = new HashSet();
        for (String e : emails) {
            uniqueEmail(e, set);
        }
        return set.size();
    }

    public static void uniqueEmail(String s, Set set) {
        String[] strings = s.split("@");
        strings[0] = strings[0].replace(".", "");
        System.out.println(strings[0].indexOf("+"));
        strings[0] = strings[0].substring(0, strings[0].indexOf("+"));
        set.add(strings[0] + "@" + strings[1]);
    }

    public static void main(String[] args) {
        String[] strings = {"testemail@leetcode.com", "testemail1@leetcode.com", "testemail+david@lee.tcode.com"};
        UniqueEmailAddresses.numUniqueEmails(strings);
    }
}
