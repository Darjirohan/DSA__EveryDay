class Solution {
    public int lastRemaining(int n) {
        int last = 1;
        int step = 1;

        int rem = n;
        boolean left = true;
        while(rem>1){
            if(left || rem%2!=0){
                last+=step;
            }
            rem = rem/2;
            step*=2;
            left = !left;
        }
        return last;
    }
}