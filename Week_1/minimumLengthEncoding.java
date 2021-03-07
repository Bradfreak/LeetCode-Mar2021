//Short Encoding of Words
class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> s = new HashSet<String>(Arrays.asList(words));
        for(String w: words){
            for(int k = 1; k < w.length(); ++k){
                s.remove(w.substring(k));
            }
        }
        
        int ans = 0;
        for(String w: s){
            ans += w.length()+1;
        }
        return ans;
    }
}
