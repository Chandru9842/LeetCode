class Solution {
    public int findCenter(int[][] edges) {
        int n=0;
        for(int i=0;i<edges.length;i++){
             int u=edges[i][0];
            int v=edges[i][1];
            n=Math.max(n,Math.max(u,v));
        }
        n++;
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
        int max=0;
        for(int i=0;i<adj.size();i++){
            if(adj.get(i).size()>max){
                max=i;
            }

        }
        return max;

        
    }
}