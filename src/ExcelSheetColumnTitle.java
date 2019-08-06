/**
 * @Author: Poldi
 * @Date: 2019-08-02 14:25
 * @Description:
 */
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.append((char)('A' + n % 26));
            n /= 26;
        }
        result.reverse();
        System.out.println(result.toString());
        return result.toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle.convertToTitle(28);
    }
}
