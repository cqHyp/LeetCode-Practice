package Interview;

/**
 * @Author: Poldi
 * @Date: 2019-04-01 10:16
 * @Description:
 */
public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder stringBuilder = new StringBuilder(paragraph);
        String symbols = "!?',;.";
        for (char c : symbols.toCharArray()) {
            
        }
        System.out.println(stringBuilder.toString());
        return paragraph;
    }

    public static void main(String[] args) {
        String[] banned = {"hit"};
        MostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far, after it was hit.", banned);
    }
}
