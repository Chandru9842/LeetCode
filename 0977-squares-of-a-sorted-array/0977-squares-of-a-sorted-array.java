class Solution {
    public int[] sortedSquares(int[] nums) {
        // int l=0;
        // int r=nums.length-1;
        // int pos=nums.length;
        // int[]a=new int[pos];
        // while(l<=r){
        //     int left=nums[l]*nums[l];
        //     int right=nums[r]*nums[r];
        //     if(left<right){
        //         a[pos-1]=right;
        //         r--;
        //         pos--;

        //     }
        //     else{

        //         a[pos-1]=left;
        //         l++;
        //         pos--;
        //     }

        // }
        // return a;
        int[]ans=new int[nums.length];
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i]*nums[i];
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int idx=0;
        for(var hi:map.entrySet()){
            int key=hi.getKey();
            int count=hi.getValue();
            for(int i=0;i<count;i++){
                ans[idx++]=key;
            }
        }
        return ans;

        
    }
}