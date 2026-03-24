class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> ls = new ArrayList<>();
    HashSet<Integer> hs = new HashSet<>();
    HashSet<Integer> st = new HashSet<>();
    for(int i:nums1){
        hs.add(i);
    }
    for(int i:nums2){
        st.add(i);
    }
    for(int i:hs){
        if(st.contains(i)){
            ls.add(i);
        }
    }
    int[] arr = new int[ls.size()];
    for(int i = 0; i < ls.size(); i++){
        arr[i] = ls.get(i);
    }

    return arr;
    }
}