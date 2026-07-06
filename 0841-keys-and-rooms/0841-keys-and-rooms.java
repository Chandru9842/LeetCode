class Solution {
    void dfs(int node,int[]vis,List<List<Integer>> rooms){
        vis[node]=1;
        for(int it:rooms.get(node)){
            if(vis[it]==0){
                vis[it]=1;
                dfs(it,vis,rooms);
            }
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int vis[]=new int[rooms.size()];
        // for(int i=0;i<rooms.size();i++){
            // if(vis[i]==0){
                dfs(0,vis,rooms);
            // }
        // }
        for(int i:vis){
            if(i==0){
                return false;
                
            }
            System.out.println(i);
        }
        return true;
        
    }
}