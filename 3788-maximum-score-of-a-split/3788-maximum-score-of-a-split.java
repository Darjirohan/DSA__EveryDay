class Solution {
    public long maximumScore(int[] nums) {
    int n = nums.length;
    long prefix=0;

    long[] suffix = new long[n];
    suffix[n-1] = nums[n-1];
    for(int i=n-2;i>=0;i--){
        suffix[i] = Math.min(suffix[i+1],nums[i]);
    }
    long maxScore = Integer.MIN_VALUE;
    for(int i=0;i<n-1;i++){
        prefix = prefix+nums[i];
        maxScore = Math.max(maxScore,prefix - suffix[i+1]);
    }
    return maxScore;
    }
}