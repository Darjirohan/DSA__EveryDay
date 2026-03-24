class Pair{
    int n;
    int d;
    Pair(int n,int d){
        this.n = n;
        this.d = d;
    }
}
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
    PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
       long first =(long)a.n*b.d;
       long second = (long)b.n*a.d;
       return Long.compare(first,second);
    });
    int n = arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
        pq.add(new Pair(arr[i],arr[j]));
        }
    }
    while(k-->1){
        pq.remove();
    }
    return new int[]{pq.peek().n,pq.peek().d};
    }
}