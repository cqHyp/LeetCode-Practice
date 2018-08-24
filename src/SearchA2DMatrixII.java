/**
 * @Author: Poldi
 * @Date: 2018/8/15 下午2:09
 * @Description:
 */
public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length <= 0 || matrix[0].length <= 0) return false;
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while (true) {
            if (matrix[i][j] > target) {
                --j;
            } else if (matrix[i][j] < target) {
                ++i;
            } else {
                return true;
            }
            if (j < 0 || i >= matrix.length) break;
        }

        return false;
    }

    public static void main(String[] args) {
        SearchA2DMatrixII searchA2DMatrixII = new SearchA2DMatrixII();
        int[][] matrix = {




                {1,  4,  7,  11, 15},
                {2,  5,  8,  12, 19},
                {3,  6,  9,  16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}




        };
//        int[][] matrix = {{-1,3}};
        System.out.println(searchA2DMatrixII.searchMatrix(matrix, 1));
    }
}
