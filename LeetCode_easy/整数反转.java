class Solution {
    public int reverse(int x) {
        int xed = 0;

            while(x!=0){
            if (xed > Integer.MAX_VALUE/10) 
            return 0;
            if (xed < Integer.MIN_VALUE/10) 
                return 0;
            xed =xed*10 + x % 10;
            x/=10;
        }
           
            return xed;
    }
}