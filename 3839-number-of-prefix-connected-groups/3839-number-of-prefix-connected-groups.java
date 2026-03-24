class Solution {
    public int prefixConnected(String[] words, int k) {
    int len = words.length;
    
    HashMap<String,Integer> mp = new HashMap<>();
    for(int i=0;i<len;i++){
        if(words[i].length()<k) continue;
        String prefix = words[i].substring(0,k);
        mp.put(prefix,mp.getOrDefault(prefix,0)+1);
    }
    int count = 0;
    for(int i:mp.values()){
        if(i>1) count++;
    }
    return count;
    }
}