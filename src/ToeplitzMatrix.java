/**
 * @Author: Poldi
 * @Date: 2018/7/26 下午3:39
 * @Description:
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        int[][] matrix = {{41, 45}, {81, 41}, {73, 81}, {47, 73}, {76, 47}, {79, 76}};
        System.out.println(toeplitzMatrix.isToeplitzMatrix(matrix));
    }
}
