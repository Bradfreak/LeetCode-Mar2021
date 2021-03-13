//Check If a String Contains All Binary Codes of Size K
class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> st = new HashSet<String>();
        int lim = 1 << k;
        for(int i = 0; i < s.length() - k + 1; i++){
            st.add(s.substring(i,i+k));
            if(st.size() == lim){
                break;
            }
        }
        if(st.size() == lim){return true;}
        else{return false;}
    }
}
