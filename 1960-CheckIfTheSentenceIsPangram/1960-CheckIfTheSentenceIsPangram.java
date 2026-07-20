// Last updated: 7/21/2026, 12:51:29 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
      for (char c = 'a'; c <= 'z'; c++) {
            // If any letter is missing, return false
            if (sentence.indexOf(c) < 0) {
                return false;
            }
        }
        return true;        
    }
}