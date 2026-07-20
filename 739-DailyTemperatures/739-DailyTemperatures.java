// Last updated: 7/21/2026, 12:51:56 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer>stack=new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prevDayIndex=stack.pop();
                ans[prevDayIndex]=i-prevDayIndex;
            }
            stack.push(i);
        }
        return ans;
        
    }
}