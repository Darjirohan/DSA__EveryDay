import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0)return 0;
    Arrays.sort(nums);
    int len=1;
    int last=Integer.MIN_VALUE;
    int count=0;
    for(int i=0;i<nums.length;i++){
    if(nums[i]-1==last){
        count++;
        last=nums[i];
    }else if(nums[i]!=last){
        count=1;
        last=nums[i];
    }
    len = Math.max(len,count);
    }
     return len;
    }
}