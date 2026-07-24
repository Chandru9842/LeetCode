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
    
        int mx = 0;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        mx <<= 1;

        boolean[] pair = new boolean[mx];

        // All possible a ^ b
        for (int a : nums) {
            for (int b : nums) {
                pair[a ^ b] = true;
            }
        }

        boolean[] ans = new boolean[mx];

        // (a ^ b) ^ c
        for (int x = 0; x < mx; x++) {
            if (pair[x]) {
                for (int c : nums) {
                    ans[x ^ c] = true;
                }
            }
        }

        int count = 0;
        for (boolean b : ans) {
            if (b) count++;
        }

        return count;

    }
}