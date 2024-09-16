class Solution {
    
    public boolean dfs(int i,int visited[],int [] path,int check[],int graph[][]){
        visited[i]=1;
        path[i]=1;
        check[i]=0;
        
        for(int it:graph[i]){
            if(visited[it]==0){
                if(dfs(it,visited,path,check,graph)==true){
                    return true;
                }
            }
            
            else if(path[it]==1){
                return true;
            }
        }
        check[i]=1;
        path[i]=0;
        return false;
        
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        int V=graph.length;
        int [] visited=new int[V];
        int [] path=new int[V];
        int [] check=new int[V];
        
        
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                dfs(i,visited,path,check,graph);
            }
        }
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(check[i]==1){
                l.add(i);
            }
        }
        
        return l;
        
    }
}