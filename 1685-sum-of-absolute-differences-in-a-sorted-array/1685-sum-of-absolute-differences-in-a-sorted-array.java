class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
    int n = nums.length;
    int[] prefix = new int[n];
    int[] suffix = new int[n];  
    prefix[0] = nums[0];
    suffix[n-1] = nums[n-1];
    for(int i=1;i<n;i++){
      prefix[i] = prefix[i-1] + nums[i];
    }  
    for(int i=n-2;i>=0;i--){
      suffix[i] = suffix[i+1] + nums[i];
    } 
    int[] ans = new int[n];
    for(int i=0;i<n;i++){
        if(i==0) ans[0] = Math.abs(suffix[1] - nums[0]*(n - 1 - i));
        else if(i==n-1) ans[n-1] = Math.abs(nums[n-1]*(n-1)- prefix[n-2]);
        else ans[i] = Math.abs((nums[i]*i - prefix[i-1]) + (suffix[i+1] - nums[i]*(n-1-i)));
    }
    return ans;
    }
}