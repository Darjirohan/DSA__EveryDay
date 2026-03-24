class Solution {
    public int absDifference(int[] nums, int k) {
    int ans=0;
        Arrays.sort(nums);
        int len = nums.length-1;
        int max = 0;
        int min=0;
        for(int i=0;i<k;i++){
           min+=nums[i]; 
           max+=nums[len-i];
        }
        ans = max-min;
        return ans;
    }
}