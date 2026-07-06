class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination){
            return true;
        }
        List<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);

        }
        int vis[]=new int[n];
        Arrays.fill(vis,0);
        Deque<Integer>q=new ArrayDeque<>();
        q.offer(source);
        while(!q.isEmpty()){
            int node=q.poll();
            vis[node]=1;
            for(int it:adj.get(node)){
                if(vis[it]==0){
                    vis[it]=1;
                    if(it==destination){
                        return true;
                    }
                    q.offer(it);
                }
            }
        }
        return false;
        
    }
}