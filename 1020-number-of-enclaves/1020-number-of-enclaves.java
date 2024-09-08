class Pair{
    int first;
    int second;
    
    Pair(int x,int y){
        first=x;
        second=y;
        
    }
}

class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        
        boolean [][] visited=new boolean[m][n];
        int onecount=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    onecount++;
                }
            }
        }
        int count=0;
        
        for(int i=0;i<m;i++){
            
            if(grid[i][0]==1 && !visited[i][0]){
                visited[i][0]=true;
                q.add(new Pair(i,0));
                count++;
            }
            
              if(grid[i][n-1]==1 && !visited[i][n-1]){
                visited[i][n-1]=true;
                q.add(new Pair(i,n-1));
                  count++;
            }
        }
          for(int i=0;i<n;i++){
            if(grid[0][i]==1 &&!visited[0][i]){
                visited[0][i]=true;
                q.add(new Pair(0,i));
                count++;
            }
            
              if(grid[m-1][i]==1 && !visited[m-1][i]){
                visited[m-1][i]=true;
                q.add(new Pair(m-1,i));
                  count++;
            }
        }
        
        
        int[]delrow={-1,0,1,0};
        int[]delcol={0,1,0,-1};
        
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            for(int i=0;i<4;i++){
            int newrow=row+delrow[i];
            int newcol=col+delcol[i];
            
            if(newrow>=0 && newrow<m && newcol>=0 &&newcol<n && !visited[newrow][newcol] && grid[newrow][newcol]==1){
                count++;
                visited[newrow][newcol]=true;
                q.add(new Pair(newrow,newcol));
            }
                
            }
        }
        
        
        return onecount-count;
        
        
    }
}