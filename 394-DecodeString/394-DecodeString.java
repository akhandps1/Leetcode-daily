// Last updated: 7/21/2026, 12:52:09 AM
class Solution {
    int i=0;
    public String decodeString(String s) {
       StringBuilder sb=new StringBuilder();
       int count=0;

       while(i<s.length()){
        char c=s.charAt(i);
        i++;
        if(Character.isDigit(c)){
            count=count*10+(c-'0');
        }else if(c=='['){
            String inner=decodeString(s);
            while(count>0){
                sb.append(inner);
                count--;
            }
        }else if(c==']'){
            return sb.toString();
        }else{
            sb.append(c);
        }
       } 
       return sb.toString();
    }
}