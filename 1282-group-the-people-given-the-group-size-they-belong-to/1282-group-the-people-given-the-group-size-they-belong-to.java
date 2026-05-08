class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        int n = groupSizes.length;
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();

        for(int i = 0; i < n; i++) {

         mp.putIfAbsent(groupSizes[i], new ArrayList<>());

         mp.get(groupSizes[i]).add(i);
        }
        
        List<List<Integer>> ls = new ArrayList<>();

        for(int key:mp.keySet()){
            List<Integer> group = mp.get(key);
            int size = group.size();

            
            int ind = 0;
            while(ind<size){
            List<Integer> part = new ArrayList<>();
            int i = 0;
            while(i<key){
            part.add(group.get(i+ind));
            i++;
            }
            ls.add(part);
            ind +=key;
            }
            
        }

        return ls;
    }
}