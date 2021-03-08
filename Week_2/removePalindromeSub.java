//Remove Palindromic Subsequences
class Solution {
    public int removePalindromeSub(String s) {
        char[] s1 = s.toCharArray();
        if(s1.length == 0){return 0;}
        for(int i = 0; i < s1.length; i++){
            if(s1[i] != s1[s1.length-1-i]){return 2;}
        }
        return 1;
    }
}
