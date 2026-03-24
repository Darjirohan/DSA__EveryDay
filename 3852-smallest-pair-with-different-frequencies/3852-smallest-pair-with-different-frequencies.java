class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
    HashMap<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer> unique = new ArrayList<>(freq.keySet());
        Collections.sort(unique);

        int n = unique.size();

        for (int i = 0; i < n; i++) {
            int x = unique.get(i);

            for (int j = i + 1; j < n; j++) {
                int y = unique.get(j);

                if (!freq.get(x).equals(freq.get(y))) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[]{-1, -1};
    }
}