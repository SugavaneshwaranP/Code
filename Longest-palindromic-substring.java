class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for(int i = 0;i<s.length();i++)
        {
            int odd = function(s,i,i);
            int even = function(s,i,i+1);
            int tot = Math.max(odd,even);
            if(tot>end-start)
            {
                start = i-(tot-1)/2;
                end = i+tot/2;
            }
        }
        return s.substring(start,end+1);
        
    }

    public int function(String s,int left,int right)
    {
        int l = left,r = right;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        
        }
        return r-l-1;
    }
}