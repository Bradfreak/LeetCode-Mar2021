//Set Mismatch
//Using Sorting
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int len = nums.length, i = 0, j = 1;
        while(i < len){
            if(nums[i] == j){i++;j++;}
            else if(nums[i] < j){
                if(nums[i-1] == nums[i]){ans[0] = nums[i];i++;}
            }
            else{
                ans[1] = j;
                j++;
            }
        }
        ans[1] = (ans[1] == 0) ? len : ans[1];
        return ans;
    }
}
