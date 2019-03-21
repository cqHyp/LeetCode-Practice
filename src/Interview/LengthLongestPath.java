package Interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-19 18:23
 * @Description:
 */
public class LengthLongestPath {
    public static int lengthLongestPath(String input) {
        String[] strings = input.split("\n");
        List<Integer> list = new ArrayList<>();
        List<StringBuilder> stringBuilderList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].lastIndexOf('\t'));
            if (strings[i].contains(".")) {
                StringBuilder temp = new StringBuilder();
                temp.append(strings[i].replace("\t", ""));
                int deep = list.get(i);
                if (strings.length > 1) {
                    for (int j = i - 1; j > 0; j--) {
                        if (list.get(j) == deep - 1) {
                            System.out.println(2 * (list.get(j) + 1) - 1);
                            temp.append("\\" + strings[j].replace("\t", ""));
                            deep--;
                        }
                    }
                    temp.append("\\" + strings[0]);
                }
                stringBuilderList.add(temp);
            }
        }
        int res = 0;
        for (StringBuilder s : stringBuilderList) {
            res = Math.max(res, s.length());
        }
        return res;
    }

    public static void main(String[] args) {
        LengthLongestPath.lengthLongestPath("dir\n        file.txt");
    }
}
