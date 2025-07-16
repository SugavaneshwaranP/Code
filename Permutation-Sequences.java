class Solution {

    public static int count = 0;
    public static String result = "";

    public static void helper(String num, String ans, int k) {
        if (!result.equals("")) return; 

        if (num.length() == 0) {
            count++;
            if (count == k) {
                result = ans; 
            }
            return;
        }

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            String temp = num.substring(0, i) + num.substring(i + 1);
            helper(temp, ans + ch, k);
        }
    }

    public String getPermutation(int n, int k) {
        count = 0;
        result = "";

        StringBuilder num = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            num.append(i);
        }

        helper(num.toString(), "", k);
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.getPermutation(3, 4));  
    }
}