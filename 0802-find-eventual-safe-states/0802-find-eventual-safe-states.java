class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int m=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        
        
        for(int i=0;i<m;i++){
            adj.add(new ArrayList<>());
        }
        int [] indegree=new int[m];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(graph[i][j]).add(i);
                indegree[i]++;
            }
            
            
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        
        while(!q.isEmpty()){
            int a=q.poll();
            l.add(a);
            for(int i:adj.get(a)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.add(i);
                }
            }
        }
        Collections.sort(l);
        return l;
        
        
    }
}