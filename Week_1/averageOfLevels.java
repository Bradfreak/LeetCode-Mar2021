//Average of Levels in Binary Tree
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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode temp;
        q.offer(root);
        List<Double> ans = new ArrayList<Double>();
        double sum;
        int size = q.size();
        while(size != 0){
            sum = 0;
            for(int i = 0; i < size; i++){
                temp = q.remove();
                if(temp.left != null){q.offer(temp.left);}
                if(temp.right != null){q.offer(temp.right);}
                sum += (double)(temp.val);
            }
            ans.add(sum/size);
            size = q.size();
        }
        return ans;
    }
}
