class Solution {
    public int maximumGap(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    if(n<2) return 0;
    int Maxgap = 0;
    for(int i=0;i<n - 1;i++){
        int gap = nums[i+1] - nums[i];
        Maxgap = Math.max(Maxgap,gap);
    }  
    return Maxgap;  
    }
}