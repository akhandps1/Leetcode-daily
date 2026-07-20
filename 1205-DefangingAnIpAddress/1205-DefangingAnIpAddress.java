// Last updated: 7/21/2026, 12:51:41 AM
class Solution {
    public String defangIPaddr(String address) {
        String res = "";
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                res += "[.]";
            } else {
                res += c;
            }
        }
        return res;        
    }
}