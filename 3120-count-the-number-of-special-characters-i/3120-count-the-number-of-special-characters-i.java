class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        boolean[] chars = new boolean[128];

        for(char c:word.toCharArray()){
            chars[c]= true;
        }
        int count = 0;

        for(int i=65;i<=90;i++){
          if(chars[i] && chars[i+32]) count++;
        }
        return count;
    }
}