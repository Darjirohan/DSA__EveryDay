class Solution {
    public void nextPermutation(int[] nums) {
    int n=nums.length;
    int pivot=-1;
    for(int i=n-2;i>=0;i--){
    if(nums[i]<nums[i+1]){
    pivot=i;
    break;
    }
    }
    if(pivot!=-1){
        for(int i=n-1;i>pivot;i--){
            if(nums[pivot]<nums[i]){
            int temp=nums[pivot];
                nums[pivot]=nums[i];
                nums[i]=temp;
                break;
            }
        }   
        }
        pivot=pivot+1;
        n=n-1;
        while(pivot<n){
        int temp=nums[pivot];
        nums[pivot]=nums[n];
        nums[n]=temp;
        pivot++;
        n--;
    
    }
    }
}