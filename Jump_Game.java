class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int far = 0;
        int currentEnd = 0;
        if(nums.length == 0 || nums.length == 1){
            return 0;
        }
        for(int i=0; i<nums.length; i++){
            far = Math.max(far,i+nums[i]);
            if(far >= nums.length-1){
                return jump+1;
            }

            if(i==currentEnd){
                jump++;
                currentEnd = far;
            }
        }
        return jump;
    }
}