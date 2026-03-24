class Solution {
    public long maxProduct(int[] nums) {
    
    for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
            nums[i]*=-1; 
        }
    }
    Arrays.sort(nums);
    long ans = 1;
    ans*=(long)nums[nums.length - 1];
    ans*=(long)nums[nums.length - 2];
    ans*=100000;
    return ans;
    }
}