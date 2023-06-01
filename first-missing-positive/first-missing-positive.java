class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length; i++){
            if(min > nums[i] && nums[i] > 0){
                min = nums[i];
            }
        }
        if(min > 1){
            return 1;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > 0 && nums[i]+1 != nums[i+1] && nums[i] != nums[i+1]){
                return nums[i]+1;
            }
        }
        return nums[nums.length-1] + 1;
    }
}