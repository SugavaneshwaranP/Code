class Solution(object):
    def search(self, nums, target):
        
        l = 0
        h = len(nums) - 1
        while l <= h:
            mid = (l + h) // 2
            if target == nums[mid]:
                return mid
            if nums[l] <= nums[mid]:
                if nums[l] <= target and target <= nums[mid]:
                    h = mid - 1
                else:
                    l = mid + 1
            else:
                if nums[mid] <= target and target <= nums[h]:
                    l = mid + 1
                else:
                    h = mid - 1
        return -1