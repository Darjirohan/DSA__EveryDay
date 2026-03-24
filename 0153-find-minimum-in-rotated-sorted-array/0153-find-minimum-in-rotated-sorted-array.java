class Solution {
    public int findMin(int[] nums) {
    int min=nums[0];
    int left=0;
    int right=nums.length-1;
    if(right<0){
        return 0;
    }
    while(left<=(nums.length-1)/2 && right>=(nums.length-1)/2){
        if(nums[left]<min){
            min=nums[left];
        }
        if(nums[right]<min){
            min=nums[right];
        }
        left++;
        right--;
    }
    return min;  
    }
}