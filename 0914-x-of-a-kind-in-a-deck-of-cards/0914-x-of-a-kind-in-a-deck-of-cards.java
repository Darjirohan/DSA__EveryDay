import java.util.Arrays;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int max = 0;
        for (int num : deck) {
            if (num > max) max = num;
        }

        int[] count = new int[max + 1];
        for (int num : deck) {
            count[num]++;
        }

        int g = 0;
        for (int c : count) {
            if (c > 0) {
                g = gcd(g, c);
            }
        }
        return g >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
