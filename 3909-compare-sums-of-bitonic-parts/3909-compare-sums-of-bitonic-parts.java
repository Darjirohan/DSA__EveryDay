class Solution {
    public int compareBitonicSums(int[] nums) {
        
        long prefix = 0;
        long suffix = 0;
        int n = nums.length;
        int ind = -1;
        for(int i=1;i<n-1;i++){
        if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
        ind = i;
        break;
        }
        }

        for(int i=0;i<=ind;i++){
        prefix+=nums[i];
        }
        for(int i=ind;i<n;i++){
        suffix+=nums[i];
        }

        int flag = 0;
        if(prefix<suffix){
            flag = 1;
        }else if(prefix==suffix){
            flag = -1;
        }

        return flag;
    }
}