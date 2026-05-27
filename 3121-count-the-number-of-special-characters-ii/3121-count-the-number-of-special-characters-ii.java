class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int n = word.length();

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                if (!mp.containsKey(c)) {
                    mp.put(c, i);
                }
            } else {
                mp.put(c, i); 
            }
        }

        int count = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            char up = (char)(c-' ');
            if (mp.containsKey(c) && mp.containsKey(up)) {

                int lower = mp.get(c);
                int upper = mp.get(up);

                if (lower < upper) {
                    count++;
                }
            }
        }

        return count;
    }
}