class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, Integer> mp = new HashMap<>();
        List<List<String>> ls = new ArrayList<>();
        int id = 0;

        for (String p : strs) {
            String sorted = toSort(p);

            if (!mp.containsKey(sorted)) {
                mp.put(sorted, id++);
                ls.add(new ArrayList<>());
            }

            ls.get(mp.get(sorted)).add(p);
        }

        return ls;
    }

    private String toSort(String p){
        char[] s = p.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
}
