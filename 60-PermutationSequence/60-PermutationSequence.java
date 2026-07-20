// Last updated: 7/21/2026, 12:54:00 AM
class Solution {
    int count = 0;
    String result = "";

    public String getPermutation(int n, int k) {
        backtrack(n, k, new boolean[n + 1], new StringBuilder());
        return result;
    }

    private void backtrack(int n, int k, boolean[] used, StringBuilder sb) {
        if (!result.equals("")) return;

        if (sb.length() == n) {
            count++;
            if (count == k) result = sb.toString();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (used[i]) continue;

            used[i] = true;
            sb.append(i);
            
            backtrack(n, k, used, sb);

            used[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
