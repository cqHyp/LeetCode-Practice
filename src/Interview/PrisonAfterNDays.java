package Interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Poldi
 * @Date: 2019-03-22 10:45
 * @Description:
 */
public class PrisonAfterNDays {
    public static int[] prisonAfterNDays(int[] cells, int N) {
        int n = 0;
        List<int[]> list = new ArrayList<>();
        switchCells(cells, list, n);
        if (N < 14){
            return list.get(N - 1);
        }else {
            if (N % 14 == 0){
                return list.get(13);
            }else {
                return list.get(N % 14 - 1);
            }
        }

    }

    static void switchCells(int[] cells, List<int[]> list, int n){
        n++;
        int[] temp = new int[8];
        temp[0] = 0;
        temp[7] = 0;
        for (int i = 1; i < cells.length - 1; i++) {
            temp[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
        }
        list.add(temp);
        if (n < 14){
            switchCells(temp, list, n);
        }
    }
}
