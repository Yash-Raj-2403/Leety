class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        set<char> a;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if((board[i][j] !='.') &&  (a.count(board[i][j])))
                { 
                    return false;
                }
                else
                {
                    a.insert(board[i][j]);
                }
            }
            a.clear();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[j][i] !='.' &&  a.count(board[j][i]))
                {
                    return false;
                }
                else
                {
                    a.insert(board[j][i]);
                }
            }
            a.clear();
        }
        for(int i=0;i<9;i=i+3)
        {
            for(int l=0;l<9;l=l+3)
            {
            for(int j=i;j<i+3;j++)
            {
                for(int k=l;k<l+3;k++)
                {
                    if(board[j][k] !='.' &&  a.count(board[j][k]))
                    {
                        return false;
                    }
                    else
                    {
                        a.insert(board[j][k]);
                    }
                }
            }
            a.clear();
            }
        }
        return true;
    }
};