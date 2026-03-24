class Solution {
    public long rob(int[] nums, int[] colors) {

        int n= nums.length;
        if(n == 1) return nums[0];

        long dp2 = 0;
        long dp1 = nums[0];
        for(int i=1;i<n;i++){
            long curr = 0;

            if(colors[i]==colors[i-1]){
                curr = dp2 + nums[i];
            }else{
                curr =  dp1 + nums[i];
            }
            curr = Math.max(curr,dp1);
            dp2 = dp1;
            dp1 = curr;
        }
        return dp1;
    }
}