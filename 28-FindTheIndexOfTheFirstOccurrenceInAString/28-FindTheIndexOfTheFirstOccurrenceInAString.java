// Last updated: 7/21/2026, 12:54:19 AM
class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        
        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }
        return -1;
        
    }
}