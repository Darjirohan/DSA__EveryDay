class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        boolean[] isJ = new boolean[128];

        for(char c:jewels.toCharArray()){
           isJ[c] = true;
        }
        int count = 0;

        for(char c:stones.toCharArray()){
           if(isJ[c]) count++;
        }
        return count;
    }
}