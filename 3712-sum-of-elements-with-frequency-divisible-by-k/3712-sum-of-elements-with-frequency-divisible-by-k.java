class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
    int[] arr = new int[101];    
    for(int i:nums){
        arr[i]++;
    }
        int sum=0;
    for(int i:nums){
        if(arr[i]%k==0){
        sum = sum + (i);   
        }
    }
        return sum;
    }
}