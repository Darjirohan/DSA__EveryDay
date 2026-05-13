class Solution {
    public int minPatches(int[] nums, int n) {
        long lastPresent = 1;
        int patches = 0;
        int index = 0;
        while(lastPresent<=n){
        if(index<nums.length && nums[index]<=lastPresent){
            lastPresent+=nums[index];
            index++;
        }else{
            lastPresent+=lastPresent;
            patches++;
        }
        }
        return patches;
    }
}