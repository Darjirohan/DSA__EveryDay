class Solution {
    public int singleNumber(int[] nums) {
    int num=0;
    for(int i=0;i<=nums.length-1;i++){
        num=num^nums[i];   
    }
    return num;
    }

}