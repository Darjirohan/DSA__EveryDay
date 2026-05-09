class Solution {
    public static int minFlips(String target) {
        int count = 0;

        for(int i=0;i<target.length();i++){

        char c = (char)((count%2) + '0');

        if(target.charAt(i)!=c) count++;
        }
    	return count;
    }
}