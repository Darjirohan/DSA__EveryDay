class Solution {
    public long minCost(String s, int[] cost) {

        long total = 0;
        for (int c : cost) {
            total += c;
        }

        HashMap<Character, Long> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0L) + cost[i]);
        }

        long ans = Long.MAX_VALUE;

        for (char ch : mp.keySet()) {
            ans = Math.min(ans, total - mp.get(ch));
        }

        return ans;
    }
}
