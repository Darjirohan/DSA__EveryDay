class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x == Integer.MAX_VALUE) return false;

        int rev = 0;
        int orig = x;

        while(x!=0){
            int digit = x%10;
            rev = rev*10 + digit;
            x/=10;
        }
        return rev == orig;
    }
}