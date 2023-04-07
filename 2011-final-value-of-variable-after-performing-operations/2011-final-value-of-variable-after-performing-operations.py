class Solution:
    def finalValueAfterOperations(self, op: List[str]) -> int:
        ans = 0;
        for st in op:
            if(st == "++X" or st == "X++"):
                ans+=1;
            if(st == "--X" or st == "X--"):
                ans-=1;
        return ans;
        