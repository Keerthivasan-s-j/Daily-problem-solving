class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        res = "0"
        for i in range(2,n+1):
            invert = "".join(['0' if i=='1' else '1' for i in res[::-1]])
            res = res + "1" + invert
        return res[k-1]