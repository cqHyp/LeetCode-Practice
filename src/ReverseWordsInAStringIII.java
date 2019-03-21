/**
 * @Author: Poldi
 * @Date: 2019-03-09 10:53
 * @Description: 557. Reverse Words in a String III
 */
public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            StringBuilder temp = new StringBuilder(strings[i]);
            res.append(temp.reverse() + " ");
        }
        return res.toString().trim();
    }
}
