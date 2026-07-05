class Tuple{
    int from;
    int to;
    int price;
    public Tuple(int from,int to,int price){
        this.from=from;
        this.to=to;
        this.price=price;
    }
}
class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++){
            int u=flights[i][0];
            int v=flights[i][1];
            int w=flights[i][2];
            adj.get(u).add(new Pair(v,w) );
        
        }
        int dist[]=new int[n];
        // for(int i=0;i)
        for(int i=0;i<dist.length;i++){
            dist[i]=(int)1e9;
        }
        dist[src]=0;
        Queue<Tuple>q=new LinkedList<>();
        q.add(new Tuple(0,src,0));
        while(!q.isEmpty()){
            Tuple it=q.poll();
            int stops=it.from;
            int node=it.to;
            int cost=it.price;
            // if(stops>k){
            //     continue;
            // }
            for(Pair iter:adj.get(node)){
                int adjNode=iter.first;
                int edW=iter.second;
                if(cost+edW<dist[adjNode]&&stops<=k){
                    dist[adjNode]=cost+edW;
                    q.offer(new Tuple(stops+1,adjNode,cost+edW));
                }
            }
        }
        if(dist[dst]==(int)1e9){
            return -1;
        }
        return dist[dst];
        
    }
}