class Solution {
    public boolean isPrime(int num){
            for(int j=2;j<=Math.sqrt(num);j++){
            if(num%j==0){
                return false;
            }  
            }
        return true;
    }
    public int countPrimes(int n) {
    int count=0;
    for(int i=2;i<n;i++){
        if(isPrime(i)){
            count++;
        }
    }
    return count;  
    }
}