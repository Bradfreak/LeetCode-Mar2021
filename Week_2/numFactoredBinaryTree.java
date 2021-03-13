//Binary Trees With Factors normal soln
class Solution {
    public boolean bs(int[] arr, int s, int r, int l){
        int m;
        if(r >= l){
            m = (r + l) / 2;
            if(arr[m] == s){
                return true;
            }
            if(arr[m] > s){
                return bs(arr,s,m - 1,l);
            }
            else{
                return bs(arr,s,r,m + 1);
            }
        }
        return false;
    }
    public int numFactoredBinaryTrees(int[] arr) {
        int i, j, temp, m = 1000000007;
        long ans = 0, tmps;
        Arrays.sort(arr);
        HashMap<Integer, Long> mp = new HashMap<Integer, Long>();
        for(i = 0; i < arr.length; i++){
            tmps = 1;
            for(j = 0; j < i; j++){
                if(arr[i] % arr[j] == 0){
                    temp = arr[i]/arr[j];
                    if(bs(arr,temp,i-1,0)){
                        tmps += mp.get(arr[j])*mp.get(temp) ;
                    }
                }
            }
            mp.put(arr[i],tmps);
            ans = (ans + tmps);
        }
        return (int)(ans%m);
    }
}
