import java.util.*;

class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int max = 0;
        for (int val : nums) max = Math.max(max, val);
        int[] freq = new int[max + 1];
        
        for (int num : nums) {
            freq[num]++;
        }
        
        for (int f : freq) {
            if (prime(f)) {
                return true;
            }
        }
        return false;   
    }

    private boolean prime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
