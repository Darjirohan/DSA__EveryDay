class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        String res = "";
        for(String s:words){
            int sum = 0;
            for(char c:s.toCharArray()){
                int index = c - 'a';
            sum+= weights[index]; 
            }
            int newIndex = sum%26;
            res+=(char)('z' - newIndex);
        }
        return res;
    }
}