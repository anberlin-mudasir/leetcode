"""
# Time:  O(logn) = O(1)
# Space: O(1)
#
# Reverse digits of an integer.
# 
# Example1: x = 123, return 321
# Example2: x = -123, return -321
# 
# Note: reversed integer might overflow?Number in Python doesn't have limit, either the input or output number won't overflow anyway.
# But OJ still requires 0 as outcome of the huge reversed number.
# Assume the input is a 32-bit integer, 
# then the reverse of 1000000003 overflows. How should you handle such cases?
# 
"""


class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        if x>0:
            m=1
        else:
            m=-1
        x=x*m
        sum=0
        while x > 0:
            sum = sum*10+ x%10
            x=x//10
            
            
        return sum*m if sum <= 0x7fffffff else 0
    
