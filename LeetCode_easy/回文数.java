class Solution {
    public boolean isPalindrome(int x) {
        int y = 0;
        int tmp = x;
        while(x > 0){
            y = y*10 + x % 10;
            x/=10;
        }
        if(y==tmp){
            return true;
        }
        else
            return false;
    }
}