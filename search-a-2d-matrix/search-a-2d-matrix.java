class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j: matrix[i]){
                set.add(j);
            }
        }
        return set.contains(target);
    }
}