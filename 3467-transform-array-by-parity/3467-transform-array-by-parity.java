class Solution {
    public int[] transformArray(int[] nums) {
        
        int evenCount = 0;
        int n = nums.length;

        int[] ans = new int[n];

        for(int i=0;i<n;i++){
        if((nums[i]&1)==1) evenCount++;
        }
        int count = n - evenCount;
        for(int i=n-1;i>=count;i--){
            ans[i] = 1;
        }

        return ans;
    }
}