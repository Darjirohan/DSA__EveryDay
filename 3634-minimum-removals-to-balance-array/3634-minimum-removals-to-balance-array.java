class Solution {
    public int minRemoval(int[] nums, int k) {
    int n = nums.length;
    if(n == 1){
        return 0;
    }    
    
    Arrays.sort(nums);
    int max = 0;
    int left=0;
    for(int right=0;right<n;right++){
        while((long)nums[right]>(long)nums[left]*k){
            left++;
        }
        max = Math.max(max,right-left+1);
    }
    return n-max;
    }
}