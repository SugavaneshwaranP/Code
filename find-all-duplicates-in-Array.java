class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        for(int i : nums)
        {
            if(!seen.add(i))
            {
                dup.add(i);
            }
        }
        return new ArrayList<>(dup);
    }
}