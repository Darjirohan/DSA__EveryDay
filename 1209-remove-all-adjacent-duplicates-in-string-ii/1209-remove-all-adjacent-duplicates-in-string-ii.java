class Pair{
    char ch;
    int count;
    Pair(char c,int count){
        this.ch = c;
        this.count = count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Pair> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
    
            if(!st.isEmpty() && st.peek().ch==c){
                st.peek().count++;
                if(st.peek().count == k) st.pop();
            }else{
                st.push(new Pair(c,1));
            } 
            }
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
        Pair p = st.pop();
        for(int i=0;i<p.count;i++){
            sb.append(p.ch);
        }
        }
        return sb.reverse().toString();
    }
}