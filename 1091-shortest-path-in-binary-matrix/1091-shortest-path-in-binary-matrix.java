class Solution {
    static class tuple{
        int first;
        int second;
        int third;
        tuple(int first,int second,int third){
            this.first=first;
            this.second=second;
            this.third=third;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        
        if(m==1 && n==1 && grid[0][0]==0){
            return 1;
        }
        if(grid[0][0]==1 || grid[m-1][n-1]==1){
            return -1;
        }
       
        int[][] distance=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                distance[i][j]=Integer.MAX_VALUE;
            }
        }
        distance[0][0]=0;
        Queue<tuple> q=new LinkedList<>();
        q.add(new tuple(0,0,0));
        
        int[] drow={0,1,0,-1};
        int[] dcol={1,0,-1,0};
        
        while(!q.isEmpty()){
            tuple t=q.poll();
            int d=t.first;
            int r=t.second;
            int c=t.third;
            
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    int newrow=r+drow[i];
                    int newcol=c+dcol[j];
                    
                    if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && grid[newrow][newcol]==0 && d+1<distance[newrow][newcol]){
                        distance[newrow][newcol]=d+1;
                        if(newrow==m-1 && newcol==n-1){
                            return d+2;
                        }
                        q.add(new tuple(d+1,newrow,newcol));
                    }
                    
                }
            }
            
            
        }
        
        
        
        return -1;
        
    }
}