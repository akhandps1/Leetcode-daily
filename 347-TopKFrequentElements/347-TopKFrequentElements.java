// Last updated: 7/21/2026, 12:52:14 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        
        // Min-heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        
        for (int key : map.keySet()) {
            pq.add(key);
            if (pq.size() > k) pq.poll(); // Keep only k most frequent
        }
        
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pq.poll();
        return res;
    }
}