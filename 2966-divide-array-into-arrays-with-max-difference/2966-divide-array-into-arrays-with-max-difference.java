class Solution {
    public int[][] divideArray(int[] nums, int k) {
       int n = nums.length;
       Arrays.sort(nums);

       int[][] ans = new int[n/3][3]; 

       for(int i=0;i<n;i++){
        ans[i/3][i%3] = nums[i];
       }
       for(int i=0;i<n/3;i++){
        int diff = ans[i][2] - ans[i][0];
        if(diff>k) return new int[][]{};
       }
       return ans;
    }
}