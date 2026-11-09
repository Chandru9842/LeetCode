class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             count++;
        //         }

               
        //     }
        // }
        // return count;
       int prefix=0;
       int cnt=0;
       HashMap<Integer,Integer>map=new HashMap<>();
       map.put(0,1);
       for(int i=0;i<nums.length;i++){
        prefix+=nums[i];
        int target=prefix-k;
        if(map.containsKey(target)){
            cnt+=map.get(target);
        }
        map.put(prefix,map.getOrDefault(prefix,0)+1);
       }
       return cnt;
        
    }
}