class Solution:
    def waysToSplitArray(self, nums):
        n = len(nums)
        count = 0
        left_sum = 0
        right_sum = sum(nums)
        for num in nums[:n-1]:
            left_sum += num
            right_sum -= num
            if (left_sum >= right_sum):
                count += 1
        return count
