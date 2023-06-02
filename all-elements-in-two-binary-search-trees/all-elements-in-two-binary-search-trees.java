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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList();
        getAllElements(root1, list);
        getAllElements(root2, list);
        Collections.sort(list);
        return list;
    }
    private void getAllElements(TreeNode root, List<Integer> list){
        if(root == null){
            return ;
        }
        list.add(root.val);
        getAllElements(root.left, list);
        getAllElements(root.right, list);
    }
}