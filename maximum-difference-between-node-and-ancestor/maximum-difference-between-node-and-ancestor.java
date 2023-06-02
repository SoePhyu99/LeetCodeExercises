/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxAncestorDiff(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        li = maxAncestorDiff(root, li, 0);
        Collections.sort(li);
        System.out.println(li);
        return li.get(li.size() - 1);
    }
    private List<Integer> maxAncestorDiff(TreeNode root, List li, int max){
        if(root == null){
            return li;
        }
        List<Integer> list = new ArrayList<>();
        list = getArray(root, list);
        for(int i = 1; i< list.size(); i++){
            int result = Math.max(list.get(i), list.get(0)) - Math.min(list.get(0), list.get(i));
            if(result > max){
                max = result;
                li.add(max);
            }
        }
        maxAncestorDiff(root.left, li, max);
        return maxAncestorDiff(root.right, li, max);
    }
    private List<Integer> getArray(TreeNode root, List list){
        if(root == null){
            return list;
        }
        list.add(root.val);
        getArray(root.left, list);
        return getArray(root.right, list);
    }
}