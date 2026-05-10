class Solution {
    
    public String longestPalindrome(String s) {
    String result ="";
    
    int n = s.length();

    for(int i=0;i<n;i++){
        int start = i,end = i;

        while(start>=0&&end<n && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }

        if(end - start-1 >result.length()){
            result = s.substring(start+1,end);
        }
        start =i;
        end = i+1;
        while(start>=0&&end<n && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }

        if(end - start - 1>result.length()){
            result = s.substring(start+1,end);
        }
    }
    return result;
    }
}