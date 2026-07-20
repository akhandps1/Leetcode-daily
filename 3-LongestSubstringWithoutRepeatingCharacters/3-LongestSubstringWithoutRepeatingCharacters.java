// Last updated: 7/21/2026, 12:54:47 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxLen=0;
        HashSet<Character>set=new HashSet<>();
        while(right<s.length()){
            char currentChar=s.charAt(right);
            while(set.contains(currentChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}