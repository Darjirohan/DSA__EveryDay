class Solution {
    public int minElement(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){

            int num = nums[i];
            int sum = 0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            min = Math.min(min,sum);
        }
        return min;
    }
}