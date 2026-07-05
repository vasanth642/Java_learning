package binarySearch.interviewQuestions;

//this question is basically about finding the number iof rotations in rotated sorted array

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,11,0,1,2,3,4,5};
        int pivot = findpivot(arr);
        int ans = pivot + 1;
        System.out.println("the number of rotations in the array is " + ans);
    }

    public static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1 ]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if(arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return  -1;
    }
}
