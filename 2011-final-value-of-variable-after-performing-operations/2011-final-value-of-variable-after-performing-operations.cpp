class Solution {
public:
    int finalValueAfterOperations(vector<string>& op) {
        int ans = 0;
        for(string str : op){
            if(str == "++X" || str == "X++") ans++;
            if(str == "--X" || str == "X--") ans--;
        }
        return ans;
    }
};