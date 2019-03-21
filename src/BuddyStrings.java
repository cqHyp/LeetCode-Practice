import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Poldi
 * @Date: 2019-03-11 10:56
 * @Description: 859. Buddy Strings
 */
public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;

        if (A.equals(B)) {
            Set<Character> set = new HashSet<>();
            for (char c : A.toCharArray()) {
                set.add(c);
            }
            if (set.size() == A.length()) {
                return false;
            } else {
                return true;
            }
        } else {
            StringBuilder stringBuilderA = new StringBuilder();
            StringBuilder stringBuilderB = new StringBuilder();
            for (int i = 0; i < A.length(); i++) {
                if (A.toCharArray()[i] != B.toCharArray()[i]) {
                    stringBuilderA.append(A.toCharArray()[i]);
                    stringBuilderB.append(B.toCharArray()[i]);
                }
            }
            if (stringBuilderA.toString().equals(stringBuilderB.reverse().toString())) {
                return true;
            } else {
                return false;
            }
        }

    }
}
