class Solution {
    public int search(int[] nums, int target) {
    int index=-1;
    int left=0;
    int right=nums.length-1;
    if(nums[left]==target){
        index=left;
    }
    if(nums[right]==target){
        index=right;
    }
    while(left<=(nums.length-1)/2 && right>=(nums.length-1)/2){
        if(nums[left]==target){
            index=left;
            break;
        }
        else if(nums[right]==target){
            index=right;
            break;
        }
        left++;
        right--;
        }
    return index;    
    }
}