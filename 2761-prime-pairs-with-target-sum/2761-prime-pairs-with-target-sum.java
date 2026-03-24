import java.util.*;

class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if (n < 4) return ans;

        boolean[] isPrime = sieve(n);

        for (int a = 2; a <= n / 2; a++) {
            int b = n - a;
            if (isPrime[a] && isPrime[b]) {
                ans.add(Arrays.asList(a, b));
            }
        }
        return ans;
    }

    private boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        if (n >= 0) prime[0] = false;
        if (n >= 1) prime[1] = false;

        for (int p = 2; (long)p * p <= n; p++) {
            if (prime[p]) {
                for (int x = p * p; x <= n; x += p) {
                    prime[x] = false;
                }
            }
        }
        return prime;
    }
}
