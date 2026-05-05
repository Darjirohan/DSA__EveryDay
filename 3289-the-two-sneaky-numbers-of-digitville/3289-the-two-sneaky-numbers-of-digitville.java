class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[101];

        for(int i:nums){
            freq[i]++;
        }
        int ans1 =-1;
        int ans2 =-1;
        for(int i=0;i<101;i++){
            if(freq[i]==2){
            if(ans1==-1){
                ans1=i;
            }else{
                ans2=i;
            }
            }
            
        }
        return new int[]{ans1,ans2};
    }
}