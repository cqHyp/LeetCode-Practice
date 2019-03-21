package Interview;

/**
 * @Author: Poldi
 * @Date: 2019-03-19 17:48
 * @Description: 482. License Key Formatting
 */
public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String S, int K) {
        String[] str = S.split("-");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            stringBuilder.append(str[i].toUpperCase());
        }
        if (stringBuilder.length() <= 0) return "";
        int oth = stringBuilder.length() % K;
        int count = stringBuilder.length() / K;
        StringBuilder res = new StringBuilder();
        if (oth == 0) {
            for (int i = 0; i < count; i++) {
                String temp = stringBuilder.substring(i * K, i * K + K);
                res.append(temp + "-");
            }
        } else {
            String head = stringBuilder.substring(0, oth);
            res.append(head + "-");
            StringBuilder stringBuilder1 = stringBuilder.delete(0, oth);
            for (int i = 0; i < count; i++) {
                String temp = stringBuilder1.substring(i * K, i * K + K);
                res.append(temp + "-");
            }

        }
        return res.substring(0, res.length() - 1);
    }
}
