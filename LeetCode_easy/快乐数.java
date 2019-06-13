class Solution {
    public boolean isHappy(int n) {
        int num = 0;
        int i = 0;
        while(true){
        while(n !=0 ){
            num = num + (n % 10) * (n % 10);
            n/=10;
            
            }
            i++;
        if(i>10){
            return false;
        }
            n = num;
            num = 0;
            if(n==1){
                break;
            }
        }
        return true;
    }
}

    