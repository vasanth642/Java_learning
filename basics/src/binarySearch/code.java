package binarySearch;

//assuming the array is sorted in ascending order
public class code {
    public static void main(String[] args) {
        int[] arr = {-18,-12,0,23,34,45,56,78,79,80,89,97,96};
        int target = -12;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

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
}
