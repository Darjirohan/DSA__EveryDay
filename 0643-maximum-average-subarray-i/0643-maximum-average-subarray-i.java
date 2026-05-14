class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxsum = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxsum = Math.max(maxsum,sum);
        int left = 0;
        for(int i=k;i<n;i++){
        sum-=nums[left];
        sum+=nums[i];
        maxsum = Math.max(maxsum,sum);
        left++;
        }

        return (double)maxsum/k;
    }
}