class Solution {
    static class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
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
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        
        
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());;
            
        }
        
        for(int i=0;i<flights.length;i++){
            adj.get(flights[i][0]).add(new pair(flights[i][1],flights[i][2]));
        }
        int [] distance=new int [n];
        for(int i=0;i<n;i++){
            distance[i]=Integer.MAX_VALUE;
        }
        
        
        distance[src]=0;
        Queue<tuple> q=new LinkedList<>();
        
        q.add(new tuple(0,src,0));
        
        while(!q.isEmpty()){
            tuple p=q.poll();
            int stops=p.first;
            int node=p.second;
            int cost=p.third;
            
            if(stops>k){
                continue;
            }
            
            for(pair pair:adj.get(node)){
                int adjnode=pair.first;
                int w=pair.second;
                
                if(cost+w<distance[adjnode]&&stops<=k){
                    distance[adjnode]=cost+w;
                    q.add(new tuple(stops+1,adjnode,distance[adjnode]));
                }
            }
            
            
        }
                                       
                                       if(distance[dst]==Integer.MAX_VALUE){
                                           return -1;
                                       }
        return distance[dst];
        
        
        
    }
}