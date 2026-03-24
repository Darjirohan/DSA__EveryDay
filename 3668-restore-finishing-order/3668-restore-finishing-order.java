class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    HashSet<Integer> st = new HashSet<>();
    List <Integer> ls = new ArrayList<>();
    for(int i:friends){
        st.add(i);
    }
    for(int i:order){
        if(st.contains(i)){
            ls.add(i);
        }
    }
    int[] arr = new int[ls.size()];
    for(int i=0;i<ls.size();i++){
        arr[i] = ls.get(i);
    }
        return arr;
    }
}