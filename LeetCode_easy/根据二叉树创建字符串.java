/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        if(t == null){
            return "";
        }
        findTree(t, sb);
        return sb.toString();
    }
    public static void findTree(TreeNode t, StringBuilder sb){
        if(t != null){
            sb.append(t.val);
        if(t.left != null || t.right != null){
            sb.append("(");
            findTree(t.left, sb);
            sb.append(")");
            if(t.right != null){
                sb.append("(");
                findTree(t.right, sb);
                sb.append(")");
                
            }
        }
    }
    }
}
