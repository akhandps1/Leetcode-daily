// Last updated: 7/21/2026, 12:54:27 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        solve("",0,0,n,ans);
        return ans;
        
    }
    private void solve(String curr,int open,int close,int n,List<String>ans){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(open<n){
            solve(curr+"(",open+1,close,n,ans);
        }
        if(close<open){
            solve(curr+")",open,close+1,n,ans);
        }
    }
}