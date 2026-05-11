class Solution {
    public int dayOfYear(String date) {

       int[] months ={31,28,31,30,31,30,31,31,30,31,30,31};
    
    String[] d = date.split("-");
    
    int year = Integer.parseInt(d[0]);
    int month = Integer.parseInt(d[1]);
    int day = Integer.parseInt(d[2]);
    
        int leap_years = 0;

        
        if(year%400==0||(year%100!=0 && year%4==0)) months[1] = 29;

        int days = 0;

        for(int i=0;i<month-1;i++){
            days+=months[i];
        }
        days+=day;

        return days;
    }
}