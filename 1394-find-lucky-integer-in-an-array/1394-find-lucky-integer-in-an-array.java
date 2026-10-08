class Solution {
    public int findLucky(int[] nums){
        int []hash=new int[501];
        int cnt=0;
        for(int  i=0;i<nums.length;i++){
            hash[nums[i]]++;
           
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==i){
                if(hash[i]>cnt){
                cnt=hash[i];
            }
            }
        }
        return cnt==0?-1:cnt;
        
    }
}