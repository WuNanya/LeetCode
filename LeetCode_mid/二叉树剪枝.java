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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        if(subtree(root.left)){    //如果左子树值为0或空，返回true修剪左子树
            root.left = null;
        }
        if(subtree(root.right)){//如果右子树值为0或空，返回true，修剪右子树
            root.right = null;
        }
        pruneTree(root.left); //如果都不为0，递归往下找、
        pruneTree(root.right);
        return root;
    }
    boolean subtree(TreeNode root){
        if(root == null) return true;
        if(root.val == 1)return false;
        return (subtree(root.left)&&subtree(root.right));
        //当判断root节点为0是需要判断其左右子树是否为0，如果左右子树都为0或不存在则返回true修剪
    }
}