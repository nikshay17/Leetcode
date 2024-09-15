class Solution {
    

    public boolean dfs(int [][] graph,int []color,int node,int col){
        
        for(int adjnode:graph[node]){
            if(color[adjnode]==-1){
                color[adjnode]=1-color[node];
            if(dfs(graph,color,adjnode,color[adjnode])==false){
                return false;
            }
            }
            else if(color[adjnode]==color[node]){
                return false;
            }
        }
        
        return true;
        
        
    }
    public boolean isBipartite(int[][] graph) {
        int m=graph.length;       
        int [] color=new int[m];
        for(int i=0;i<m;i++){
            color[i]=-1;
        }
        
        
        
        for(int i=0;i<m;i++){
            if(color[i]==-1){
                color[i]=0;
                
                if(dfs(graph,color,i,color[i])==false){
                    return false;
                }
            }
        }
        return true;
    }
}