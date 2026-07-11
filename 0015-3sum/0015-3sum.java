class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>>ans=new ArrayList<>();
        // Arrays.sort(nums);
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //      if (i > 0 && nums[i] == nums[i - 1]) continue;
        // int j=i+1;
        // int k=n-1;
        // while(j<k){
        // int sum=nums[i]+nums[j]+nums[k];
        // if(sum>0){
        //     k--;
        // }
        // else if(sum<0){
        //     j++;
        // }
        // else{
        //     List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
        //     ans.add(temp);
        //     j++;
        //     k--;
        //     while(j<k&&nums[j]==nums[j-1]){
        //         j++;
        //     }
        //     while(j<k&&nums[k]==nums[k+1]){
        //         k--;
        //     }
        // }
        // }
        // }

        // return ans;




            //    Bruete force;


    //    int n=nums.length;
    //    Arrays.sort(nums);
    //    Set<List<Integer>>res=new HashSet<>();
    //    for(int i=0;i<n-2;i++){
    //     for(int j=i+1;j<n-1;j++){
    //         for(int k=j+1;k<n;k++){
    //             int sum=nums[i]+nums[j]+nums[k];
    //             if(sum==0){
    //                 List<Integer>ans=Arrays.asList(nums[i],nums[j],nums[k]);
    //                 res.add(ans);
    //             }
    //         }
    //     }
    //    }
    //    return new ArrayList<>(res);


    // effecient solution

    int n=nums.length;
    Arrays.sort(nums);
    // Set<List<Integer>>ans=new HashSet<>();
      List<List<Integer>> ans = new ArrayList<>();
    for(int i=0;i<n-2;i++){
          if (i > 0 && nums[i] == nums[i - 1]) continue;
        int l=i+1;
        int r=nums.length-1;
        while(l<r){
            long sum=(long)nums[i]+nums[l]+nums[r];
            // System.out.println(sum);
            if(sum==0){
                List<Integer>temp=Arrays.asList(nums[i],nums[l],nums[r]);
                ans.add(temp);
                l++;
                r--;

            
            while (l < r && nums[l] == nums[l - 1]) {
                l++;
}

            while (l < r && nums[r] == nums[r + 1]) {
    r--;
}
            }
 else if (sum > 0) {
            r--;
        } else {
            l++;
        }

        }
    }
    return ans;



    }
}