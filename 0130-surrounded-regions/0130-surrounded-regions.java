class Solution {
    public void dfs(int row,int col,boolean[][]visited,char[][]board){
        int m=board.length;
        int n=board[0].length;
        int[]delrow={0,1,0,-1};
        int[]delcol={1,0,-1,0};
        visited[row][col]=true;
        
        for(int i=0;i<4;i++){
            int newrow=row+delrow[i];
            int newcol=col+delcol[i];
            if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && visited[newrow][newcol]==false && board[newrow][newcol]=='O'){
                dfs(newrow,newcol,visited,board);
            }
        }
        
        
        
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean[][]visited=new boolean[m][n];
        
    
        
        for(int i=0;i<m;i++){
            if(!visited[i][0]){
            if(board[i][0]=='O'){
                dfs(i,0,visited,board);
            }
            }
            if(!visited[i][n-1]){
                if(board[i][n-1]=='O'){
                    dfs(i,n-1,visited,board);
                }
                
            }
            
            
        }
        
        
        
         for(int i=0;i<n;i++){
            if(!visited[0][i]){
            if(board[0][i]=='O'){
                dfs(0,i,visited,board);
            }
            }
             if(!visited[m-1][i]){
                if(board[m-1][i]=='O'){
                    dfs(m-1,i,visited,board);
                }
             }
            }
            
        
    
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]){
                    board[i][j]='O';
                }
                else{
                    board[i][j]='X';
                }
            }
        }
            
        }
        
        
    }
