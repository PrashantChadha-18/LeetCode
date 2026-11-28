class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char ch='1';ch<='9';ch++)
                    {
                        boolean safe=true;
                        for(int k=0;k<9;k++)
                        {
                            if(board[i][k]==ch || board[k][j]==ch)
                            {
                                safe=false;
                                break;
                            }
                        }
                        int r=(i/3)*3;
                        int c=(j/3)*3;
                        for(int a=r;a<r+3;a++)
                        {
                            for(int b=c;b<c+3;b++)
                            {
                                if(board[a][b]==ch)
                                {
                                    safe=false;
                                }
                            }
                        }
                        if(safe)
                        {
                            board[i][j]=ch;
                            if(solve(board))
                            {
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}