class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }

        int ops = 0;

        for (int count : freq.values()) {
            if (count == 1) {
                return -1; 
                }
            ops += count / 3;
            int rem = count % 3;

            if (rem != 0) {
                ops++;
            }
        }

        return ops;
    }
}
