class Solution {
    public int[] rotateElements(int[] nums, int k) {
       int n = nums.length;
       int count=0;
       for(int i=0;i<n;i++){
            if(nums[i]>=0){
                count++;
            }
       }
       if(count<=1)return nums;
       int[] positive = new int[count];
       int index = 0;
       for(int i=0;i<n;i++){
            if(nums[i]>=0){
                positive[index++] = nums[i];
            }
       }
       k = k%count;
       int[] ans = new int[nums.length];
       index=0;
       for(int i=0;i<n;i++){
        if(nums[i]<0){
            ans[i] = nums[i];
        }else{
            ans[i] = positive[(index+k)%count];
            index++;
        }
       }
       return ans;
    }
}