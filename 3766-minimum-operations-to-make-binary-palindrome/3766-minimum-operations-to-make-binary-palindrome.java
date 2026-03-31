class Solution {
int[] palindrome = {1, 3, 5, 7, 9, 15, 17, 21, 27, 31, 33, 45, 51, 63, 65, 73, 85, 93, 99, 107, 119, 127, 129, 153, 165, 189, 195, 219, 231, 255, 257, 273, 297, 313, 325, 341, 365, 381, 387, 403, 427, 443, 455, 471, 495, 511, 513, 561, 585, 633, 645, 693, 717, 765, 771, 819, 843, 891, 903, 951, 975, 1023, 1025, 1057, 1105, 1137, 1161, 1193, 1241, 1273, 1285, 1317, 1365, 1397, 1421, 1453, 1501, 1533, 1539, 1571, 1619, 1651, 1675, 1707, 1755, 1787, 1799, 1831, 1879, 1911, 1935, 1967, 2015, 2047, 2049, 2145, 2193, 2289, 2313, 2409, 2457, 2553, 2565, 2661, 2709, 2805, 2829, 2925, 2973, 3069, 3075, 3171, 3219, 3315, 3339, 3435, 3483, 3579, 3591, 3687, 3735, 3831, 3855, 3951, 3999, 4095, 4097, 4161, 4257, 4321, 4369, 4433, 4529, 4593, 4617, 4681, 4777, 4841, 4889, 4953,5049};
    public int[] minOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for(int i=0;i<nums.length;i++){
        int left = 0,right = palindrome.length - 1;
        int index = 0;
        while(left<=right){
        int mid = (left+right)/2;
        if(palindrome[mid]==nums[i]){
            index = mid;
            break;
        }
        if(palindrome[mid]<nums[i]){
            index = mid;
            left = mid+1;
        }else{
            right = mid - 1;
        }
        }
        int diff1 = Math.abs(palindrome[index] - nums[i]);
        int diff2 = (index + 1 < palindrome.length) ? 
            Math.abs(palindrome[index + 1] - nums[i]) : Integer.MAX_VALUE;

        int diff3 = (index - 1 >= 0) ? 
            Math.abs(palindrome[index - 1] - nums[i]) : Integer.MAX_VALUE;

        ans[i] = Math.min(diff1, Math.min(diff2, diff3));
        }
        

        return ans;
    }
}
