class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
    int[] suffix = new int[n];

    suffix[n-1] =nums[n-1];
    for(int i=n-2;i>=0;i--){
        suffix[i] = suffix[i+1]+nums[i];
        
    }
    int dominants = 0;

    for(int i=0;i<n-1;i++){
        if(nums[i]*(n-i-1)>suffix[i+1]) dominants++;
    } 
    return dominants;  
    }
}