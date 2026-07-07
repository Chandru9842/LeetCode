class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        // int count=0;
        Deque<Integer>q=new ArrayDeque<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(v).add(u);
        }
       int[]indegree=new int[numCourses];
       for(int i=0;i<numCourses;i++){
        for(int it:adj.get(i)){
            indegree[it]++;
        }
       }
       for(int i=0;i<numCourses;i++){
        if(indegree[i]==0){
            q.offer(i);
        }
       }
       int count=0;
       while(!q.isEmpty()){
        int node=q.poll();
        count++;
        for(int iter:adj.get(node)){
            indegree[iter]--;
            if(indegree[iter]==0){
                q.offer(iter);
            }

        }
       }
       return count==numCourses;
        
    }
}