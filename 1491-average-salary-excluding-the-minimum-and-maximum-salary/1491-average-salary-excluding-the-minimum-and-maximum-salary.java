class Solution {
    public double average(int[] salary) {
    double avg = 0.0;
    int max = salary[0];
    int min = salary[0];
    int sum = 0;
    for(int i:salary){
        sum+=i;
        max = Math.max(max,i);
        min = Math.min(min,i);
    }
    sum-=max;
    sum-=min;
    int n = salary.length;
    avg = (double)sum/(n - 2);
    return avg;
    }
}