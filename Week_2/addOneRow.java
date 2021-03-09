//Add One Row to Tree
//Using Recursion
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
    public TreeNode change(TreeNode root, int v, int d, char pos, int dep){
        if(dep == d){
            if(pos == 'l' || pos == 'm'){
                TreeNode temp = new TreeNode(v, root, null);
                dep++;
                return temp;
            }
            else if(pos == 'r'){
                TreeNode temp = new TreeNode(v, null, root);
                dep++;
                return temp;
            }
        }
        if(dep == d+1){return root;}
        if(root.left != null){root.left = change(root.left,v,d,'l',dep+1);}
        else if(dep+1 == d){root.left = new TreeNode(v);}
        if(root.right != null){root.right = change(root.right,v,d,'r',dep+1);}
        else if(dep+1 == d){root.right = new TreeNode(v);}
        return root;
    }
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        int dep = 0;
        return change(root, v, d-1,'m', dep);
    }
}
