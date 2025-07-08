class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        count = {}
        for num in nums:
            count[num] = count.get(num, 0) + 1
        sorted_counter = sorted(count)

        result = []

        for i, num in enumerate(sorted_counter):
            if count[num] > 1:
                if num == 0:
                    if count[num] > 2:
                        result.append([0, 0, 0])
                else:
                    if -2 * num in count:
                        result.append([num, num, -2 * num])
            if num < 0:
                two_sum = -num
                left = bisect.bisect_left(sorted_counter, (two_sum - sorted_counter[-1]), i + 1)
                right = bisect.bisect_right(sorted_counter, (two_sum // 2), left)
                for i in sorted_counter[left:right]:
                    j = two_sum - i
                    if j in count and j != i:
                        result.append([num, i, j])
                        
        return result 


                







        