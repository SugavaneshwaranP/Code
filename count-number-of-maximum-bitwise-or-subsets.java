class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int[] dp = new int[1 << 17];
        dp[0] = 1;
        int maxor = 0;

        for (int num : nums) {
            for (int i = maxOr; i >= 0; i--) {
                dp[i | num] += dp[i];
            }
            maxor |= num;
        }

        return dp[maxor];
    }
}