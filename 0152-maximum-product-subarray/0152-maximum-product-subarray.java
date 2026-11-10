class Solution {
    public int maxProduct(int[] nums) {
        // int n=nums.length;
        // int max=-10;
        // for(int i=0;i<n;i++){
        //     int pro=1;
        //     for(int j=i;j<n;j++){
        //         pro*=nums[j];
        //         max=Math.max(max,pro);
        //     }
        // }
        // return max;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix*=nums[i];
            suffix*=nums[n-1-i];
            max=Math.max(max,Math.max(suffix,prefix));
        }
        return max;
    }
}