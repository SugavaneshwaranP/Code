class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (!seen.contains(num)) {
                pq.add(num);
                seen.add(num);
                
                if (pq.size() > 3) {
                    pq.poll();
                }
            }
        }
         if (pq.size() < 3) {
            while (pq.size() > 1) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}