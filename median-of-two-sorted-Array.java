class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int a = nums1.length;
        int b = nums2.length;
        for(int i = 0;i<a;i++)
        {
            ans.add(nums1[i]);
        }
         for(int i = 0;i<b;i++)
        {
            ans.add(nums2[i]);
        }
        int as = ans.size();
        int[] result = new int[as];

        for(int i = 0;i<as;i++)
        {
            result[i] = ans.get(i);
        }
        Arrays.sort(result);
        if(as%2==1)
        {
            return result[as/2];
        }
        return (result[(as/2)-1] + result[as/2])/2.00;
    }
}