class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        int count = 0;
        int i = n;
        
        while (i >= 0) {
            if (digits[i] < 9 && count == 0) {
                digits[i]++;
                return digits;
            } else if (digits[i] == 9 && count == 0) {
                digits[i] = 0;
                count++;
                i--;
            } else if (count == 1 && digits[i] == 9) {
                digits[i] = 0;
                i--;
            } else if (count == 1) {
                digits[i]++;
                count--;
                break;
            }
        }
        
        if (i < 0 && count == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
}
