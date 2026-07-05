class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Tuple{
    int first;
    int second;
    // int third;
    public Tuple(int first,int second){
        this.first=first;
        this.second=second;
        // this.third=third;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];
            adj.get(u).add(new Pair(v,w));
        }
        int dist[]=new int[n+1];
        for(int i=0;i<dist.length;i++){
            dist[i]=(int)1e9;
        }
        dist[k]=0;
        Deque<Tuple>q=new LinkedList<>();
        q.offer(new Tuple(0,k)); //dist,node
        while(!q.isEmpty()){
            Tuple it=q.poll();
            int dis=it.first;
            int node=it.second;
            for(Pair iter:adj.get(node)){
                int adjNode=iter.first;
                int edW=iter.second;
                if(edW+dis<dist[adjNode]){
                    dist[adjNode]=edW+dis;
                    q.offer(new Tuple(dis+edW,adjNode));
                }
            }
        }
        int nas=0;
        for(int i=1;i<dist.length;i++){
            if(dist[i]==(int)1e9){
                return -1;
            }
            nas=Math.max(nas,dist[i]);
        }
        return nas;
    }
}