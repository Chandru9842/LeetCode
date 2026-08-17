class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]ans=new int[k];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int i:map.keySet()){
            q.add(i);
            if(q.size()>k){
                q.poll();
            }
        }
        int i=0;
        while(!q.isEmpty()){
            ans[i]=q.poll();
            i++;
        }
        return ans;

        
    }
}