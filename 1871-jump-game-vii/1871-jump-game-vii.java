class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        
        int n = s.length();
        boolean[] isVisited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.offer(0);
        isVisited[0] = true;
        int far = 0;
        while(!q.isEmpty()){
           int curr = q.poll();

           if(curr == n - 1) return true;

           int lowest = Math.max(far+1,curr+minJump);
           int highest = Math.min(curr+maxJump,n - 1);

           for(int i=lowest;i<=highest;i++){
            if(s.charAt(i)=='0'&& !isVisited[i]){
                isVisited[i] = true;
                q.offer(i);
            }
           }
           far = Math.max(far,highest);
        }
        return false;
    }
}