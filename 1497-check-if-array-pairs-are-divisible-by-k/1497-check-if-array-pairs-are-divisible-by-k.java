class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : arr){
            int rem = ((num % k) + k) % k;
            int need = (k - rem) % k;

            if(mp.getOrDefault(need,0) > 0){
                mp.put(need, mp.get(need) - 1);
            } else {
                mp.put(rem, mp.getOrDefault(rem,0) + 1);
            }
        }

        for(int v : mp.values()){
        if(v != 0) return false;
        }
        return true;
    }
}