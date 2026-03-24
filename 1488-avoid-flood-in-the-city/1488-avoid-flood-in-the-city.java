import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] res = new int[n];
        Map<Integer, Integer> full = new HashMap<>(); 
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                res[i] = 1;
            } else {
                res[i] = -1;
                if (full.containsKey(rains[i])) {
                    int last = full.get(rains[i]);
                    Integer d = dryDays.ceiling(last);
                    if (d == null) return new int[0];
                    res[d] = rains[i];
                    dryDays.remove(d);
                }
                full.put(rains[i], i);
            }
        }
        return res;
    }
}
