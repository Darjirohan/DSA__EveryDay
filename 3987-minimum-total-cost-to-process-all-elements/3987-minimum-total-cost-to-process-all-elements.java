class Solution {
    public int minimumCost(int[] nums, int k) {
         long s = 0, mod = 1000000007;
        for (int a : nums)
            s += a;
        long x = (s + k - 1) / k % mod;
        return (int) ((x - 1) * x / 2 % mod);
    }
}