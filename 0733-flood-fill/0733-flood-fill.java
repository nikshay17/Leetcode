class Solution {
    public void dfs(int[][]temp,int[][]image,int sr,int sc,int color,int[] delrow,int [] delcol,int inicolor){
        
        temp[sr][sc]=color;
        int m=image.length;
        int n=image[0].length;
        
        for(int i=0;i<4;i++){
            int r=sr+delrow[i];
            int c=sc+delcol[i];
            
            if(r>=0&&r<m &&c>=0 &&c<n && image[r][c]==inicolor && temp[r][c]!=color){
                dfs(temp,image,r,c,color,delrow,delcol,inicolor);
            }
        }
        
        
        
        

    
    }
    
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int[][]temp=image;
        
       
    
        int[]delrow={-1,0,1,0};
        int[]delcol={0,-1,0,1};
        int inicolor=image[sr][sc];
        dfs(temp,image,sr,sc,color,delrow,delcol,inicolor);
        return temp;
        
    }
}