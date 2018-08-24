/**
 * @Author: Poldi
 * @Date: 2018/7/23 下午4:37
 * @Description:
 */
public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double width = points[0][0];
        double height = points[0][1];
        double min = Math.abs(points[0][0] - points[0][1]);
        for (int i = 0; i < points.length; i++) {
            width = Math.max(width, points[i][0]);
            height = Math.max(height, points[i][1]);
            min = Math.min(min, Math.abs(points[i][0] - points[i][1]));
        }
        return (((width * height) / 2) - min * Math.max(width, height) / 2);
    }

    public static void main(String[] args) {
        LargestTriangleArea largestTriangleArea = new LargestTriangleArea();
        int[][] points = {{4, 6}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        System.out.println(largestTriangleArea.largestTriangleArea(points));
    }
}
