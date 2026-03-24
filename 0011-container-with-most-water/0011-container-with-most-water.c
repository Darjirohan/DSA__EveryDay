int maxArea(int* height, int heightSize) {
int mostwater = 0;
    int left = 0;
    int right = heightSize - 1;
    while(left<right){
        int length = (height[left]>height[right])?height[right]:height[left];
        int width = right-left;
        mostwater = (mostwater>length*width)?mostwater:length*width;
    if(height[left]>height[right]){
        right--;
    }else{
        left++;
    }
    }    
    return mostwater;
}