class Solution:
    def reverse(self, x: int) -> int:
        mod = 2**31  # Modulo for overflow checking
        sign = -1 if x < 0 else 1
        x *= sign
        
        reversed_number = int(str(x)[::-1])
        
        # Check for overflow
        if reversed_number > mod - 1:
            return 0
        return sign * reversed_number