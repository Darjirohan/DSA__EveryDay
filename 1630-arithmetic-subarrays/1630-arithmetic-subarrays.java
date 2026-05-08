class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> ans = new ArrayList<>();

        for(int i = 0; i < l.length; i++) {

            int start = l[i];
            int end = r[i];

            int[] temp = new int[end - start + 1];

            int idx = 0;

            for(int j = start; j <= end; j++) {
                temp[idx++] = nums[j];
            }

            Arrays.sort(temp);

            boolean ok = true;

            int diff = temp[1] - temp[0];

            for(int j = 2; j < temp.length; j++) {

                if(temp[j] - temp[j - 1] != diff) {
                    ok = false;
                    break;
                }
            }

            ans.add(ok);
        }

        return ans;
    }
}