class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
        int diffA = Math.abs(a - x);
        int diffB = Math.abs(b - x);
        if(diffA!=diffB){
            return diffB - diffA;
        }
        return b - a;
    });

    for(int i:arr){
        pq.add(i);
        if(pq.size()>k){
            pq.poll();
        }
    }
    List<Integer> ls = new ArrayList<>(pq);
    Collections.sort(ls);
    return ls; 
    }
}