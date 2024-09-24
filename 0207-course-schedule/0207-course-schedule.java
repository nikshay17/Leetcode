class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        
        int m=prerequisites.length;
        
        for(int i=0;i<m;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        ArrayList<Integer> a=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        
        int [] indegree=new int[numCourses];
        
        for(int i=0;i<numCourses;i++){
            for(int j:adj.get(i)){
                indegree[j]++;
            }
        }
        
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        while(!q.isEmpty()){
            
            int x=q.poll();
            a.add(x);
            
            for(int i:adj.get(x)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.add(i);
                }
            }
            
            
        }
        
        if(numCourses==a.size()){
            return true;
        }
        return false;
        
        
        
    }
}