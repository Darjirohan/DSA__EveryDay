class Solution {
    public int maximumStrongPairXor(int[] nums) {
    int xor = 0;
    for(int i = 0;i<nums.length;i++){
    for(int j = 0;j<nums.length;j++){
       int dif = Math.abs(nums[i] - nums[j]);
       if(dif<=Math.min(nums[i],nums[j])){
        xor = Math.max(xor,nums[i]^nums[j]);
       }
    }  
    }   
    return xor; 
    }
}