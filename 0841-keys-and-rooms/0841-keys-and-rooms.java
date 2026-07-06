class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Deque<Integer>q=new ArrayDeque<>();
        int[]vis=new int[rooms.size()];
        q.offer(0);
        while(!q.isEmpty()){
            int node=q.poll();
            vis[node]=1;
            for(int it:rooms.get(node)){
                if(vis[it]==0){
                    vis[it]=1;
                    q.offer(it);
                }
            }
        }
        for(int i:vis){
            if(i==0){
                return false;
            }
        }
        return true;
        
    }
}