class Solution(object):
    def lengthOfLastWord(self,s):
    # Remove trailing spaces
        s = s.strip()
    # Split the string into words
        words = s.split()
    # Return the length of the last word
        return len(words[-1]) if words else 0
