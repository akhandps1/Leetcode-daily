// Last updated: 7/21/2026, 12:53:25 AM
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> triangle;  

        for (int i = 0; i < numRows; i++) {
            vector<int> row(i + 1, 1);  // har row length = i+1, sab 1 se initialize

            // fill middle elements using previous row
            for (int j = 1; j < i; j++) {
                row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }

            triangle.push_back(row);
        }
        return triangle;
    }
};
