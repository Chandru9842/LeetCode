class Solution {
    boolean isgraph(int start,int[][]graph,ArrayList<ArrayList<Integer>>adj,int[]color){
        Deque<Integer>q=new ArrayDeque<>();
        q.offer(start);
        color[start]=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.poll();

            for(int it:adj.get(node)){
                if(color[it]==-1){
                    color[it]=1-color[node];
                    q.offer(it);
                }
                else if(color[it]==color[node]){
                    return false;
                }
            }
        }
        return true;



    }
    public boolean isBipartite(int[][] graph) {
       ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
       int[]color=new int[graph.length];
       Arrays.fill(color,-1);
       for(int i=0;i<graph.length;i++){
         adj.add(new ArrayList<>());
        
       }
       for(int i=0;i<graph.length;i++){
        for(int j:graph[i]){
            adj.get(i).add(j);
            // adj.get(j).add(i);

        }
       }
       for(int i=0;i<graph.length;i++){
        if(color[i]==-1){
        if(isgraph(i,graph,adj,color)==false){
            return false;
        }
       }
       }
       return true;


        
    }
}