class Solution {
    public List<String> removeAnagrams(String[] words) {
    List<String> ls = new ArrayList<>();
    ls.add(words[0]);
    for(int i=1;i<words.length;i++){
       if(!isAnagram(words[i-1],words[i])){
        ls.add(words[i]);
       }
    }
    return ls;   
    }
    private boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        int[]count= new int[26];
        for(int i=0;i<a.length();i++){
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
    
}