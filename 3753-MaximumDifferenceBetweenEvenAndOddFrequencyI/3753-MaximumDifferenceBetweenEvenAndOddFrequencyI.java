// Last updated: 7/21/2026, 12:51:18 AM
class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        // frequency count
        for (int i = 0; i < n; i++) {
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int oddMax = -1;   // max frequency among odd
        int evenMin = 101; // min frequency among even (assuming n <= 100)

        for (Map.Entry<Character, Integer> ent : map.entrySet()) {
            int freq = ent.getValue();
            if (freq % 2 == 0) {
                evenMin = Math.min(evenMin, freq);
            } else {
                oddMax = Math.max(oddMax, freq);
            }
        }

        return oddMax - evenMin;
    }
}
