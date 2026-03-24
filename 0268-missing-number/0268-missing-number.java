class Solution {
    public int missingNumber(int[] nums) {
    int sum=(nums.length)*(nums.length+1)/2;
    int s=0;
    for(int num:nums){
        s+=num;
    }
    return (sum-s);   
    }
}