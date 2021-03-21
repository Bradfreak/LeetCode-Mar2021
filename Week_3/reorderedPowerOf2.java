//Reordered Power of 2
class Solution {
    public boolean reorderedPowerOf2(int N) {
        int[] dig = new int[10];
        int[] ref = new int[]{0,4,7,10,14,17,20,24,27,30};
        int count = 0;
        while(N != 0){
            dig[N % 10]++;
            N = N / 10;
            count++;
        }
        int n1;
        boolean done = true;
        for(int i = ref[count-1]; i < ref[count]; i++){
            int[] temp = new int[10];
            n1 = 1 << i;
            while(n1 != 0){
                temp[n1 % 10]++;
                n1 = n1 / 10;
            }
            done = true;
            for(int j = 0; j < 10; j++){
                if(dig[j] != temp[j]){
                    done = false;
                    break;
                }
            }
            if(done){break;}
        }
        return done;
    }
}
