// Last updated: 7/21/2026, 12:51:46 AM
class Solution {
    public int fib(int n) {
    if(n<=1) return n;
    return fib(n-1)+fib(n-2);    
    }
}