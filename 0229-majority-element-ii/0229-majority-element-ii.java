import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0, count2 = 0;
        Integer ele1 = null, ele2 = null;

        for (int num : nums) {
            if (ele1 != null && num == ele1) {
                count1++;
            } else if (ele2 != null && num == ele2) {
                count2++;
            } else if (count1 == 0) {
                ele1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                ele2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == ele1) count1++;
            else if (num == ele2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(ele1);
        if (count2 > n / 3) result.add(ele2);

        return result;
    }
}
