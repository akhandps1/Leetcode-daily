// Last updated: 7/21/2026, 12:54:40 AM
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int currentHeight=Math.min(height[left],height[right]);
            int currentWidth=right-left;
            maxArea=Math.max(maxArea,currentHeight*currentWidth);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
        
    }
}