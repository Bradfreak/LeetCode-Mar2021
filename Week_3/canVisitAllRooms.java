//Keys and Rooms
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> st = new Stack<Integer>();
        List<Integer> there = new ArrayList<Integer>();
        st.push(0);
        there.add(0);
        while(st.size() > 0){
            for(int i: rooms.get(st.pop())){
                if(!there.contains(i)){
                    st.push(i);
                    there.add(i);
                }
            }
        }
        if(rooms.size() == there.size()){return true;}
        else{return false;}
    }
}
