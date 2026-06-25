class Solution {
    boolean dfs(int node, ArrayList<ArrayList<Integer>>adj,int[][]graph,int[]vis,int[]vispath,int[]check){
        vis[node]=1;
        vispath[node]=1;
        check[node]=0;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(dfs(it,adj,graph,vis,vispath,check)==true){
                    check[it]=0;
                    return true;
                }
            }
            else if(vispath[it]==1){
                check[it]=0;;
                return true;
            }
        }
        check[node]=1;
        vispath[node]=0;
        return false;

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());

        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
                // adj.get(j).add(i);
            }
        }
        int []vis=new int[graph.length];
        int[]vispath=new int[graph.length];
        int[]check=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(vis[i]==0){
                dfs(i,adj,graph,vis,vispath,check);
                
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<check.length;i++){
            if(check[i]==1){
                ans.add(i);
            }
        }
        return ans;
        
    }
}