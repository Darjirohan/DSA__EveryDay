class Solution {
    public int centeredSubarrays(int[] nums) {
    int count = 0;
    
    int[] prefix = new int[nums.length];
    prefix[0] = nums[0];
    for(int i=1;i<nums.length;i++){
        prefix[i] = prefix[i-1] + nums[i];
    }
    for(int left=0;left<nums.length;left++){
        HashSet<Integer> st = new HashSet<>();
        for(int right=left;right<nums.length;right++){
            st.add(nums[right]);
            int sum = prefix[right] - (left>0?prefix[left-1]:0);
            if(st.contains(sum)){
                count++;
            }
        }
    }
        return count;
    }
}