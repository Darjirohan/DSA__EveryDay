class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        HashMap<Integer, List<Integer>> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> list : mp.values()) {
            int size = list.size();

            long[] prefix = new long[size];
            prefix[0] = list.get(0);

            for (int i = 1; i < size; i++) {
                prefix[i] = prefix[i - 1] + list.get(i);
            }

            for (int j = 0; j < size; j++) {
                int idx = list.get(j);

                long left = 0, right = 0;

                if (j > 0) {
                    left = (long) idx * j - prefix[j - 1];
                }

                if (j < size - 1) {
                    right = (prefix[size - 1] - prefix[j]) - (long) idx * (size - j - 1);
                }

                res[idx] = left + right;
            }
        }

        return res;
    }
}