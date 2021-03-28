//Reconstruct Original Digits from English
class Solution {
    public String originalDigits(String s) {
        int[] freq = new int[26];
        int[] ansf = new int[10];
        char[] s1 = s.toCharArray();
        for(char i: s1){
            freq[(int)i - 97]++;
        }
        //zero
        ansf[0] += freq[25];
        //two
        ansf[2] += freq[22];
        //four
        ansf[4] += freq[20];
        //six
        ansf[6] += freq[23];
        //eight
        ansf[8] += freq[6];
        //one
        ansf[1] += freq[14]-freq[25]-freq[22]-freq[20];
        //three
        ansf[3] += freq[19]-freq[22]-freq[6];
        //five
        ansf[5] += freq[5]-freq[20];
        //seven
        ansf[7] += freq[18]-freq[23];
        //nine
        ansf[9] += freq[8]-freq[23]-freq[6]-freq[5]+freq[20];
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < ansf[i]; j++){
                ans.append(i);
            }
        }
        return ans.toString();
    }
}
