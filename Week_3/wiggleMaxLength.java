//Wiggle Subsequence
class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1){return 1;}
        int[] diff = new int[nums.length-1];
        int count = 1;
        for(int i = 0; i < nums.length-1; i++){
            diff[i] = nums[i+1] - nums[i];
        }
        int sign;
        if(diff[0] < 0){
            sign = -1;
            count++;
        }
        else if(diff[0] == 0){sign = 0;}
        else{
            sign = 1;
            count++;
        }
        for(int i = 1; i < diff.length; i++){
            if(diff[i]*sign < 0){
                count++;
                sign = sign * -1;
            }
            else if(sign == 0){
                if(diff[i] < 0){
                    sign = -1;
                    count++;
                }
                else if(diff[i] > 0){
                    sign = 1;
                    count++;
                }
            }
        }
        return count;
    }
}
