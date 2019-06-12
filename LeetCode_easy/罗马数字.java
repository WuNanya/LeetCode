class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] sed = s.toCharArray();
        for(int i = 0;i<sed.length;i++){
            switch(sed[i]){
                case 'I': sum = sum +1;
                break;
                case 'V':sum = sum +5;
                break;
                case 'X':sum = sum +10;
                break;
                case 'L':sum = sum +50;
                break;
                case 'C':sum = sum +100;
                break;
                case 'D':sum = sum +500;
                break;
                case 'M':sum = sum +1000;
                break;
            }
            if(i!=0){
                if((sed[i] == 'V' ||sed[i] == 'X') && sed[i-1] == 'I'){
                    sum = sum - 2;
                }
                if((sed[i] == 'L' || sed[i] == 'C') && sed[i-1] == 'X'){
                    sum = sum - 20;
                }
                if((sed[i] == 'D' || sed[i] == 'M') && sed[i-1] == 'C'){
                    sum = sum - 200;
                }
            }
        }
        return sum;
    }
}