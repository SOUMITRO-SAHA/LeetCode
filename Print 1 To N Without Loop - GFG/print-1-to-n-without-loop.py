#User function Template for python3

class Solution:    
    #Complete this function
    def printNos(self,N):
        # Base Case:
        if N == 0:
            return;
            
        # Recursive Call:
        self.printNos(N-1);
        
        # Print
        print(N, end=" ");
        
#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math




def main():
    
    T=int(input())
    
    while(T>0):
        
        
        N=int(input())
        
        ob=Solution()
        
        ob.printNos(N)
        print()
        T-=1

if __name__=="__main__":
    main()
# } Driver Code Ends