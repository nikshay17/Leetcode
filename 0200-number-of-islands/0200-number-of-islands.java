class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
    
}


class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&grid[i][j]=='1'){
                    count++;
                    bfs(i,j,vis,grid);
                }
                
            }
        }
        return count;
        
    }
    
    
    
    public void bfs(int row,int col,int[][]vis,char[][] grid){
        Queue<Pair> q=new LinkedList<>();
        vis[row][col]=1;
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;
        
        
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            q.remove();
            
            for(int i=-1;i<=1;i++){
                int nrow=r+i;
                int ncol=c;
                if(nrow>=0 && nrow<n && grid[nrow][ncol]=='1' &&vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
            }
             for(int i=-1;i<=1;i++){
                int nrow=r;
                int ncol=c+i;
                 if(ncol>=0 && ncol<m && grid[nrow][ncol]=='1' &&vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
            }
            
            
            
            
            
        }
        
    }
}