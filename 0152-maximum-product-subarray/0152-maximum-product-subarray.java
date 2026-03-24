class Solution {
    public int maxProduct(int[] nums) {
    int ans = nums[0];
    int neg = nums[0];
    int pos = nums[0]; 
    for(int i=1;i<nums.length;i++){
        int x = nums[i];
        int prevneg = neg;
        int prevpos = pos;
        neg = Math.min(x,Math.min(x*prevneg,x*prevpos));
        pos = Math.max(x,Math.max(x*prevneg,x*prevpos));

        ans = Math.max(ans,pos);
    }
    return ans;   
    }
}