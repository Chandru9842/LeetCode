class Solution {
    public int findMaxLength(int[] nums) {
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0){
        //             sum++;
        //         }
        //        else{
        //         sum--;
        //        }
        //        if(sum==0){
        //         max=Math.max(j-i+1,max);
        //        }

        //     }
        // }
        // return max;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int prefix=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                prefix--;
            }
            else{
                prefix++;
            }
            if(map.containsKey(prefix)){
                int len=i-map.get(prefix);
                max=Math.max(max,len);

            }
            else{
                map.put(prefix,i);
            }
        }
        return max;


        
        
    }
}