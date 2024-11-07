class Solution:
    def majorityElement(self, nums):
        hash_table = {}
        for i in nums:
            if (i in hash_table):
                hash_table[i] += 1
                continue
            hash_table[i] = 1
        n = len(nums)
        res = []
        for key,val in hash_table.items():
            if (val > n//3):
                res.append(key)
        return res