/**
 * @Author: Poldi
 * @Date: 2019-01-17 16:54
 * @Description:
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
//        while (start < end){
//            int mid = start + (end - start) / 2;
//            if (!isBadVersion(mid)) start = mid + 1;
//            else end = mid;
//        }
        return start;
    }

    public static int binarySearch(int[] arr, int start, int end, int hkey) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;    //防止溢位
        if (arr[mid] > hkey)
            return binarySearch(arr, start, mid - 1, hkey);
        if (arr[mid] < hkey)
            return binarySearch(arr, mid + 1, end, hkey);
        return mid;

    }
}
