class Solution {

    private boolean isPrime(int n){
        if(n<2) return false;
        if(n==2 || n==3) return true;
        if(n%2==0) return false;
        if(n%3==0) return false;

        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i=0;i<n;i++){
            if(isPrime(nums[i])){
                j=i;
                break;
            }
        }
        int k = 0;
        for(int i=0;i<n;i++){
            if(isPrime(nums[i])){
                k=i;
            }
        }
        
        return k - j;
    }
}