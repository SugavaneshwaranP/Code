class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                sum = nums[i] + nums[r] + nums[l];
                if(Math.abs(sum-target) < Math.abs(target - res))
                {
                   res = sum;
                }
                else if(sum<target){
                    l++;
                }
                else
                {
                    r--;
                }
        }
    }
    return res;
}
}