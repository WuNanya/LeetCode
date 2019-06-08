class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int max=-1000001;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int ans=sum;
        for(int j=1;j+k-1<nums.length;j++){
            sum=sum-nums[j-1]+nums[j+k-1];
            ans=Math.max(ans,sum);
        }
        return (double)ans/k;
}
}