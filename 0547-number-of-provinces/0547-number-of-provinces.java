class Solution {
    void dfs(int node,List<ArrayList<Integer>>adj,boolean[]vis){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]){
                dfs(it,adj,vis);

            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        List<ArrayList<Integer>>adj=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1&&(i!=j)){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean vis[]=new boolean[isConnected.length+1];
        int count=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                
                dfs(i,adj,vis);
                count++;
            }
        }
        return count;

        
    }
}