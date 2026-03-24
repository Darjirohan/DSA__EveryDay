class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        if(k==0) return n;
        if(k>=n) return 0;
        for (int i = n-k; i >=0; i--) {
            int greater = n - 1 - i;
            if (greater >= k && nums[i]!=nums[i+1]) return i+1;
        }
     return 0;
    }
}