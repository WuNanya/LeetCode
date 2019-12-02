class Solution {
    public boolean isPowerOfFour(int num) {
        if((num & 0xaaaaaaaa)==0 &&Integer.bitCount(num)==1) return true;
        else return false;
    }
}
//创建
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
