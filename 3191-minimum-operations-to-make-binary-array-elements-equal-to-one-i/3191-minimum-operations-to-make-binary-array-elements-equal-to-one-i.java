class Solution {
    public int minOperations(int[] nums) {
    int count = 0;

    for(int i=0;i<nums.length-2;i++){
        if(nums[i]==0){ 
            nums[i]=1;
            nums[i+1] = (nums[i+1]==0)?1:0;
            nums[i+2] = (nums[i+2]==0)?1:0;
            count++;
        }
    }    
    boolean isOne = true;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            isOne = false;
            break;
        }
    }
    return (isOne)?count:-1;
    }
}