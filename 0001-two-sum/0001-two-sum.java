class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap <Integer,Integer> hs = new HashMap<>();
    for(int i = 0;i<nums.length;i++){
        int rem = target - nums[i];
        if(hs.containsKey(rem)){
            return new int[]{hs.get(rem),i};
        }
        hs.put(nums[i],i);
    }
    return new int[]{-1,-1};
    }
}