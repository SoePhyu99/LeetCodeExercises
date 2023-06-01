class Solution {
    public int[] rotate(int[] nums, int k) {
        if(k > nums.length){
            k = k - nums.length;
            while(k > nums.length){
                k = k - nums.length;
            }
        }
        int[] current = new int[nums.length];
        int index = 0;
        int back = nums.length - k;
        for(int i = 0; i < nums.length; i++){
            if(i < k){
                current[i] = nums[back++];
            }else{
                current[i] = nums[index++];
            }
        }
        for(int i = 0;i<current.length; i++){
            nums[i] = current[i];
        }
        
        return nums;
    }
}