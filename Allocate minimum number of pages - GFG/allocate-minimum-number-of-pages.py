from typing import List

class Solution:
    # Function to find minimum number of pages.
    def findPages(self, pages, n, students):
        # Edge Case:
        if len(pages) < students: return -1

        si = 0
        ei = 0

        for p in pages:
            si = max(si, p)
            ei += p

        pans = -1
        while si <= ei:
            mid = si + (ei - si) // 2

            if self.isPossible(pages, mid, students):
                pans = mid
                ei = mid - 1
            else:
                si = mid + 1

        return pans

    def isPossible(self, pages: List[int], maxPages: int, students: int) -> bool:
        studentCount = 1
        pageCount = 0

        for p in pages:
            currPage = pageCount + p
            if currPage <= maxPages:
                pageCount = currPage
            else:
                studentCount += 1
                pageCount = p

        return studentCount <= students


#{ 
 # Driver Code Starts
#Initial Template for Python 3

#contributed by RavinderSinghPB
if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        
        n=int(input())
        
        arr=[int(x) for x in input().strip().split()]
        m=int(input())
        
        ob=Solution()
        
        print(ob.findPages(arr,n,m))
# } Driver Code Ends