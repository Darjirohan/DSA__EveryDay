class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
        int sec = 0;

        String[] StartTime = startTime.split(":");
        String[] EndTime = endTime.split(":");

        for(int i=0;i<StartTime.length;i++){
            sec = sec*60 + Integer.parseInt(EndTime[i]) - Integer.parseInt(StartTime[i]);
        }
        return sec;
    }
}