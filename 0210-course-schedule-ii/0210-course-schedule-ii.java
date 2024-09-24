class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        
        int m=prerequisites.length;
        
        for(int i=0;i<m;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
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
        
    if(numCourses!=a.size()){
        return new int[0];
    }
        else{
            int arr[]=new int[numCourses];
            int top=0;
            for(int i:a){
                arr[top++]=i;
            }
            return arr;
        }
        
        
        
    }
}