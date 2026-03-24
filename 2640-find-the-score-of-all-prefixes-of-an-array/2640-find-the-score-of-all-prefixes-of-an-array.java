class Solution {
    public long[] findPrefixScore(int[] nums) {
    
    int n = nums.length;
    int maximum = nums[0];

    long[] prefix = new long[n];
    prefix[0] = (long)(nums[0] + maximum);
    for(int i=1;i<n;i++){
    maximum = Math.max(maximum,nums[i]);
    prefix[i] = (long) prefix[i-1] + nums[i] + maximum;
    }
    return prefix;
    }
}