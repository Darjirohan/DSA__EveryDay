class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxdiago = 0;
        int maxarea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int length = dimensions[i][0];
            int width = dimensions[i][1];
            double diago = Math.sqrt(length * length + width * width);
            int area = length * width;

            if (diago > maxdiago) {
                maxdiago = diago;
                maxarea = area;
            } else if (diago == maxdiago) { 
                maxarea = Math.max(maxarea, area);
            }
        }
        return maxarea;
    }
}
