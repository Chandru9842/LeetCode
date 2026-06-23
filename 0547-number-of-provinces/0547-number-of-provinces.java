class Solution {
    public static void dfs(boolean[] visited,ArrayList<ArrayList<Integer>>adj,int node){
        visited[node]=true;
        for(int it:adj.get(node)){
            if(!visited[it]){
                dfs(visited,adj,it);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int  j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count=0;
        boolean[]visited=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                count++;
                dfs(visited,adj,i);
            }
        }
        return count;
        
    }
}