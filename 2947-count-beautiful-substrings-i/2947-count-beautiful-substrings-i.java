class Solution {
    public int beautifulSubstrings(String s, int k) {
        int n = s.length();
        int count=0;
        for(int i=0;i<n;i++){
            int vowel = 0,cons = 0;
            for(int j=i;j<n;j++){
                char c = s.charAt(j);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowel++;
                }else if(c>='a'&&c<='z'){
                    cons++;
                }
                if((vowel == cons) && (vowel * vowel) % k == 0) count++;
            }
        }
        return count;
    }
}