class Solution {
    public int maxAscendingSum(int[] nums) {
    int n=nums.length;
    int max=nums[0];
    int sum=nums[0];
    for(int right=1;right<n;right++){
       if(nums[right]>nums[right-1]){
        sum+=nums[right];
       }else{
        sum=nums[right];
       }
       max = Math.max(max,sum);
    }
    return max;    
    }
}