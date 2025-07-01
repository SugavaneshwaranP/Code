class Solution {
    public int myAtoi(String s) {
        s = s.trim();
		if (s.length() == 0)
			return 0;
		int result = 0;
		int sign = 1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i == 0 && (ch == '-' || ch == '+')) {
				sign = ch == '-' ? -1 : 1;
			} else if (Character.isDigit(ch)) {
				if (result > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10) {
					return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				}
				result = result * 10 + (s.charAt(i) - '0');
			} else {
				break;
			}
		}
		return sign * result;
    }
}