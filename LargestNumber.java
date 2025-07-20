class Solution {
    public String largestNumber(int[] nums) {
        String[] strNums = Arrays.stream(nums)
                                 .mapToObj(String::valueOf)
                                 .toArray(String[]::new);
        
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }
        
        return result.toString();
    }
}