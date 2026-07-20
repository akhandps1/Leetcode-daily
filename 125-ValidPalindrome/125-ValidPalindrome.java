// Last updated: 7/21/2026, 12:53:21 AM
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String filtered=sb.toString();
        String reversed=sb.reverse().toString();
        return filtered.equals(reversed);
        
    }
}