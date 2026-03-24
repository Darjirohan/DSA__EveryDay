class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    for(int i:stones) pq.add(i);
    while(pq.size()>1){
        int phela = pq.poll();
        int dusra = pq.poll();
        if(phela > dusra){
            pq.offer(phela - dusra);
        }    
    } 
    return pq.isEmpty()?0:pq.peek();  
    }
}