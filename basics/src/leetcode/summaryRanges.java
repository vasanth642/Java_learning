class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;
        int start = nums[0];
        for(int i = 0;i < nums.length;i++){
            if(i != nums.length - 1 && nums[i] + 1 == nums[i + 1]){
              continue;
            }else{
                if(start == nums[i]){
                    result.add(String.valueOf(nums[i]));
                    
                }else{
                    result.add(start + "->" + nums[i]);
                }
                if(i != nums.length - 1){
                      start = nums[i + 1];
                }
            }
        }
        return result;
    }
}