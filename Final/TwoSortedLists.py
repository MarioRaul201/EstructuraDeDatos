#Para este problema seutilizo IA para aclarar el enunciado y la solucion
# Dado dos listas enlazadas ordenadas, se requiere unirlas en una sola lista ordenada.

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1, list2):
        dummy = ListNode()  # dummy node to start the new list
        tail = dummy        # tail always points to the last node in the merged list

        while list1 and list2:
            if list1.val < list2.val:
                tail.next = list1
                list1 = list1.next
            else:
                tail.next = list2
                list2 = list2.next
            tail = tail.next

        # Attach the remaining part (if any)
        if list1:
            tail.next = list1
        elif list2:
            tail.next = list2

        return dummy.next  # the real head is after dummy
