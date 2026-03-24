class Solution {
    public int minMoves(int[] nums) {
    int min = nums[0];
    for(int i:nums){
        min = Math.min(min,i);
    }
    int moves=0;
    for(int i:nums){
        moves+=(i-min);
    }
    return moves;   
    }
}