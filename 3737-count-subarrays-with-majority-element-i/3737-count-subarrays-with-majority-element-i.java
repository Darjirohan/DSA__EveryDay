class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
    int n = nums.length;
    int count = 0;
    for(int i=0;i<n;i++){
        int count_target = 0;
        for(int j=i;j<n;j++){
            if(nums[j] == target){
                count_target++;
            }
            if(2*count_target>(j-i+1)) count++;
        }
    } 
    return count;
    }
}