//Distribute Candies
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i : candyType){
            s.add(i);
        }
        return Math.min(s.size(), candyType.length >> 1);
    }
}
