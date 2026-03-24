class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closest = nums[0] + nums[1] + nums[2];
    for(int i = 0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        int j = i+1;
        int k = nums.length-1;
        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(Math.abs(sum - target)<Math.abs(closest-target)){
                closest = sum;
            }
            if(sum>target){
                k--;
            }else if(sum<target){
                j++;
            }else{
                if(sum==target){
                    closest=sum;
                }
                j++;
                k--;
                while(j<k && nums[j]==nums[j-1]) j++;
                while(j<k && nums[k] == nums[k+1]) k--;
            }
        }
    }   
    return closest;   
    }
}