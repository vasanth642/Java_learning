package linearSearch;

public class lsCode {
    public static void main(String[] args) {
        int[] nums = {23,5,34,56,7,3,2,21};
        System.out.println(linearSearch(nums,23));

    }

    //search in the array:return the index of the item
    //otherwise if item is not found return -1
    static int linearSearch(int[] arr,int target) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i = 0;i< arr.length;i++) {
            //check for element at every index if it is equal to the target
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }

        return -1;

    }
}
