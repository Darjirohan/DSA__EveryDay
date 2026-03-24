class Solution {
    public int minimumPrefixLength(int[] nums) {
    int index=0;
    for(int i=nums.length-2;i>=0;i--){
        if(nums[i]>=nums[i+1]){
            index=i+1;
            break;
        }
    }   
    return index; 
    }
}