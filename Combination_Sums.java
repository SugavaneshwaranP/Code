class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        back(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    public void back(int[] candidates,int target,int start,List<Integer> current,List<List<Integer>> result)
    {
            if(target<0)
            {
                return;
            }
            if(target==0)
            {
                result.add(new ArrayList<>(current));
            }
            for(int i = start;i<candidates.length;i++)
            {
                current.add(candidates[i]);
                back(candidates,target-candidates[i],i,current,result);
                current.remove(current.size()-1);
            }
    }
}