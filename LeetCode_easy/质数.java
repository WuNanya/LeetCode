class Solution {
    public int countPrimes(int n) {
        int num = 0;
        for(int i = 2; i < n; i++){

            boolean flag = find(i);
            if(flag == true){
                num++;
            }
            flag =false;
        }
        return num;
    }
    public static boolean find(int i){
        for(int j = 2; j <= i/2; j++){
  
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
