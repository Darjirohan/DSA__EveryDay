class Solution {
    public int[] decrypt(int[] code, int k) {
    int n = code.length;
    if(k == 0) return new int[n];
    
    int[] res = new int[n];
    if(k > 0){
        int sum = 0;
        for(int p=1;p<=k;p++) sum+=code[p%n];

        for(int i=0;i<n;i++){
            res[i] = sum;
            sum-=code[(i+1)%n];
            sum+=code[(i+k+1)%n];
        }
    }else{
        int newk = -k;
        int sum = 0;
        for(int p=1;p<=newk;p++) sum+=code[(n-p)%n];
        for(int i=0;i<n;i++){
            res[i] = sum;
            sum+=code[i];
            int prevIndex = i - newk;
            if (prevIndex < 0) prevIndex += n;
            sum -= code[prevIndex];
        }
    }
    return res;  
    }
}