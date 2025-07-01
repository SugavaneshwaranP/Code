class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        ArrayList <String> ls = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            String temp = new String("");
            ls.add(temp);
        }
        int trv = 0;
        int adder = 1;
        for(int i = 0; i < s.length(); i++){
            //ls.get(trv) += s.charAt(i);
            ls.set(trv, ls.get(trv) + s.charAt(i));
            trv += adder;
            if(trv == numRows){
                adder = -adder;
                trv = numRows-2;
            }
            else if(trv == -1){
                adder = -adder;
                trv = 1;
            }
        }
        String ans = new String("");
         for(int i = 0; i < numRows; i++){
            ans += ls.get(i);
         }
         return ans;
    }
}