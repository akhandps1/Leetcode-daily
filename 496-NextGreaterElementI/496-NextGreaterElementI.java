// Last updated: 7/21/2026, 12:52:01 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int foundIndex=-1;
            res[i]=-1;

            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    foundIndex=j;
                    break;
                }
            }

            for(int k=foundIndex+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    res[i]=nums2[k];
                    break;
                }
            }
        }
        return res;
    }
}