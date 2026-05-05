class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        if(n==1) return 0;

        int sum = 0;
        int totalsum = 0;
        for(int i=0;i<n;i++){
            sum+=(nums[i]);
            totalsum +=i*nums[i];
        }
        int max = totalsum;
        
        for(int i=n-1;i>=1;i--){
            totalsum += sum - n*(nums[i]);
            max = Math.max(max,totalsum);
        }

        return max;
    }
}