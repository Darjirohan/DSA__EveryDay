class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
    int n = nums.size();
    int[] prefix = new int[n];    
    prefix[0] = 1;
    for(int i=1;i<n-1;i++){
        prefix[i] = (nums.get(i-1)<nums.get(i))?(prefix[i-1]+1):1;
    }
    int[] suffix = new int[n];    
    suffix[n-1] = 1;
    for(int i=n-2;i>=0;i--){
        suffix[i] = (nums.get(i+1)>nums.get(i))?(suffix[i+1]+1):1;
    }
    int ans = 0;
    for(int i=0;i<n-1;i++){
        ans = Math.max(ans,Math.min(prefix[i],suffix[i+1]));
    }
    return ans;
    }
}