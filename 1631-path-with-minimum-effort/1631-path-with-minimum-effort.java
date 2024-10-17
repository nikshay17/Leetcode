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
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        
        int[][] distance=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                distance[i][j]=Integer.MAX_VALUE;
            }
            
        }
        
        distance[0][0]=0;
        
        PriorityQueue<tuple> q=new PriorityQueue<>((x,y)->x.first-y.first);
        int [] drow={1,0,-1,0};
        int [] dcol={0,1,0,-1};
        q.add(new tuple(0,0,0));
        while(!q.isEmpty()){
            tuple t=q.poll();
            int d=t.first;
            int r=t.second;
            int c=t.third;
            if(r==m-1 && c==n-1){
                return d;
            }
            
            for(int i=0;i<4;i++){
                int newrow=r+drow[i];
                int newcol=c+dcol[i];
            
            if(newrow>=0 && newrow<m && newcol>=0 && newcol<n ){
                
                int neweffort=Math.max(d,Math.abs(heights[newrow][newcol]-heights[r][c]));
                if(neweffort<distance[newrow][newcol]){
                    distance[newrow][newcol]=neweffort;
                    q.add(new tuple(neweffort,newrow,newcol));
                    
                }
                
                
                
                
            }
            
            
        }
        }
        
        return -1;
        
    }
}