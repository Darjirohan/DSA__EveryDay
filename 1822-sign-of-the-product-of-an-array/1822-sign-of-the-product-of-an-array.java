class Solution {
    public int arraySign(int[] nums) {
    int count0 = 0;
    int countneg = 0;
    for(int i=0;i<nums.length;i++){
       if(nums[i]==0){
        return 0;
       }
       if(nums[i]<0){
        countneg+=1;
       }
    } 
    if(countneg % 2 != 0){
        return -1;
    }
    return 1;  
    }
}