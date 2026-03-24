class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

    Set<Integer> st = new HashSet<>();
    for(int i:bulbs){
        if(st.contains(i)){
            st.remove(i);
        }else{
            st.add(i);
        }
    }
    List<Integer> ls = new ArrayList<>(st);

        Collections.sort(ls);
    return ls;
    }
}