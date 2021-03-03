//Set Mismatch
//using frequency
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] c = new int[nums.length];
        int[] ans = new int[2];
        for(int i: nums){
            c[i-1]++;
        }
        for(int i = 0; i < c.length; i++){
            if(c[i] == 0){
                ans[1] = i+1;
            }
            else if(c[i] == 2){
                ans[0] = i+1;
            }
        }
        return ans;
    }
}
