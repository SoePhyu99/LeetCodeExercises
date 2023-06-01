class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int[] array = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i : nums1) {
            array[index++] = i;
        }
        for (int i : nums2) {
            array[index++] = i;
        }
        Arrays.sort(array);
        if(array.length % 2 != 0){
            result = array[(array.length / 2)];
        }else{
            result = (array[(array.length / 2) - 1] + array[(array.length / 2)]) * 0.5;
        }
        return result;
    }
}