class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    List <Integer> nge = new ArrayList<>();

    for(int i=0;i<nums1.length;i++){
        int ele=nums1[i];
        int found=0;
        int pos=-1;
        for(int j =0;j<nums2.length;j++){
            if(nums2[j]==ele){
                pos = j;
                break;
            }
        }
        if(pos!=-1){
        for(int k=pos+1;k<nums2.length;k++){
            if(nums2[k]>ele){
                nge.add(nums2[k]);
                found=1;
                break;
            }else{
                continue;
            }
        }
        }
        if(found==0){
            nge.add(-1);
        }
    }
    int ar[] = new int[nums1.length];
    int i=0;
    for(int num:nge){
      ar[i++]=num; 
    }
    return ar;    
    }
}