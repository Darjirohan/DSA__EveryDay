import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> stack = new ArrayList<>();

        for (int num : nums) {
            int pos = Collections.binarySearch(stack, num);
            if (pos < 0) pos = -(pos + 1);

            if (pos == stack.size()) {
                stack.add(num);
            } else {
                stack.set(pos, num);
            }
        }
        return stack.size();
    }
}
