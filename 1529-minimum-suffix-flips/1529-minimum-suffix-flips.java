class Solution {
    public static int minFlips(String target) {
        int count = 0;
        int n = target.length();

        char last = '0';
        for(int i=0;i<n;i++){

        char c = (char)((count%2) + '0');

        if(target.charAt(i)!=last){
            count++;
            last = target.charAt(i);
        }
        }
    	return count;
    }
}