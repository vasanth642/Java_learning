package array_arraylist.java;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {1,23,45,6,7,8,9,234,55,};
        System.out.println(max(arr,2,5));
    }

    static int max(int[] arr,int start,int end) {
        int maxval = arr[0];
        for (int i=start;i<=end;i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
