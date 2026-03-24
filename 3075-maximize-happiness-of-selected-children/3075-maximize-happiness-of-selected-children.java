class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
    Arrays.sort(happiness);
    int n = happiness.length;
    long sum=0;
    for(int i=0;i<k;i++){
       if(happiness[n-1-i] >(i-1)){
        int happy = (happiness[n-1-i]-i);
        sum+=happy;
       }
    } 
    return sum;   
    }
}