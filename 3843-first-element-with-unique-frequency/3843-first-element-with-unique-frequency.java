class Solution {
    public int firstUniqueFreq(int[] nums) {
        int max = 0;
        for(int i:nums){
            max = Math.max(max,i);
        }
        int[] freq = new int[max+1];
        for(int i:nums){
            freq[i]++;
        }
        int ans = -1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:freq){
            if(i==0) continue;
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        for(int i:nums){
            if(mp.get(freq[i])==1) return i;
        }
        
        return ans;
    }
}