class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int answer = 1;
        for(int i = 0;i<=n-1;i++)
        {
            if(nums[i] == answer)
            {
                answer++;
            }
        }
        return answer;
    }
}