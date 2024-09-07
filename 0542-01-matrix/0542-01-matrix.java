class Pair{
    int first;
    int second;
    int third;
    Pair(int x,int y,int z){
        first=x;
        second=y;
        third=z;
    }
}




class Solution {
    public void bfs(int[][]temp,int[][]mat,Queue<Pair>q,boolean[][]visited){
        
        int [] delrow={-1,0,1,0};
        int [] delcol={0,1,0,-1};
        int m=mat.length;
        int n=mat[0].length;
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            int val=q.peek().third;
            q.remove();
            
            for(int i=0;i<4;i++){
                int newrow=r+delrow[i];
                int newcol=c+delcol[i];
                
                if(newrow>=0 && newrow<m &&newcol>=0 &&newcol<n){
                    if(!visited[newrow][newcol]){
                        visited[newrow][newcol]=true;
                        q.add(new Pair(newrow,newcol,val+1));
                        temp[newrow][newcol]=val+1;
                    }
                }
            }
            
            
        }
        
        
        
        
    }
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [][] temp=new int[m][n];
        Queue<Pair>q=new LinkedList<>();
        boolean[][]visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=true;
                }
                
            }
        }
        bfs(temp,mat,q,visited);
        return temp;
        
        
        
        
        
        
       
}
    
    
}