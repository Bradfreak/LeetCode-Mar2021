//Keys and Rooms REcursion
class Solution {
    boolean[] check;
    public void check(List<List<Integer>> r, int cur){
        if(check[cur]){return;}
        else{
            check[cur] = true;
            for(int i : r.get(cur)){
               check(r,i); 
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        check = new boolean[rooms.size()];
        check(rooms,0);
        for(boolean i: check){
            if(!i){return false;}
        }
        return true;
    }
}
