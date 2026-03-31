import java.util.*;

class Solution {
    HashSet<Character> vow = new HashSet<>(
        Arrays.asList('A','E','I','O','U','a','e','i','o','u')
    );

    public String sortVowels(String s) {
        int[] freq = new int[128];

        // count vowels
        for (char ch : s.toCharArray()) {
            if (vow.contains(ch)) {
                freq[ch]++;
            }
        }

        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (vow.contains(ch)) {
                for (int i = 0; i < 128; i++) {
                    if (freq[i] > 0 && vow.contains((char)i)) {
                        res.append((char)i);
                        freq[i]--;
                        break;
                    }
                }
            } else {
                res.append(ch);
            }
        }

        return res.toString();
    }
}