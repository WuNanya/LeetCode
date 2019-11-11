class Solution {
    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];
        int i = 0;
        int left  = 1;
        int right = n;
        while(true){
            if(i < k){
                arr[i] = left;
                i++;
                left++;
            }else{
                break;
            }
            if(i < k){
                arr[i] = right;
                right--;
                i++;
            }else{
                break;
            }
        }
        if(k % 2 == 1){
            for(int m = i; i < n; i++){
                arr[i] = left;
                left++;
            }
        }else{
            for(int m = i; m < n; m++){
                arr[m] = right;
                right--;
            }
        }
        return arr;
        }
    }
