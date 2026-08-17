class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);

        }
        PriorityQueue<String>q=new PriorityQueue<>((a,b)->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(a) - map.get(b);
            }
            return b.compareTo(a);
        });
        for(String i:map.keySet()){
            q.add(i);
            if(q.size()>k){
                q.poll();
            }
        }
        // String[]ans=new String[k];
        // int i=0;
        ArrayList<String>ans=new ArrayList<>();
        while(!q.isEmpty()){
           ans.add(q.poll());
        }
        Collections.reverse(ans);
        return ans;
        
    }
}