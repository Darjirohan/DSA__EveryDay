class Solution {
    public int[] getConcatenation(int[] nums) {
    int n=2*nums.length;
    int[] newar = new int[n];
    for(int i=0;i<nums.length;i++){
        newar[i]=nums[i];
    }
    for(int i=0;i<nums.length;i++){
        newar[nums.length+i] = nums[i];
    }
    return newar;
    }
}