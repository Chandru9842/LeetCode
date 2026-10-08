class Solution {
    public int findLucky(int[] nums){
        // int []hash=new int[501];
        // int cnt=0;
        // for(int  i=0;i<nums.length;i++){
        //     hash[nums[i]]++;
           
        // }
        // for(int i=0;i<hash.length;i++){
        //     if(hash[i]==i){
        //         if(hash[i]>cnt){
        //         cnt=hash[i];
        //     }
        //     }
        // }
        // return cnt==0?-1:cnt;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int lucky=-1;
        for(int key:map.keySet()){
            if(map.get(key)==key){
                lucky=key;
            }
        }
        return lucky;

    }
}