class Solution {
    public int sumFourDivisors(int[] nums) {
       int sum=0;
       for(int i:nums){
        int currentSum=0;
        int count=0;
        for(int d=1;d*d<=i;d++){
            if(i%d == 0){ 
                count++;
                currentSum+=d;
            if(d*d!=i){
                count++;
                currentSum+=(i/d);
            }
            }
            if(count>4) break;
        }
        if(count==4) sum+=currentSum;
       } 
       return sum;
    }
    
}