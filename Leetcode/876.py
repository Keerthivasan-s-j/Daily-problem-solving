class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def middleNode(self, head):
        l = 0
        temp = head
        while temp != None:
            l+=1
            temp = temp.next
        temp = head
        i = 0
        while i < l//2:
            i+=1
            temp = temp.next
        return temp