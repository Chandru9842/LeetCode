class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // Set<Integer>ans=new HashSet<>();
        // int xor=0;
        // int count=0;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         // for(int k=j;k<n;k++){
        //             int sum=nums[i]^nums[j];
        //            ans.add(sum);
        //         // }
        //     }
        // }
        //  Set<Integer> pairXor = new HashSet<>();
        // for(int i:nums){
        //     for(int p:ans){
        //         pairXor.add(i^p);
        //     }
        // }
        // return pairXor.size();
        if(nums.length<=2){
            return nums.length;
        }
        int n=nums.length;
        int mask=0;
        for(int i:nums){
            mask|=i;
        }
        return mask+1;
        
    }
}