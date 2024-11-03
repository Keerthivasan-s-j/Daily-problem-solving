class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def getDecimalValue(self, head):
        l = 0
        temp = head
        lis = []
        while temp != None:
            l+=1
            lis.append(temp.val)
            temp = temp.next
        res = 0
        i = 0
        while i<l:
            res += lis.pop() * 2**i
            i += 1
        return res
