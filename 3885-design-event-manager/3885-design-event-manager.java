class EventManager {
    
    HashMap<Integer,Integer> mp;
    PriorityQueue<int[]> pq;

    public EventManager(int[][] events) {
        mp = new HashMap<>();
        pq = new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]) return a[0] - b[0];
            return b[1] - a[1];
        });


        for(int i=0;i<events.length;i++){
            mp.put(events[i][0], events[i][1]);
            pq.offer(new int[]{events[i][0], events[i][1]});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        mp.put(eventId, newPriority);
        pq.offer(new int[]{eventId, newPriority}); 
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] arr = pq.poll();
            int id = arr[0], pr = arr[1];

            if(mp.containsKey(id) && mp.get(id) == pr){
                mp.remove(id);
                return id;
            }
        }
        return -1;
    }
}