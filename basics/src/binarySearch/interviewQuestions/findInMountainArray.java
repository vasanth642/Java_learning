package binarySearch.interviewQuestions;

public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,5,4,2,1};
        int target = 19;
        int peakIndex = findPeakIndex(arr);
        int firstTry = orderAgnosticBinarySearch(arr,target,0,peakIndex);
        if(firstTry != -1) {
            System.out.println(firstTry);
        }else {
            System.out.println(orderAgnosticBinarySearch(arr,target,peakIndex + 1,arr.length - 1));
        }
    }

    public static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr [mid + 1]) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderAgnosticBinarySearch(int[] arr,int target,int start,int end) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(isAsc) {
                if(target == arr[mid]) {
                    return mid;
                }else if(target > arr[mid]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else {
                if(target == arr[mid]) {
                    return mid;
                }else if(target > arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return - 1;
    }
}
