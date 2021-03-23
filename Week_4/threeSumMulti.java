//3Sum With Multiplicity
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long[] freq = new long[101];
        int temp = 0, i, t = 0;
        for(i = 0; i < arr.length; i++){
            temp = freq[arr[i]] == 0 ? temp + 1 : temp;
            freq[arr[i]]++;
        }
        int[] el = new int[temp];
        for(i = 0; i < freq.length;i++){
            if(freq[i] != 0){
                el[t] = i;
                t++;
            }
        }
        long ans = 0;
        for (i = 0; i < temp; ++i) {
            int x = el[i];
            int T = target - x;
            int j = i, k = temp - 1;
            while (j <= k) {
                int y = el[j], z = el[k];
                if (y + z < T) {
                    j++;
                } else if (y + z > T) {
                    k--;
                } else {  // # x+y+z == T, now calc the size of the contribution
                    if (i < j && j < k) {
                        ans += freq[x] * freq[y] * freq[z];
                    } else if (i == j && j < k) {
                        ans += freq[x] * (freq[x] - 1) / 2 * freq[z];
                    } else if (i < j && j == k) {
                        ans += freq[x] * freq[y] * (freq[y] - 1) / 2;
                    } else {  // i == j == k
                        ans += freq[x] * (freq[x] - 1) * (freq[x] - 2) / 6;
                    }

                    ans %= 1000000007;
                    j++;
                    k--;
                }
            }
        }
        return((int)(ans % 1000000007));
    }
}
