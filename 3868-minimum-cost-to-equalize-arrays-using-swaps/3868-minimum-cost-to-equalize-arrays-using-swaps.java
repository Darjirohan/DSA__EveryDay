class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        Map<Integer, Integer> total = new HashMap<>();
        for (int x : nums1) total.merge(x, 1, Integer::sum);
        for (int x : nums2) total.merge(x, 1, Integer::sum);
        for (int freq : total.values()) {
            if (freq % 2 != 0) return -1;
        }
        
        Map<Integer, Integer> target = new HashMap<>();
        for (var e : total.entrySet()) target.put(e.getKey(), e.getValue() / 2);
        
        Map<Integer, Integer> count1 = new HashMap<>();
        for (int x : nums1) count1.merge(x, 1, Integer::sum);
        
        int cost = 0;
        for (var e : count1.entrySet()) {
            int val = e.getKey();
            int have = e.getValue();
            int need = target.getOrDefault(val, 0);
            if (have > need) cost += have - need;
        }
        
        return cost;
    }
}