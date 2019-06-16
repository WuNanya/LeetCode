class Solution {
    public int divide(int dividend, int divisor) {
        boolean Symbol = (dividend ^ divisor) >= 0;    //如果大于0 两数符号相同
        long _dividend = (Math.abs((long)dividend));
        long _divisor = (Math.abs((long)divisor));
        
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int result = 0;
        for(int i = 31;i>=0;i--){
            if((_dividend>>i)>=_divisor){
                result = result + (1<<i);
                _dividend = _dividend - (_divisor<<i);
            }
        }
        if(Symbol == true){
            return result;
        }
        else
            return -result;
    }
}