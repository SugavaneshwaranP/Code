class Solution {
    public boolean isMatch(String s, String p) {
        Boolean dp[][]=new Boolean[s.length()][p.length()];
       return  Match(s,p,s.length()-1,p.length()-1,dp);
    }
    public static boolean Match(String str,String pattern,int len1,int len2,Boolean[][]dp){
        if(len2>=0 && len1<0)
        {
            for(int j=0;j<=len2;j++){
                if(pattern.charAt(j)!='*')
                    return false;
            }
            return true;
        }
        if(len2<0 && len1>=0){
            return false;
        }
        if(len1<=0 && len2<0)
            return true;
        if(dp[len1][len2]!=null)
            return dp[len1][len2];
        if(pattern.charAt(len2)=='?'||pattern.charAt(len2)==str.charAt(len1))
            return dp[len1][len2]=Match(str,pattern,len1-1,len2-1,dp);
        if(pattern.charAt(len2)=='*')
            return dp[len1][len2]= Match(str,pattern,len1-1,len2,dp) || Match(str,pattern,len1,len2-1,dp);
        return dp[len1][len2]=false;
    }
}