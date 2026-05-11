class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};

        int leap_years = 0;

        for(int i=1971;i<year;i++){

            if(i%400==0||(i%100!=0 && i%4==0)) leap_years++;
        }
        
        if(year%400==0 || (year%100!=0 && year%4==0)) monthDays[1] = 29;

        int total = 2*(leap_years) + (year - 1971 - leap_years);

        for(int i=0;i<month-1;i++){
            total+=(monthDays[i]%7);
        }
        total +=day-1;

        return days[total%7];
    }
}