import java.util.*;
class Solution {
    public int findPeakElement(int[] nums) {
    int left=0,right=nums.length-1;
    int peak=0,max=nums[0];
    while(left<=right){
    if(nums[left]>max){
        max=nums[left];
        peak=left;
        left++;
    }else if(nums[right]>max){
        max=nums[right];
        peak=right;
        right--;
    }else{
        left++;
        right--;
    }
    }
    return peak;
    }
}