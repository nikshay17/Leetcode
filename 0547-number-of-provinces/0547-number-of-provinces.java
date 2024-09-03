class Solution {
    private void dfs(int i,ArrayList<ArrayList<Integer>>adj,int[] visited){
        visited[i]=1;
        for(int element:adj.get(i)){
            if(visited[element]==0){
                dfs(element,adj,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int vis[]=new int[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
}