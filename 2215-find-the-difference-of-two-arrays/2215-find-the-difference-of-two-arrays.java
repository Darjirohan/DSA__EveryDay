class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();

        for (int i : nums1) st1.add(i);
        for (int i : nums2) st2.add(i);

        List<Integer> for1 = new ArrayList<>();
        List<Integer> for2 = new ArrayList<>();

        for (int x : st1) {
            if (!st2.contains(x)) {
                for1.add(x);
            }
        }

        for (int x : st2) {
            if (!st1.contains(x)) {
                for2.add(x);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(for1);
        result.add(for2);

        return result;
    }
}
