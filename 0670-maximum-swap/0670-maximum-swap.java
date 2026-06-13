class Solution {
    public int maximumSwap(int num) {

        int len = (int)Math.log10(num) + 1;

        int[] suffix = new int[len];

        int temp = num;
        int max = -1;

        for(int i = len - 1; i >= 0; i--){
            int pow = (int)Math.pow(10, len - i - 1);
            int digit = (temp / pow) % 10;

            if(digit > max)
                max = digit;

            suffix[i] = max;
        }


        int pos1 = -1;
        int pos2 = -1;

        for(int i = 0; i < len; i++){

            int pow = (int)Math.pow(10, len - i - 1);
            int digit = (num / pow) % 10;

            if(digit < suffix[i]){
                pos1 = i;
                
                for(int j = len - 1; j > i; j--){
                    int p = (int)Math.pow(10, len - j - 1);
                    if((num / p) % 10 == suffix[i]){
                        pos2 = j;
                        break;
                    }
                }
                break;
            }
        }


        if(pos1 == -1)
            return num;


        int p1 = (int)Math.pow(10, len - pos1 - 1);
        int p2 = (int)Math.pow(10, len - pos2 - 1);

        int d1 = (num / p1) % 10;
        int d2 = (num / p2) % 10;


        num = num - d1 * p1 - d2 * p2;
        num = num + d2 * p1 + d1 * p2;


        return num;
    }
}