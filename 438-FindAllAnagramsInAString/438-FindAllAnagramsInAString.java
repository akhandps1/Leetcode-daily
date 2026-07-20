// Last updated: 7/21/2026, 12:52:06 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length(), m = p.length();
        if (n < m) return result;

        int[] pFreq = new int[26];
        for (char c : p.toCharArray()) pFreq[c - 'a']++;

        for (int i = 0; i <= n - m; i++) {
            int[] sFreq = new int[26];
            // Compute freq for every window from scratch
            for (int j = i; j < i + m; j++) {
                sFreq[s.charAt(j) - 'a']++;
            }
            if (Arrays.equals(pFreq, sFreq)) {
                result.add(i);
            }
        }
        return result;        
    }
}