class Solution {
    public boolean checkStrings(String s1, String s2) {

    HashMap<Character,Integer> mp1 = new HashMap<>();
    HashMap<Character,Integer> mp2 = new HashMap<>();
      int n = s1.length();
      for(int i=0;i<n;i++){
        char c = s1.charAt(i);
        if(i%2==0){
            mp2.put(c,mp2.getOrDefault(c,0)+1);
        }else{
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }
      }
      for(int i=0;i<n;i++){
        char c = s2.charAt(i);
        if(i%2==0){
            mp2.put(c,mp2.getOrDefault(c,0)-1);
        }else{
            mp1.put(c,mp1.getOrDefault(c,0)-1);
        }
      }
      boolean even = true;
      boolean odd = true;
      for(int i:mp1.values()){
        if(i!=0){
            even = false;
            break;
        }
      }
      for(int i:mp2.values()){
        if(i!=0){
            odd = false;
            break;
        }
      }
    return even && odd;
    }
}