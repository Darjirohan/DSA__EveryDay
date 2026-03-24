class Solution {
    public int numberOfAlternatingGroups(int[] colors) {

       int n = colors.length;
       int count = 0;
       for(int i = 0;i<n;i++){
         int prev = (i+n-1)%n;
         int next = (i+n+1)%n;
         if(colors[prev]!=colors[i] && colors[i]!=colors[next]){
            count++;
         }
       }
       return count; 
    }
}