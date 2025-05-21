class Solution():
    def isPalindrome(self, x):
        numbers = list(str(x))

        if numbers == numbers[::-1]:
            return True
        else: 
            return False