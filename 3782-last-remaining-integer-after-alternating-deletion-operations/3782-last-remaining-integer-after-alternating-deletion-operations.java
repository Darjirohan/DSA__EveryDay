class Solution {
    public long lastInteger(long n) {
        long last = 1;
        long step = 1;

        long rem = n;
        boolean left = true;
        while(rem>1){
        if(!left){
            if(rem%2==0) last+=step;
        }
        rem = (rem+1)/2;
        step*=2;
        left = !left;
        }
        return last; 
    }
}