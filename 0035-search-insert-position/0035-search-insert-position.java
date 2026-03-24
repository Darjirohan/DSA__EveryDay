class Solution {
    public int searchInsert(int[] nums, int target) {
    int n=nums.length;
    int left=0;
    int right=n-1;
    int index=0;
    if(target>nums[n-1]){
    index=n;
    }
    while(left<=right ){
    int pos=left+(right-left)/2 ;
    if(nums[pos]==target){
        return pos;
    }
    else if(nums[pos]<target){
        left=pos+1;
    }
    else{
        right=pos-1;
    }
    }
    return left;
    }
}