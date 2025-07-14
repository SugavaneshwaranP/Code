class Solution {
    List<List<Integer>> out;
    int n;
    public List<List<Integer>> permuteUnique(int[] nums) {
        out = new ArrayList<>();
        this.n = nums.length;
        Arrays.sort(nums);
        helper(0, Arrays.stream(nums).boxed().collect(Collectors.toList()));
        return out;
    }
    public void helper(int start, List<Integer> temp){
        if(start==n-1){
            out.add(temp);
            return;
        }
        for(int i=start;i<n;i++){
            if(i!=start && (temp.get(i)==temp.get(start)))continue;
            Collections.swap(temp, start, i);
            helper(start+1, new ArrayList<>(temp));
        }
    }
}