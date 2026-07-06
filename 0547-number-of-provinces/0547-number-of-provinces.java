class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        Deque<Integer>q=new ArrayDeque<>();
        List<ArrayList<Integer>>adj=new ArrayList<>();
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
        int vis[]=new int[isConnected.length];
        for(int i=0;i<n;i++){
           
            if(vis[i]==0){
                count++;
                // vis[i]=1;
                q.offer(i);
            }
            // q.offer(i);
            while(!q.isEmpty()){
                int node=q.poll();
                // vis[node]=1;
                for(int it:adj.get(node)){
                    if(vis[it]==0){
                        vis[it]=1;
                        q.offer(it);
                    }

                }
            }
            

        }
        return count;
        
    }
}