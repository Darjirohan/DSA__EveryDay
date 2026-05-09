class Solution {
    public static int minFlips(String target) {
        
    	int n =  target.length();
    	
    	int count = 0;
    	char excepted  =  '0';
    	
    	for (int i = 0; i < n; i++) {
			
    		if(target.charAt(i) != excepted) {
    			
    			count ++;
    			excepted = target.charAt(i);
    		}
    		
		}
    	
    	return count;
    	
    }
}