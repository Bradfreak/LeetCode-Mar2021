//Binary Trees With Factors Best soln
//Check only till sqrt of element
class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int i, j, temp, m = 1000000007, sqt;
        long ans = 0, tmps;
        Arrays.sort(arr);
        long[] dp = new long[arr.length];
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        
        for(i = 0; i < arr.length; i++){
            mp.put(arr[i],i);
        }
        
        for(i = 0; i < arr.length; i++){
            tmps = 1;
            sqt = (int)Math.sqrt(arr[i]);
            for(j = 0; arr[j] <= sqt; j++){
                if(arr[i] % arr[j] == 0){
                    temp = arr[i]/arr[j];
                    if(temp == arr[j]){
                        tmps += dp[j]*dp[j];
                    }
                    else if(mp.containsKey(temp)){
                        tmps += dp[j]*dp[mp.get(temp)]*2;
                    }
                }
            }
            dp[i] = tmps;
            ans = (ans + tmps);
        }
        return (int)(ans%m);
    }
}
