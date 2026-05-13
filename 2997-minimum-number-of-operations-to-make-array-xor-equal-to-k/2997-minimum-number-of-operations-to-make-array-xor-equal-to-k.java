class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int xor = 0;
        for(int i=0;i<n;i++){
        xor  = xor^nums[i];
        }
        int count = 0;
        xor = xor^k;
        while(xor!=0){
            count+=xor&1;
            xor>>=1;
        }
        return count;
    }
}