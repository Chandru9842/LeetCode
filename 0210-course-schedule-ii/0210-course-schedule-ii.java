class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // if(prerequisites.length==0){
        //     return new int[0];
        // }
        Deque<Integer>q=new ArrayDeque<>();
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int n=numCourses;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
       for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(v).add(u);
        }
        int[]indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int j=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.poll();
            ans[j++]=node;
            for(int i:adj.get(node)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.offer(i);
                }
            }
        }
//         ❌ Missing cycle check

// Suppose:

// numCourses = 2;
// prerequisites = {{0,1},{1,0}}

// Graph:

// 0 ←→ 1

// There is a cycle.

// Your queue is empty initially, so
    if(j!=numCourses){
        return new int[0];
    }
        return ans;

        
    }
}