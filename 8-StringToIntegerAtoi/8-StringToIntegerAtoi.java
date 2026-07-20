// Last updated: 7/21/2026, 12:54:43 AM
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
        return 0;
        int sign=1;
        int index=0;
        long ans=0;

        if(s.charAt(0)=='-'){
            sign=-1;
            index++;
        }else if(s.charAt(0)=='+'){
            index++;
        }

        while(index<s.length()){
            char ch=s.charAt(index);
            if(!Character.isDigit(ch))
            break;
            ans=ans*10+(ch-'0');
            if(sign==1 && ans>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
            if(sign==-1 && -ans<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            index++;
        }
        return (int)(ans*sign);
        
    }
}