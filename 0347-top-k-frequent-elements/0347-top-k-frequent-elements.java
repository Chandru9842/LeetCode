class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[]res=new int[k];
        for(int i=0;i<k;i++){
            int maxfreq=0;
            int value=0;
            for(int key:map.keySet()){
                if(map.get(key)>maxfreq){
                    maxfreq=map.get(key);
                    value=key;
                }
            }
            res[i]=value;
            map.remove(value);

        }
        return res;
       
    }
}