class Solution {
    public int minOperations(int[] nums, int x) {
    int n = nums.length;
    int total = 0;
    int Maxlen = -1;
    for(int i:nums){
        total+=i;
    }
    int target = total - x;
    if(target<0) return -1;
    int sum = 0;
    int left=0;
    for(int right=0;right<n;right++){
       sum+=nums[right];
       while(sum>target){
        sum-=nums[left];
        left++;
       }
       if(sum == target){
        Maxlen = Math.max(Maxlen,right - left + 1);
       }
    }
    if(Maxlen== -1){
        return -1;
    }
    return n - Maxlen;
    }
}