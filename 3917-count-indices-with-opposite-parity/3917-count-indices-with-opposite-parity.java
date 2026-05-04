class Solution {
    public int[] countOppositeParity(int[] nums) {
        
        int countZ = 0;
        int countO = 0;

        int n = nums.length;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            if((nums[i]&1)==1){
                ans[i] = countZ;
                countO++;
            }else{
                ans[i] = countO;
                countZ++;
            }
        }
        return ans;
    }
}