class Solution:
    def mySqrt(self, x: int) -> int:
        if x <= 1:  return x
        guess = x // 2
        quo = guess
        while True:
            guess = (guess + quo) // 2
            quo = x // guess
            if abs(quo - guess) <= 1:  
                return min(quo, guess)