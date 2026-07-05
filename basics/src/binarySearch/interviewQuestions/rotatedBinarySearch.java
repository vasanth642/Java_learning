package binarySearch.interviewQuestions;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
//this is question number 33 in leetcode
public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2,3};
        int target = 4;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    public static int search(int[] arr,int target) {
        int pivot = pivot(arr);
        if (pivot == -1) {
            //this means the array is simply sorted and it is not an rotated array
            //so simply do normal binary search(easy peasy!!)
            return binarySearch(arr,target,0,arr.length -1 );
        }

        if(arr[pivot] == target) {
            return pivot;
        }

        if(target >= arr[0]) {
            return binarySearch(arr,target,0,pivot - 1);
        }

        return binarySearch(arr,target,pivot + 1,arr.length -1 );
    }
    static int binarySearch(int[] arr,int target,int start ,int end) {

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    //this is the method to find the pivot element
    public static int pivot(int[] arr) {
       int start = 0;
       int end = arr.length - 1;
       while(start <= end) {
           int mid = start + (end - start) / 2;

           if( mid < end && arr[mid] > arr[mid  + 1]) {
               return mid;
           }
           if(mid > start &&  arr[mid] < arr[mid - 1]) {
               return mid - 1;
           }
           if(arr[start] >= arr[mid]) {
               end = mid - 1;
           }else {
               start = mid + 1;
           }
       }
       return  -1;
    }
}
