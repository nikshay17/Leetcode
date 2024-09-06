class Pair{
    int first;
    int second;
    int val;
    Pair(int a,int b,int c){
        first=a;
        second=b;
        val=c;
    }
}




class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] visited=new int[m][n];
        int countfresh=0;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=1;
                }
                else{
                    visited[i][j]=0;
                }
                if(grid[i][j]==1){
                    countfresh++;
                }
            }
        }
        
        int delrow[]={-1,0,1,0};
        int delcol[]={0,-1,0,1};
        int count=0;
        int time=0;
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            int val=q.peek().val;
            
            time=val;
            q.remove();
            
            for(int i=0;i<4;i++){
              int r1=r+delrow[i];
               int c1=c+delcol[i];
            
            
            if(r1>=0 && r1<m && c1>=0 && c1<n && visited[r1][c1]==0 && grid[r1][c1]==1){
                count++;
                visited[r1][c1]=1;
                q.add(new Pair(r1,c1,val+1));
            }
            
        }
        }
        
        if(count==countfresh){
            return time;
        }
        else{
            return -1;
        }
        
      
    }
}