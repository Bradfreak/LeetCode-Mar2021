//Integer to Roman
class Solution {
    public String intToRoman(int num) {
        String ans = "";
        int q, i;
        while(num > 0){
            if(num >= 1000){
                q = num / 1000;
                num = num % 1000;
                for(i = 0; i < q; i++){ans += "M";}
            }
            else if(num >= 900){
                q = num / 900;
                num = num % 900;
                for(i = 0; i < q; i++){ans += "CM";}
            }
            else if(num >= 500){
                q = num / 500;
                num = num % 500;
                for(i = 0; i < q; i++){ans += "D";}
            }
            else if(num >= 400){
                q = num / 400;
                num = num % 400;
                for(i = 0; i < q; i++){ans += "CD";}
            }
            else if(num >= 100){
                q = num / 100;
                num = num % 100;
                for(i = 0; i < q; i++){ans += "C";}
            }
            else if(num >= 90){
                q = num / 90;
                num = num % 90;
                for(i = 0; i < q; i++){ans += "XC";}
            }
            else if(num >= 50){
                q = num / 50;
                num = num % 50;
                for(i = 0; i < q; i++){ans += "L";}
            }
            else if(num >= 40){
                q = num / 40;
                num = num % 40;
                for(i = 0; i < q; i++){ans += "XL";}
            }
            else if(num >= 10){
                q = num / 10;
                num = num % 10;
                for(i = 0; i < q; i++){ans += "X";}
            }
            else if(num >= 9){
                q = num / 9;
                num = num % 9;
                for(i = 0; i < q; i++){ans += "IX";}
            }
            else if(num >= 5){
                q = num / 5;
                num = num % 5;
                for(i = 0; i < q; i++){ans += "V";}
            }
            else if(num >= 4){
                q = num / 4;
                num = num % 4;
                for(i = 0; i < q; i++){ans += "IV";}
            }
            else if(num >= 1){
                q = num;
                num = num % q;
                for(i = 0; i < q; i++){ans += "I";}
            }
        }
        return ans;
    }
}
