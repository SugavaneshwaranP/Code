class Solution:
    def lengthOfLongestSubstring(self, s):
        l = 0 # INtial value is 0 
        longest = 0
        sett = set() # define the empy set
        n = len(s)

        for r in range(n):
            while s[r] in sett: # while loop to check for the longest substring
                sett.remove(s[l])
                l += 1

            w = (r - l) + 1  
            longest = max(longest, w)
            sett.add(s[r])

        return longest
        