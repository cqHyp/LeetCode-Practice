/**
 * @Author: Poldi
 * @Date: 2018/7/23 下午5:00
 * @Description:
 */
public class RotateString {
    public boolean rotateString(String A, String B) {
        StringBuilder builderA = new StringBuilder(A);
        StringBuilder builderB = new StringBuilder(B);
        for (int i = 0; i < builderA.length(); i++){

        }
        return builderA.toString().equals((builderB).toString());
    }

    public static void main(String[] args) {
        RotateString rotateString = new RotateString();
        System.out.println(rotateString.rotateString("abcde","cdeab"));
    }
}
