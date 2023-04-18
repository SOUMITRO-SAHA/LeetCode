# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        si = 1
        ei = n
        pans = -1
        while si < ei:
            mid = si + (ei - si)// 2
            
            if isBadVersion(mid):
                ei = mid
            else:
                si = mid + 1

        return si

