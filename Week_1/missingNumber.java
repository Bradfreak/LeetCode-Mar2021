//Missing Number
class Solution {
    public int missingNumber(int[] nums) {
        int len = 0, xo = 0;
        for(int i: nums){
            len++;
            xo = (xo ^ i);
        }
        for(int i = 0; i <= len; i++){
            xo = (xo ^ i);
        }
        return xo;
    }
}
