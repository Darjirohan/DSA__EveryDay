class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
    Map<Integer, Integer> map = new HashMap<>();
        for (int[] ind : restrictions) {
            map.put(ind[0], ind[1]);
        }

        long[] arr = new long[n];
        arr[0] = 0;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + diff[i - 1];
            if (map.containsKey(i)) {
                arr[i] = Math.min(arr[i], map.get(i));
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            arr[i] = Math.min(arr[i], arr[i + 1] + diff[i]);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, arr[i]);
        }

        return (int) ans;
    }
}