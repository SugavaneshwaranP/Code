class Solution {
    public boolean isNumber(String s) {
        if(s.contains("f")||s.contains("D"))
              return false;
        try{
            Double.parseDouble(s);
            return true;
        }catch(NumberFormatException e){
            try{
                Integer.parseInt(s);
                return true;
            }catch(NumberFormatException err){return false;}
        }
}}