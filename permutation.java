class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new LinkedList<>();
        distict(nums,0,ans);
        return ans;
    }
    public static void distict(int nums[],int ind,List<List<Integer>>ans){
        if(ind==nums.length)
        {
            List<Integer>list=new LinkedList<>();
           for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
           }
           ans.add(list);
           return ;
        }
        for(int i=ind;i<nums.length;i++){
            swap(ind,i,nums);
            distict(nums,ind+1,ans);
            swap(ind,i,nums);
        }
    }
    public static void swap(int ind,int i,int[]nums){
        int temp=nums[i];
        nums[i]=nums[ind];
        nums[ind]=temp;
    }
}