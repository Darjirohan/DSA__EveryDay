class Solution {
    public int firstUniqueEven(int[] nums) {
        int max = nums[0];
        for(int i:nums){
            max = Math.max(max,i);
        }
        int[] freq = new int[max+1];
        for(int i:nums){
            freq[i]++;
        }
        for(int i:nums){
            if(freq[i]==1 && i%2==0){
                return i;
            }
        }
        return -1;
    }
}