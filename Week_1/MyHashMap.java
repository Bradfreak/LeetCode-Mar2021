//Design HashMap
//Best Memory
class MyHashMap {

    /** Initialize your data structure here. */
    public class pair{
        int key;
        int val;
        
        pair(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    int len;
    List<pair> pr;
    public MyHashMap() {
        len = 0;
        pr = new ArrayList<pair>();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(get(key) == -1){
            pr.add(new pair(key, value));
            len++;
        }
        else{
            remove(key);
            pr.add(new pair(key,value));
            len++;
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int ans = -1;
        pair temp;
        for(int i = 0; i < len; i++){
            temp = pr.get(i);
            if(temp.key == key){
                ans = temp.val;
                break;
            }
        }
        return ans;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        pair temp;
        for(int i = 0; i < len; i++){
            temp = pr.get(i);
            if(temp.key == key){
                pr.remove(temp);
                len--;
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
