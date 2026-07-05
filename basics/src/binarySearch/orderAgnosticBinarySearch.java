package binarySearch;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {97,96,89,80,79,78, 56,45,34,23,0,-12,-18,-22};
        int target = -12;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //isAsc is used to check whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}