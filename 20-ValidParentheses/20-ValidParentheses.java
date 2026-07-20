// Last updated: 7/21/2026, 12:54:29 AM
class Solution {
    public boolean isValid(String s) {
        while(s.contains("()") || s.contains("[]") || s.contains("{}")){
            s=s.replace("()","");
            s=s.replace("[]","");
            s=s.replace("{}","");
        }
        return s.length()==0;
    }
}