class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0,b = 0;
        for(int i=0;i<nums.length; i++){
            for(int j=0;j<nums.length; j++){
                if(i != j && nums[j] + nums[i] == target){
                    a = j;
                    b = i;
                }
            }
        }
        int[] result = {a, b};
        return result;
    }
}