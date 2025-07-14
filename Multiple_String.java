class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length();
        int len2 = num2.length();

        int[] res = new int[len1+len2];
//multiply from the rear to get Valid Output
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                int mul_val = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
//storing the values at the rear to calculate the carryOver to reduce"o(n)"
                int position_front = i+j;
                int position_back = i+j+1;
                mul_val += res[position_back];
//place the value in the back
                res[position_back] = mul_val%10;
/* add the value to the multiplied value if the value alread exisist in the array position
the last single digit is 9*9= 81 so it is enough as 10 for '/' && '%'*/
                res[position_front] += mul_val/10;

            }
        }
        StringBuilder str = new StringBuilder();
        for(int num:res){
            if(str.length()==0 && num==0) continue;
            str.append(num);
        }
        return str.toString();
    }
}