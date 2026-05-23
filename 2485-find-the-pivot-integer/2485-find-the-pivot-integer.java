class Solution {
    public int pivotInteger(int n) {
        int ans = -1;

        for(int i=1;i<=n;i++){
            int sum = i*(i+1)/2;
            int rem = n*(n+1)/2 - sum + i;
            if(sum == rem){
                ans = i;
                break;
            }

        }
        return ans;
    }
}