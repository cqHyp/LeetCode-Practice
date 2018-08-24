import java.util.*;

/**
 * @Author: Poldi
 * @Date: 2018/8/14 下午1:39
 * @Description:
 */
public class KthSmallestPrimeFraction {
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        int n = A.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(A[a[0]] * A[n - 1 - b[1]], A[n - 1 - a[1]] * A[b[0]]);
            }
        });

        for (int i = 0; i < n; i++) {
            pq.offer(new int[] {i, 0});
        }

        while (--K > 0) {
            int[] p = pq.poll();

            if (++p[1] < n) {
                pq.offer(p);
            }
        }

        return new int[] {A[pq.peek()[0]], A[n - 1 - pq.peek()[1]]};
    }


    public static void main(String[] args) {
        int[] A = {1, 2, 3, 5};
        KthSmallestPrimeFraction kthSmallestPrimeFraction = new KthSmallestPrimeFraction();
        kthSmallestPrimeFraction.kthSmallestPrimeFraction(A,3);
    }
}
