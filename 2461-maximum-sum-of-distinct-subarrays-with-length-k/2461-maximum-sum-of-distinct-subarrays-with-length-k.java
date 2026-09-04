class Solution {
    // public long maximumSubarraySum(int[] arr, int k) {
    //     int l=0;
    //     int j=0;
    //     long max=0,sum=0;
    //     // Arrays.sort(arr);
    //     int[] freq = new int[100001];
    //     for(int r=0;r<arr.length;r++){
    //         sum+=arr[r];
    //         freq[arr[r]]++;
    //         if(r-l+1>k){
    //             sum-=arr[l];
    //             freq[arr[l]]--;
    //             l++;
    //         }
    //         if(r-l+1==k){
    //            boolean found=true;
    //            for(int i=l;i<=r;i++){
    //             if(freq[arr[i]]>1){
    //                 found=false;
    //             }
    //            }
    //            if(found){
    //             max=Math.max(max,sum);

    //            }
    //         }
           
    //     }
    //     return max;
        public long maximumSubarraySum(int[] arr, int k) {
            int dist=0;
            long max=0;
            long sum=0;
            int l=0;
            int[]freq=new int[100001];
            for(int r=0;r<arr.length;r++){
                sum+=arr[r];
                if(freq[arr[r]]==0){
                    dist++;
                }
                freq[arr[r]]++;
                if(r-l+1>k){
                    sum-=arr[l];
                    freq[arr[l]]--;
                    if(freq[arr[l]]==0){
                        dist--;
                    }
                    l++;


                }
                if(r-l+1==k){
                    if(k==dist){
                        max=Math.max(max,sum);
                    }
                }
            }
            return max;
        
    }
}