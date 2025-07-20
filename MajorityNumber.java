class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int can = 0;
        for(int num : nums)
        {
            if(count==0)
            {
                can = num;
            }
            count += (can==num) ? 1:-1;
        }
        return can;
    }
}