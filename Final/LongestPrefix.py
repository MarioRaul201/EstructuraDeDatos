class Solution(object):
    def longestCommonPrefix(self,strs):
        if not strs:
            return ""
    
        prefix = strs[0]

        for string in strs[1:]:    # Iterate through the rest of the strings
            while not string.startswith(prefix):  # Check if the current string starts with the prefix
                prefix = prefix[:-1]       # Reduce the prefix by one character from the end
                if not prefix:
                    return ""                 
                
        return prefix
