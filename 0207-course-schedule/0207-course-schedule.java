class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int count=0;
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
            for(int j:adj.get(i)){
                indegree[j]++;
            }


        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int node=q.peek();
            q.poll();
            count++;
            for(int i:adj.get(node)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.offer(i);

                }
            }
        }
        if(numCourses==count){
            return true;
        }
        return false;
        
    }
}