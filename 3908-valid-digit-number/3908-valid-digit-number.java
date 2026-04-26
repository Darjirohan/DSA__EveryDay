class Solution {
    public boolean validDigit(int n, int x) {
        
        int len  = (int)Math.log10(n);
        int pow = (int)Math.pow(10,len);
        if(pow!=0 && n/(pow) == x) return false;

        while(n!=0){
            int digit = n%10;
            if(digit == x) return true;
            n/=10;
        }
        return false;
    }
}