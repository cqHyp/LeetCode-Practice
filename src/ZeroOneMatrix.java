/**
 * @Author: Poldi
 * @Date: 2018/11/22 5:06 PM
 * @Description:
 */
public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        int x = matrix[0].length;
        int y = matrix.length;
        int max = matrix.length * matrix[0].length;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (matrix[i][j] == 0) {
                    res[i][j] = 0;
                } else {
                    int topCell = i > 0 ? res[i - 1][j] : max;
                    int leftCell = j > 0 ? res[i][j - 1] : max;
                    res[i][j] = Math.min(topCell, leftCell) + 1;
                }
            }
        }
        for (int i = y - 1; i >= 0; i--) {
            for (int j = x - 1; j >= 0; j--) {
                if (res[i][j] != 0) {
                    int downCell = i < y - 1 ? res[i + 1][j] : max;
                    int rightCell = j < x - 1 ? res[i][j + 1] : max;
                    res[i][j] = Math.min(Math.min(downCell, rightCell) + 1, res[i][j]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ZeroOneMatrix zeroOneMatrix = new ZeroOneMatrix();
        int[][] matrix = {{0}, {0}, {0}, {0}, {0}};
        zeroOneMatrix.updateMatrix(matrix);
    }
}
